package org.mk.store;

public class StripePaymentService implements PaymentService {
  @Override
  public void processPayment(double amount) {
    System.out.println("Stripe | Amount: " + amount);
  }
}
