package testeTarefa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ColunaTeste {

    @Test
    public void gerarScriptComTodosOsParametros() {
        Coluna coluna = new Coluna("codigo", "INT", true, true);

        String scriptEsperado = "codigo INT NOT NULL AUTO_INCREMENT";

        assertEquals(scriptEsperado, coluna.gerarScript());
    }

    @Test
    public void gerarScriptSemAutoIncremento() {
        Coluna coluna = new Coluna("codigo", "INT", true, false);

        String scriptEsperado = "codigo INT NOT NULL";

        assertEquals(scriptEsperado, coluna.gerarScript());
    }

    @Test
    public void gerarScriptSemNaoNulo() {
        Coluna coluna = new Coluna("codigo", "INT", false, false);

        String scriptEsperado = "codigo INT";

        assertEquals(scriptEsperado, coluna.gerarScript());
    }

    @Test
    public void gerarScriptComSomenteNomeETipo() {
        Coluna coluna = new Coluna("codigo", "INT", false, false);

        String scriptEsperado = "codigo INT";

        assertEquals(scriptEsperado, coluna.gerarScript());
    }
}

