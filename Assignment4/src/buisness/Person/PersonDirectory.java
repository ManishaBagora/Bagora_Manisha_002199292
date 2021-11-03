package buisness.Person;



import java.util.ArrayList;


public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
       personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person createPerson(String name,String city,String mobilenumber){
        Person person = new Person();
        person.setName(name);
        person.setCity(city);
        person.setMobilenumber(mobilenumber);
       
        personList.add(person);
        return person;
    }
}