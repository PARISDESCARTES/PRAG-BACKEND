package com.iman.domain;

import java.util.Date;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "infodon")
public class InfoDon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idinfodons")
	private String idInfoDons;

	@Column(name="txnid")
	private String txnId;
	
	@Column(name="receiveremail")
	private String receiverEmail;
	
	@Column(name="receiverid")
	private String receiverId;
	
	@Column(name="residencecountry")
	private String residenceCountry;
	
	@Column(name="testipn")
	private int testIpn;
	
	@Column(name="transactionsubject")
	private String transactionSubject;
	
	@Column(name="txntype")
	private String txnType;
	
	@Column(name="payeremail")
	private String payerEmail;
	
	@Column(name="payerid")
	private String payerId;
	
	@Column(name="payerstatus")
	private String payerStatus;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="addresscity")
	private String addressCity;
	
	@Column(name="addressstate")
	private String addressState;
	
	@Column(name="addressstatus")
	private String addressStatus;
	
	@Column(name="addresscountrycode")
	private String addressCountryCode;
	
	@Column(name="addressname")
	private String addressName;
	
	@Column(name="addressstreet")
	private String addressStreet;
	
	@Column(name="addresscountry")
	private String addressCountry;
	
	@Column(name="addresszip")
	private String addressZip;
	
	@Column(name="custom")
	private String custom;
	
	@Column(name="handlingamount")
	private float handlingAmount;
	
	@Column(name="itemname")
	private String itemName;
	
	@Column(name="itemnumber")
	private String itemNumber;
	
	@Column(name="mccurrency")
	private String mcCurrency;
	
	@Column(name="mcfee")
	private float mcFee;
	
	@Column(name="mcgross")
	private float mcGross;
	
	@Column(name="paymentdate")
	private Date paymentDate;
	
	@Column(name="paymentfee")
	private float paymentFee;
	
	@Column(name="paymentgross")
	private float paymentGross;
	
	@Column(name="paymentstatus")
	private String paymentStatus;
	
	@Column(name="paymenttype")
	private String paymentType;
	
	@Column(name="protectioneligibility")
	private String protectionEligibility;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="shipping")
	private float shipping;
	
	@Column(name="tax")
	private float tax;
	
	@Column(name="notifyversion")
	private float notifyVersion;
	
	@Column(name="charset")
	private String charset;
	
	@Column(name="verifysign")
	private String verifySign;
	
}
