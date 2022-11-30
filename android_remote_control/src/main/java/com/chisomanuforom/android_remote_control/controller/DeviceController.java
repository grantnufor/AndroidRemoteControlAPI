package com.chisomanuforom.android_remote_control.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chisomanuforom.android_remote_control.entity.Device;
import com.chisomanuforom.android_remote_control.service.DeviceService;


@RestController
@RequestMapping("/Device")
public class DeviceController {
	
	
	private final DeviceService deviceService;

	@Autowired
	public DeviceController(DeviceService deviceService) {
		super();
		this.deviceService = deviceService;
	}
	
	
	@GetMapping
	public List<Device> getDevices(){
		
		return deviceService.getDevices();
		
	}
	
	

	
	@GetMapping("/{deviceId}")
	public Optional<Device> getDeviceByDeviceId(@PathVariable short deviceId)
	{
		return deviceService.getDeviceById(deviceId);	
		
	}
	
	
	
	@GetMapping("/imeiNumber/{imeiNumber}")
	public Optional<Device> getDeviceByImeiNumber(@PathVariable String imeiNumber)
	{
		return deviceService.getDeviceByImeiNumber(imeiNumber);
		
	}
	

	
	 @PostMapping
	public void registerDevice(@RequestBody Device device) {
		
		deviceService.addDevice(device);
		
	}
	
	 
	 @PutMapping("/{deviceId}")
	public void updateDevice(@PathVariable short deviceId, @RequestBody Device device) {
		 
		 device.setDeviceId(deviceId);
			
			deviceService.updateDevice(device);
			
	}
	 
	 
	 @PatchMapping("/{deviceId}")
		public void updatePatchDevice(@PathVariable short deviceId, @RequestBody Device device) {
			 
			 device.setDeviceId(deviceId);
				
				deviceService.updateDevice(device);
				
	 }
	
	
	@PostMapping("/{deviceId}")
	public String deleteDevice(@PathVariable short deviceId) {
		
		deviceService.deleteDevice(deviceId);
		
		return "Device has been deleted with id ="+deviceId;
		
	}
	
	
	


}
