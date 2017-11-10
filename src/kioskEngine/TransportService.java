package kioskEngine;

public class TransportService implements Service{
    private String transportationType;

    public TransportService (){
        this.type = "TransportationService";
    }

    public TransportService(String type){
        this.transportationType = type;
        this.type = "TransportationService";
    }

    public assignPerson(Staff person){
        this.personel.add(person);
    }

    public assignPeople(List<Staff> people){
        for(Staff person: people)
            this.personel.add(person)
    }
}