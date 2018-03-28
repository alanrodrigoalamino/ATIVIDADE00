package revisao.exercicio1;

import java.time.LocalDate;

public class Funcionario {
    private int idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private double salario;
    private String documento;
    private boolean estaAtivo;
    
    public void atualizarSalario(double aumento){
        setSalario(getSalario()+aumento);
    }
    
    public void demitirFuncionario(){
        setEstaAtivo(false);
    }
    
    public void imprimir(){
        System.out.println("Identificação: " + getIdFunc());
        System.out.println("Nome: " + getNomeFunc());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Contratação: " + getDataContratacao());
        System.out.println("Salario: " + getSalario());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Situação: " +isEstaAtivo());
    }

    /**
     * @return the idFunc
     */
    public int getIdFunc() {
        return idFunc;
    }

    /**
     * @param idFunc the idFunc to set
     */
    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    /**
     * @return the nomeFunc
     */
    public String getNomeFunc() {
        return nomeFunc;
    }

    /**
     * @param nomeFunc the nomeFunc to set
     */
    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the dataContratacao
     */
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    /**
     * @param dataContratacao the dataContratacao to set
     */
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the estaAtivo
     */
    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    /**
     * @param estaAtivo the estaAtivo to set
     */
    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }
}
