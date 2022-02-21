package com.capgemini.academia.questoes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Questao2Test {
  @Test
  public void testEnunciado() {
    // Monatando cenario
    String palavra = """
    A senha deve ter:
      - No mínimo 6 caracteres.
      - No mínimo 1 digito.
      - No mínimo 1 letra em minúsculo.
      - No mínimo 1 letra em maiúsculo.
      - No mínimo 1 caractere especial.
    Digite uma senha: """;
    
    // Execução
		String retorno = Questao2.enunciado();

		// Validação
		assertEquals(palavra, retorno);
  }

  @Test
  public void testTemCaracterEspecialTrue() {
    // Montando cenario
    String palavra = "ov#o";
    
    // Execução
		boolean retorno = Questao2.temCaracterEspecial(palavra);

		// Validação
		assertEquals(true, retorno);
  }

  @Test
  public void testTemCaracterEspecialFalse() {
    // Montando cenario
    String palavra = "ovo";
    
    // Execução
		boolean retorno = Questao2.temCaracterEspecial(palavra);

		// Validação
		assertEquals(false, retorno);
  }

  @Test
  public void testTemNumeroTrue() {
    // Montando cenario
    String palavra = "ov1o";
    
    // Execução
		boolean retorno = Questao2.temNumero(palavra);

		// Validação
		assertEquals(true, retorno);
  }

  @Test
  public void testTemNumeroFalse() {
    // Montando cenario
    String palavra = "ovo";
    
    // Execução
		boolean retorno = Questao2.temNumero(palavra);

		// Validação
		assertEquals(false, retorno);
  }

  @Test
  public void testTemCaracterMaiusculoTrue() {
    // Montando cenario
    String palavra = "Ovo";
    
    // Execução
		boolean retorno = Questao2.temCaracterMaiusculo(palavra);

		// Validação
		assertEquals(true, retorno);
  }

  @Test
  public void testTemCaracterMaiusculoFalse() {
    // Montando cenario
    String palavra = "ovo";
    
    // Execução
		boolean retorno = Questao2.temCaracterMaiusculo(palavra);

		// Validação
		assertEquals(false, retorno);
  }

  @Test
  public void testTemCaracterMinusculoTrue() {
    // Montando cenario
    String palavra = "Ovo";
    
    // Execução
		boolean retorno = Questao2.temCaracterMinusculo(palavra);

		// Validação
		assertEquals(true, retorno);
  }

  @Test
  public void testTemCaracterMinusculoFalse() {
    // Montando cenario
    String palavra = "OVO";
    
    // Execução
		boolean retorno = Questao2.temCaracterMinusculo(palavra);

		// Validação
		assertEquals(false, retorno);
  }

  @Test
  public void testNumeroMinimoSenha() {
    // Montando cenario
    String palavra = "OVO";
    String teste = "Sua senha precisa de +3 caracteres e não cumpre algumas regras";
    
    // Execução
		String retorno = Questao2.numeroMinimoSenha(palavra);

		// Validação
		assertEquals(teste, retorno);
  }
}
