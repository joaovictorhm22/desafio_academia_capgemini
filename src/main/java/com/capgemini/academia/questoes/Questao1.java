package com.capgemini.academia.questoes;

/**
 * Classe responsável pela questão 1
 *
 * @author João victor Macedo
 */
public class Questao1 {
  /**
   * Metodo que retorna um enuciado simplificado.
   * 
   * @return String contendo um enuciado simplificado
   */
  public static String enunciado() {
    return "Digite um numero: ";
  }

  /**
   * Metodo que retorna o desenho da escada.
   * 
   * @param numero
   *               int que dia a quantidade de linhas que o desenho irá ter
   * 
   * @return String contendo o desnho da escada
   */
  public static String desenhoEscada(int numero) {
    String linha = "";
    for (int i = 1; i <= numero; i++) {
      for (int j = 1; j <= numero - i; j++) {
        linha = linha + " ";
      }
      for (int j = 0; j < i; j++) {
        linha = linha + "*";
      }
      if (i != numero) {
        linha = linha + "\n";
      }
    }
    return linha;
  }
}
