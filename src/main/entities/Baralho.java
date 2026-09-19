package main.entities;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import main.enums.Naipe;
import main.enums.Valor;


public final class Baralho {


    
    private final List<Carta> baralho = new ArrayList<>();

   public Baralho(){
        ConstruirBaralho();
        Embaralhar();
   }

    public List<Carta> getBaralho() {
        return baralho;
    }

    public void ConstruirBaralho(){
        baralho.clear();
        for(Naipe simboloNaipe : Naipe.values()){
            for(Valor valorCarta : Valor.values()){                
                baralho.add(new Carta(simboloNaipe,valorCarta));
            }
        }
    }
    
    public void Embaralhar(){
        Collections.shuffle(baralho);
    }
    
    public Carta RetirarCarta(){
        Carta retirada = baralho.getFirst();
        baralho.remove(0);
        return retirada;
    }
}
