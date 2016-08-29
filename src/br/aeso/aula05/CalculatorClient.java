package br.aeso.aula05;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
public class CalculatorClient {
	public static void main(String[] args) {
		try {
			ICalculator calculator = (ICalculator) 
					Naming.lookup("//127.0.0.1:1079/CalculatorService");
			System.out.println("Addition: " + calculator.addition(1, 1));
			System.out.println("Divisiton: " + calculator.divisiton(10, 2));
			System.out.println("Divisiton: " + calculator.multiplication(2, 5));
			System.out.println("Divisiton: " + calculator.subtraction(1, 1));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
