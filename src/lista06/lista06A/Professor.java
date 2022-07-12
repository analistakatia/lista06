package lista06A;

import java.util.Scanner;

public class Professor extends Funcionarios{
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professor(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase, String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numRegistro, orgaoLotacao, salarioBase);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }

    //Metodo - Calcular aumento de salario de todos os funcionarios com percentual de 10%, exceto coordenadores
    public void aumentarSalarioFunc (){
        reajusteFunc = (salarioBase /100) * 10;
        double salarioFunc = salarioBase + reajusteFunc;
        System.out.println("Salário atual: R$ " + salarioBase);
        System.out.println("Você obteve um reajuste de 10% sobre seu salário atual!!");
        System.out.println("O valor do reajuste é de R$ " + reajusteFunc);
        System.out.println("O valor total do novo salario será de R$ " + salarioFunc);
    }
    public void adicionarTurma(){
        int turma;
        Scanner t1 = new Scanner(System.in);
        System.out.print("Deseja adicionar alguma nova turma a esse professor? 1 - S/ 2 - N: ");
        turma = t1.nextInt();

        switch (turma){
            case 1:
                System.out.println("Insira a quantidade de turma a ser adicionada: ");
                turma = t1.nextInt();
                int turmaAtualizada = qtdTurmas + turma;
                System.out.print("\nQuantidade de turmas atualizada para: "+turmaAtualizada+" turmas");
                break;
            default:
                System.out.println("\nQuantidade de turmas se manteve a mesma sem nenhuma alteração!");
        }
    }
}
