package com.lovjyot.flightcheckin.integration;

import com.lovjyot.flightcheckin.integration.dto.Reservation;
import com.lovjyot.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	
	public Reservation findReservation(long id);
	public Reservation updateReservation(ReservationUpdateRequest request);

}
