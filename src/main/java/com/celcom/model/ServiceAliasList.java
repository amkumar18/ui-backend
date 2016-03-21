package com.celcom.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="service_alias_list_t")
public class ServiceAliasList {
	
	@Id
	@Column(name="obj_id0",unique=true, nullable=false)
	private Long id;
	
	@Column(name="rec_id")
	private Integer recId;
	
	@Column(name="name")
	private String name;
	
    public ServiceAliasList() {

    }
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="obj_id0", insertable=false, updatable=false)
	private ServiceInstance service;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRecId() {
		return recId;
	}

	public void setRecId(Integer recId) {
		this.recId = recId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
