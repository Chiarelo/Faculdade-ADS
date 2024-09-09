package br.edu.fatecfranca.exe00;

public class Funcionario {
    protected String nome, endereco, cpf;
    protected float salario;

    //Construtores
    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.salario = salario;
    }

    //Construtores
    public Funcionario() {
        this.nome = "";
        this.endereco = "";
        this.cpf = "";
        this.salario = 0;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public float getSalario() {
        return salario;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salario=" + this.calculaSalario() +
                '}';
    }

    public float calculaSalario() {
        return this.salario;
    }
}
