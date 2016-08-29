package br.aeso.aula05;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class CalculatorImplement 
	extends UnicastRemoteObject 
	implements ICalculator {
	protected CalculatorImplement() throws RemoteException {
		super();
	}
	public long addition(long a, long b) throws RemoteException {
		return a+b;
	}
	public long subtraction(long a, long b) throws RemoteException {
		return a-b;
	}
	public long multiplication(long a, long b) throws RemoteException {
		return a*b;
	}
	public long divisiton(long a, long b) throws RemoteException {
		return a/b;
	}
}
