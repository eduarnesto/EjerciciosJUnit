package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Numeros;

class NumerosTest {

	@ParameterizedTest
	@MethodSource ("capicua")
	void testEsCapicua(int num, boolean expected) {
		Numeros capicua = new Numeros (num);
		boolean resul = capicua.esCapicua();
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> capicua() {
		return Stream.of(
			Arguments.of(0, true),
			Arguments.of(100, false),
			Arguments.of(101, true)
		);
	}
	
	@ParameterizedTest
	@MethodSource ("primo")
	void testEsPrimo(int num, boolean expected) {
		Numeros primo = new Numeros (num);
		boolean resul = primo.esPrimo();
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> primo() {
		return Stream.of(
			Arguments.of(1, false),
			Arguments.of(8, false),
			Arguments.of(2, true),
			Arguments.of(17, true)
		);
	}

}
