package org.xxjr.rmi.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.xxjr.rmi.LoyService;

public class LoyServiceImpl extends UnicastRemoteObject implements LoyService {
	private String serviceName;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LoyServiceImpl(String serviceName) throws RemoteException {
		this.setServiceName(serviceName);
		System.out.println("remote instance.......");
	}

	public String show(String msg) throws RemoteException {
		System.out.println("remote:" + msg);
		return "loys";
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
