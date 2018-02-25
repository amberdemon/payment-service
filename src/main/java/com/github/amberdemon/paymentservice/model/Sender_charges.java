package com.github.amberdemon.paymentservice.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Sender_charges
{
    private String amount;
    private String currency;
}