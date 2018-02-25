package com.github.amberdemon.paymentservice.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Attributes
{
    private Debtor_party debtor_party;

    private String scheme_payment_sub_type;

    private Fx fx;

    private String reference;

    private String currency;

    private String amount;

    private String payment_scheme;

    private String processing_date;

    private String numeric_reference;

    private String payment_purpose;

    private Beneficiary_party beneficiary_party;

    private Charges_information charges_information;

    private String end_to_end_reference;

    private Sponsor_party sponsor_party;

    private String scheme_payment_type;

    private String payment_id;

    private String payment_type;

}
