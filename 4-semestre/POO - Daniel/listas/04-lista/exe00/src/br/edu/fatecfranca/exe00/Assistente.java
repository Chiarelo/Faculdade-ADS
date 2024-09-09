package br.edu.fatecfranca.exe00;

public class Assistente extends Funcionario {
    private float horaExtra;
    public Assistente() {
        super();
        this.horaExtra = 0;
    }

    public Assistente(String nome, String endereco, String cpf, float salario, float horaExtra) {
        super(nome, endereco, cpf, salario);
        this.horaExtra = horaExtra;
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHoraExtra: " + horaExtra;
    }
    public float calculaSalario() {
        return this.salario + (horaExtra * 40);
    }
}
