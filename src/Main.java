public class Main {
    public static void main(String[] args) {
        // Criando o cliente (sem passar saldo inicial)
        Cliente c1 = new Cliente();
        
        // O cliente faz o cadastro e depois entra no menu principal
        c1.cadastrar();
        c1.comecar();
    }
}
