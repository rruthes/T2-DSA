import javax.swing.JOptionPane;

public class TestePilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        int opcao = 1;
        
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Empilhar documento\n2 - Imprimir documento\n3 - Verificar documento\n4 - Exibir pilha\n0 - Sair do sistema"));
            
            switch (opcao) {
                case 1:
                    String arquivo = JOptionPane.showInputDialog("digite o nome do arquivo");
                    String usuario = JOptionPane.showInputDialog("digite o usuário");
                    Documento docTeste = new Documento(arquivo, usuario);
                    JOptionPane.showMessageDialog(null, pilha.empilharDocumento(docTeste));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, pilha.desempilharDocumento());
                    break;
                case 3:
                    String nomeArquivo = JOptionPane.showInputDialog("digite o nome do arquivo que deseja verificar");
                    JOptionPane.showMessageDialog(null, pilha.verificarDocumento(nomeArquivo));
                    break;
                case 4:
                    System.out.println("exibindo pilha\n" + pilha);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "saindo do sistema");
                    break;
            }
        }
    }
}
