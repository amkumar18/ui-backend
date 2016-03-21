package com.celcom.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="account_nameinfo_t")
public class AccountNameInfo {
	
    @Id
    @Column(name="obj_id0",unique=true, nullable=false)
	private Long id;

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	private String address;
	
	@Column(name="canon_company")
	private String canonCompany;
	
	@Column(name="canon_country")
	private String canonCountry;
	
	private String city;
	
	private String company;
	
	@Column(name="contact_type")
	private String contactType;
	
	private String country;
	
	@Column(name="email_addr")
	private String emailAddress;
	
	@Column(name="first_canon")
	private String firstCanon;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_canon")
	private String lastCanon;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="middle_canon")
	private String middleCanon;
	
	@Column(name="middle_name")
	private String middleName;
	
	private String salutation;
	
	
	@Column(name="service_obj_id0")
	private Long serviceId;
	
	@Column(name="service_obj_type")
	private String servicePoidType;
	private String state;
	private String title;
	private String zip;
	private String geocode;
	
	@Column(name="taxpkg_type")
	private String taxPkgType;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="obj_id0", insertable=false, updatable=false)
	private Account account;
	
    public AccountNameInfo() {

    }
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCanonCompany() {
		return canonCompany;
	}
	public void setCanonCompany(String canonCompany) {
		this.canonCompany = canonCompany;
	}
	public String getCanonCountry() {
		return canonCountry;
	}
	public void setCanonCountry(String canonCountry) {
		this.canonCountry = canonCountry;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getFirstCanon() {
		return firstCanon;
	}
	public void setFirstCanon(String firstCanon) {
		this.firstCanon = firstCanon;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastCanon() {
		return lastCanon;
	}
	public void setLastCanon(String lastCanon) {
		this.lastCanon = lastCanon;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleCanon() {
		return middleCanon;
	}
	public void setMiddleCanon(String middleCanon) {
		this.middleCanon = middleCanon;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getSaluation() {
		return salutation;
	}
	public void setSaluation(String saluation) {
		this.salutation = saluation;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServicePoidType() {
		return servicePoidType;
	}
	public void setServicePoidType(String servicePoidType) {
		this.servicePoidType = servicePoidType;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getGeocode() {
		return geocode;
	}
	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}
	public String getTaxPkgType() {
		return taxPkgType;
	}
	public void setTaxPkgType(String taxPkgType) {
		this.taxPkgType = taxPkgType;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSalutation() {
		return salutation;
	}

	

}
