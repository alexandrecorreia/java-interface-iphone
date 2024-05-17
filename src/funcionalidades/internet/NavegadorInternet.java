package funcionalidades.internet;

public class NavegadorInternet implements Internet {

    @Override
    public void exibirPagina(String url) {
       System.out.println("Exibir Pagina " + url + "Navegador Internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicioinar nova aba Navegador Internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina Navegador Internet");
    }
}
