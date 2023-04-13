package id.co.funtourntravel.payment.model;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class Transaction {
    private int id;
    private int userId;
    private int tourId;
    private String status;
    private int paymentId;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private Timestamp tourDate;
    private String noBayar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Timestamp getTourDate() {
        return tourDate;
    }

    public void setTourDate(Timestamp tourDate) {
        this.tourDate = tourDate;
    }

    public String getNoBayar() {
        return noBayar;
    }

    public void setNoBayar(String noBayar) {
        this.noBayar = noBayar;
    }
}