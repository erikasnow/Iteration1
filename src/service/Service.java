package service;

import java.util.List;

abstract class Service{
    String type;
    List<Staff> personel;

    abstract void assignPerson(Staff person); //Are these actually void? Just fixing errors -Travis
    abstract void assignPeople(List<Staff> people);
}