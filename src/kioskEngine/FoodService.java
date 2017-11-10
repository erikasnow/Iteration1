package kioskEngine;

public class FoodService implements Service{
    private String foodType;

    public FoodService (){
        this.type = "FoodService";
    }

    public FoodService (String foodType){
        this.foodType = foodType;
        this.type = "FoodService";
    }

    public assignPerson(Staff person){
        this.personel.add(person);
    }

    public assignPeople(List<Staff> people){
        for(Staff person: people)
            this.personel.add(person)
    }
}