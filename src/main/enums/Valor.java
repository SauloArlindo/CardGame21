package main.enums;

public enum Valor {
    As(1),
    Dois(2),
    tres(3),
    Quatro(4),
    Cinco(5),
    Seis(6),
    Sete(7),
    Oito(8),
    Nove(9),
    Dez(10),
    Valete(10),
    Dama(10),
    Rei(10);

    private final int pontos;

   Valor(int pontos){
        this.pontos = pontos;
   }

   
   public int getPontos(){
        return pontos;
   }
    

}
