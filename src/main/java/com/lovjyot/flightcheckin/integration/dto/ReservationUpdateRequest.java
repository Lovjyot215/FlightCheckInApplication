package com.lovjyot.flightcheckin.integration.dto;

public class ReservationUpdateRequest {

	private Long id;
	private boolean checkedInFlag;
	private int numberOfBags;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getCheckedInFlag() {
		return checkedInFlag;
	}

	public void setCheckedInFlag(Boolean checkedInFlag) {
		this.checkedInFlag = checkedInFlag;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

}
