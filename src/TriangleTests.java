import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TriangleTests {

	@Test
	@DisplayName("Testes de Triângulo Escaleno válido.")
	void testValidScalene() {
		Triangle t = new Triangle(11,12,13);
		assertEquals(t.checkTriangle(),"SCALENE");
	}
	
	@Test
	@DisplayName("Testes de Triângulo Isósceles válido.")
	void testValidIsosceles() {
		Triangle t = new Triangle(11,11,13);
		assertEquals(t.checkTriangle(),"ISOSCELES");
	}
	
	@Test
	@DisplayName("Testes de Triângulo Isósceles Válido Iterado.")
	void testValidIsoscelesIteration() {
		int sides[][] = {{11,11,12},{11,12,11},{12,11,11}};
		int i;
		
		for(i=0;i<sides.length;i++) {
			Triangle t = new Triangle(sides[i][0],sides[i][1],sides[i][2]);
			assertEquals(t.checkTriangle(),"ISOSCELES");
		}
	}
	
	@Test
	@DisplayName("Testes de Triângulo com a soma sendo igual ao terceiro.")
	void testValidCEqualsSum() {
		int sides[][] = {{7,5,12},{5,12,7},{12,7,5}};
		int i;
		
		for(i=0;i<sides.length;i++) {
			Triangle t = new Triangle(sides[i][0],sides[i][1],sides[i][2]);
			assertEquals(t.checkTriangle(),"INVALID");
		}
	}
	
	@Test
	@DisplayName("Testes de Triângulo Equilátero válido.")
	void testValidEquilateral() {
		Triangle t = new Triangle(11,11,11);
		assertEquals(t.checkTriangle(),"EQUILATERAL");
	}
	
	@Test
	@DisplayName("Testes de Zeros.")
	void testZeros() {
		Triangle t = new Triangle(0,0,0);
		assertEquals(t.checkTriangle(),"INVALID");
	}
	
	@Test
	@DisplayName("Testes de Negativos.")
	void testNegative() {
		Triangle t = new Triangle(-10,-10,-10);
		assertEquals(t.checkTriangle(),"INVALID");
	}
	
	@Test
	@DisplayName("Testes de Triângulo com a soma sendo menor que o terceiro.")
	void testValidCSmallerSum() {
		int sides[][] = {{7,4,12},{4,12,7},{12,7,4}};
		int i;
		
		for(i=0;i<sides.length;i++) {
			Triangle t = new Triangle(sides[i][0],sides[i][1],sides[i][2]);
			assertEquals(t.checkTriangle(),"INVALID");
		}
	}
}
