package com.example.paymentservice;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/process")
    public String processPayment(@RequestBody PaymentRequest request) {
        // Simulación de lógica de procesamiento de pago
        if ("1234567890123456".equals(request.getCardNumber()) && request.getAmount() > 0) {
            return "Pago procesado con éxito!";
        }
        return "Pago rechazado!";
    }
}
