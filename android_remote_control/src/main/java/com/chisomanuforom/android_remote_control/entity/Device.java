package com.chisomanuforom.android_remote_control.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DEVICE")
public class Device {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short deviceId;
	private String deviceName;
	private String userName;
	private String email;
	private String password;
	private String imeiNumber;
	
	
	
	
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Device(short deviceId, String deviceName, String userName, String email, String password,
			String imeiNumber) {
		super();
		this.deviceId = deviceId;
		this.deviceName = deviceName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.imeiNumber = imeiNumber;
	}




	@Override
	public String toString() {
		return "Device [deviceId=" + deviceId + ", deviceName=" + deviceName + ", userName=" + userName + ", email=" + email + ", password=" + password + ", IMEINumber=" + imeiNumber + "]";
	}




	public short getDeviceId() {
		return deviceId;
	}




	public void setDeviceId(short deviceId) {
		this.deviceId = deviceId;
	}




	public String getDeviceName() {
		return deviceName;
	}




	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getImeiNumber() {
		return imeiNumber;
	}




	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	
	
	
	
	
	
	

}
