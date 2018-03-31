package programa3;

import programa2.Janela;

public class Casa {

    public String cor;
    Janela janela1 = new Janela();
    Janela janela2 = new Janela();
    Janela janela3 = new Janela();
    public int qtd = 0;

    public void pinta(String s) {
        this.cor = s;
    }

    public int quantidadeJanelaAbertas() {
        if (janela1.isAberta()) {
            qtd++;
        }
        if (janela2.isAberta()) {
            qtd++;
        }
        if (janela3.isAberta()) {
            qtd++;
        }
        return qtd;
    }
    
    public void imprimir(){
        System.out.println("Cor da casa: " + cor);
        System.out.println("Quantidade janelas abertas: " + qtd);
    }
}
