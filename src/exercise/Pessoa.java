package exercise;

public class Pessoa {

    private String name;
    private String endereco;
    private String telefone;

    public Pessoa(String name, String endereco, String telefone) {
        this.name = name;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getName() {
        return this.name;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String toString() {
        return "O " + this.getName() + " domiciliado no endereco " +
                this.getEndereco() + " e telefone " +
                this.getTelefone() + " não possui pendência";
    }
}
