package com.iotsystem.iotproject.Service;

import com.iotsystem.iotproject.Entity.Device;

import java.util.List;
import java.util.Optional;

public interface IDeviceService {
    List<Device> getAllDevices();
    Optional<Device> getDeviceById(int deviceId);
    void addDevice(Device device);
    void updateDevice(Device device, int deviceId);
    void deleteDevice(int deviceId);
    //might add addAttribute, updateAttribute

}
