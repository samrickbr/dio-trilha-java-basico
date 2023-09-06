package UML.Iphone.Aplicativos;

import UML.Iphone.Funcoes.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    // reprodutor de musica
    @Override
    public void tocar() {
        System.out.println("Tocando a música");
    }

    @Override
    public void pausa() {
        System.out.println("Pausando a música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

}
