import java.util.Arrays;

public class Seminar {

    private Person coach;
    private Person[] attendees;

    public Seminar(Person coach, Person[] attendees) {
        this.coach = coach;
        this.attendees = attendees;
    }


    public Seminar(Seminar originalSem) {
        coach = new Person(originalSem.coach);
        attendees = new Person[originalSem.attendees.length];
        for (int i = 0; i != attendees.length; ++i) {
//            Person otherPerson = new Person(originalSem.attendees[i]);
//            this.attendees[i] = otherPerson;
            attendees[i] = new Person(originalSem.attendees[i]);
        }

    }

    public boolean equals(Object other) {
        boolean res = false;
        boolean res2 = false;
        if (other != null && (other instanceof Seminar)) {
            Seminar otherSeminar = (Seminar) other;
            res = coach.equals(otherSeminar.coach);
//            return coach.equals(otherSeminar.coach)                       // Bernard code
//            && Arrays.deepEquals(attendees, otherSeminar.attendees);      // Bernard code

            for (int i = 0; i < attendees.length; i++) {
                res2 = attendees[i].equals(otherSeminar.attendees[i]);
            }
//        } return false ;                                                  // => Bernard code
            if (res == true && res2 == true) {
                return true;
            }
        }
        return false;

    }
}
