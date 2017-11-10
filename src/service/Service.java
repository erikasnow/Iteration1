package service;

import java.util.List;

public interface Service{
    //String type;              //Interfaces can't have data fields, only methods
    //List<Staff> personel;

    public void assignPerson(Staff person); //Are these actually void? Just fixing errors -Travis
    public void assignPeople(List<Staff> people);
}