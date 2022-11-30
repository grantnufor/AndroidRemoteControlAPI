package com.chisomanuforom.android_remote_control.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.android_remote_control.entity.SettingsLog;
import com.chisomanuforom.android_remote_control.repository.SettingsLogRepository;

@Service
public class SettingsLogService {
	
	private final SettingsLogRepository settingsLogRepository;

	public SettingsLogService(SettingsLogRepository settingsLogRepository) {
		super();
		this.settingsLogRepository = settingsLogRepository;
	}
	
	public List<SettingsLog> getSettingsLogs(){
		
		return settingsLogRepository.findAll();
	}
	

	public Optional<SettingsLog> getSettingsLogById(short settingsLogId){
		
		return settingsLogRepository.findById(settingsLogId);
		
	}
	
	
    public Optional<SettingsLog> getSettingsLogByDeviceId(short deviceId) {
		
		return settingsLogRepository.findSettingsLogByDeviceId(deviceId);
		
	}
	
	
	

	public void addSettingsLog(SettingsLog settingsLog) {
		
		Optional<SettingsLog> deviceById = settingsLogRepository.findById(settingsLog.getDeviceId());
		
		if(!deviceById.isPresent()) {
			
			settingsLogRepository.save(settingsLog);
			
		}
		else {
			
			throw new IllegalStateException("Settings Log with ID "+settingsLog.getSettingsLogId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateSettingsLog(SettingsLog settingsLog) {
		// TODO Auto-generated method stub
		Optional<SettingsLog> settingsLogById = settingsLogRepository.findById(settingsLog.getSettingsLogId());
		if(settingsLogById.isPresent()) {
			
			settingsLogRepository.save(settingsLog);
			
		}
		else {
			
			throw new IllegalStateException("Settings Log with ID "+settingsLog.getSettingsLogId()+" already exists.");
			
		}
		
		
	}
	
	
	public void deleteSettingsLog(short settingsLogId) {
		// TODO Auto-generated method stub
		Optional<SettingsLog> settingsLogById = settingsLogRepository.findById(settingsLogId);
		
		if(settingsLogById.isPresent()) {
			
			settingsLogRepository.deleteById((short) settingsLogById.get().getDeviceId());
			
		}
		else {
			
			throw new IllegalStateException("Settings Log with ID "+settingsLogById.get().getSettingsLogId()+" already exists.");
			
		}
		
		
	}

}
