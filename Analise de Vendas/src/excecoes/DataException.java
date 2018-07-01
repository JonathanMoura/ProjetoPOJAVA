package excecoes;
import negocio.Mensagem;

public class DataException extends Exception{
	public String getMessage(){
		return Mensagem.DATAEXCP;
	}
}
