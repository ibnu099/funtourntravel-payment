package id.co.funtourntravel.payment.service;

import id.co.funtourntravel.payment.model.Payment;

import java.util.List;

public interface IPaymentService {
    void insert(Payment payment);
    void update(Payment payment);
    void delete(Payment payment);
    Payment findThePayment(Payment payment);
    List<Payment> allPayment();
    List<Payment> allPaymentPage(int page, int size);
    // buat inqury payment hanya sesuai user id saja
}
