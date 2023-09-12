package exception;

// quando uma classe é uma execao, coloca-se um sufiquiço exception
// o runtimeException é um tipo exceçao que o conpilador não é obrigado a tratar
public class DomainExcetion extends RuntimeException {

	// é assim que se decrara uma versão de uma clsse serializable
	private static final long serialVersionUID = 1L;

	// isso permite instaciar a minha exceçao personalizada passado uma msg para ela, que irá ficar armazenada dentro da minha exceção
	public DomainExcetion (String msg) {
		super(msg);
	}
	
}
