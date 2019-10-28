public class Person {

    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }


    public Person(Person newPerson) {
        firstname = new String(newPerson.firstname);
        lastname = new String(newPerson.lastname);
        age = newPerson.age;
    }


//    public static void main(String[] args) {
//
//        Person coach = new Person("Toto", "JHHD", 5);
//        Person attendee1 = new Person("Vincent","Bar",19);
//        Person attendee2 = new Person("Andréa","Mini",34);
//        Person attendee3 = new Person("Laurent","Cordi",28);
//        Person attendee4 = new Person(attendee3);
//
//        Person[] attendees = new Person[]{attendee1, attendee2, attendee3};
//
//    }
}

