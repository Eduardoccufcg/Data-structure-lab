package route5;

public class QueueUnderflowException extends Exception {

	public QueueUnderflowException() {
		super("Fila vazia");
	}

}
