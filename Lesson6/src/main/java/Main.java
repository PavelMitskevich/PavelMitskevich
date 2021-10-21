public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alexander", -25, "male", "Belarus", "Hrodna");
        Person person2 = new Person("Petr", 17, "male", "Belarus", "Minsk");
        Person person3 = new Person("Vasiliy", 35, "male", "Belarus", "Hrodna");
        Person person4 = new Person("Alexander", 18, "male", "Belarus", "Minsk");
        Person person5 = new Person("Olga", 27, "female", "Belarus", "Hrodna");
        System.out.println(person1);
        System.out.println("----------");
        PersonRegistry personRegistry = new PersonRegistry();
        personRegistry.addPersonsToRegistry(person1);
        personRegistry.addPersonsToRegistry(person2);
        personRegistry.addPersonsToRegistry(person3);
        personRegistry.addPersonsToRegistry(person4);
        personRegistry.addPersonsToRegistry(person5);
        System.out.println(personRegistry.people);
        System.out.println("----------");
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        militaryOffice.checkForMilitary();
        System.out.println("----------");
        militaryOffice.checkForMilitaryMinsk();
        System.out.println("----------");
        militaryOffice.checkForMilitaryAge();
        System.out.println("----------");
        militaryOffice.checkForMilitaryAlexander();
    }
}
