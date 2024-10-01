package com.example.paymentservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class PaymentControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testProcessPayment() throws Exception {
		String paymentJson = """
            {
                "cardNumber": "1234567890123456",
                "cvv": "123",
                "expirationDate": "12/25",
                "amount": 100.0
            }
        """;

		mockMvc.perform(post("/payments/process")
						.contentType("application/json")
						.content(paymentJson))
				.andExpect(status().isOk());
	}
}
