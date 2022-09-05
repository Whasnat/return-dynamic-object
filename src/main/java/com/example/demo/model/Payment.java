package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Payment {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "transaction_type")
    private String type;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "sender")
    private String sender;

    @Column(name = "receiver")
    private String receiver;



    public Payment() {
    }


    public Payment(String id, String type, Integer amount, String sender, String receiver) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id) && Objects.equals(type, payment.type) && Objects.equals(amount, payment.amount) && Objects.equals(sender, payment.sender) && Objects.equals(receiver, payment.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, amount, sender, receiver);
    }


    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
