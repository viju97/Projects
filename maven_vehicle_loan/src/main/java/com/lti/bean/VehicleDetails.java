package com.lti.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class VehicleDetails {
	@Column(name = "BRAND")
	private String vehicleBrand;
	@Column(name = "MODEL")
	private String vehicleModel;
	@Column(name = "ONROAD_PRICE")
	private String vehiclePrice;
	@Id
	@Column(name = "EMAIL")
	private String email;
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(String vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public VehicleDetails(String vehicleBrand, String vehicleModel, String vehiclePrice, String email) {
		super();
		this.vehicleBrand = vehicleBrand;
		this.vehicleModel = vehicleModel;
		this.vehiclePrice = vehiclePrice;
		this.email = email;
	}
	public VehicleDetails() {
		super();
	}
	@Override
	public String toString() {
		return "VehicleDetails [vehicleBrand=" + vehicleBrand + ", vehicleModel=" + vehicleModel + ", vehiclePrice="
				+ vehiclePrice + ", email=" + email + "]";
	}
	

}
