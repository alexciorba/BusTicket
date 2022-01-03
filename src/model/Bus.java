package model;

public class Bus {

    private int busId;
    private int busNumber;
    private int busSeat;
    private String busRoute;

    public Bus(int busId, int busNumber, int busSeat, String busRoute){
        this.busId=busId;
        this.busNumber=busNumber;
        this.busSeat=busSeat;
        this.busRoute=busRoute;
    }
    public Bus(String line){
        this(Integer.parseInt(line.split(",")[0]),
                Integer.parseInt(line.split(",")[1]),
                        Integer.parseInt(line.split(",")[2]),
                                line.split(",")[3]);
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public void setBusRoute(String busRoute) {
        this.busRoute = busRoute;
    }

    public void setBusSeat(int busSeat) {
        this.busSeat = busSeat;
    }

    public int getBusId() {
        return busId;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public int getBusSeat() {
        return busSeat;
    }

    public String getBusRoute() {
        return busRoute;
    }

    public String descriereBus(){
        String text="";
        text+="bus id: " + busId+"\n";
        text+="bus numeber: " + busNumber+"\n";
        text+="bus seat number: "+busSeat+"\n";
        text+="bus route: " + busRoute+"\n";
        return text;
    }

    public String toSaveBus(){
        String text="";
        text+=busId+","+busNumber+","+busSeat+","+busRoute;
        return text;
    }
}
