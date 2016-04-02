package com.stock.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyPrice implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	@Column
	private BigDecimal open;
	@Column
	private BigDecimal max;
	@Column
	private BigDecimal min;
	@Column
	private BigDecimal close;
	@Column
	private Integer volume;
	@Column
	private Integer numberOfTransaction;
	@Column
	private BigDecimal valueOfTrading;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getOpen() {
		return open;
	}
	public void setOpen(BigDecimal open) {
		this.open = open;
	}
	public BigDecimal getMax() {
		return max;
	}
	public void setMax(BigDecimal max) {
		this.max = max;
	}
	public BigDecimal getMin() {
		return min;
	}
	public void setMin(BigDecimal min) {
		this.min = min;
	}
	public BigDecimal getClose() {
		return close;
	}
	public void setClose(BigDecimal close) {
		this.close = close;
	}
	public Integer getVolume() {
		return volume;
	}
	public void setVolume(Integer volume) {
		this.volume = volume;
	}
	public Integer getNumberOfTransaction() {
		return numberOfTransaction;
	}
	public void setNumberOfTransaction(Integer numberOfTransaction) {
		this.numberOfTransaction = numberOfTransaction;
	}
	public BigDecimal getValueOfTrading() {
		return valueOfTrading;
	}
	public void setValueOfTrading(BigDecimal valueOfTrading) {
		this.valueOfTrading = valueOfTrading;
	}
	

}
