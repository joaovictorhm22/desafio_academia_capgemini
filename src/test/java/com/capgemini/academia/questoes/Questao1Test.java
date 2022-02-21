package com.capgemini.academia.questoes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Questao1Test {
  @Test
  public void testEnunciado() {
    // Execução
		String retorno = Questao1.enunciado();

		// Validação
		assertEquals("Digite um numero: ", retorno);
  }

  @Test
  public void testdesenhoEscada() {
     // Execução
		String retorno = Questao1.desenhoEscada(3);

		// Validação
		assertEquals("  *\n **\n***", retorno);
  }
}
