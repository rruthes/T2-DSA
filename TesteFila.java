import javax.swing.JOptionPane;

public class TesteFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        int opcao = 1;
        
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Enfileirar documento\n2 - Desenfileirar documento\n3 - Consultar documento\n4 - Exibir fila\n0 - Sair do sistema"));
            
            switch (opcao) {
                case 1:
                    String arquivo = JOptionPane.showInputDialog("digite o nome do arquivo");
                    String usuario = JOptionPane.showInputDialog("digite o usuário");
                    Documento novoDoc = new Documento(arquivo, usuario);
                    JOptionPane.showMessageDialog(null, fila.enfileirarDocumento(novoDoc));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, fila.desenfileirarDocumento());
                    break;
                case 3:
                    String nomeArquivo = JOptionPane.showInputDialog("digite o nome do arquivo que deseja consultar");
                    JOptionPane.showMessageDialog(null, fila.consultarDocumento(nomeArquivo));
                    break;
                case 4:
                    System.out.println("exibindo fila\n" + fila);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "saindo do sistema");
                    break;
            }
        }
    }
}
