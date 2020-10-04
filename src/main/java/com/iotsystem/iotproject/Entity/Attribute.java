package com.iotsystem.iotproject.Entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Attribute")
public class Attribute {
    private int attributeId;
    private String attributeName;
    private double maxValue;
    private double minValue;
    private double actualValue;
}
