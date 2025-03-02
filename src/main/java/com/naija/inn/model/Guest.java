package com.naija.inn.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "guests")
@Data
public class Guest {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
}
