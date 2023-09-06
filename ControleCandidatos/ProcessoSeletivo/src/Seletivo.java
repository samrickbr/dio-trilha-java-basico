package ControleCandidatos.ProcessoSeletivo.src;

import java.util.concurrent.ThreadLocalRandom;

public class Seletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo.");   
        selecaoCandidatos(); 
    }

    static void selecaoCandidatos(){
        String[] candidatos = {"Felipe", "Márcia", "Júlia", "Paulo", "Augusto", "Mônica", "Fabrício", "Mirela", "Daniela", "Jorge"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salariobase = 2000.0;
        
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário: R$ " + salarioPretendido);
            if(salariobase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase >salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO!");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA!");
        }else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }            
    }
}
