package com.hand.Emptity;
// Generated 2015-8-31 18:42:46 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Store generated by hbm2java
 */
public class Store implements java.io.Serializable {

	private Byte storeId;
	private Address address;
	private byte managerStaffId;
	private Date lastUpdate;
	private Set customers = new HashSet(0);

	public Store() {
	}

	public Store(Address address, byte managerStaffId, Date lastUpdate) {
		this.address = address;
		this.managerStaffId = managerStaffId;
		this.lastUpdate = lastUpdate;
	}

	public Store(Address address, byte managerStaffId, Date lastUpdate, Set customers) {
		this.address = address;
		this.managerStaffId = managerStaffId;
		this.lastUpdate = lastUpdate;
		this.customers = customers;
	}

	public Byte getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Byte storeId) {
		this.storeId = storeId;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public byte getManagerStaffId() {
		return this.managerStaffId;
	}

	public void setManagerStaffId(byte managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set customers) {
		this.customers = customers;
	}

}
