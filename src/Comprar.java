import java.util.Scanner; // Importa as classes Java necessárias // Importa a classe necessária para a funcionalidade do programa

public class Comprar extends Cliente{ // Define a classe Comprar que estende a classe Cliente // Define a classe que representa o processo de compra, herda da classe Cliente

Menu menus = new Menu(); // Cria uma instância da classe Menu para exibir opções para o usuário
Scanner entrada = new Scanner(System.in); // Cria um objeto Scanner para capturar a entrada do usuário // Cria um objeto Scanner para ler entradas do usuário, como nome, idade, e outras informações

public void cadastrar() { // Método para registrar os dados do cliente (nome e idade) // Método responsável pelo cadastro de um cliente no sistema
System.out.println("=================================="); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

setNome(entrada.nextLine()); // Captura e armazena a entrada do usuário (como nome ou idade)

if (getNome().isEmpty()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição

while (getNome().isEmpty()) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Nome inválido! Digite um nome válido."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
setNome(entrada.nextLine()); // Captura e armazena a entrada do usuário (como nome ou idade)
            }
        }

System.out.println("Qual sua idade?"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
setIdade(entrada.nextInt()); // Captura e armazena a entrada do usuário (como nome ou idade)
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

if (getIdade() == null || getIdade() < 0) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
while (getIdade() == null || getIdade() < 0) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Idade inválida! Digite uma idade válida.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Qual sua idade?");
setIdade(entrada.nextInt()); // Captura e armazena a entrada do usuário (como nome ou idade)
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            }
        }
    }

public void comecar() { // Método para iniciar a interação com o sistema de menu // Declaração de um método público que pode ser acessado por outras classes
System.out.println("==========================================="); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                + "\n========MENU========\n"
                + "[1] Consultar saldo\n"
                + "[2] Fazer depósito\n"
                + "[3] Comprar\n"
                + "[4] Ver cadastro\n"
                + "[5] Encerrar");
int opcaoMenu = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

if (opcaoMenu == 1) { // Cria uma instância da classe Menu para exibir opções para o usuário
            consultarSaldo(); // Método para consultar o saldo atual do cliente
} else if (opcaoMenu == 2) { // Cria uma instância da classe Menu para exibir opções para o usuário
            fazerDeposito(); // Método para fazer depósito na conta do cliente
} else if (opcaoMenu == 3) { // Cria uma instância da classe Menu para exibir opções para o usuário
            comprarProduto(); // Método para iniciar a compra de um produto
} else if (opcaoMenu == 4) { // Cria uma instância da classe Menu para exibir opções para o usuário
            status();

System.out.println("O que deseja fazer:\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                    + "[1] Atualizar Cadastro\n"
                    + "[2] Voltar\n"
                    + "[3] Encerrar");
int opcaoQuatroMenu = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

if (opcaoQuatroMenu == 1) { // Cria uma instância da classe Menu para exibir opções para o usuário
                cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ " Retornando ao Menu Principal\n"); // Cria uma instância da classe Menu para exibir opções para o usuário
                comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoQuatroMenu == 2) { // Cria uma instância da classe Menu para exibir opções para o usuário
                comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoQuatroMenu == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                System.exit(0);
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoQuatroMenu < 1 || opcaoQuatroMenu > 3) { // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Opção inválida. Escolha uma opção válida!"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                            + "[1] Atualizar cadastro\n"
                            + "[2] Voltar\n"
                            + "[3] Encerrar");
opcaoQuatroMenu = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

if (opcaoQuatroMenu == 1) { // Cria uma instância da classe Menu para exibir opções para o usuário
                        cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                        status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ " Retornando ao Menu Principal\n"); // Cria uma instância da classe Menu para exibir opções para o usuário
                        comecar(); // Método para iniciar a interação com o sistema de menu
                    }
if (opcaoQuatroMenu == 2) { // Cria uma instância da classe Menu para exibir opções para o usuário
                        comecar(); // Método para iniciar a interação com o sistema de menu
                    }
if (opcaoQuatroMenu == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        System.exit(0);
                    }
                }
            }

} else if (opcaoMenu == 5){ // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            System.exit(0);
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida! Escolha uma opção válida.\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            comecar(); // Método para iniciar a interação com o sistema de menu
        }

    }

public void comprarBebida(){ // Método para comprar uma bebida // Declaração de um método público que pode ser acessado por outras classes
System.out.println("\nVocê tem R$" + getSaldo() + "\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
        menus.menuBebida();
int opcaoMenuBebida = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário


            float valorProduto = 10.5f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Refrigerante.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outra bebida\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoBebida = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoBebida == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarBebida(); // Método para comprar uma bebida
} else if (segundaOpcaoBebida == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoBebida == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
}else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else if (opcaoMenuBebida == 2){ // Cria uma instância da classe Menu para exibir opções para o usuário
            float valorProduto = 7.8f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Suco.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outra bebida\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoBebida = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoBebida == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarBebida(); // Método para comprar uma bebida
} else if (segundaOpcaoBebida == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoBebida == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
}else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else if (opcaoMenuBebida == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
if (getIdade() < 18){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
System.out.println("\n" + getNome() + " você tem " + getIdade() // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + " anos. Você é menor de idade!\n");
                + "[1] Atualizar cadastro\n"
                + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal\n" // Cria uma instância da classe Menu para exibir opções para o usuário
                + "[4] Sair");

                    cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                    status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ " Retornando ao Menu Principal\n"); // Cria uma instância da classe Menu para exibir opções para o usuário
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoMenuCerveja == 2){ // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
} else if (opcaoMenuCerveja == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoMenuCerveja == 4){ // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                    System.exit(0);
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoMenuCerveja < 1 || opcaoMenuCerveja > 4) { // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Opção inválida! Escolha uma opção:\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                                + "[1] Atualizar cadastro\n"
                                + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal\n" // Cria uma instância da classe Menu para exibir opções para o usuário
                                + "[4] Sair");

                            cadastrar(); // Método para registrar os dados do cliente (nome e idade)
                            status();
System.out.println("Cadastro atualizado com sucesso!" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ " Retornando ao Menu Principal\n"); // Cria uma instância da classe Menu para exibir opções para o usuário
                            comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoMenuCerveja == 2) { // Cria uma instância da classe Menu para exibir opções para o usuário
                            comprarProduto(); // Método para iniciar a compra de um produto
} else if (opcaoMenuCerveja == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
                            comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoMenuCerveja == 4){ // Cria uma instância da classe Menu para exibir opções para o usuário
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                            System.exit(0);
                        }
                    }
                }

} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
                float valorProduto = 14.5f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Cerveja.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                            + "Seu saldo atual é R$" + getSaldo() + "\n");
                            + "[1] Comprar outra bebida\n"
                            + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoBebida = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoBebida == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                        comprarBebida(); // Método para comprar uma bebida
} else if (segundaOpcaoBebida == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                        comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoBebida == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                        comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                        comprarProduto(); // Método para iniciar a compra de um produto
                    }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                            + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                        fazerDeposito(); // Método para fazer depósito na conta do cliente
                        menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                        comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                                fazerDeposito(); // Método para fazer depósito na conta do cliente
                                menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                                comecar(); // Método para iniciar a interação com o sistema de menu
                            }
                        }
                    }
                }
            }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida! Escolha uma opção: \n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            comprarBebida(); // Método para comprar uma bebida
        }
    }

public void comprarComida(){ // Método para comprar comida // Declaração de um método público que pode ser acessado por outras classes
        menus.menuComida();
int opcaoMenuComida = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário

            float valorProduto = 8f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Salgado.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outra comida\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoComida = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoComida == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarComida(); // Método para comprar comida
} else if (segundaOpcaoComida == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoComida == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else if (opcaoMenuComida == 2){ // Cria uma instância da classe Menu para exibir opções para o usuário
            float valorProduto = 12.8f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Pastel.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outra comida\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoComida = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoComida == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarComida(); // Método para comprar comida
} else if (segundaOpcaoComida == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoComida == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else if (opcaoMenuComida == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
            float valorProduto = 17.9f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Salada.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outra comida\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoComida = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoComida == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarComida(); // Método para comprar comida
} else if (segundaOpcaoComida == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoComida == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida! Escolha uma opção: \n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            comprarComida(); // Método para comprar comida
        }
    }

public void comprarHigienie(){ // Declaração de um método público que pode ser acessado por outras classes
        menus.menuHigiene();
int opcaoMenuHigiene = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário

            float valorProduto = 19.9f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Shampoo.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outro produto de higiene\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoHigiene = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoHigiene == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarHigienie();
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoHigiene == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else if (opcaoMenuHigiene == 2) { // Cria uma instância da classe Menu para exibir opções para o usuário
            float valorProduto = 2.35f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Sabonete.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outro produto de higiene\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoHigiene = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoHigiene == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarHigienie();
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoHigiene == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else if (opcaoMenuHigiene == 3) { // Cria uma instância da classe Menu para exibir opções para o usuário
            float valorProduto = 13.4f;
if (valorProduto <= getSaldo()) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                setSaldo(getSaldo() - valorProduto);
System.out.println("\nVoce comprou o produto Desodorante.\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "Seu saldo atual é R$" + getSaldo() + "\n");
                        + "[1] Comprar outro produto de higiene\n"
                        + "[2] Comprar outro produto\n"
+ "[3] Voltar ao Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int segundaOpcaoHigiene = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
if (segundaOpcaoHigiene == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comprarHigienie();
                    comprarProduto(); // Método para iniciar a compra de um produto
}else if (segundaOpcaoHigiene == 3){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Voltando ao Menu dos Produtos!"); // Exibe saída no console // Cria uma instância da classe Menu para exibir opções para o usuário
                    comprarProduto(); // Método para iniciar a compra de um produto
                }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Saldo insuficiente! Escolha uma opção:\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                        + "[1] Fazer depósito\n"
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
int opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    fazerDeposito(); // Método para fazer depósito na conta do cliente
                    menuDeposito();
} else if (opcaoFinal == 2){ // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                    comecar(); // Método para iniciar a interação com o sistema de menu
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
while (opcaoFinal < 1 || opcaoFinal > 2) { // Estrutura de repetição que continua executando enquanto a condição for verdadeira
System.out.println("Opção inválida! Escolha uma opção\n\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
+ "[2] Menu Principal"); // Cria uma instância da classe Menu para exibir opções para o usuário
opcaoFinal = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)

if (opcaoFinal == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            fazerDeposito(); // Método para fazer depósito na conta do cliente
                            menuDeposito();
} else if (opcaoFinal == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
                            comecar(); // Método para iniciar a interação com o sistema de menu
                        }
                    }
                }
            }
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida! Escolha uma opção: \n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            comprarHigienie();
        }

    }

public void comprarProduto(){ // Método para iniciar a compra de um produto // Declaração de um método público que pode ser acessado por outras classes
        menus.menuProdutos();
int opcaoMenuProdutos = entrada.nextInt(); // Cria uma instância da classe Menu para exibir opções para o usuário
            comprarBebida(); // Método para comprar uma bebida
} else if (opcaoMenuProdutos == 2){ // Cria uma instância da classe Menu para exibir opções para o usuário
            comprarComida(); // Método para comprar comida
} else if  (opcaoMenuProdutos == 3){ // Cria uma instância da classe Menu para exibir opções para o usuário
            comprarHigienie();
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Escolha uma opção válida:\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            comprarProduto(); // Método para iniciar a compra de um produto
        }
    }

public void consultarSaldo() { // Método para consultar o saldo atual do cliente // Declaração de um método público que pode ser acessado por outras classes
System.out.println("========="); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                + "\nO que deseja fazer:\n"
                + "[1] Nova consulta\n"
                + "[2] Fazer depósito\n"
+ "[3] Retornar ao Menu Principal\n" // Cria uma instância da classe Menu para exibir opções para o usuário
                + "[4] Sair");
int opcaoCosultarSaldo = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

if (opcaoCosultarSaldo == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
            consultarSaldo(); // Método para consultar o saldo atual do cliente
} else if (opcaoCosultarSaldo == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
            fazerDeposito(); // Método para fazer depósito na conta do cliente
} else if (opcaoCosultarSaldo == 3) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
            comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoCosultarSaldo == 4) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            System.exit(0);
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Escolha uma opção válida:\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            consultarSaldo(); // Método para consultar o saldo atual do cliente
        }
    }

public void fazerDeposito() { // Método para fazer depósito na conta do cliente // Declaração de um método público que pode ser acessado por outras classes
System.out.println("============"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
float valor = entrada.nextFloat(); // Captura e armazena a entrada do usuário (como nome ou idade)
        this.setSaldo(this.getSaldo() + valor);
        menuDeposito();
    }

public void menuDeposito(){ // Declaração de um método público que pode ser acessado por outras classes

System.out.println("Seu saldo atual é R$ " + this.getSaldo() + "\n\n" // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                + "O que deseja fazer:\n\n"
                + "[1] Novo depósito\n"
+ "[2] Retornar ao Menu Principal\n" // Cria uma instância da classe Menu para exibir opções para o usuário
                + "[3] Encerrar");
int opcaoDeposito = entrada.nextInt(); // Captura e armazena a entrada do usuário (como nome ou idade)
System.out.println("\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console

if (opcaoDeposito == 1) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
            fazerDeposito(); // Método para fazer depósito na conta do cliente
} else if (opcaoDeposito == 2) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
            comecar(); // Método para iniciar a interação com o sistema de menu
} else if (opcaoDeposito == 3) { // Início de uma estrutura condicional que executa um bloco de código com base em uma condição
System.out.println("Encerrando o programa..."); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            System.exit(0);
} else { // Bloco alternativo que é executado se a condição do 'if' for falsa
System.out.println("Opção inválida. Escolha uma opção válida:\n"); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
            menuDeposito();
        }
    }
public void status(){ // Declaração de um método público que pode ser acessado por outras classes
System.out.println("======================="); // Exibe saída no console // Exibe mensagens e instruções para o usuário no console
                + "Idade: " + getIdade() + "\n");
    }

}
