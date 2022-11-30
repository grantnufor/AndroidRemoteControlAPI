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

import com.chisomanuforom.android_remote_control.entity.LocationLog;
import com.chisomanuforom.android_remote_control.entity.SettingsLog;
import com.chisomanuforom.android_remote_control.service.SettingsLogService;



public class SettingsLogController {

	
	private final SettingsLogService settingsLogService;

	@Autowired
	public SettingsLogController(SettingsLogService settingsLogService) {
		super();
		this.settingsLogService = settingsLogService;
	}
	
	
	@GetMapping
	public List<SettingsLog> getSettingsLog(){
		
		return settingsLogService.getSettingsLogs();
		
	}
	

	
	@GetMapping("/{settingsLogId}")
	public Optional<SettingsLog> getSettingsLogBySettingsLogId(@PathVariable short settingsLogId)
	{
		return settingsLogService.getSettingsLogById(settingsLogId);	
		
	}
	
	
	
	@GetMapping("/imeiNumber/{deviceId}")
	public Optional<SettingsLog> getSettingsLogByDeviceId(@PathVariable short deviceId)
	{
		return settingsLogService.getSettingsLogByDeviceId(deviceId);
		
	}
	

	
	@PostMapping
	public void registerSettingsLog(@RequestBody SettingsLog settingsLog) {
		
		settingsLogService.addSettingsLog(settingsLog);
		
	}
	
	
	 @PutMapping("/{settingsLogId}")
		public void updateSettingsLog(@PathVariable short settingsLogId, @RequestBody SettingsLog settingsLog) {
			 
			 settingsLog.setSettingsLogId(settingsLogId);
				
			settingsLogService.updateSettingsLog(settingsLog);
				
	 }
	
	 
	 @PatchMapping("/{settingsLogId}")
	public void updatePatchSettingsLog(@PathVariable short settingsLogId, @RequestBody SettingsLog settingsLog) {
			 
			 settingsLog.setSettingsLogId(settingsLogId);
				
			settingsLogService.updateSettingsLog(settingsLog);
				
	 }
	
	
	@PostMapping("/{settingsLogId}")
	public String deleteSettingsLog(@PathVariable short settingsLogId) {
		
		settingsLogService.deleteSettingsLog(settingsLogId);;
		
		return "Settings Log has been deleted with id ="+settingsLogId;
		
	}
	
	
}
