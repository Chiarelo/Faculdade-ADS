package br.edu.fatecfranca.exe02;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private int id;
    private String name, sigla;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    //Criando 3 construtores um sem paramentros, um com todos os parametros e o ultimo com todos os parametros
    //Tirando o parametros de array list
    public Disciplina() {

    }

    public Disciplina(int id, String name, String sigla, Professor professor, List<Aluno> alunos) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
        alunos = alunos;
    }

    public Disciplina(int id, String name, String sigla, Professor professor) {
        this.id = id;
        this.name = name;
        this.sigla = sigla;
        this.professor = professor;
    }

    //Criando getters


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSigla() {
        return sigla;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    //Crinado setter

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAlunos(List<Aluno> alunos) {
        alunos = alunos;
    }


    @Override
    public String toString() {
        return "\nDisciplina{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sigla='" + sigla + '\'' +
                ", professor=" + professor +
                ", alunos=" + alunos +
                '}';
    }

    public void dadosDisciplina(){
        System.out.println(this.toString());
    }

    public void addAluno(Aluno al){
        this.alunos.add(al);
    }
}
