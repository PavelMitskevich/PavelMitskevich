public class MilitaryOffice {
    PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public void checkForMilitary() {
        for (Person p : personRegistry.people) {
            if (p.getAge() > 17 && p.getAge() < 28 && p.getSex().equalsIgnoreCase("male")) {
                System.out.println(p);
            }
        }
    }

    public void checkForMilitaryMinsk() {
        for (Person p : personRegistry.people) {
            if (p.getAge() > 17 && p.getAge() < 28 && p.getSex().equalsIgnoreCase("male") && p.getTown().equalsIgnoreCase("Minsk")) {
                System.out.println(p);
            }
        }
    }

    public void checkForMilitaryAge() {
        for (Person p : personRegistry.people) {
            if (p.getAge() > 24 && p.getAge() < 28 && p.getSex().equalsIgnoreCase("male")) {
                System.out.println(p);
            }
        }
    }

    public void checkForMilitaryAlexander() {
        for (Person p : personRegistry.people) {
            if (p.getAge() > 17 && p.getAge() < 28 && p.getName().equalsIgnoreCase("Alexander")) {
                System.out.println(p);
            }
        }
    }
}
