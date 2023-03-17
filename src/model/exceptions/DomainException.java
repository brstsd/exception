package model.exceptions;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	//RuntimeException não obriga a tratar as exeções
	
	public DomainException(String message) {
		super(message);
	}

}
