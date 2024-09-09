package br.edu.fatecfranca.exe01;

public class Message {
    private int id;
    private String text;
    private String user;

    // Construtor
    public Message(int id, String text, Person user) {
        this.id = id;
        this.text = text;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }



    @Override
    public String toString() {
        return "Message{id=" + id + ", text='" + text + "'}";
    }
}

