package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Cadenas;

class CadenasTest {

	@ParameterizedTest
	@MethodSource ("cuentaEspacios")
	void testCuentaEspacios(String frase, int expected) {
		Cadenas cad = new Cadenas (frase);
		int resul = cad.cuentaEspacios();
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> cuentaEspacios() {
		return Stream.of(
			Arguments.of("Campana", 0),
			Arguments.of("La Campana", 1),
			Arguments.of("", 0)
		);
	}

	@ParameterizedTest
	@MethodSource ("reves")
	void testDelReves(String frase, String expected) {
		Cadenas cad = new Cadenas (frase);
		String resul = cad.delReves();
		assertEquals(expected, resul);
	}

	private static Stream<Arguments> reves() {
		return Stream.of(
			Arguments.of("Arbol", "lobrA"),
			Arguments.of("a", "a"),
			Arguments.of("", "")
		);
	}

	
	@ParameterizedTest
	@MethodSource ("palabras")
	void testContarPalabra(String frase, String palabra, int expected) {
		Cadenas cad = new Cadenas (frase);
		int resul = cad.contarPalabra(palabra);
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> palabras() {
		return Stream.of(
			Arguments.of("Hola Hola", "Hola", 2),
			Arguments.of("La Campana Hola", "Hola", 1),
			Arguments.of("", "Hola", 0)
		);
	}


}
