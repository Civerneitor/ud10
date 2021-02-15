package error;

public class MiException extends Exception{
	private String messageException;
	
	public MiException(String codigoError) {
		super();
		this.messageException=codigoError;
	}
	
	public MiException() {
		super();
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		String message=messageException;
		
		return message;
	}
	
}
