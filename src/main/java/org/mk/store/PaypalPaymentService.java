package org.mk.store;

import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentService implements PaymentService {
  @Override
  public void processPayment(double amount) {
    System.out.println("Paypal | Amount: " + amount);
  }
}
