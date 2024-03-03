package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import clases.Tablas;

class TablasTest {

	@ParameterizedTest
	@MethodSource ("magica")
	void testEsMagica(int tabla[][], boolean expected) {
		boolean resul = Tablas.esMagica(tabla);
		assertEquals(expected, resul);
	}
	
	private static Stream<Arguments> magica() {
		return Stream.of(
			Arguments.of((Object) new int[][]{{1, 1}, {1, 1}}, true),
			Arguments.of((Object) new int[][]{{1, 2}, {1, 1}}, false)
		);
	}
	
	@ParameterizedTest
	@MethodSource ("gira")
	void testGira90(int tabla[][], int expected[][]) {
		int[][] resul = Tablas.gira90(tabla);
		Assert.assertArrayEquals(expected, resul);
	}

	private static Stream<Arguments> gira() {
		return Stream.of(
			Arguments.of((Object) new int[][]{{1, 1}, {1, 1}}, (Object) new int[][]{{1, 1}, {1, 1}}),
			Arguments.of((Object) new int[][]{{1, 2}, {1, 1}}, (Object) new int[][]{{1, 1}, {1, 2}})
		);
	}
	
}
