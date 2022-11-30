package com.chisomanuforom.android_remote_control.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOCATION_LOG")
public class LocationLog {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long locationLogId;
	private short deviceId;
	private String locationInfo;
	private String latitude;
	private String longitude;
	private String time;
	
	
	
	
	
	public LocationLog() {
		super();
		// TODO Auto-generated constructor stub
	}





	@Override
	public String toString() {
		return "LocationLog [locationLogId=" + locationLogId + ", deviceId=" + deviceId + ", locationInfo="
				+ locationInfo + ", latitude=" + latitude + ", longitude=" + longitude + ", time=" + time + "]";
	}




	public LocationLog(long locationLogId, short deviceId, String locationInfo, String latitude, String longitude,
			String time) {
		super();
		this.locationLogId = locationLogId;
		this.deviceId = deviceId;
		this.locationInfo = locationInfo;
		this.latitude = latitude;
		this.longitude = longitude;
		this.time = time;
	}





	public long getLocationLogId() {
		return locationLogId;
	}





	public void setLocationLogId(long locationLogId) {
		this.locationLogId = locationLogId;
	}





	public short getDeviceId() {
		return deviceId;
	}





	public void setDeviceId(short deviceId) {
		this.deviceId = deviceId;
	}





	public String getLocationInfo() {
		return locationInfo;
	}





	public void setLocationInfo(String locationInfo) {
		this.locationInfo = locationInfo;
	}





	public String getLatitude() {
		return latitude;
	}





	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}





	public String getLongitude() {
		return longitude;
	}





	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}





	public String getTime() {
		return time;
	}





	public void setTime(String time) {
		this.time = time;
	}
	
	
	
	
	
	
	
	
	
	
	
}
