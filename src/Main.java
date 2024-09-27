public class Main { // Classe principal que inicializa o programa
    public static void main(String[] args) { // Método main que dá início ao programa

        Comprar comprar1 = new Comprar(); // Criação de um objeto da classe Comprar
        comprar1.cadastrar(); // Chama o método cadastrar para registrar o cliente
        comprar1.comecar(); // Chama o método comecar para iniciar o processo de compra
    }
}