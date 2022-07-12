package lista06A;

public class TesteLista06A{
    public static void main(String[] args) {

        Coordenador c1 = new Coordenador("Kilda", "001.000.001-01", "003-R", "MASP", 2000);
        System.out.println("\n\n\n*** Dados do Funcionário  - Grupo de Servidor - Coordenador ***");
        System.out.println("\nNome: "+c1.nome+"\nCPF: "+c1.cpf+"\nÓrgão: "+c1.orgaoLotacao+" - "+c1.numRegistro);
        c1.aumentarSalarioFunc();
        c1.adicionarProfessor();

        FuncionarioAdmin f1 = new FuncionarioAdmin("Antonia", "003.003.003-03", "001-W", "MASP", 4000, "Secretário", "Pleno");
        System.out.println("\n\n\n*** Dados do Funcionário  - Grupo de Servidor - Função Administrativa ***");
        System.out.println("\nNome: "+f1.nome+"\nCPF: "+f1.cpf+"\nÓrgão: "+f1.orgaoLotacao+" - "+f1.numRegistro+"\nFunção Administrativa: "+f1.getFuncaoAdmin()+"\nSenioridade: "+f1.getSenioridade());
        f1.aumentarSalarioFunc();

        Professor p1 = new Professor("Pedro Neto", "000.000.000-00", "X007", "MASP", 5000, "Superior Completo",
                "Informática", 100, 4);
        System.out.println("\n\n\n*** Dados do Funcionário  - Grupo de Servidor - Professor ***");
        System.out.println("\nNome: "+p1.nome+"\nCPF: "+p1.cpf+"\nÓrgão: "+p1.orgaoLotacao+" - "+p1.numRegistro+"\nNível de Graduação: "+p1.getNivelGraduacao()+
                "\nDisciplina Ministrada: "+p1.getDisciplinaMinistrada()+"\nQuantidade de alunos: "+p1.getQtdAlunos()+"  -  Quantidade de Turmas: "+p1.getQtdTurmas());
        p1.aumentarSalarioFunc();
        p1.adicionarTurma();



    }


}
