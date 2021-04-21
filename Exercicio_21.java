package ED_Atividade1;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {

        Pontos jogador = new Pontos(5);
        Pontos computador = new Pontos(5);
        Scanner entrada = new Scanner(System.in);
        
        // System.out.print("Digite quantos baralhos serão utilizados (1-7): ");
        // int qtde = entrada.nextInt();
        // entrada.nextLine();

        //Baralho baralho = new Baralho(qtde); 

        Baralho baralho = new Baralho(1);
        jogador.push(baralho.pop());
        jogador.push(baralho.pop());

        System.out.println(baralho.size());
        baralho.print();

       

        // jogador.push(baralho.pop());
        // jogador.push(baralho.pop());

        // jogador.print();
        // System.out.print(jogador.total());

        


        
        //Collections.shuffle(baralho);

        //baralho.print();

        //baralho.embaralhar();
        //System.out.println(baralho.size());
        //baralho.print();


        entrada.close();
    }
    
}
