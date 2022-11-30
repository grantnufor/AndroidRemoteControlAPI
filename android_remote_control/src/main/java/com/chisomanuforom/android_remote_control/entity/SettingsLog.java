package com.chisomanuforom.android_remote_control.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "SETTINGS_LOG")
public class SettingsLog {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short settingsLogId;
	private short deviceId;
	private String locationSetting;
	private String usbSetting;
	private LocalDateTime dateCreated;
	private LocalDateTime datelastUpdated;
	
	
	public SettingsLog() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public SettingsLog(short settingsLogId, short deviceId, String locationSetting, String usbSetting,
			LocalDateTime dateCreated, LocalDateTime datelastUpdated) {
		super();
		this.settingsLogId = settingsLogId;
		this.deviceId = deviceId;
		this.locationSetting = locationSetting;
		this.usbSetting = usbSetting;
		this.dateCreated = dateCreated;
		this.datelastUpdated = datelastUpdated;
	}




	@Override
	public String toString() {
		return "SettingsLog [settingsLogId=" + settingsLogId + ", deviceId=" + deviceId + ", locationSetting="
				+ locationSetting + ", usbSetting=" + usbSetting + ", dateCreated=" + dateCreated + ", datelastUpdated="
				+ datelastUpdated + "]";
	}




	public short getSettingsLogId() {
		return settingsLogId;
	}




	public void setSettingsLogId(short settingsLogId) {
		this.settingsLogId = settingsLogId;
	}




	public short getDeviceId() {
		return deviceId;
	}




	public void setDeviceId(short deviceId) {
		this.deviceId = deviceId;
	}




	public String getLocationSetting() {
		return locationSetting;
	}




	public void setLocationSetting(String locationSetting) {
		this.locationSetting = locationSetting;
	}




	public String getUsbSetting() {
		return usbSetting;
	}




	public void setUsbSetting(String usbSetting) {
		this.usbSetting = usbSetting;
	}




	public LocalDateTime getDateCreated() {
		return dateCreated;
	}




	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}




	public LocalDateTime getDatelastUpdated() {
		return datelastUpdated;
	}




	public void setDatelastUpdated(LocalDateTime datelastUpdated) {
		this.datelastUpdated = datelastUpdated;
	}
	
	
	
	
	
	
	
	
}
