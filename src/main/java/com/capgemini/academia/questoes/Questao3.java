package com.capgemini.academia.questoes;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe responsável pela questão 3
 *
 * @author João victor Macedo
 */
public class Questao3 {
  /**
   * Metodo que retorna um enuciado simplificado.
   * 
   * @return String contendo um enuciado simplificado
   */
  public static String enunciado() {
    return "Digite uma palavra: ";
  }

  /**
   * Metodo que retorna uma string informando a quantidade de anagramas pares das
   * subtrings da palavra.
   * 
   * @param palavra
   *                String que será analisada para saber os anagramas pares da
   *                substrings
   * 
   * @return String informando a a quantidade de anagramas pares da substrings
   */
  public static String numeroAnagrama(String palavra) {
    int numero = 0;
    palavra = palavra.toLowerCase();
    ArrayList<String> substrings = todasSubstrings(palavra);
    for (int i = 0; i < substrings.size(); i++) {
      for (int j = substrings.size() - 1; j > i; j--) {
        boolean anagrama = isAnagrama(substrings.get(i), substrings.get(j));
        if (anagrama) {
          numero++;
        }
      }
    }
    return String.format("A palavra '%s' tem %d anagramas pares em suas substrings", palavra, numero);
  }

  /**
   * Metodo que retorna um ArrayList contendo todas as substrings da palavra
   * 
   * @param palavra
   *                String que será analisada coletar suas substrings
   * 
   * @return ArrayList contendo todas as substrings da palavra
   */
  public static ArrayList<String> todasSubstrings(String palavra) {
    ArrayList<String> substrings = new ArrayList<>();
    for (int i = 0; i < palavra.length(); i++) {
      for (int j = i; j < palavra.length(); j++) {
        String substring = palavra.substring(i, j + 1);
        substrings.add(substring);
      }
    }
    return substrings;
  }

  /**
   * Metodo que verifica se as strings passadas são anagramas e retorna um boolean
   * informando se é anagrama ou não
   * 
   * @param string1 string que será comparada com a outra para verificar se são
   *                anagramas
   * @param string2 string que será comparada com a outra para verificar se são
   *                anagramas
   * 
   * @return boolean informando se é anagrama ou não
   */
  public static boolean isAnagrama(String string1, String string2) {
    if (string1 == null || string2 == null) {
      return false;
    }
    if (string1.length() != string2.length()) {
      return false;
    }
    char[] stringTemporaria1 = string1.toCharArray();
    char[] stringTemporaria2 = string2.toCharArray();

    Arrays.sort(stringTemporaria1);
    Arrays.sort(stringTemporaria2);

    return Arrays.equals(stringTemporaria1, stringTemporaria2);
  }
}
