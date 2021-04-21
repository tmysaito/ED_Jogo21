package ED_Atividade1;

import java.util.Scanner;

public class Exercicio_21 {
    public static void main(String[] args) {
        boolean novoJogo = true;
        Scanner entrada = new Scanner(System.in);
        int jogadorVenceu = 0;
        int computadorVenceu = 0;
        

        while(novoJogo == true){
           
            Pontos jogador = new Pontos(5);
            Pontos computador = new Pontos(5);            
            boolean condicao = false;
            int qtde = 0;

            while(condicao == false){
                System.out.print("\n" + "Digite quantos baralhos serão utilizados (1-7): ");
                qtde = entrada.nextInt();
                if(qtde < 1 || qtde > 7){
                    System.out.print("\n" + "Valor inválido");
                }else condicao =  true;            
            }

            entrada.nextLine();

            Baralho baralho = new Baralho(qtde);
            
            hit(jogador, baralho);
            hit(jogador, baralho);
            System.out.println("\n" + "Cartas do jogador: ");
            jogador.print();
            System.out.println("\n" + "Total de pontos do jogador: " + jogador.total());

            boolean continuar = true;
            while(continuar == true && jogador.total() < 21 ){
                System.out.print("\n" + "Deseja mais uma carta? (s/n): ");
                char escolha = entrada.next().charAt(0);
                if(escolha == 's'){
                    hit(jogador, baralho);
                    System.out.println("\n" + "Cartas do jogador: ");
                    jogador.print();
                    System.out.println("\n" + "Total de pontos: " + jogador.total());
                } 
                else continuar = false;  
            }

            hit(computador, baralho);
            hit(computador, baralho);

            if(jogador.total() > 21){
                System.out.println("\n" + "Cartas do computador: ");
                computador.print();
                System.out.println("\n" + "Total de pontos do computador: " + computador.total());
                System.out.println("Computador venceu" + "\n");
                computadorVenceu++;
            }
            else if(computador.total() > jogador.total()){
                System.out.println("\n" + "Cartas do computador: ");
                computador.print();
                System.out.println("\n" + "Total de pontos do computador: " + computador.total());
                System.out.println("Computador venceu" + "\n");
                computadorVenceu++;
            }
            else if(computador.total() < 21){
                while(computador.total() < jogador.total()){
                    hit(computador, baralho);
                    System.out.println("\n" + "Cartas do computador: ");
                    computador.print();
                    System.out.println("\n" + "Total de pontos do computador: " + computador.total());
                } 
                if(computador.total() <= 21 && computador.total() > jogador.total()){
                    System.out.println("Computador venceu" + "\n");
                    computadorVenceu++;
                }
                else {
                    System.out.println("Jogador venceu" + "\n");
                    jogadorVenceu++;
                }

            }

            System.out.println("PLACAR");
            System.out.println("Jogador " + jogadorVenceu + " x " + computadorVenceu + " Computador");

            System.out.print("\n" + "Jogar novamente? (s/n): ");
            char escolha = entrada.next().charAt(0);
            if(escolha == 'n'){
                novoJogo = false;
                baralho.print();
            } 

        }

        entrada.close();

    }

    static void hit(Pontos p, Baralho b){
        p.push(b.pop());
    }

    
}
