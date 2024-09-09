package br.edu.fatecfranca.exe01;

public class Person {
    private int id;
    private String name, user;


    public Person() {
    }

    // Construtor
    public Person(int id, String name, String user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
