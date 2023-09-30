package DesafioPOO;

public class MeuTelefone {
    public static void main(String[] args) {
        NewIphone newIphone = new NewIphone();

        System.out.println("\nResolução Desafio POO");

        System.out.println("\nIniciando Serviço de Controle de Volume");
        System.out.println("Volume inicial: " + newIphone.getVolume());

        newIphone.aumentarVolume();
        System.out.println("Volume após aumentar: " + newIphone.getVolume());

        newIphone.diminuirVolume();
        System.out.println("Volume após diminuir: " + newIphone.getVolume());

        System.out.println("\nIniciando Serviço Chamada Telefônica");
        newIphone.efetuarLigacao();
        System.out.println("Efetuando Ligacao!");

        newIphone.atenderLigacao();
        System.out.println("Atendendo Ligacao!");

        newIphone.iniciarCorreioDeVoz();
        System.out.println("Iniciando Correio de Voz");

        System.out.println("\nIniciando Serviço Navegador de Internet");
        newIphone.exibirPagina();
        System.out.println("Exibindo Página no Navegador");

        newIphone.atualizarPagina();
        System.out.println("Atualizando Página no Navagador");

        newIphone.adicionarNovaAba();
        System.out.println("Abrindo Nova Página no Navegador");

        System.out.println("\nIniciando Serviço de Mídia");
        newIphone.selecionarMidia();
        System.out.println("Selecionando Midia!");

        newIphone.reproduzirMidia();
        System.out.println("Reproduzindo Midia!");

        newIphone.pausarMidia();
        System.out.println("Pausando Midia!");

    }
    
}
