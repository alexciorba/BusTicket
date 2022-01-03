package controller;

import model.Bus;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerBus {
    private ArrayList<Bus>busList;

    public ControllerBus(){
        busList=new ArrayList<>();
        load();
    }
    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BusTicketBooking\\src\\resources\\bus.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                busList.add(new Bus(scanner.nextLine()));
            }
        }catch (Exception e){

        }
    }

    public void addBus(Bus bus){
        busList.add(bus);
    }

    public void afisareBus(){
        for(Bus bus: busList){
            System.out.println(bus.descriereBus());
        }
    }

    public void updateBusNumber(int id,int number){
        for(Bus b :busList){
            if(b.getBusId()==id){
                b.setBusNumber(number);
            }
        }
    }

    public void updateBusSeat(int id,int seat){
        for(Bus b :busList){
            if(b.getBusId()==id){
                b.setBusSeat(seat);
            }
        }
    }
    public void updateBusRoute(int id,String route){
        for(Bus b :busList){
            if(b.getBusId()==id){
                b.setBusRoute(route);
            }
        }
    }
    public void deleteBus(int id){
        for(int i=0;i<busList.size();i++){
            if(busList.get(i).getBusId()==id){
                busList.remove(i);
            }
        }
    }
    public String toSaveBus(){
        String text="";
        for(Bus b:busList){
            text+=b.toSaveBus()+"\n";
        }
        return text;
    }
    public void saveBus(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BusTicketBooking\\src\\resources\\bus.txt");

        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveBus());
            printWriter.close();
        }catch (Exception e){

        }

    }

}
