package telefone;

public class Telefone implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Lingando para ...");
    }

    public void atender() {
        System.out.println("Atendendo ...");
    }

    public void correioVoz() {
        System.out.println("Correio de voz ...");
    }
}
