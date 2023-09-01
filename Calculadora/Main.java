
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Resultado = 0;
          String fraseEscolha = "Escolha o operador:\n[1]Soma\n[2]Subtração\n[3]Multiplicação\n[4]Divisão\n[5]Sair";

        Scanner input = new Scanner(System.in);
        System.out.println(fraseEscolha);    
        
        int escolha = input.nextInt();

        System.out.println(escolha);

        if(escolha == 5){
            System.out.println("Tchau brigado");
            return;
        };
        Calculadora calculadora = new Calculadora();
        System.out.println("Insira o 1° valor: ");
        double valorUm = input.nextDouble();
                
        System.out.println("Insira o 2° valor: ");
        double valorDois = input.nextDouble();
        
        
        switch (escolha) {
            case 1:
          Resultado = calculadora.adicionar(valorUm, valorDois);
              
                break;

            case 2:
             Resultado = calculadora.subtrair(valorUm, valorDois);
             
                break;  

            case 3:
               Resultado =  calculadora.multiplicar(valorUm, valorDois);
           
                break;

            case 4:
               Resultado =  calculadora.dividir(valorUm, valorDois);
           
                break;
        
            default:
            System.out.println("ERRO");
                break;
        }
         System.out.println("Resultado:"+Resultado);
    }
 }
    
