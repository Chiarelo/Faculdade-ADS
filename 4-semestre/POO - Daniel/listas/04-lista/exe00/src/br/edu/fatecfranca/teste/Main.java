package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe00.Assistente;

public class Main {
    public static void main(String[] args) {
        Assistente assi1 = new Assistente("Matheus", "Franca", "123.456.789-3", 3000, 4);

        assi1.calculaSalario();
        System.out.println(assi1);
    }
}
