package lista06A;

public class FuncionarioAdmin extends Funcionarios{
    private String funcaoAdmin;
    private String senioridade;

    public FuncionarioAdmin(String nome, String cpf, String numRegistro, String orgaoLotacao, double salarioBase, String funcaoAdmin, String senioridade) {
        super(nome, cpf, numRegistro, orgaoLotacao, salarioBase);
        this.funcaoAdmin = funcaoAdmin;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdmin() {
        return funcaoAdmin;
    }

    public void setFuncaoAdmin(String funcaoAdmin) {
        this.funcaoAdmin = funcaoAdmin;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
    public void aumentarSalarioFunc (){
        reajusteFunc = (salarioBase /100) * 10;
        double salarioFunc = salarioBase + reajusteFunc;
        System.out.println("Salário atual: R$ " + salarioBase);
        System.out.println("Você obteve um reajuste de 10% sobre seu salário atual!!");
        System.out.println("O valor do reajuste é de R$ " + reajusteFunc);
        System.out.println("O valor total do novo salario será de R$ " + salarioFunc);
    }

}
