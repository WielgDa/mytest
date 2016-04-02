package com.stock.model.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class StockCompany implements Serializable{
	
	@Id
	private String name;
	@Column
	private String isin;
	@OneToMany
	@JoinColumn(name = "company")
	private Set<DailyPrice> dailyPrice;
	
	
	public Set<DailyPrice> getDailyPrice() {
		return dailyPrice;
	}
	public void setDailyPrice(Set<DailyPrice> dailyPrice) {
		this.dailyPrice = dailyPrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}

}
