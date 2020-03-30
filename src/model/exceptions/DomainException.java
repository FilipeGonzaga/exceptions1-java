package model.exceptions;

//RunTimeExeption não te obriga a tratar as exceções no código fonte
//1o tratado com Exception
public class DomainException extends RuntimeException {
	//Lançar numero de serie
	private static final long serialVersionUID = 1L;
	
	//Exceptions personalizadas 
	public DomainException(String msg) {
		super(msg);
	}
}
