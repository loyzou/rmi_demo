package org.xxjr.rmi.main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.xxjr.rmi.impl.LoyServiceImpl;

/***
 * 远程服务
 * @author sty
 *
 */
public class LoySever {

	public static void main(String[] args) {
		
		try {
			LoyServiceImpl service1 = new LoyServiceImpl("loyService1");
			/*LoyServiceImpl service2 = new LoyServiceImpl("loyService2");*/
			
			Context namingConext = new InitialContext();
			LocateRegistry.createRegistry(8891);
			namingConext.rebind("rmi://localhost:8891/LoyService1", service1);
/*			namingConext.rebind("rmi:LoyService2", service2);*/
			System.out.println("服务端注册了对象");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
