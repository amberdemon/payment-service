package com.github.amberdemon.paymentservice.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SenderCharges
{
    private BigDecimal amount;
    
    @OneToMany
    private Currency currency;
}