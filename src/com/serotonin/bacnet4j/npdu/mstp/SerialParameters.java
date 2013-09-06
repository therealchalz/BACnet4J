package com.serotonin.bacnet4j.npdu.mstp;

import jssc.SerialPort;

public class SerialParameters {
	private int baudrate = SerialPort.BAUDRATE_9600;
	private int databits = SerialPort.DATABITS_8;
	private int stopbits = SerialPort.STOPBITS_1;
	private int parity = SerialPort.PARITY_NONE;
	private int flowcontrol = SerialPort.FLOWCONTROL_NONE;
	private String commPortId = "";
	
	public int getBaudrate() {
		return baudrate;
	}
	public void setBaudrate(int baudrate) {
		this.baudrate = baudrate;
	}
	public int getDatabits() {
		return databits;
	}
	public void setDatabits(int databits) {
		this.databits = databits;
	}
	public int getStopbits() {
		return stopbits;
	}
	public void setStopbits(int stopbits) {
		this.stopbits = stopbits;
	}
	public int getParity() {
		return parity;
	}
	public void setParity(int parity) {
		this.parity = parity;
	}
	public int getFlowcontrol() {
		return flowcontrol;
	}
	public void setFlowcontrol(int flowcontrol) {
		this.flowcontrol = flowcontrol;
	}
	public String getCommPortId() {
		return commPortId;
	}
	public void setCommPortId(String commPortId) {
		this.commPortId = commPortId;
	}
}
