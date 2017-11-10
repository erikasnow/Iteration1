package service;


import java.util.List;

public class TransportService implements Service{
    private String transportationType;

    private String type;
    List<Staff> personel;

    public TransportService (){
        this.type = "TransportationService";
    }

    public TransportService(String type){
        this.transportationType = type;
        this.type = "TransportationService";
    }

    public void assignPerson(Staff person){
        this.personel.add(person);
    }

    public void assignPeople(List<Staff> people){
        for(Staff person: people)
            this.personel.add(person);
    }
}