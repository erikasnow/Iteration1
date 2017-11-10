package service;

import java.util.List;

public class TranslatorService extends Service{
    private String language;
    private int endTime;
    private String type;
    List<Staff> personel;

    public TranslatorService (){
        this.type = "TranslatorService";
    }

    public TranslatorService(String language, int endTime){
        this.language = language;
        this.endTime = endTime;
        this.type = "TranslatorService";
    }

    public void assignPerson(Staff person){
        this.personel.add(person);
    }

    public void assignPeople(List<Staff> people){
        for(Staff person: people)
            this.personel.add(person);
    }
}