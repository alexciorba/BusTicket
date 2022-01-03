package model;

public class Customer {
    private int id;
    private String name;
    private String mail;
    private String password;
    private int mobile;

    public Customer(int id,String name , String mail,String password,int mobile){
        this.id=id;
        this.name=name;
        this.mail=mail;
        this.password=password;
        this.mobile=mobile;
    }

    public Customer(String line){
        this(Integer.parseInt(line.split(",")[0]),
                line.split(",")[1],
                line.split(",")[2],
                line.split(",")[3],
                Integer.parseInt(line.split(",")[4])
                ); 
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public int getMobile() {
        return mobile;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
    public String descriptionCustomer(){
        String text="";
        text+="Customer id: "+ id+"\n";
        text+="Customer name: " + name+"\n";
        text+="Customer mail: " + mail+"\n";
        text+="Customer password: " + password + "\n";
        text+="Customer mobile: " + mobile + "\n";
        return text;
    }
    public String toSaveCustomer(){
        String text="";
        text+=id+","+name+","+mail+","+password+","+mobile;
        return text;
    }
}
