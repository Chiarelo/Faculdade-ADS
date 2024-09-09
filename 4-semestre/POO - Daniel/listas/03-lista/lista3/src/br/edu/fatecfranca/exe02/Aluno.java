package br.edu.fatecfranca.exe02;

public class Aluno {
    private int id;
    private String name, username;

    //Criando váriaveis
    public Aluno(int id, String name, String username) {
        this.id = id;
        this.name = name;
        this.username = username;
    }

    public Aluno() {
        this.id = 0;
        this.name = "";
        this.username = "";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public void dadosAluno(){
        System.out.println(this.toString());
    }
}
