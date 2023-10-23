package genericAtividade;

public class At1Main {
    public static void main(String[] args) {
    	
        // Exemplo com Integer
        At1Generic<Integer> inteiro = new At1Generic<>(42);
        Integer valorInteiro = inteiro.getDado();
        System.out.println("Valor inteiro: " + valorInteiro);

        // Exemplo com String
        At1Generic<String> texto = new At1Generic<>("Texto");
        String valorTexto = texto.getDado();
        System.out.println("Valor de texto: " + valorTexto);

        // Exemplo com um objeto customizado 
        At1Generic<At1Pessoa> pessoa = new At1Generic<>(new At1Pessoa("João", 30));
        At1Pessoa valorPessoa = pessoa.getDado();
        System.out.println("Nome da pessoa: " + valorPessoa.getNome());
        System.out.println("Idade da pessoa: " + valorPessoa.getIdade());
    }
}
