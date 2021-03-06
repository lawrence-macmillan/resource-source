package com.example.ukpowergrid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // JPA Annotation to configure this object for JPA based datastore
@Table(name = "power_grid") // Specifying table name
public class GridUsage {
	
	@Id // Identifying Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO) // Specifying the PK is automatically generated by the database
	private String id;
	
	@Column(name = "settlement_date") // Specifying column name
	private String settlementDate;
	
	@Column(name = "settlement_period")
	private String settlementPeriod;
	
	@Column(name = "demand")
	private String demand;
	
	@Column(name = "ccgt")
	private String ccgt;
	
	@Column(name = "oil")
	private String oil;
	
	@Column(name = "coal")
	private String coal;
	
	@Column(name = "nuclear")
	private String nuclear;
	
	@Column(name = "wind")
	private String wind;
	
	@Column(name = "ps")
	private String ps;
	
	@Column(name = "npshyd")
	private String npshyd;
	
	@Column(name = "ocgt")
	private String ocgt;
	
	@Column(name = "other")
	private String other;
	
	@Column(name = "intfr")
	private String intfr;
	
	@Column(name = "intirl")
	private String intirl;
	
	@Column(name = "intned")
	private String intned;
	
	@Column(name = "intew")
	private String intew;
	
	GridUsage() {}
	
	GridUsage(String settlementDate, String settlementPeriod, String demand, String ccgt, String oil, String coal, String nuclear, String wind, String ps, String npshyd, String ocgt, String other, String intfr, String intirl, String intned, String intew) {
		
		this.settlementDate = settlementDate;
		this.settlementPeriod = settlementPeriod;
		this.demand = demand;
		this.ccgt = ccgt;
		this.oil = oil;
		this.coal = coal;
		this.nuclear = nuclear;
		this.wind = wind;
		this.ps = ps;
		this.npshyd = npshyd;
		this.ocgt = ocgt;
		this.other = other;
		this.intfr = intfr;
		this.intirl = intirl;
		this.intned = intned;
		this.intew = intew;
	}
	
	// Getters and Setters
	public String getId() {
		return this.id;
	}
	
	public String getSettlementDate() {
		return this.settlementDate;
	}
	
	public String getSettlementPeriod() {
		return this.settlementPeriod;
	}
	
	public String getDemand() {
		return this.demand;
	}
	
	public String getCCGT() {
		return this.ccgt;
	}
	
	public String getOil() {
		return this.oil;
	}
	
	public String getCoal() {
		return this.coal;
	}
	
	public String getNuclear() {
		return this.nuclear;
	}
	
	public String getWind() {
		return this.wind;
	}
	
	public String getPS() {
		return this.ps;
	}
	
	public String getNPSHYD() {
		return this.npshyd;
	}
	
	public String getOCGT() {
		return this.ocgt;
	}
	
	public String getOther() {
		return this.other;
	}
	
	public String getINTFR() {
		return this.intfr;
	}
	
	public String getINTIRL() {
		return this.intirl;
	}
	
	public String getINTNED() {
		return this.intned;
	}
	
	public String getINTEW() {
		return this.intew;
	}
	
	public void setId(String id) {
		this.id = id; 
	}
	
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	
	public void setSettlementPeriod(String settlementPeriod) {
		this.settlementPeriod = settlementPeriod;
	}
	
	public void setDemand(String demand) {
		this.demand = demand;
	}
	
	public void setCCGT(String ccgt) {
		this.ccgt = ccgt;
	}
	
	public void setOil(String oil) {
		this.oil = oil;
	}
	
	public void setCoal(String coal) {
		this.coal = coal;
	}
	
	public void setNuclear(String nuclear) {
		this.nuclear = nuclear;
	}
	
	public void setWind(String wind) {
		this.wind = wind;
	}
	
	public void setPS(String ps) {
		this.ps = ps;
	}
	
	public void setNPSHYD(String npshyd) {
		this.npshyd = npshyd;
	}
	
	public void setOCGT(String ocgt) {
		this.ocgt = ocgt;
	}
	
	public void setOther(String other) {
		this.other = other;
	}
	
	public void setINTFR(String intfr) {
		this.intfr = intfr;
	}
	
	public void setINTIRL(String intirl) {
		this.intirl = intirl;
	}
	
	public void setINTNED(String intned) {
		this.intned = intned;
	}
	
	public void setINTEW(String intew) {
		this.intew = intew;
	}

}