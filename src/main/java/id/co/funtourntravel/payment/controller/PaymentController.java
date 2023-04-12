package id.co.funtourntravel.payment.controller;

import id.co.funtourntravel.payment.model.Payment;
import id.co.funtourntravel.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping("/all")
    public @ResponseBody
    List<Payment> findAll(){
        return paymentService.allPayment();
    }

    @GetMapping("/id")
    public @ResponseBody Payment getPayment(@RequestParam("id") int id){
        Payment model = new Payment();
        model.setId(id);
        return paymentService.findThePayment(model);
    }

    @GetMapping("/add")
    public String addPayment(@RequestParam("paymentName") String paymentName
            , @RequestParam("paymentType") String paymentType){
        Payment model = new Payment();
        model.setId(0);
        model.setPaymentName(paymentName);
        model.setPaymentType(paymentType);
        paymentService.insert(model);
        return "redirect:/payment/all";
    }

    @GetMapping("/update")
    public String addPayment(@RequestParam("id")  int id
            , @RequestParam("paymentName") String paymentName
            , @RequestParam("paymentType") String paymentType){
        Payment model = new Payment();
        model.setId(id);
        model.setPaymentName(paymentName);
        model.setPaymentType(paymentType);
        paymentService.update(model);
        return "redirect:/payment/all";
    }

}
