public class OperadoresLogicos {
    public static void main(String[] args) {

        int idade = 18;
        float salario = 900f;

        System.out.println(idade >= 18 && salario >= 1000);

        if (idade > 18) {
            System.out.println("Pode entrar no clube");
        } else {
            System.out.println("Idade não permite ter acesso ao clube");
        }

        if (idade > 18 || salario > 1000) {
            System.out.println("Pode entrar no clube");
        } else {
            System.out.println("Verifique salário e idade!");
        }

    }
}