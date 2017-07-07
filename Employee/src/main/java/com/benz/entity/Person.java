package com.benz.entity;

public class Person {
	
	String pName;
	long PNumber;

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public long getPNumber() {
		return PNumber;
	}

	public void setPNumber(long pNumber) {
		PNumber = pNumber;
	}

	@Override
	public String toString() {
		return "Person [pName=" + pName + ", PNumber=" + PNumber + "]";
	}

}
