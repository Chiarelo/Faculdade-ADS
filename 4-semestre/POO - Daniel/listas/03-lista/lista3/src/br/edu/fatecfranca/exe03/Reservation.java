package br.edu.fatecfranca.exe03;
import java.util.Date;

public class Reservation {
    private int id;
    private Date date;
    private Passenger passenger;
    private Flight flight;

    public Reservation(int id, Date date, Passenger passenger, Flight flight) {
        this.id = id;
        this.date = date;
        this.passenger = passenger;
        this.flight = flight;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }
    public void dados(){
        System.out.println(this.toString());
    }
}
