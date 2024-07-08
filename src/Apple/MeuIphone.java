package Apple;

public class MeuIphone extends Iphone {
    public static void main(String[] args) {
        MeuIphone meuIphone = new MeuIphone();

        // Exemplo de uso das funcionalidades herdadas
        meuIphone.selecionarMusica("MusicaX");
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
