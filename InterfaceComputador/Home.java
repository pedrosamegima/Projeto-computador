package InterfaceComputador;

public class Home implements Computador {
	@Override
	public void ligar() {
		System.out.println("O computador home esta ligado");
	}
	@Override
	public void reiniciar() {
		System.out.println("O computador home esta reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("O computador home esta ldesligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("O computador home esta carregando o sistema");
	}
}
