package com.example.user.entity;

import java.io.Serializable;

public class OperationData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String numone;
	private String numtwo;
	private String operation;

	public String getNumone() {
		return numone;
	}

	public void setNumone(String numone) {
		this.numone = numone;
	}

	public String getNumtwo() {
		return numtwo;
	}

	public void setNumtwo(String numtwo) {
		this.numtwo = numtwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "User [numone=" + numone + ", numtwo=" + numtwo + ", operation=" + operation + "]";
	}

}
