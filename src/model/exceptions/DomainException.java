package model.exceptions;

//RunTimeExeption n�o te obriga a tratar as exce��es no c�digo fonte
//1o tratado com Exception
public class DomainException extends RuntimeException {
	//Lan�ar numero de serie
	private static final long serialVersionUID = 1L;
	
	//Exceptions personalizadas 
	public DomainException(String msg) {
		super(msg);
	}
}
