package com.github.amberdemon.paymentservice.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Attributes {
	private BigDecimal amount;
	@ManyToOne
	private DebtorParty debtorParty;
	private SchemePaymentSubType schemePaymentSubType;

	private Fx fx;

	private String reference;

	private Currency currency;

	private String payment_scheme;

	private LocalDate processingDate;

	private long numericReference;

	private String paymentPurpose;

	@ManyToOne
	private BeneficiaryParty beneficiaryParty;

	private ChargesInformation chargesInformation;

	private String endToEndReference;
	@ManyToOne
	private SponsorParty sponsorParty;

	private SchemePaymentType schemePaymentType;

	private long paymentId;

	private PaymentType paymentType;

}
