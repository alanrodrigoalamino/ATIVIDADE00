package programa1;


public class Programa1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa pess = new Pessoa();
        pess.nome = "Alan";
        pess.idade = 30;
        
        pess.fazAniversario();
        pess.fazAniversario();
        pess.fazAniversario();
        pess.fazAniversario();
        
        System.out.println("Nome: " + pess.nome);
        System.out.println("Idade: " + pess.idade);
    }
    
}
