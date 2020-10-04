package com.iotsystem.iotproject.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Device")
public class Device {
    @Id
    private int id;
    private String deviceType;
    private String deviceState;
    
    private List<Attribute> attributes;
}
