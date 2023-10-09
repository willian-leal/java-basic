package edu.willian.segundasemana;

public class App {
    public static void main(String[] args) {
        String primeiroNome = "Willian";
        String segundoNome = "Leal";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
