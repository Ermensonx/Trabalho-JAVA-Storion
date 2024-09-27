import java.util.Scanner;

public class Cliente extends Pessoa { // Classe Cliente que herda de Pessoa e possui o saldo do cliente
    private float saldo;

    public float getSaldo() { // Método para obter o saldo do cliente
        return this.saldo;
    }

    public void setSaldo(float saldo) { // Método para definir o saldo do cliente
        this.saldo = saldo;
    }

}