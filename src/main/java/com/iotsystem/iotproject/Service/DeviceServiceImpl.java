package com.iotsystem.iotproject.Service;

import com.iotsystem.iotproject.Entity.Device;
import com.iotsystem.iotproject.Repository.IDeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceServiceImpl implements  IDeviceService{
    @Autowired
    IDeviceRepository repository;

    @Override
    public List<Device> getAllDevices() {
        return repository.findAll();
    }

    @Override
    public Optional<Device> getDeviceById(int deviceId) {
        return repository.findById(deviceId);
    }

    @Override
    public void addDevice(Device device) {
        repository.save(device);
    }

    @Override
    public void updateDevice(Device device, int deviceId) {

    }

    @Override
    public void deleteDevice(int deviceId) {

    }
}
