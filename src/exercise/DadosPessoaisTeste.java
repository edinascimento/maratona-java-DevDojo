package exercise;

public class DadosPessoaisTeste {
    public static void main(String[] args) {
        DadosPessoais dp = new DadosPessoais("Édipo", "Rua Vilfredo Pareto, 829", "(11)94585-9999",
                "casado", 'M', 3000.0);

        System.out.println(dp.toString());;
    }
}
