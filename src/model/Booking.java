package model;

public class Booking {
    private int bookingId;
    private int customerId;
    private String date;

    public Booking(int bookingId,int customerId,String date){
        this.bookingId=bookingId;
        this.customerId=customerId;
        this.date=date;
    }

    public Booking(String line){
        this(Integer.parseInt(line.split(",")[0]),
                Integer.parseInt(line.split(",")[1]),
                line.split(",")[2]);
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getDate() {
        return date;
    }

    public String descriereBooking(){

        String text="";
        text+="Booking id is: " + bookingId + "\n";
        text+="Customer id is: "+ customerId + "\n";
        text+="Date : " + date+"\n";
        return text;

    }

    public String toSaveBooking(){
        String text="";
        text+=bookingId+","+customerId+","+date;
        return text;
    }
}
