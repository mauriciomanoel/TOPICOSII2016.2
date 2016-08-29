package br.aeso.aula05;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface ICalculator extends Remote {
	public long addition(long a, long b) throws RemoteException;
	public long subtraction(long a, long b) throws RemoteException;
	public long multiplication(long a, long b) throws RemoteException;
	public long divisiton(long a, long b) throws RemoteException;
}
