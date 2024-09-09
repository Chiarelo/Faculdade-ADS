package br.edu.fatecfranca.exe01;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> messages = new ArrayList<>();

    // Construtor
    public Forum(int id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Getter para messages
    public List<Message> getMessages() {
        return messages;
    }

    // Método para adicionar uma mensagem
    public void addMessage(int msgId, String msgText, Person msgPerson) {
        this.messages.add(new Message(msgId, msgText, msgPerson));
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", messages=" + messages +
                '}';
    }
}
