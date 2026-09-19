package main.games;

import java.util.List;
import java.util.Scanner;
import main.entities.Baralho;
import main.entities.Carta;
import main.entities.Jogador;
import main.entities.Maquina;

public class Card21 {

    private Baralho baralho;
    private String name;
    private Jogador player;
    private Maquina maquina;

    Scanner sc = new Scanner(System.in);
    public void iniciarJogo(){
        baralho = new Baralho();
        System.out.print("Insira o Nome do Jogador :");
        name = sc.nextLine();
        player = new Jogador(name);
        maquina = new Maquina("Computador");
    }

    public void distribuirCartas(){
        for (int i = 0 ; i < 2; i++){
            player.addCartaMao(baralho.RetirarCarta());
            maquina.addCartaMao(baralho.RetirarCarta());
        }
    }
    public List<Carta> mostrarCartasPlayer(){
        return player.getCartasMao();
        
    }

}
