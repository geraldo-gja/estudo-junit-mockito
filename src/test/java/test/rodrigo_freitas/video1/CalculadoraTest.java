package test.rodrigo_freitas.video1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void somaDoisNumeros() {
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(10, 20);
		Assertions.assertEquals(30, soma);	
	}
	
	@Test
	public void verificaSeEPar() {
		Calculadora calculadora = new Calculadora();
		boolean verifica = calculadora.verificaPar(2);
		Assertions.assertTrue(verifica);
	}

}
