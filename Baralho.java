package ED_Atividade1;

import java.util.Random;

public class Baralho {

private Carta baralho[];
private int topo;  

String[] naipe = {"Paus", "Ouros", "Copas", "Espadas"};
String[] valor = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};


public Baralho(int num){
    this.baralho = new Carta[num*52];
    this.topo = 0;

    for(int a=0;a<num;a++){
        for(int b=0;b<4;b++){
            for(int c=0;c<13;c++){
                Carta carta = new Carta(naipe[b],valor[c]);
                //baralho.push(carta);
                this.baralho[this.topo] = carta;
                this.topo++;
            }
        }
    }
    embaralhar();
}

public Carta pop() {
            if(!this.isEmpty()) { 
                this.topo--;
                return this.baralho[this.topo];
            } else {
                System.out.println("Pilha Vazia!");
                return null;
            }
        }


public boolean isEmpty() {
    if(this.topo == 0)
        return true;
    else 
        return false;
}


public int size() {
    return this.topo;
}

public void print(){
    for(int i=0; i<topo; i++){
        System.out.println(baralho[i].getValor() + " de " + baralho[i].getNaipe());
    }
}

public void embaralhar(){
    Random aleatorio = new Random();
    for(int i=0; i < baralho.length; i++){
        int random = aleatorio.nextInt(baralho.length);
        Carta temp = baralho[i];
        baralho[i] = baralho[random];
        baralho[random] = temp;
    }
}


}


