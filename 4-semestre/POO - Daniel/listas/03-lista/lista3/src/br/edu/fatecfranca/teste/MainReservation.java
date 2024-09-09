package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe03.Flight;
import br.edu.fatecfranca.exe03.Passenger;
import br.edu.fatecfranca.exe03.Reservation;

import java.util.Date;

public class MainReservation {
    public static void main(String[] args) {
        // Criando alguns passageiros
        Passenger passenger1 = new Passenger(1, "Vinícius", "12345678900");
        Passenger passenger2 = new Passenger(2, "Laura", "98765432100");

        // Criando alguns voos
        Flight flight1 = new Flight(101, "São Paulo", "Rio de Janeiro");
        Flight flight2 = new Flight(102, "Brasília", "Salvador");

        // Criando algumas reservas
        Reservation reservation1 = new Reservation(1, new Date(), passenger1, flight1);
        Reservation reservation2 = new Reservation(2, new Date(), passenger2, flight2);

        // Exibindo as informações das reservas
        passenger1.dados();
        passenger2.dados();

        flight1.dados();
        flight2.dados();

        reservation1.dados();
        reservation2.dados();

    }
}
