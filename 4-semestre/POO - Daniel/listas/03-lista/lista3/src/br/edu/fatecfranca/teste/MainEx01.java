package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe01.Person;
import br.edu.fatecfranca.exe01.Forum;
import br.edu.fatecfranca.exe01.Message;

public class MainEx01 {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Joao Victor", "JoaoVictorCRP");
        Person p2 = new Person(2, "Larissa", "Larissa120");

        Forum forum = new Forum(00, "Conversas", "www.conversas.com");

        forum.addMessage(010, "Oi, Larissa. Tudo bem?", p1);
        forum.addMessage(020, "Tudo ótimo. E você?", p2);

        System.out.println(forum);
    }
}
