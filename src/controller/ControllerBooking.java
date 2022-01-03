package controller;

import model.Booking;
import model.Bus;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBooking {
    private ArrayList<Booking>bookingList;

    public ControllerBooking(){
        bookingList=new ArrayList<>();
        load();

    }
    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BusTicketBooking\\src\\model\\Booking.java");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                bookingList.add(new Booking(scanner.nextLine()));
            }
        }catch (Exception e){

        }
    }

    public void addBooking(Booking booking){
        bookingList.add(booking);
    }
    public void afisareBooking(){
        for(Booking booking : bookingList){
            System.out.println(booking.descriereBooking());
        }
    }
    public void updateDate(int id,String date){
        for(Booking booking : bookingList){
            if(booking.getBookingId()==id){
                booking.setDate(date);
            }
        }
    }

    public void deleteBooking(int id){
        for(int i=0;i<bookingList.size();i++){
            if(bookingList.get(i).getBookingId()==id){
                bookingList.remove(i);
            }
        }
    }
    public String toSaveBooking(){
        String text="";
        for(Booking  booking:bookingList){
            text+=booking.toSaveBooking()+"\n";
        }
        return text;
    }
    public void saveBus(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BusTicketBooking\\src\\resources\\booking.txt");

        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveBooking());
            printWriter.close();
        }catch (Exception e){

        }

    }


}
