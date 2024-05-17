package funcionalidades.telefone;

public class AparelhoTelefonico implements Telefone {

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligar para o numero " + numero + " Aparelho Telefonico");
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atender Aparelho Telefonico");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz Aparelho Telefonico");
        
    }


}
