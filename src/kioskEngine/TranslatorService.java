package kioskEngine;

public class TranslatorService implements Service{
    private String language;
    private int endTime;

    public TranslatorService (){
        this.type = "TranslatorService";
    }

    public TranslatorService(String language, int endTime){
        this.language = language;
        this.endTime = endTime;
        this.type = "TranslatorService";
    }

    public assignPerson(Staff person){
        this.personel.add(person);
    }

    public assignPeople(List<Staff> people){
        for(Staff person: people)
            this.personel.add(person)
    }
}