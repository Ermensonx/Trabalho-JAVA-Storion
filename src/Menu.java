import java.util.Scanner;

public class Menu { // Classe responsável por exibir os menus de produtos

    public void menuProdutos() { // Exibe o menu principal de categorias de produtos
        System.out.println("===========");
        System.out.println("||PRODUTOS||");
        System.out.println("===========\n");
        System.out.println("Escolha um tipo de produto:\n"
                + "[1] Bebida\n"
                + "[2] Comida\n"
                + "[3] Higiênie");
    }

    public void menuBebida() { // Exibe o menu de opções de bebidas
        System.out.println("===========");
        System.out.println("||BEBIDAS||");
        System.out.println("===========\n");
        System.out.println("Escolha uma bebida:\n"
                + "[1] Refrigerante R$10.50\n"
                + "[2] Suco R$7.80\n"
                + "[3] Cerveja R$14.50");

    }

    public void menuComida(){ // Exibe o menu de opções de comidas
        System.out.println("===========");
        System.out.println("||COMIDAS||");
        System.out.println("===========\n");
        System.out.println("Escolha uma comida:\n"
                + "[1] Salgado R$8.00\n"
                + "[2] Pastel R$12.80\n"
                + "[3] Salada R$17.90");

    }

    public void menuHigiene(){ // Exibe o menu de opções de produtos de higiene
        System.out.println("===========");
        System.out.println("||HIGIENE||");
        System.out.println("===========\n");
        System.out.println("Escolha um produto de higiene:\n"
                + "[1] Shampoo R$19.90\n"
                + "[2] Sabonete R$2.35\n"
                + "[3] Desodorante R$13.40");

    }
}
