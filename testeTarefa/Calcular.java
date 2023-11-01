package testeTarefa;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Calcular {

    public static double media(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    public static double moda(double[] valores) {
        Map<Double, Integer> ocorrencias = new HashMap<>();
        for (double valor : valores) {
            ocorrencias.put(valor, ocorrencias.getOrDefault(valor, 0) + 1);
        }
        return Collections.max(ocorrencias.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    public static double mediana(double[] valores) {
        Arrays.sort(valores);
        if (valores.length % 2 == 0) {
            return (valores[valores.length / 2] + valores[valores.length / 2 - 1]) / 2;
        } else {
            return valores[valores.length / 2];
        }
    }

    public static double variancia(double[] valores) {
        double media = media(valores);
        double somaDosQuadradosDasDiferencas = 0;

        for (double valor : valores) {
            somaDosQuadradosDasDiferencas += Math.pow(valor - media, 2);
        }

        return somaDosQuadradosDasDiferencas / (valores.length);
    }





    public static double desvioPadrao(double[] valores) {
        double media = media(valores);
        double variancia = 0;
        for (double valor : valores) {
            variancia += Math.pow(valor - media, 2);
        }
        variancia /= valores.length - 1;
        return Math.sqrt(variancia);
    }

    
    

}
