package com.capgemini.academia;

import java.util.Scanner;

import com.capgemini.academia.questoes.Questao1;
import com.capgemini.academia.questoes.Questao2;
import com.capgemini.academia.questoes.Questao3;

/**
 * Classe responsável pelo funcionamento do programa
 *
 * @author João victor Macedo
 */
public class Desafio {
  /**
   * Metodo de inicialização e funcionamento do programa
   * 
   * @param args[]
   */
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    boolean rodando = true;
    String menu = """
        -----------------------------------------------------------------------------------------------------
        |                                               Menu                                                |
        -----------------------------------------------------------------------------------------------------
        Questão 1 - Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere *
        e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter
        nenhum espaço.

        Questão 2 - algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados
        para uma string qualquer ser considerada segura

        Questão 3 - Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de
        substrings que são anagramas.

        Digite o numero da questão que você quer executar ou 0 para encerrar o programa: """;
    while (rodando) {
      limpaTela();
      System.out.print(menu);
      int opcão = sc.nextInt();
      switch (opcão) {
        case 0:
          rodando = false;
          break;
        case 1:
          limpaTela();
          System.out.println(Questao1.enunciado());
          int numero = sc.nextInt();
          String resultado = Questao1.desenhoEscada(numero);
          System.out.println(resultado);
          travaTela(sc);
          break;
        case 2:
          limpaTela();
          System.out.println(Questao2.enunciado());
          String palavra2 = sc.next();
          System.out.println(Questao2.numeroMinimoSenha(palavra2));
          travaTela(sc);
          break;
        case 3:
          limpaTela();
          System.out.println(Questao3.enunciado());
          String palavra3 = sc.next();
          System.out.println(Questao3.numeroAnagrama(palavra3));
          travaTela(sc);
          break;
        default:
          break;
      }
    }
    sc.close();
  }

  /**
   * Metodo para limpar a tela do terminal
   * 
   */
  public static void limpaTela() {
    System.out.print("\033[H\033[2J");
  }

  /**
   * Metodo que que trava o terminal até o usuario digitar algo e depois clicar no
   * enter, feito para dá tempo do usuario vê as respostas das questões
   * 
   * @param sc
   *                Scanner para pegar o valor que o usuario digitar
   */
  public static void travaTela(Scanner sc) {
    System.out.println("DIGITE ALGO e aperte 'ENTER' para continuar....");
    sc.next();
  }
}
