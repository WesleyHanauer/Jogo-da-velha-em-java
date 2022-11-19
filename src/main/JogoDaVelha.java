package main;

/**
 *
 * @author Wesley
 */

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class JogoDaVelha {
    static Scanner ler = new Scanner(System.in);
    String[][] tabuleiro={{"1","2","3"},{"4","5","6"},{"7","8","9"}};
    static int vencedor = 0;
    public static String modoDeJogo="0";
    public static int jogadas=0;
    
    public void mostrarTabuleiro(){
        for(int linhas=0;linhas<3;linhas++){
            for(int colunas=0;colunas<3;colunas++){
                System.out.printf("   "+tabuleiro[linhas][colunas]);
            }
            System.out.println(" ");
        }
    }

    public boolean validarJogada(String posicao){
        for(int linhas=0;linhas<3;linhas++){
            for(int colunas=0;colunas<3;colunas++){
                if (tabuleiro[linhas][colunas].equals(posicao)){
                    return false;
                }
            }
        }
        return true;
    }

    public void fazerJogada(String posicao, String jogador){
        switch (posicao) {
            case "1" -> tabuleiro[0][0] = jogador;
            case "2" -> tabuleiro[0][1] = jogador;
            case "3" -> tabuleiro[0][2] = jogador;
            case "4" -> tabuleiro[1][0] = jogador;
            case "5" -> tabuleiro[1][1] = jogador;
            case "6" -> tabuleiro[1][2] = jogador;
            case "7" -> tabuleiro[2][0] = jogador;
            case "8" -> tabuleiro[2][1] = jogador;
            case "9" -> tabuleiro[2][2] = jogador;
        }
    }
    
    public void verificarVencedor(String posicao){
        if(modoDeJogo.equals("1")){
            if(tabuleiro[0][0].equals("X")&&tabuleiro[0][1].equals("X")&&tabuleiro[0][2].equals("X")
                ||tabuleiro[1][0].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[1][2].equals("X")
                ||tabuleiro[2][0].equals("X")&&tabuleiro[2][1].equals("X")&&tabuleiro[2][2].equals("X")
                ||tabuleiro[0][0].equals("X")&&tabuleiro[1][0].equals("X")&&tabuleiro[2][0].equals("X")
                ||tabuleiro[0][1].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[2][1].equals("X")
                ||tabuleiro[0][2].equals("X")&&tabuleiro[1][2].equals("X")&&tabuleiro[2][2].equals("X")
                ||tabuleiro[0][0].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[2][2].equals("X")
                ||tabuleiro[0][2].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[2][0].equals("X")
                ){
                System.out.println();
                System.out.println("Jogador 1 venceu!");
                vencedor=1;
            }else if(tabuleiro[0][0].equals("O")&&tabuleiro[0][1].equals("O")&&tabuleiro[0][2].equals("O")
                ||tabuleiro[1][0].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[1][2].equals("O")
                ||tabuleiro[2][0].equals("O")&&tabuleiro[2][1].equals("O")&&tabuleiro[2][2].equals("O")
                ||tabuleiro[0][0].equals("O")&&tabuleiro[1][0].equals("O")&&tabuleiro[2][0].equals("O")
                ||tabuleiro[0][1].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[2][1].equals("O")
                ||tabuleiro[0][2].equals("O")&&tabuleiro[1][2].equals("O")&&tabuleiro[2][2].equals("O")
                ||tabuleiro[0][0].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[2][2].equals("O")
                ||tabuleiro[0][2].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[2][0].equals("O")){
                System.out.println();
                System.out.println("Jogador 2 venceu!");
                vencedor=2;
            }
        }else if(modoDeJogo.equals("2")){
            if(tabuleiro[0][0].equals("X")&&tabuleiro[0][1].equals("X")&&tabuleiro[0][2].equals("X")
                ||tabuleiro[1][0].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[1][2].equals("X")
                ||tabuleiro[2][0].equals("X")&&tabuleiro[2][1].equals("X")&&tabuleiro[2][2].equals("X")
                ||tabuleiro[0][0].equals("X")&&tabuleiro[1][0].equals("X")&&tabuleiro[2][0].equals("X")
                ||tabuleiro[0][1].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[2][1].equals("X")
                ||tabuleiro[0][2].equals("X")&&tabuleiro[1][2].equals("X")&&tabuleiro[2][2].equals("X")
                ||tabuleiro[0][0].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[2][2].equals("X")
                ||tabuleiro[0][2].equals("X")&&tabuleiro[1][1].equals("X")&&tabuleiro[2][0].equals("X")
                ){
                System.out.println();
                System.out.println("Jogador 1 venceu!");
                vencedor=1;
            }else if(tabuleiro[0][0].equals("O")&&tabuleiro[0][1].equals("O")&&tabuleiro[0][2].equals("O")
                ||tabuleiro[1][0].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[1][2].equals("O")
                ||tabuleiro[2][0].equals("O")&&tabuleiro[2][1].equals("O")&&tabuleiro[2][2].equals("O")
                ||tabuleiro[0][0].equals("O")&&tabuleiro[1][0].equals("O")&&tabuleiro[2][0].equals("O")
                ||tabuleiro[0][1].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[2][1].equals("O")
                ||tabuleiro[0][2].equals("O")&&tabuleiro[1][2].equals("O")&&tabuleiro[2][2].equals("O")
                ||tabuleiro[0][0].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[2][2].equals("O")
                ||tabuleiro[0][2].equals("O")&&tabuleiro[1][1].equals("O")&&tabuleiro[2][0].equals("O")){
                System.out.println();
                System.out.println("O computador venceu!");
                vencedor=2;
            }
        }
        if(jogadas==8){
            System.out.println();
            System.out.println("Empate!");
            vencedor=3;
        }
        if(vencedor!=0){
            modoDeJogo="0";
        }
    }
    
    public void escolherModoDeJogo(){
        if(modoDeJogo.equals("0")){
            System.out.println(" ");
            System.out.println("Escolha o modo de jogo:");
            System.out.println(" ");
            System.out.println("Jogador contra jogador: digite 1.");
            System.out.println(" ");
            System.out.println("Jogador contra maquina: digite 2.");
            System.out.println(" ");
            System.out.println("Sair do jogo: digite 3.");
            System.out.println(" ");
            modoDeJogo = ler.next();
            while(!Objects.equals(modoDeJogo, "0") &&!Objects.equals(modoDeJogo, "1")&&!Objects.equals(modoDeJogo, "2")&&!Objects.equals(modoDeJogo, "3")){
                System.out.println("Modo de jogo invalido, tente novamente.");
                modoDeJogo = ler.next();
            }
        }
    }
    
    public static void main(String[] args){
        while(!modoDeJogo.equals("3")){
            JogoDaVelha jogo = new JogoDaVelha();
            jogo.escolherModoDeJogo();
            if(!modoDeJogo.equals("3")){
                jogo.mostrarTabuleiro();
            }
            String posicao;
            jogadas=0;
            while(modoDeJogo.equals("1")){
                vencedor=0;
                System.out.println(" ");
                System.out.println("Jogador 1, informe uma posicao: ");
                System.out.println(" ");
                posicao = ler.next();
                while(jogo.validarJogada(posicao)){
                    System.out.println(" ");
                    System.out.println("Jogada invalida!");
                    System.out.println("Jogador 1, informe uma posicao: ");
                    System.out.println(" ");
                    posicao = ler.next();
                }
                jogo.fazerJogada(posicao, "X");
                jogo.mostrarTabuleiro();
                jogo.verificarVencedor(posicao);
                jogadas++;
                if (vencedor==0){
                    System.out.println(" ");
                    System.out.println("Jogador 2, informe uma posicao: ");
                    System.out.println(" ");
                    posicao = ler.next();
                    while(jogo.validarJogada(posicao)){
                        System.out.println(" ");
                        System.out.println("Jogada invalida!");
                        System.out.println("Jogador 2, informe uma posicao: ");
                        System.out.println(" ");
                        posicao = ler.next();
                    }
                    jogo.fazerJogada(posicao, "O");
                    jogo.mostrarTabuleiro();
                    jogo.verificarVencedor(posicao);
                    jogadas++;
                }
            }

            while(modoDeJogo.equals("2")){
                vencedor=0;
                System.out.println(" ");
                System.out.println("Jogador 1, informe uma posicao: ");
                System.out.println(" ");
                posicao = ler.next();
                while(jogo.validarJogada(posicao)){
                    System.out.println(" ");
                    System.out.println("Jogada invalida!");
                    System.out.println("Jogador 1, informe uma posicao: ");
                    System.out.println(" ");
                    posicao = ler.next();
                }
                jogo.fazerJogada(posicao, "X");
                jogo.mostrarTabuleiro();
                jogo.verificarVencedor(posicao);
                jogadas++;
                if(vencedor==0){
                    Random rand=new Random();
                    int random=rand.nextInt(9)+1;
                    String posicao1=String.valueOf(random);
                    System.out.println(" ");
                    System.out.println("Vez do computador: ");
                    System.out.println(" ");
                    while(jogo.validarJogada(posicao1)){
                        random=rand.nextInt(9)+1;
                        posicao1=String.valueOf(random);
                    }
                    jogo.fazerJogada((posicao1), "O");
                    jogo.mostrarTabuleiro();
                    jogo.verificarVencedor(posicao1);
                    jogadas++;
                }
            }
            
        }
    }
}