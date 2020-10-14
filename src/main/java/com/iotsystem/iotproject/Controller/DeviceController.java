package com.iotsystem.iotproject.Controller;

import com.iotsystem.iotproject.Entity.Device;
import com.iotsystem.iotproject.Service.IDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins ="*")
@RestController
public class DeviceController {

    @Autowired
    IDeviceService serviceDevice;

    @RequestMapping("/devices")
    public List<Device> getAllDevices() {
        return serviceDevice.getAllDevices();
    }

    @RequestMapping("/devices/{id}")
    public Optional<Device> getDeviceById(@PathVariable int id) {
        return serviceDevice.getDeviceById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/devices")
    public void addDevice(@RequestBody Device device) {
        serviceDevice.addDevice(device);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/devices/{id}")
    public void updateDevice(@RequestBody Device device, @PathVariable int id) {
        serviceDevice.updateDevice(device, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/devices/{id}")
    public void deleteDevice(@PathVariable int id) {
        serviceDevice.deleteDevice(id);
    }


}
