import java.util.Scanner; // Importa as classes Java necessárias // Importa as classes Java necessárias

public class Comprar extends Cliente{ // Define a classe Comprar que estende a classe Cliente // Define a nova classe principal que estende Cliente

Menu menus = new Menu(); // Cria um objeto da classe Menu para acessar suas funcionalidades
Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para capturar a entrada do usuário // Cria um objeto Scanner para capturar a entrada do usuário

public void cadastrar() { // Método para registrar os dados do cliente (nome e idade) // Define um método público
System.out.println("=================================="); // Exibe saída no console // Exibe saída no console
System.out.println("||FAÇA SEU CADASTRO PARA COMEÇAR||"); // Exibe saída no console // Exibe saída no console
System.out.println("=================================="); // Exibe saída no console // Exibe saída no console

System.out.println("\nQual seu nome?"); // Exibe saída no console // Exibe saída no console
        setNome(entrada.nextLine());

        if (getNome().isEmpty()) {

            while (getNome().isEmpty()) {
System.out.println("Nome inválido! Digite um nome válido."); // Exibe saída no console // Exibe saída no console
System.out.println("\n"); // Exibe saída no console // Exibe saída no console
System.out.println("Qual seu nome?"); // Exibe saída no console // Exibe saída no console
                setNome(entrada.nextLine());
            }
        }

System.out.println("Qual sua idade?"); // Exibe saída no console // Exibe saída no console
        setIdade(entrada.nextInt());
System.out.println("\n"); // Exibe saída no console // Exibe saída no console

        if (getIdade() == null || getIdade() < 0) {
            while (getIdade() == null || getIdade() < 0) {
System.out.println("Idade inválida! Digite uma idade válida.\n" // Exibe saída no console // Exibe saída no console
                        + "Qual sua idade?");
                setIdade(entrada.nextInt());
System.out.println("\n"); // Exibe saída no console // Exibe saída no console
            }
        }
    }

public void comecar() { // Método para iniciar a interação com o sistema de menu // Define um método público
System.out.println("==========================================="); // Exibe saída no console // Exibe saída no console
System.out.println(" SEJA BEM VINDO(A) " + getNome() + " !!! "); // Exibe saída no console // Exibe saída no console
System.out.println("==========================================="); // Exibe saída no console // Exibe saída no console
System.out.println("\nPor onde deseja começar?\n" // Exibe saída no console // Exibe saída no console
                + "\n========MENU========\n"
                + "[1] Consultar saldo\n"
                + "[2] Fazer depósito\n"
                + "[3] Comprar\n"
                + "[4] Ver cadastro\n"
                + "[5] Encerrar");
        int opcaoMenu = entrada.nextInt();
System.out.println("\n"); // Exibe saída no console // Exibe saída no console

        if (opcaoMenu == 1) {
            consultarSaldo(); // Método para consultar o saldo atual do cliente
        } else if (opcaoMenu == 2) {
            fazerDeposito(); // Método para fazer depósito na conta do cliente
        } else if (opcaoMenu == 3) {
            comprarProduto(); // Método para iniciar a compra de um produto
        } else if (opcaoMenu == 4) {
            status();

System.out.println("O que deseja fazer:\n" // Exibe saída no console // Exibe saída no console
                    + "[1] Atualizar Cadastro\n"
                    + "[2] Voltar\n"
                    + "[3] Encerrar");
            int opcaoQuatroMenu = entrada.nextInt();
System.out.println("\n"); // Exibe saída no console // Exibe saída no console

            if (opcaoQuatroMenu == 1) {
                cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe saída no console
                        + " Retornando ao Menu Principal\n");
                comecar(); // Método para iniciar a interação com o sistema de menu
            } else if (opcaoQuatroMenu == 2) {
                comecar(); // Método para iniciar a interação com o sistema de menu
            } else if (opcaoQuatroMenu == 3){
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
                System.exit(0);
            } else {
                while (opcaoQuatroMenu < 1 || opcaoQuatroMenu > 3) {
System.out.println("Opção inválida. Escolha uma opção válida!"); // Exibe saída no console // Exibe saída no console
System.out.println("\n"); // Exibe saída no console // Exibe saída no console
System.out.println("O que deseja fazer:\n" // Exibe saída no console // Exibe saída no console
                            + "[1] Atualizar cadastro\n"
                            + "[2] Voltar\n"
                            + "[3] Encerrar");
                    opcaoQuatroMenu = entrada.nextInt();
System.out.println("\n"); // Exibe saída no console // Exibe saída no console

                    if (opcaoQuatroMenu == 1) {
                        cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                        status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe saída no console
                                + " Retornando ao Menu Principal\n");
                        comecar(); // Método para iniciar a interação com o sistema de menu
                    }
                    if (opcaoQuatroMenu == 2) {
                        comecar(); // Método para iniciar a interação com o sistema de menu
                    }
                    if (opcaoQuatroMenu == 3){
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
                        System.exit(0);
                    }
                }
            }

        } else if (opcaoMenu == 5){
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
            System.exit(0);
        } else {
System.out.println("Opção inválida! Escolha uma opção válida.\n"); // Exibe saída no console // Exibe saída no console
            comecar(); // Método para iniciar a interação com o sistema de menu
        }

    }

public void comprarBebida(){ // Método para comprar uma bebida // Define um método público
System.out.println("\nVocê tem R$" + getSaldo() + "\n"); // Exibe saída no console // Exibe saída no console
menus.menuBebida(); // Cria um objeto da classe Menu para acessar suas funcionalidades
        int opcaoMenuBebida = entrada.nextInt();

        if (opcaoMenuBebida == 1) {

            float valorProduto = 10.5f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Refrigerante.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outra bebida\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoBebida = entrada.nextInt();
                if (segundaOpcaoBebida == 1) {
                    comprarBebida(); // Método para comprar uma bebida
                } else if (segundaOpcaoBebida == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoBebida == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            }else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                + "[1] Fazer depósito\n"
                + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else if (opcaoMenuBebida == 2){
            float valorProduto = 7.8f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Suco.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outra bebida\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoBebida = entrada.nextInt();
                if (segundaOpcaoBebida == 1) {
                    comprarBebida(); // Método para comprar uma bebida
                } else if (segundaOpcaoBebida == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoBebida == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            }else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else if (opcaoMenuBebida == 3){
            if (getIdade() < 18){
System.out.println("\n" + getNome() + " você tem " + getIdade() // Exibe saída no console // Exibe saída no console
                        + " anos. Você é menor de idade!\n");
System.out.println("================================================================="); // Exibe saída no console // Exibe saída no console
System.out.println("||          *******Lei federal 13.106/16*******                ||"); // Exibe saída no console // Exibe saída no console
System.out.println("||PROIBIDA A VENDA DE BEBIDAS ALCOÓLICAS PARA MENORES DE IDADE!||"); // Exibe saída no console // Exibe saída no console
System.out.println("||          **********VENDA CANCELADA**********                ||"); // Exibe saída no console // Exibe saída no console
System.out.println("================================================================="); // Exibe saída no console // Exibe saída no console
System.out.println("\nO que deseja fazer:\n" // Exibe saída no console // Exibe saída no console
                + "[1] Atualizar cadastro\n"
                + "[2] Comprar outro produto\n"
                + "[3] Voltar ao Menu Principal\n"
                + "[4] Sair");
                int opcaoMenuCerveja = entrada.nextInt();

                if (opcaoMenuCerveja == 1){
                    cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                    status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe saída no console
                            + " Retornando ao Menu Principal\n");
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else if (opcaoMenuCerveja == 2){
                    comprarProduto(); // Método para iniciar a compra de um produto
                } else if (opcaoMenuCerveja == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else if (opcaoMenuCerveja == 4){
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
                    System.exit(0);
                } else {
                    while (opcaoMenuCerveja < 1 || opcaoMenuCerveja > 4) {
System.out.println("Opção inválida! Escolha uma opção:\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("O que deseja fazer:\n" // Exibe saída no console // Exibe saída no console
                                + "[1] Atualizar cadastro\n"
                                + "[2] Comprar outro produto\n"
                                + "[3] Voltar ao Menu Principal\n"
                                + "[4] Sair");
                        opcaoMenuCerveja = entrada.nextInt();

                        if (opcaoMenuCerveja == 1) {
                            cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                            status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe saída no console
                                    + " Retornando ao Menu Principal\n");
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        } else if (opcaoMenuCerveja == 2) {
                            comprarProduto(); // Método para iniciar a compra de um produto
                        } else if (opcaoMenuCerveja == 3){
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        } else if (opcaoMenuCerveja == 4){
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
                            System.exit(0);
                        }
                    }
                }

            } else {
                float valorProduto = 14.5f;
                if (valorProduto <= getSaldo()) {
                    setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Cerveja.\n" // Exibe saída no console // Exibe saída no console
                            + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                            + "[1] Comprar outra bebida\n"
                            + "[2] Comprar outro produto\n"
                            + "[3] Voltar ao Menu Principal");
                    int segundaOpcaoBebida = entrada.nextInt();
                    if (segundaOpcaoBebida == 1) {
                        comprarBebida(); // Método para comprar uma bebida
                    } else if (segundaOpcaoBebida == 2) {
                        comprarProduto(); // Método para iniciar a compra de um produto
                    }else if (segundaOpcaoBebida == 3){
                        comecar(); // Método para iniciar a interação com o sistema de menu
                    } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                        comprarProduto(); // Método para iniciar a compra de um produto
                    }
                } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                            + "[1] Fazer depósito\n"
                            + "[2] Menu Principal");
                    int opcaoFinal = entrada.nextInt();

                    if (opcaoFinal == 1){
                        fazerDeposito(); // Método para fazer depósito na conta do cliente
                        menuDeposito();
                    } else if (opcaoFinal == 2){
                        comecar(); // Método para iniciar a interação com o sistema de menu
                    } else {
                        while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                    + "[2] Menu Principal");
                            opcaoFinal = entrada.nextInt();

                            if (opcaoFinal == 1) {
                                fazerDeposito(); // Método para fazer depósito na conta do cliente
                                menuDeposito();
                            } else if (opcaoFinal == 2) {
                                comecar(); // Método para iniciar a interação com o sistema de menu
                            }
                        }
                    }
                }
            }
        } else {
System.out.println("Opção inválida! Escolha uma opção: \n"); // Exibe saída no console // Exibe saída no console
            comprarBebida(); // Método para comprar uma bebida
        }
    }

public void comprarComida(){ // Método para comprar comida // Define um método público
menus.menuComida(); // Cria um objeto da classe Menu para acessar suas funcionalidades
        int opcaoMenuComida = entrada.nextInt();

        if (opcaoMenuComida == 1) {
            float valorProduto = 8f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Salgado.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outra comida\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoComida = entrada.nextInt();
                if (segundaOpcaoComida == 1) {
                    comprarComida(); // Método para comprar comida
                } else if (segundaOpcaoComida == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoComida == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else if (opcaoMenuComida == 2){
            float valorProduto = 12.8f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Pastel.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outra comida\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoComida = entrada.nextInt();
                if (segundaOpcaoComida == 1) {
                    comprarComida(); // Método para comprar comida
                } else if (segundaOpcaoComida == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoComida == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else if (opcaoMenuComida == 3){
            float valorProduto = 17.9f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Salada.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outra comida\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoComida = entrada.nextInt();
                if (segundaOpcaoComida == 1) {
                    comprarComida(); // Método para comprar comida
                } else if (segundaOpcaoComida == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoComida == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else {
System.out.println("Opção inválida! Escolha uma opção: \n"); // Exibe saída no console // Exibe saída no console
            comprarComida(); // Método para comprar comida
        }
    }

public void comprarHigienie(){ // Define um método público
menus.menuHigiene(); // Cria um objeto da classe Menu para acessar suas funcionalidades
        int opcaoMenuHigiene = entrada.nextInt();

        if (opcaoMenuHigiene == 1) {
            float valorProduto = 19.9f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Shampoo.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outro produto de higiene\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoHigiene = entrada.nextInt();
                if (segundaOpcaoHigiene == 1) {
                    comprarHigienie();
                } else if (segundaOpcaoHigiene == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoHigiene == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else if (opcaoMenuHigiene == 2) {
            float valorProduto = 2.35f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Sabonete.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outro produto de higiene\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoHigiene = entrada.nextInt();
                if (segundaOpcaoHigiene == 1) {
                    comprarHigienie();
                } else if (segundaOpcaoHigiene == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoHigiene == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else if (opcaoMenuHigiene == 3) {
            float valorProduto = 13.4f;
            if (valorProduto <= getSaldo()) {
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Desodorante.\n" // Exibe saída no console // Exibe saída no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
System.out.println("O que deseja fazer?\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Comprar outro produto de higiene\n"
                        + "[2] Comprar outro produto\n"
                        + "[3] Voltar ao Menu Principal");
                int segundaOpcaoHigiene = entrada.nextInt();
                if (segundaOpcaoHigiene == 1) {
                    comprarHigienie();
                } else if (segundaOpcaoHigiene == 2) {
                    comprarProduto(); // Método para iniciar a compra de um produto
                }else if (segundaOpcaoHigiene == 3){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Exibe saída no console
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
            } else {
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe saída no console
                        + "[1] Fazer depósito\n"
                        + "[2] Menu Principal");
                int opcaoFinal = entrada.nextInt();

                if (opcaoFinal == 1){
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
                } else if (opcaoFinal == 2){
                    comecar(); // Método para iniciar a interação com o sistema de menu
                } else {
                    while (opcaoFinal < 1 || opcaoFinal > 2) {
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe saída no console
System.out.println("[1] Fazer depósito\n" // Exibe saída no console // Exibe saída no console
                                + "[2] Menu Principal");
                        opcaoFinal = entrada.nextInt();

                        if (opcaoFinal == 1) {
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
                        } else if (opcaoFinal == 2) {
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
        } else {
System.out.println("Opção inválida! Escolha uma opção: \n"); // Exibe saída no console // Exibe saída no console
            comprarHigienie();
        }

    }

public void comprarProduto(){ // Método para iniciar a compra de um produto // Define um método público
menus.menuProdutos(); // Cria um objeto da classe Menu para acessar suas funcionalidades
        int opcaoMenuProdutos = entrada.nextInt();
        if (opcaoMenuProdutos == 1){
            comprarBebida(); // Método para comprar uma bebida
        } else if (opcaoMenuProdutos == 2){
            comprarComida(); // Método para comprar comida
        } else if  (opcaoMenuProdutos == 3){
            comprarHigienie();
        } else {
System.out.println("Opção inválida. Escolha uma opção válida:\n"); // Exibe saída no console // Exibe saída no console
            comprarProduto(); // Método para iniciar a compra de um produto
        }
    }

public void consultarSaldo() { // Método para consultar o saldo atual do cliente // Define um método público
System.out.println("========="); // Exibe saída no console // Exibe saída no console
System.out.println("||SALDO||"); // Exibe saída no console // Exibe saída no console
System.out.println("========="); // Exibe saída no console // Exibe saída no console
System.out.println("\n" + this.getNome() + " seu saldo é R$ " + this.getSaldo() // Exibe saída no console // Exibe saída no console
                + "\nO que deseja fazer:\n"
                + "[1] Nova consulta\n"
                + "[2] Fazer depósito\n"
                + "[3] Retornar ao Menu Principal\n"
                + "[4] Sair");
        int opcaoCosultarSaldo = entrada.nextInt();
System.out.println("\n"); // Exibe saída no console // Exibe saída no console

        if (opcaoCosultarSaldo == 1) {
            consultarSaldo(); // Método para consultar o saldo atual do cliente
        } else if (opcaoCosultarSaldo == 2) {
            fazerDeposito(); // Método para fazer depósito na conta do cliente
        } else if (opcaoCosultarSaldo == 3) {
            comecar(); // Método para iniciar a interação com o sistema de menu
        } else if (opcaoCosultarSaldo == 4) {
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
            System.exit(0);
        } else {
System.out.println("Opção inválida. Escolha uma opção válida:\n"); // Exibe saída no console // Exibe saída no console
            consultarSaldo(); // Método para consultar o saldo atual do cliente
        }
    }

public void fazerDeposito() { // Método para fazer depósito na conta do cliente // Define um método público
System.out.println("============"); // Exibe saída no console // Exibe saída no console
System.out.println("||DEPÓSITO||"); // Exibe saída no console // Exibe saída no console
System.out.println("============"); // Exibe saída no console // Exibe saída no console
System.out.println("\nQual o valor do depósito?"); // Exibe saída no console // Exibe saída no console
        float valor = entrada.nextFloat();
        this.setSaldo(this.getSaldo() + valor);
        menuDeposito();
    }

public void menuDeposito(){ // Define um método público

System.out.println("Seu saldo atual é R$ " + this.getSaldo() + "\n\n" // Exibe saída no console // Exibe saída no console
                + "O que deseja fazer:\n\n"
                + "[1] Novo depósito\n"
                + "[2] Retornar ao Menu Principal\n"
                + "[3] Encerrar");
        int opcaoDeposito = entrada.nextInt();
System.out.println("\n"); // Exibe saída no console // Exibe saída no console

        if (opcaoDeposito == 1) {
            fazerDeposito(); // Método para fazer depósito na conta do cliente
        } else if (opcaoDeposito == 2) {
            comecar(); // Método para iniciar a interação com o sistema de menu
        } else if (opcaoDeposito == 3) {
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe saída no console
            System.exit(0);
        } else {
System.out.println("Opção inválida. Escolha uma opção válida:\n"); // Exibe saída no console // Exibe saída no console
            menuDeposito();
        }
    }
public void status(){ // Define um método público
System.out.println("======================="); // Exibe saída no console // Exibe saída no console
System.out.println("|| DADOS DO CADASTRO ||"); // Exibe saída no console // Exibe saída no console
System.out.println("=======================\n"); // Exibe saída no console // Exibe saída no console
System.out.println("Nome: " + getNome() +"\n" // Exibe saída no console // Exibe saída no console
                + "Idade: " + getIdade() + "\n");
    }

}
