package atu.ie;

public class Employee {
    private String name;
    private int ppsId;

    public Employee(){}
    Employee(String n, int pps){
        name = n;
        ppsId = pps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPpsId() {
        return ppsId;
    }

    public void setPpsId(int ppsId) {
        this.ppsId = ppsId;
    }


    void main(){

    }
}


