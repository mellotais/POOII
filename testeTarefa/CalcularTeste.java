package testeTarefa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcularTeste {

	    @Test
	    public void deveCalcularMedia() {
	        double[] valores = {1, 2, 3, 4, 5};
	        assertEquals(3, Calcular.media(valores), 0.001);
	    }

	    @Test
	    public void deveCalcularModa() {
	        double[] valores = {1, 1, 2, 2, 3};
	        assertEquals(1, Calcular.moda(valores), 0.001);
	    }

	    @Test
	    public void deveCalcularMediana() {
	        double[] valores = {1, 2, 3, 4, 5};
	        assertEquals(3, Calcular.mediana(valores), 0.001);
	    }

	    @Test
	    public void deveCalcularVariancia() {
	        double[] valores = {1, 2, 3, 4, 5};
	        assertEquals(2, Calcular.variancia(valores), 0.01); 

	    }

	    @Test
	    public void deveCalcularDesvioPadrao() {
	        double[] valores = {1, 2, 3, 4, 5};
	        assertEquals(1.581, Calcular.desvioPadrao(valores), 0.01);

	    }

	}
