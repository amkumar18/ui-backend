package com.celcom.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name="account_t")
public class Account {

	@Id
    @Column(name="poid_id0")
    private Long id;

    @Column(nullable = true)
    private String name;
    
    @Column(nullable = false)
    private String poid_type;
    
    
    @Column(name="account_no")
    private String accountNo;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy="account")
    @PrimaryKeyJoinColumn(name="poid_id0")
    private List<AccountNameInfo> acctNameInfo;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy="account")
    @PrimaryKeyJoinColumn(name="poid_id0")
    private List<ServiceInstance> services;
	
	public List<AccountNameInfo> getAcctNameInfo() {
		return acctNameInfo;
	}


	public List<ServiceInstance> getServices() {
		return services;
	}


	public void setServices(List<ServiceInstance> services) {
		this.services = services;
	}





	public void setAcctNameInfo(List<AccountNameInfo> acctNameInfo) {
		this.acctNameInfo = acctNameInfo;
	}



	public void addAccountNameInfo(AccountNameInfo acctInfo){
		acctNameInfo.add(acctInfo);
	}



	public Account() {

    }
    
    

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPoid_type() {
		return poid_type;
	}



	public void setPoid_type(String poid_type) {
		this.poid_type = poid_type;
	}



	public String getAccountNo() {
		return accountNo;
	}



	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}



	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
   
}
