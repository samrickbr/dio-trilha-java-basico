import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int input1 = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int input2 = terminal.nextInt();
            
            try {
            	//chamando o método contendo a lógica de contagem
            	contar(input1, input2);
            
            }catch (ParametrosInvalidosException exception) {
            	//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(ParametrosInvalidosException.parametroInvalido());
            }
        }
		
	}

    static void contar(int input1, int input2) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(input1 > input2){
            System.out.println(ParametrosInvalidosException.parametroInvalido());
        }else{
            int contagem = input2 - input1;
            // realizar o for para imprimir os números com base na variável contagem
            for(int indice=0; indice <= contagem; indice++){
                System.out.println("Imprimindo o número " + (input1+indice));
            }
        }
    }
}
