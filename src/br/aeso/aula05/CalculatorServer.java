package br.aeso.aula05;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
public class CalculatorServer {
	public CalculatorServer() {
		try {
			LocateRegistry.createRegistry(1079); // create registry
			ICalculator calculator = new CalculatorImplement();
			Naming.rebind("rmi://172.16.9.204:1079/CalculatorService", 
					calculator);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new CalculatorServer();
	}
}
