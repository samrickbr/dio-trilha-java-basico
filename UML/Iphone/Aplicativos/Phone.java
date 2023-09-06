package UML.Iphone.Aplicativos;

import UML.Iphone.Funcoes.Telefone;

public class Phone implements Telefone {

    // telefone
    @Override
    public void ligar() {
        System.out.println("Realizando uma ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreiodeVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
