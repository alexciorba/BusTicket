package controller;

import model.Bus;
import model.Customer;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerCustomer {

    private ArrayList<Customer>customersList;

    public ControllerCustomer(){
        customersList=new ArrayList<>();
        load();
    }
    public void load(){
        try{
            File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BusTicketBooking\\src\\resources\\customer.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                customersList.add(new Customer(scanner.nextLine()));
            }
        }catch (Exception e){

        }
    }

    public void addCustomer(Customer customer){
        customersList.add(customer);
    }

    public void afisareCustomer(){
        for(Customer customer : customersList){
            System.out.println(customer.descriptionCustomer());
        }
    }

    public void updateName(int id,String name){
        for(Customer customer : customersList){
            if(customer.getId()==id){
                customer.setName(name);
            }
        }
    }
    public void updateMail(int id,String mail){
        for(Customer customer : customersList){
            if(customer.getId()==id){
                customer.setMail(mail);
            }
        }
    }
    public void updatePass(int id,String pass){
        for(Customer customer : customersList){
            if(customer.getId()==id){
                customer.setPassword(pass);
            }
        }
    }

    public void updateMobile(int id,int nr){
        for(Customer customer : customersList){
            if(customer.getId()==id){
                customer.setMobile(nr);
            }
        }
    }

    public void deleteCustomer(int id){
        for(int i=0;i<customersList.size();i++){
            if(customersList.get(i).getId()==id){
                customersList.remove(i);
            }
        }
    }
    public String toSaveCustomer(){
        String text="";
        for(Customer customer:customersList){
            text+=customer.toSaveCustomer()+"\n";
        }
        return text;
    }
    public void saveCustomer(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Incapsulare\\BusTicketBooking\\src\\resources\\customer.txt");

        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSaveCustomer());
            printWriter.close();
        }catch (Exception e){

        }

    }
}
