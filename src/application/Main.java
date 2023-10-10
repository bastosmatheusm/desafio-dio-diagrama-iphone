package application;

import smartphone.Iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iPhone = new Iphone();
		
		iPhone.adicionarAba();
		iPhone.atender();
		iPhone.atualizarPagina();
		iPhone.exibirPagina();
		iPhone.iniciarCorrerioVoz();
		iPhone.ligar();
		iPhone.pausar();
		iPhone.selecionarMusica();
		iPhone.tocar();

	}

}
