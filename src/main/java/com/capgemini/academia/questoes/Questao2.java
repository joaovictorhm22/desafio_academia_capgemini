package com.capgemini.academia.questoes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe responsável pela questão 2
 *
 * @author João victor Macedo
 */
public class Questao2 {
  /**
   * Metodo que retorna um enuciado simplificado.
   * 
   * @return String contendo um enuciado simplificado
   */
  public static String enunciado() {
    return """
        A senha deve ter:
          - No mínimo 6 caracteres.
          - No mínimo 1 digito.
          - No mínimo 1 letra em minúsculo.
          - No mínimo 1 letra em maiúsculo.
          - No mínimo 1 caractere especial.
        Digite uma senha: """;
  }

  /**
   * Metodo que retorna uma string informando a situação da senha.
   * 
   * @param palavra
   *                String que será analisada para saber se cumpre os requisitos
   *                de senha forte
   * 
   * @return String informando a situação da senha
   */
  public static String numeroMinimoSenha(String palavra) {
    int numero = palavra.length();
    int numeroMinimo = 0;
    if (temCaracterEspecial(palavra) && temCaracterMaiusculo(palavra) && temCaracterMinusculo(palavra)
        && temNumero(palavra)) {
      if (numero < 6) {
        numeroMinimo = 6 - numero;
        return String.format("Sua senha precisa de +%d caracteres", numeroMinimo);
      } else {
        return "Sua senha é forte";
      }
    } else {
      if (numero < 6) {
        numeroMinimo = 6 - numero;
        return String.format("Sua senha precisa de +%d caracteres e não cumpre algumas regras", numeroMinimo);
      } else {
        return "Sua senha não cumpre algumas regras";
      }
    }
  }

  /**
   * Metodo que retorna um boolean informando se a palavra contém caracter
   * especial.
   * 
   * @param palavra
   *                String que será analisada para saber se cumpre o requisito de
   *                caracter especial
   * 
   * @return Boolean, true - se contém caracter especial e false - se não contém
   */
  public static boolean temCaracterEspecial(String palavra) {
    Pattern pattern = Pattern.compile("\\W");
    Matcher matcher = pattern.matcher(palavra);
    return matcher.find();
  }

  /**
   * Metodo que retorna um boolean informando se a palavra contém numero.
   * 
   * @param palavra
   *                String que será analisada para saber se cumpre o requisito de
   *                conter digito
   * 
   * @return Boolean, true - se contém digito e false - se não contém
   */
  public static boolean temNumero(String palavra) {
    Pattern pattern = Pattern.compile("\\d");
    Matcher matcher = pattern.matcher(palavra);
    return matcher.find();
  }

  /**
   * Metodo que retorna um boolean informando se a palavra contém caracter
   * maiusculo.
   * 
   * @param palavra
   *                String que será analisada para saber se cumpre o requisito de
   *                conter caracter maiusculo
   * 
   * @return Boolean, true - se contém caracter maiusculo e false - se não contém
   */
  public static boolean temCaracterMaiusculo(String palavra) {
    Pattern pattern = Pattern.compile("[A-Z]");
    Matcher matcher = pattern.matcher(palavra);
    return matcher.find();
  }

  /**
   * Metodo que retorna um boolean informando se a palavra contém caracter
   * minusculo.
   * 
   * @param palavra
   *                String que será analisada para saber se cumpre o requisito de
   *                conter caracter minusculo
   * 
   * @return Boolean, true - se contém caracter minusculo e false - se não contém
   */
  public static boolean temCaracterMinusculo(String palavra) {
    Pattern pattern = Pattern.compile("[a-z]");
    Matcher matcher = pattern.matcher(palavra);
    return matcher.find();
  }
}
