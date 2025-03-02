package com.naija.inn.dto;

import lombok.Data;

@Data
public class PaymentResponseDTO {
    private String bookingReference;
    private double totalAmount;
    private boolean isFestivePeriod;
    private double festiveSurcharge;
}
