import java.util.Scanner;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        int opcao = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (opcao != 0) {
            System.out.println("\n===== SISTEMA DE GERENCIAMENTO DE FILA =====");
            System.out.println("1 - inserir documento na fila");
            System.out.println("2 - remover documento da fila");
            System.out.println("3 - procurar documento");
            System.out.println("4 - mostrar fila");
            System.out.println("0 - sair");
            System.out.print("escolha uma opção: ");
            
            opcao = Integer.parseInt(scanner.nextLine());
            
            switch (opcao) {
                case 1:
                    System.out.print("digite o nome do arquivo: ");
                    String arquivo = scanner.nextLine();
                    System.out.print("digite o usuário: ");
                    String usuario = scanner.nextLine();
                    Documento novoDoc = new Documento(arquivo, usuario);
                    System.out.println(fila.enfileirarDocumento(novoDoc));
                    break;
                case 2:
                    System.out.println(fila.desenfileirarDocumento());
                    break;
                case 3:
                    System.out.print("digite o nome do arquivo: ");
                    String nomeArquivo = scanner.nextLine();
                    System.out.println(fila.consultarDocumento(nomeArquivo));
                    break;
                case 4:
                    System.out.println("\n=== EXIBINDO FILA ===");
                    System.out.println(fila);
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
