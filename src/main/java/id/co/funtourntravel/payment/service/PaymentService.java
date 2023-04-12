package id.co.funtourntravel.payment.service;

import id.co.funtourntravel.payment.model.Payment;
import id.co.funtourntravel.payment.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IPaymentService{
    @Autowired
    PaymentRepo paymentRepo;


    @Override
    public void insert(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public void update(Payment payment) {
        paymentRepo.save(payment);
    }

    @Override
    public void delete(Payment payment) {
        paymentRepo.deleteById(payment.getId());
    }

    @Override
    public Payment findThePayment(Payment payment) {
        return paymentRepo.findPaymentById(payment.getId());
    }

    @Override
    public List<Payment> allPayment() {
        return paymentRepo.findAll();
    }

    @Override
    public List<Payment> allPaymentPage(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return paymentRepo.findAll(pageable).getContent()   ;
    }
}
