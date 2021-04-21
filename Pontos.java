package ED_Atividade1;

public class Pontos {
    
    private Carta baralho[];
    private int topo; 

    public Pontos(int max) {
		this.baralho = new Carta[max];
		this.topo = 0;
	}

	public void push(Carta carta) {
                if(!this.isFull()) { 
                    this.baralho[this.topo] = carta;
                    this.topo++;		
                }
            }
      
    public boolean isFull() {
        if(this.topo == this.baralho.length)
            return true;
        else 
            return false;
    }

    public int total(){
        int total=0;
        boolean as = false;
        for(Carta a : baralho){
            if(a!=null){
                switch(a.getValor()){
                    case "A":
                    total += 1;
                    as = true;
                    break; 
                    case "2":
                    total += 2;
                    break;               
                    case "3":
                    total += 3;
                    break;               
                    case "4":
                    total += 4;
                    break;              
                    case "5":
                    total += 5;
                    break;              
                    case "6":
                    total += 6;
                    break;               
                    case "7":
                    total += 7;
                    break;              
                    case "8":
                    total += 8;
                    break;               
                    case "9":
                    total += 9;
                    break;               
                    case "10":                             
                    case "J": 
                    case "Q":                
                    case "K":
                    total += 10;
                    break;
                } 
            }             

        }
        if(as && total+10 <= 21){
            total += 10;
        }
        return total;
    }

    public void print(){
        for(Carta a : baralho){
            if(a!=null){
            System.out.println(a.getValor() + " de " + a.getNaipe());
            }
        }
    }


}
