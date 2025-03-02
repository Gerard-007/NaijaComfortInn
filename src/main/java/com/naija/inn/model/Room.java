package com.naija.inn.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rooms")
@Data
public class Room {
    @Id
    private String roomNumber;
    private String type; // Single, Double, Suite
    private boolean isAvailable;
    private double price;
}
