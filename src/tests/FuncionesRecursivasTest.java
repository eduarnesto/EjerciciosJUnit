package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.FuncionesRecursivas;

class FuncionesRecursivasTest {

	@ParameterizedTest
	@MethodSource ("sumatorio")
	void testSumatorio(int numero, int expected) {
		int resul = FuncionesRecursivas.sumatorio(numero);
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> sumatorio() {
		return Stream.of(
			Arguments.of(1, 1),
			Arguments.of(2, 3),
			Arguments.of(3, 6)
		);
	}
	
	@ParameterizedTest
	@MethodSource ("potencia")
	void testPotencia(double numero, int potencia, double expected) {
		double resul = FuncionesRecursivas.potencia (numero, potencia);
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> potencia() {
		return Stream.of(
			Arguments.of(1, 0, 1),
			Arguments.of(2, 1, 2),
			Arguments.of(2, 4, 16)
		);
	}

	@ParameterizedTest
	@MethodSource ("fibonacci")
	void testFibonacci(int numero, int expected) {
		int resul = FuncionesRecursivas.fibonacci (numero);
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> fibonacci() {
		return Stream.of(
			Arguments.of(1, 1),
			Arguments.of(2, 1),
			Arguments.of(3, 2)
		);
	}
}
