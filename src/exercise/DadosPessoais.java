package exercise;

public class DadosPessoais extends Pessoa {

    private String estadoCivil;
    private char sexo;
    private double salario;

    public DadosPessoais(String name,String endereco, String telefone, String estadoCivil, char sexo, double salario) {
        super(name, endereco, telefone);
        this.estadoCivil = estadoCivil;
        this.sexo = sexo;
        this.salario = salario;
    }
}
