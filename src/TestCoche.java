import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestCoche {

	@Test
	public void test_al_crear_un_coche_su_velocidad_es_cero_jaime_macia() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	
	@Test
	public void test_al_acelerar_un_coche_su_velocidad_aumenta_jaime_macia() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.acelerar(30);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
	public void test_al_decelerar_un_coche_su_velocidad_disminuye_jaime_macia() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelerar(20);
		Assert.assertEquals(30, nuevoCoche.velocidad);
	}
	@Test
	public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_jaime_macia() {
		Coche nuevoCoche = new Coche();
		nuevoCoche.velocidad = 50;
		nuevoCoche.decelerar(80);
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}
	

}
