public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA NO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA NO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA NO IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA NO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA NO NAVEGADOR DO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA NO NAVEGADOR DO IPHONE");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO DO IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO O IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ DO IPHONE");
    }
    
}
