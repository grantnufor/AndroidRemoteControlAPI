package com.chisomanuforom.android_remote_control.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chisomanuforom.android_remote_control.entity.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Short> {
	

	Optional<Device> findDeviceByUserName(String userName);
	
	Optional<Device> findDeviceByImeiNumber(String imeiNumber);
	
	
}
