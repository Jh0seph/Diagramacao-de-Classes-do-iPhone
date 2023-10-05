package iPhone;

import navegador.NavegadorInternet;
import reprodutor.RepodutorMusicial;
import telefone.AparelhoTelefonico;

public class IPhone implements NavegadorInternet, RepodutorMusicial, AparelhoTelefonico {
    @Override
    public void exibirPagina() {
        System.out.println("iPhone: \n Exibindo página ...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("iPhone: \n Adicionando nova aba ...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("iPhone: \n Atualizando página ...");
    }

    @Override
    public void pausar() {
        System.out.println("iPhone: \n Pausando música ...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("iPhone: \n Selecionando música ...");
    }

    @Override
    public void tocar() {
        System.out.println("iPhone: \n Tocando música ...");
    }

    @Override
    public void ligar() {
        System.out.println("iPhone: \n Lingando para ...");
    }

    @Override
    public void atender() {
        System.out.println("iPhone: \n Atendendo ...");
    }

    @Override
    public void correioVoz() {
        System.out.println("iPhone: \n Correio de voz ...");
    }
}
