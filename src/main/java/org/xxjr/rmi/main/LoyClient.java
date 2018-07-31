package org.xxjr.rmi.main;

import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.xxjr.rmi.LoyService;

public class LoyClient {

	public static void main(String[] args) {
		try {
			Context namingContext  = new InitialContext();
			LoyService service1 = (LoyService) namingContext.lookup("rmi://localhost:8891/LoyService1");
			
			System.out.println(service1.show("test"));
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
