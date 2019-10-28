public class SeminarTest {

    public static void main(String[] args) {

        Person coach1 = new Person("Toto", "JHHD", 5);
        Person coach2 = new Person("CARD", "Solange", 27);

        Person attendee1 = new Person("Vincent","Bar",19);
        Person attendee2 = new Person("Andréa","Mini",34);
        Person attendee3 = new Person("Laurent","Cordi",28);
        Person attendee4 = new Person(attendee3);

        Person[] attendees = new Person[]{attendee1, attendee2, attendee3};
        Person[] attendees2 = new Person[] {attendee1,attendee3, attendee2};

        Seminar semiAout = new Seminar(coach1, attendees);
        Seminar semiSept = new Seminar(coach1, attendees);

        Seminar semiOct = new Seminar(coach2, attendees);
        Seminar semiNov = new Seminar(coach1, attendees2);

        boolean test1 = semiAout.equals(semiSept);

        System.out.println("Boolean de test1 : " + test1);

        boolean test2 = semiAout.equals(semiOct);

        System.out.println("Boolean de test2 : " + test2);

        boolean test3 = semiAout.equals(semiNov);
        System.out.println("Boolean de test3 : " + test3);
    }
}
