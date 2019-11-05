package com.lti.dao;

import java.util.List;

import com.lti.bean.VehicleDetails;

public interface VehicleDao {
	public boolean insertDetails(VehicleDetails vehicle);
	public VehicleDetails getVehicle(String email);
	//public List<VehicleDetails> getuserlist();
}
