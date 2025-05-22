public class Fila {
    Documento[] elementos;
    int inicio, fim, tamanhoAtual;
    
    public Fila(int tamanhoMaximo) {
        inicio = 0;
        fim = 0;
        tamanhoAtual = 0;
        elementos = new Documento[tamanhoMaximo];
    }
    
    public Fila() {
        this(10);
    }
    
    public boolean estaVazia() {
        return tamanhoAtual == 0;
    }
    
    public boolean estaCheia() {
        return tamanhoAtual == elementos.length;
    }
    
    public int proximaPosicao(int posicao) {
        return (posicao + 1) % elementos.length;
    }
    
    public boolean enfileirarDocumento(Documento doc) {
        if (estaCheia()) {
            return false;
        }
        
        elementos[fim] = doc;
        fim = proximaPosicao(fim);
        tamanhoAtual++;
        return true;
    }
    
    public Documento desenfileirarDocumento() {
        if (estaVazia()) {
            return null;
        }
        
        Documento temp = elementos[inicio];
        elementos[inicio] = null;
        inicio = proximaPosicao(inicio);
        tamanhoAtual--;
        return temp;
    }
    
    public Documento consultarDocumento(String nomeArquivo) {
        if (estaVazia()) {
            return null;
        }
        
        int posicao = inicio;
        for (int i = 0; i < tamanhoAtual; i++) {
            if (elementos[posicao].getArquivo().equals(nomeArquivo)) {
                return elementos[posicao];
            }
            posicao = proximaPosicao(posicao);
        }
        
        return null;
    }
    
    @Override
    public String toString() {
        if (estaVazia()) {
            return "fila vazia";
        }
        
        StringBuilder resultado = new StringBuilder();
        int posicao = inicio;
        
        for (int i = 0; i < tamanhoAtual; i++) {
            resultado.append(elementos[posicao].getArquivo());
            if (i < tamanhoAtual - 1) {
                resultado.append(", ");
            }
            posicao = proximaPosicao(posicao);
        }
        
        return resultado.toString();
    }
}
