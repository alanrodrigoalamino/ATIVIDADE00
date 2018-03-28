package revisao.exercicio1;

import java.time.LocalDate;
import java.time.Month;

public class GerenciarFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
         Funcionario Func = new Funcionario();
         Func.setIdFunc(1);
         Func.setNomeFunc("Alan");
         Func.setDepartamento("TI");
         Func.setDataContratacao(LocalDate.of(2018, Month.MARCH, 01));
         Func.setSalario(2900.0);
         Func.setDocumento("57.313.490-x");
         Func.setEstaAtivo(true);
         
         Func.atualizarSalario(100);
         
         Func.imprimir();
         
         Func.demitirFuncionario();
         
         Func.imprimir();
    }
    
}
