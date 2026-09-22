package main.games;

import java.util.Scanner;
import main.entities.Baralho;
import main.entities.Jogador;
import main.entities.Maquina;
import main.enums.Decisao;


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
    public void mostrarCartasPlayer(){
        System.out.println("Suas Cartas :" + player.getCartasMao());
        System.out.println("Pontos:"+ player.calcularPonto());
    }
    public void turnoJogador(){
        int escolha = 1;
        while (escolha != 2){
            mostrarCartasPlayer();
            if (player.calcularPonto() < 21){
                System.out.println("Deseja Comprar uma Carta:  1 para comprare 2 para terminar o turno");
                if (sc.hasNextInt()){    
                    escolha = sc.nextInt();
                    if (escolha == 1){
                        player.addCartaMao(baralho.RetirarCarta());
                    }
                    if (escolha != 1 && escolha != 2){
                        System.out.println("Opçao invalida digite somente 1 para comprar e 2 para terminar");
                    }
                }else{
                    System.out.println("Opçao invalida digite somente 1 para comprar e 2 para terminar");
                    sc.next();
                }
            }else{
                escolha = 2;
                System.out.println("Chegou ou ultrapassou o limite");
            }
        }
    }
    public void turnoMaquina(){
        while(maquina.decidirJogada() == Decisao.COMPRAR){
                maquina.addCartaMao(baralho.RetirarCarta());
        }
    }
    public void resultadoPartida(){
        int pontoplayer = player.calcularPonto();
        int pontomaquina = maquina.calcularPonto();
        System.out.println("Cartas Maquina :" + maquina.getCartasMao() +"\n Pontuação :" + pontomaquina);
        System.out.println("Cartas Player :" + player.getCartasMao() +"\n Pontuação :" + pontoplayer);
        
        String resultado = " ";
        if (pontoplayer > 21) {
            resultado = "Jogador Estourou Derrota";
        }else if(pontomaquina > 21){
            resultado = "Maquina Estourou Jogador Venceu";
        }else if(pontomaquina > pontoplayer){
            resultado = "Maquina Venceu";
        }else if(pontomaquina < pontoplayer){
            resultado = "Jogador Venceu";
        }else if(pontomaquina == pontoplayer){
            resultado =  "Empate";
        }
        System.out.println(resultado);
    }
    

}
