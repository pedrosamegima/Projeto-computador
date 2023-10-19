package InterfaceComputador;

public class Gamer implements Computador {
	@Override
	public void ligar() {
		System.out.println("O computador gamer esta ligado");
	}
	@Override
	public void reiniciar() {
		System.out.println("O computador gamer esta reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("O computador gamer esta desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("O computador gamer esta carregando o sistema");
	}

}
