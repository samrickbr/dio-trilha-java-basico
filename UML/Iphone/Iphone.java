package UML.Iphone;

import UML.Iphone.Aplicativos.Ipod;
import UML.Iphone.Aplicativos.Phone;
import UML.Iphone.Aplicativos.Safari;

public class Iphone {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();
        Safari safari = new Safari();
        Ipod ipod = new Ipod();
        Phone phone = new Phone();

        System.out.println("Funções do telefone:");
        phone.ligar();
        phone.atender();
        phone.iniciarCorreiodeVoz();

        System.out.println("\nFunçoes do reprodutor de música:");
        ipod.selecionarMusica();
        ipod.tocar();
        ipod.pausa();

        System.out.println("\nFunções do navegador de internet:");
        safari.exibirPagina();
        safari.adicionarNovaAba();
        safari.atualizarPagina();

    }
    
}
