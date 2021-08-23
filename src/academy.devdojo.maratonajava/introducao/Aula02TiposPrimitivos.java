package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
  // int, double, float, char, byte, short, long, boolean
  public static void main(String[] args) {
    int age = 10;
    long numeroLong = 140000000000000L;
    double salarioDouble = 2000d;
    float salarioFloat = 150.90f;
    byte idadeByte = 10;
    short idadeShort = 10;
    boolean verdadeiro = true;
    boolean falso = false;
    char caractere = 10;

    System.out.println("Número inteiro: " + age);
    System.out.println("Número long: " + numeroLong);
    System.out.println("Número double: " + salarioDouble);
    System.out.println("Número float: " + salarioFloat);
    System.out.println("Número byte: " + idadeByte);
    System.out.println("Idade short: " + idadeShort);
    System.out.println("Verdadeiro: " + verdadeiro);
    System.out.println("Falso: " + falso);
    System.out.println("Caractere: " + caractere);
  }
}