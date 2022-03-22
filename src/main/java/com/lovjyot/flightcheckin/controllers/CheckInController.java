package com.lovjyot.flightcheckin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lovjyot.flightcheckin.integration.ReservationRestClient;
import com.lovjyot.flightcheckin.integration.dto.Reservation;
import com.lovjyot.flightcheckin.integration.dto.ReservationUpdateRequest;

@Controller
public class CheckInController {

	@Autowired
	ReservationRestClient reservationRestClient;

	@RequestMapping("/showStartCheckIn")
	public String showStartCheckIn() {
		return "startCheckIn";

	}

	@RequestMapping("/startCheckIn")
	public String showStartCheckIn(@RequestParam("reservationId") long reservationId, ModelMap modelMap) {
		Reservation reservation = reservationRestClient.findReservation(reservationId);
		modelMap.addAttribute("reservation", reservation);
		return "displayReservationDetails";

	}

	@RequestMapping("/completeCheckIn")
	public String completeCheckin(@RequestParam("reservationId") long reservationId, @RequestParam int numberOfBags) {
		ReservationUpdateRequest request = new ReservationUpdateRequest();
		request.setId(reservationId);
		request.setCheckedInFlag(true);
		request.setNumberOfBags(numberOfBags);
		reservationRestClient.updateReservation(request);
		return "checkInConfirmation";

	}

}
