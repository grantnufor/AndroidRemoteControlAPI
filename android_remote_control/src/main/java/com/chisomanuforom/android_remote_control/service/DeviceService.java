package com.chisomanuforom.android_remote_control.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.android_remote_control.entity.Device;
import com.chisomanuforom.android_remote_control.repository.DeviceRepository;



@Service
public class DeviceService {
	
	
	private final DeviceRepository deviceRepository;

	public DeviceService(DeviceRepository deviceRepository) {
		super();
		this.deviceRepository = deviceRepository;
	}
	
	public List<Device> getDevices(){
		
		return deviceRepository.findAll();
	}
	

	public Optional<Device> getDeviceById(short deviceId){
		
		return deviceRepository.findById(deviceId);
		
	}
	
	
    public Optional<Device> getDeviceByUserName(String userName) {
		
		return deviceRepository.findDeviceByUserName(userName);
		
	}
	
	
	public Optional<Device> getDeviceByImeiNumber(String imeiNumber) {
		
		return deviceRepository.findDeviceByImeiNumber(imeiNumber);
		
	}
	
	
	

	public void addDevice(Device device) {
		
		Optional<Device> deviceById = deviceRepository.findById((short) device.getDeviceId());
		
		if(!deviceById.isPresent()) {
			
			deviceRepository.save(device);
			
		}
		else {
			
			throw new IllegalStateException("Device with IMEI Number "+device.getDeviceId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateDevice(Device device) {
		// TODO Auto-generated method stub
		Optional<Device> deviceByDeviceId = deviceRepository.findById(device.getDeviceId());
		if(deviceByDeviceId.isPresent()) {
			
			deviceRepository.save(device);
			
		}
		else {
			

			throw new IllegalStateException("Device with ID "+device.getDeviceId()+" does not exist exists.");
			
		}
		
		
	}
	
	
	public void deleteDevice(short deviceId) {
		// TODO Auto-generated method stub
		Optional<Device> device = deviceRepository.findById(deviceId);
		
		if(device.isPresent()) {
			
			deviceRepository.deleteById((short) device.get().getDeviceId());
			
		}
		else {
			
			throw new IllegalStateException("Device with IMEI "+device.get().getDeviceId()+" does not exist exists.");
			
		}
		
		
	}
	

}
