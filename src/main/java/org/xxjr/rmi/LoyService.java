package org.xxjr.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoyService extends Remote {

	public String show(String msg) throws RemoteException;
}
