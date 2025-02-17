package com.example.paymentservice;

public class PaymentRequest {
    private String cardNumber;
    private String cvv;
    private String expirationDate;
    private double amount;

    // Getters y Setters
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getCvv() { return cvv; }
    public void setCvv(String cvv) { this.cvv = cvv; }

    public String getExpirationDate() { return expirationDate; }
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
