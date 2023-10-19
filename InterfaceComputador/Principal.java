package InterfaceComputador;

public class Principal {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------");
		Gamer gamer = new Gamer();
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		System.out.println("-----------------------------------------------------------");
		Home home = new Home();
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
		System.out.println("-----------------------------------------------------------");

	}

}
