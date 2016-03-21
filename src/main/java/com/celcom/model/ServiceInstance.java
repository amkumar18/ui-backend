package com.celcom.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="service_t")
public class ServiceInstance {
	
	@Id
	@Column(name="poid_id0")
	private Long id;
	
	@Column(name="account_obj_id0")
	private Long accountId;
	
	@Column(name="bal_grp_obj_id0")
	private Long balanceId;
	
	@Column(name="subscription_obj_id0")
	private Long subscriptionId;
	
	@Column(name="close_when_t")
	private int closeWhenT;
	
	@Column(name="profile_obj_id0")
	private Long profileId;
	
	@Column(name="poid_type")
	private String poidType;
	
	@Column(name="status")
	private int status;
	
	@Column(name="status_flags")
	private int statusFlags;
	
	public ServiceInstance(){
		
	}
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="account_obj_id0", insertable=false, updatable=false)
	private Account account;
	
    @OneToMany(fetch = FetchType.EAGER, mappedBy="service")
    @PrimaryKeyJoinColumn(name="poid_id0")
	private List<ServiceAliasList> aliasList;

	public List<ServiceAliasList> getAliasList() {
		return aliasList;
	}

	public void setAliasList(List<ServiceAliasList> aliasList) {
		this.aliasList = aliasList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public Long getBalanceId() {
		return balanceId;
	}

	public void setBalanceId(Long balanceId) {
		this.balanceId = balanceId;
	}

	public Long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(Long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public int getCloseWhenT() {
		return closeWhenT;
	}

	public void setCloseWhenT(int closeWhenT) {
		this.closeWhenT = closeWhenT;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getPoidType() {
		return poidType;
	}

	public void setPoidType(String poidType) {
		this.poidType = poidType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getStatusFlags() {
		return statusFlags;
	}

	public void setStatusFlags(int statusFlags) {
		this.statusFlags = statusFlags;
	}


}
