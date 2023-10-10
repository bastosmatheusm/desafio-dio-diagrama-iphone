package smartphone;

import smartphone.internet.NavegadorDeInternet;
import smartphone.ligacao.AparelhoTelefonico;
import smartphone.musica.ReprodutorMusical;

public class Iphone implements NavegadorDeInternet, AparelhoTelefonico, ReprodutorMusical {
	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Página");
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");

	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");

	}

	@Override
	public void iniciarCorrerioVoz() {
		System.out.println("Acessando correio de voz");

	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo música");

	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");

	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");

	}

}
