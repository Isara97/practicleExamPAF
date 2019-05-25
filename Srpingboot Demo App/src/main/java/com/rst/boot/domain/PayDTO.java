package com.rst.boot.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "payment")
public class PayDTO implements Serializable {
    //id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "pay_id",length = 10, nullable = false)
    private Integer id;
    //payment_id of the client
    @Column(name = "payment_id",length = 10, nullable = false)
    private Integer pid;
    //cardNumber
    @Column(name = "card_number",length = 16, nullable = false)
    private Integer cardNumber;
    //amount
    @Column(name = "amount",length = 10, nullable = false)
    private double amount;
    //item lists
    @Column(name = "item_list",length = 50, nullable = false)
    private String ItemList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getItemList() {
        return ItemList;
    }

    public void setItemList(String itemList) {
        ItemList = itemList;
    }
}
