package com.chisomanuforom.android_remote_control.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.chisomanuforom.android_remote_control.entity.LocationLog;
import com.chisomanuforom.android_remote_control.repository.LocationLogRepository;



@Service
public class LocationLogService {
	
	
	private final LocationLogRepository locationLogRepository;

	public LocationLogService(LocationLogRepository locationLogRepository) {
		super();
		this.locationLogRepository = locationLogRepository;
	}
	
	public List<LocationLog> getLocationLogs(){
		
		return locationLogRepository.findAll();
	}
	

	public Optional<LocationLog> getLocationLogById(long locationLogId){
		
		return locationLogRepository.findById(locationLogId);
		
	}
	
	
    public Optional<LocationLog> getLocationLogByDeviceId(Short deviceId) {
		
		return locationLogRepository.findLocationLogByDeviceId(deviceId);
		
	}
	

	public void addLocationLog(LocationLog locationLog) {
		
		Optional<LocationLog> locationLogByLocationLogId = locationLogRepository.findById(locationLog.getLocationLogId());
		
		if(!locationLogByLocationLogId.isPresent()) {
			
			locationLogRepository.save(locationLog);
			
		}
		else {
			
			throw new IllegalStateException("LocationLog with ID "+ locationLog.getLocationLogId()+" already exists.");
			
		}
		
		
	}
	
	
	public void updateLocationLog(LocationLog locationLog) {
		// TODO Auto-generated method stub
		Optional<LocationLog> locationLogByLocationLogId = locationLogRepository.findById(locationLog.getLocationLogId());
		if(locationLogByLocationLogId.isPresent()) {
			
			locationLogRepository.save(locationLog);
			
		}
		else {
			

			throw new IllegalStateException("LocationLog with ID "+locationLog.getLocationLogId()+" does not exist exists.");
			
		}
		
		
	}
	
	
	public void deleteLocationLog(long locationLogId) {
		// TODO Auto-generated method stub
		Optional<LocationLog> locationLog = locationLogRepository.findById(locationLogId);
		
		if(locationLog.isPresent()) {
			
			locationLogRepository.deleteById(locationLog.get().getLocationLogId());
			
		}
		else {
			
			throw new IllegalStateException("LocationLog with ID "+locationLogId+" does not exist exists.");
			
		}
		
		
	}
	

}
