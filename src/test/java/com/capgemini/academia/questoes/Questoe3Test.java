package com.capgemini.academia.questoes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class Questoe3Test {
  @Test
  public void testEnunciado() {
    // Execução
		String retorno = Questao3.enunciado();

		// Validação
		assertEquals("Digite uma palavra: ", retorno);
  }

  @Test
  public void testNumeroAnagrama() {
    // Montando cenario
    String palavra = "OVO";
    String teste = "A palavra 'ovo' tem 2 anagramas pares em suas substrings";
    
    // Execução
		String retorno = Questao3.numeroAnagrama(palavra);

		// Validação
		assertEquals(teste, retorno);
  }

  @Test
  public void testTodasSubstrings() {
    // Montando cenario
    String palavra = "OVO";
    ArrayList<String> teste = new ArrayList<>();
    teste.add("O");
    teste.add("OV");
    teste.add("OVO");
    teste.add("V");
    teste.add("VO");
    teste.add("O");

    // Execução
		ArrayList<String> retorno = Questao3.todasSubstrings(palavra);

		// Validação
		assertEquals(teste, retorno);
  }

  @Test
  public void testIsAnagrama() {
    // Montando cenario
    String palavra1 = "OV";
    String palavra2 = "VO";

    // Execução
		boolean retorno = Questao3.isAnagrama(palavra1, palavra2);

		// Validação
		assertEquals(true, retorno);
  }
}
