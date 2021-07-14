package com.example.arithmatic.operations.entity;

public class Operands {
	private String numone;
	private String numtwo;
	private String result;
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
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "Operands [numone=" + numone + ", numtwo=" + numtwo + ", result=" + result + ", operation=" + operation
				+ "]";
	}

}
