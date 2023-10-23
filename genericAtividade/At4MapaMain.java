package genericAtividade;

public class At4MapaMain {

	public static void main(String[] args) {
        At4Mapa<String> mapa = new At4Mapa<>();

        // Adiciona dois itens ao mapa
        mapa.add("chave1", "valor1");
        mapa.add("chave2", "valor2");

        // Verifica se a chave existe
        System.out.println(mapa.get("chave1")); // valor1
        System.out.println(mapa.get("chave2")); // valor2

        // Tenta adicionar um item com uma chave já existente
        boolean sucesso = mapa.add("chave1", "valor3");
        System.out.println(sucesso); // false
    }	
}
