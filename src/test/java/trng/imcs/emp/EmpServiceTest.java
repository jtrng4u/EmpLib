package trng.imcs.emp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmpServiceTest {

	@Test
	public void testGetEmpName() {
		//Given
		EmpService empService = new EmpService();
		
		//When
		String actualResult = empService.getEmpName();
		
		//Then
		assertEquals("IMCS Emp", actualResult);
	}

}
