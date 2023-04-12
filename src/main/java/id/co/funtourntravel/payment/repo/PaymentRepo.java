package id.co.funtourntravel.payment.repo;

import id.co.funtourntravel.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {
    Payment findPaymentById(Integer ainteger);
}
