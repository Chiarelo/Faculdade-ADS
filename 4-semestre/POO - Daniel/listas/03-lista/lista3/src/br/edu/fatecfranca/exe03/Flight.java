package br.edu.fatecfranca.exe03;
import java.util.ArrayList;
import java.util.List;

public class Flight {
    private int id;
    private String origin;
    private String destination;
    private List<Reservation> reservations = new ArrayList<Reservation>();

    public Flight(int id, String origin, String destination) {
        this.id = id;
        this.origin = origin;
        this.destination = destination;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(Reservation reservations) {
        this.reservations.add(reservations);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", reservations=" + reservations +
                '}';
    }

    public void dados(){
        System.out.println(this.toString());
    }
}
