package UML.Iphone.src.Aplicativos;

import UML.Iphone.src.Funcoes.Navegador;

public class Safari implements Navegador{
    // navegador
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página atual do navegador");
    }
    
}
