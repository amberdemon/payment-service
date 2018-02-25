package com.github.amberdemon.paymentservice.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment {
	private String id;

	private String organisation_id;

	private Attributes attributes;

	private String type;

	private String version;

}
