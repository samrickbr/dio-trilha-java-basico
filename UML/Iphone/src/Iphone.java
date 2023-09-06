package UML.Iphone.src;

import UML.Iphone.src.Aplicativos.Ipod;
import UML.Iphone.src.Aplicativos.Phone;
import UML.Iphone.src.Aplicativos.Safari;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        final Safari safari = new Safari();
        final Ipod ipod = new Ipod();
        final Phone phone = new Phone();

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
