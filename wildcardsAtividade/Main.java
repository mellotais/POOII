package wildcardsAtividade;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	
        // Upper Bounded Wildcards
        List<? extends Animal> animais = new ArrayList<>();
        
        //animais.add(new Cachorro());
        //animais.add(new Gato());
        
        List<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(new Cachorro("Rex"));
        listaAnimais.add(new Gato("Galileu"));
        
        
        //  método imprimirLista
        imprimirLista(listaAnimais);
        
        
        //-----------------------------------------------------
        
       
        // Lower Bounded Wildcards
        List<? super Animal> animais2 = new ArrayList<>();
        animais2.add(new Cachorro("Crypton"));
        animais2.add(new Animal("Cat"));
        
        // método obterPrimeiroAnimal
        Animal primeiroAnimal = obterPrimeiroAnimal(animais2);
        System.out.println("Primeiro animal: " + primeiroAnimal);
        
        
        //-----------------------------------------------------
        
        
        // Unbounded Wildcards
        List<?> lista = new ArrayList<>();
        
        //não se pode adicionar elementos a uma lista com wildcard não limitado.
        //lista.add(1);
        //lista.add("Objeto");
        
        imprimirLista(lista);
        imprimirObjeto(1);
        imprimirObjeto("Objeto");
    }

    
    
    
    /*public static void imprimirLista(List<? extends Animal> lista) {
        for (Animal item : lista) {
            System.out.println(item);
        }
    }*/

    public static void imprimirLista(List<?> lista) {
        for (Object item : lista) {
            System.out.println(item);
        }
    }
    
    public static Animal obterPrimeiroAnimal(List<? super Animal> lista) {
        return (Animal) lista.get(0);
    }

    public static void imprimirObjeto(Object objeto) {
        System.out.println(objeto);
    }
}