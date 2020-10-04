package com.iotsystem.iotproject.Repository;

import com.iotsystem.iotproject.Entity.Device;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends MongoRepository<Device, Integer> {
}
