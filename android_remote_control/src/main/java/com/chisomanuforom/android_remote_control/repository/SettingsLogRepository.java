package com.chisomanuforom.android_remote_control.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.android_remote_control.entity.Device;
import com.chisomanuforom.android_remote_control.entity.SettingsLog;

@Repository
public interface SettingsLogRepository extends JpaRepository<SettingsLog, Short>{
	
	Optional<SettingsLog> findSettingsLogByDeviceId(short deviceId);

	

}
