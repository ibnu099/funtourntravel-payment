package id.co.funtourntravel.payment.controller;

import id.co.funtourntravel.payment.model.Payment;
import id.co.funtourntravel.payment.model.Transaction;
import id.co.funtourntravel.payment.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("api")
public class RestPaymentController {
    @Autowired
    PaymentRepo paymentRepo;

    @GetMapping("/payment")
    @ResponseStatus(HttpStatus.OK)
    public List<Payment> findAll(){
        return paymentRepo.findAll();
    }

    @GetMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Payment findPaymentById(@PathVariable("id") int id){
        return paymentRepo.findPaymentById(id);
    }

    @PostMapping("/payments")
    @ResponseStatus(HttpStatus.OK)
    public Payment addPayment(@RequestBody Payment payment){
        payment.setId(0);
        return paymentRepo.save(payment);

    }

    @PutMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Payment updatePayment(@RequestBody Payment payment, @PathVariable("id") int id){
        payment.setId(id);
        return paymentRepo.save(payment);
    }

    @DeleteMapping("/payments/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deletePayment(@PathVariable("id") int id){
        paymentRepo.deleteById(id);
    }

    @PostMapping("/pay")
    @ResponseStatus(HttpStatus.OK)
    public String payTour(@RequestBody Transaction transaction){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            return "Gagal";
        } else {
            return "Sukses";
        }

    }
}
