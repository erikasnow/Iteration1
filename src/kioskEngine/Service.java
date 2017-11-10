package kioskEngine;

public interface Service{
    private String type;
    private List<Staff> personel;

    public assignPerson(Staff person);
    public assignPeople(List<Staff> people);
}