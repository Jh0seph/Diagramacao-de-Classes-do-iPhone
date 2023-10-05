import iPhone.IPhone;
import navegador.Navegador;
import navegador.NavegadorInternet;

public class Usuario {
    public static void main(String[] args) {
        IPhone iPhone;
        iPhone = new IPhone();

        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.pausar();
        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.ligar();
        iPhone.atender();
        iPhone.correioVoz();
    }
}
