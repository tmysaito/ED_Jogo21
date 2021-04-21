package ED_Atividade1;

public class Carta {

    private String naipe;
    private String valor;

    public Carta(String naipe, String valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe(){
        return naipe;
    }

    public String getValor(){
        return valor;
    }

    public void print(){
        System.out.println(getValor() + " de " + getNaipe());        
    }

    
}
