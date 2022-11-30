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

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.chisomanuforom.android_remote_control.entity.Device;
import com.chisomanuforom.android_remote_control.entity.LocationLog;
import com.chisomanuforom.android_remote_control.service.LocationLogService;



@RestController
@RequestMapping("/LocationLog")
public class LocationLogController {

	
	private final LocationLogService locationLogService;

	@Autowired
	public LocationLogController(LocationLogService locationLogService) {
		super();
		this.locationLogService = locationLogService;
	}
	
	
	@GetMapping
	public List<LocationLog> getLocationLogs(){
		
		return locationLogService.getLocationLogs();
		
	}
	
	

	
	@GetMapping("/{locationLogId}")
	public Optional<LocationLog> getLocationLogByLocationLogId(@PathVariable long locationLogId)
	{
		return locationLogService.getLocationLogById(locationLogId);	
		
	}
	
	
	
	@GetMapping("/device/{deviceId}")
	public Optional<LocationLog> getLocationLogByDeviceId(@PathVariable short deviceId)
	{
        return locationLogService.getLocationLogByDeviceId(deviceId);
		
	}
	

	
	@PostMapping
	public void registerLocationLog(@RequestBody LocationLog locationLog) {
		
		
		locationLogService.addLocationLog(locationLog);
		
	}
	
	 @PutMapping("/{locationLogId}")
		public void updateLocationLog(@PathVariable long locationLogId, @RequestBody LocationLog locationLog) {
			 
			 locationLog.setLocationLogId(locationLogId);
				
				locationLogService.updateLocationLog(locationLog);
				
	 }
	 
	 
	 @PatchMapping("/{locationLogId}")
	public void updatePatchLocationLog(@PathVariable long locationLogId, @RequestBody LocationLog locationLog) {
			 
			 locationLog.setLocationLogId(locationLogId);
				
				locationLogService.updateLocationLog(locationLog);
				
	 }
	
	
	
	
	@PostMapping("/{locationLogId}")
	public String deleteLocationLog(@PathVariable long locationLogId) {
		
		locationLogService.deleteLocationLog(locationLogId);
		
		return "Location Log has been deleted with id ="+locationLogId;
		
	}
	
	
}
