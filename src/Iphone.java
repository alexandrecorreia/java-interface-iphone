
import funcionalidades.internet.*;
import funcionalidades.som.*;
import funcionalidades.telefone.*;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        NavegadorInternet navegador = new NavegadorInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
       
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
        navegador.exibirPagina("UOL"); 

        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica("Pearl Jam - Jeremy");

        aparelhoTelefonico.ligar("99999-0000");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }
}
