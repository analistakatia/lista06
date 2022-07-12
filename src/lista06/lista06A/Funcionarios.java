package lista06A;

import java.util.Scanner;

public abstract class Funcionarios {
    String nome;
    String cpf;
    String numRegistro;
    String orgaoLotacao;
    double salarioBase = 0;
    double reajusteFunc = 0;

    //Implementando Construtor
    public Funcionarios(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salarioBase = salarioBase;
    }
    //Implementando Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //Implementando Metodos

    public void aumentarSalarioFunc (double salarioBase){

    }
}
