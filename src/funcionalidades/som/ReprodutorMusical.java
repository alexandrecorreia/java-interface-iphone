package funcionalidades.som;

public class ReprodutorMusical implements Audio {

    @Override
    public void tocar() {
        System.out.println("Tocar ReprodutorMusical");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar ReprodutorMusical");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica Selecionada " + musica + " ReprodutorMusical");        
    }

}
