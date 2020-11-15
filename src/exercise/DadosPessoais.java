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

    public char getSexo() {
        return this.sexo;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public double getSalario() {
        return this.salario;
    }

    public String toString() {
        return "O trabalhador(a) "+ this.getName() +" do sexo "+ this.getSexo() +" e estado civil "+ this.getEstadoCivil() +"\n" +
                "e salário "+ this.getSalario() +" encontra-se empregado neste estabelecimento.";
    }
}
