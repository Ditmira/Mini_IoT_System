package com.iotsystem.iotproject.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Data
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
    //@DBRef
    private List<Attribute> attributes;
}
