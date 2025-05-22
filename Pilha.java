import java.util.Date;

public class Pilha {
    Documento[] itens;
    int topo;
    
    public Pilha(int capacidade) {
        topo = 0;
        itens = new Documento[capacidade];
    }
    
    public Pilha() {
        this(10);
    }
    
    public boolean pilhaVazia() {
        return topo == 0;
    }
    
    public boolean pilhaCheia() {
        return topo == itens.length;
    }
    
    public String empilharDocumento(Documento doc) {
        if (pilhaCheia()) {
            return "capacidade máxima foi atingida";
        }
        
        Long tempoSolicitacao = System.currentTimeMillis();
        Date data = new Date(tempoSolicitacao);
        doc.setHorario(data);
        
        itens[topo] = doc;
        topo++;
        
        return "documento " + doc.getArquivo() + " empilhado com sucesso";
    }
    
    public Documento desempilharDocumento() {
        if (pilhaVazia()) {
            return null;
        }
        
        topo--;
        Documento temp = itens[topo];
        itens[topo] = null;
        return temp;
    }
    
    public Documento verificarDocumento(String nomeArquivo) {
        if (pilhaVazia()) {
            return null;
        }
        
        for (int i = 0; i < topo; i++) {
            if (itens[i].getArquivo().equals(nomeArquivo)) {
                return itens[i];
            }
        }
        
        return null;
    }
    
    @Override
    public String toString() {
        if (pilhaVazia()) {
            return "pilha vazia";
        }
        
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < topo; i++) {
            resultado.append(itens[i].getArquivo());
            if (i < topo - 1) {
                resultado.append(", ");
            }
        }
        
        return resultado.toString();
    }
}
