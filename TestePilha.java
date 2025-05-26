import java.util.Scanner;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        int opcao = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (opcao != 0) {
            System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE FILA =====");
            System.out.println("1 - inserir documento na pilha");
            System.out.println("2 - remover documento da pilha");
            System.out.println("3 - procurar documento");
            System.out.println("4 - mostrar pilha");
            System.out.println("0 - sair");
            System.out.print("escolha uma opção: ");
            
            opcao = Integer.parseInt(scanner.nextLine());
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do arquivo: ");
                    String arquivo = scanner.nextLine();
                    System.out.print("Digite o usuário: ");
                    String usuario = scanner.nextLine();
                    Documento docTeste = new Documento(arquivo, usuario);
                    System.out.println(pilha.empilharDocumento(docTeste));
                    break;
                case 2:
                    System.out.println(pilha.desempilharDocumento());
                    break;
                case 3:
                    System.out.print("digite o nome do arquivo: ");
                    String nomeArquivo = scanner.nextLine();
                    System.out.println(pilha.verificarDocumento(nomeArquivo));
                    break;
                case 4:
                    System.out.println("\n=== EXIBINDO PILHA ===");
                    System.out.println(pilha);
                    break;
                case 0:
                    System.out.println("saindo do sistema...");
                    break;
                default:
                    System.out.println("opção inválida.");
            }
            
            if (opcao != 0) {
                System.out.println("\npressione ENTER para continuar...");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}
