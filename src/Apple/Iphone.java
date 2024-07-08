package Apple;

import Apple.Internet.NavegadorInternet;
import Apple.ReprodutorMusica.ReprodutorMusical;
import Apple.Telefonico.AparelhoTelefonico;

public abstract class Iphone implements ReprodutorMusical , AparelhoTelefonico , NavegadorInternet {

    private String musicaAtual;


    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }


    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("Tocando música: " + musicaAtual);
        } else {
            System.out.println("Nenhuma música selecionada para tocar.");
        }
    }
    public void pausar() {
        boolean estaTocando = false;
        if (estaTocando){
            System.out.println("Música pausada.");
        } else {
            System.out.println("Não há música tocando para pausar.");
        }

    }
      public void ligar(String numero){
          System.out.println("Ligando para " + numero + "...");
   }
     public void atender(){
         System.out.println("Chamada atendida.");
   }
    public void iniciarCorreioVoz(){
       System.out.println("Iniciando correio de voz...");
    }
    public  void exibirPagina(String url){
        System.out.println("Exibindo " + url);
    }
   public void adicionarNovaAba(){
       System.out.println("Nova aba adicionada: ");
    }
   public void atualizarPagina(){
System.out.println("Atualizando a pagina");
   }
}
