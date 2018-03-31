
package programa3;

public class Programa3 {

    public static void main(String[] args) {
        Casa cas = new Casa();
        
        cas.cor = "Marrom";
        cas.janela1.abre();
        cas.janela2.fecha();
        cas.janela3.abre();
        cas.quantidadeJanelaAbertas();
        cas.imprimir();
    }
    
}
