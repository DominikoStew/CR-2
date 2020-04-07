public class Example{

    public static void main(String[] args){
        User u1 = new User("Dominique", 27);
        u1.printUser();

        User u2 = new User("Linda", 26)
        u2.printUser();

        Animal a1 = new Animal("Wolf");
        a1.printAnimal();
        
        Animal a2 = new Animal("Lion");
        a2.printAnimal();

        Student s1= new Student("Samantha", 29,8);
        s1.printUser();

        Student s2= new Student("OBrien", 29,8);
        s2.printUser();

        a1.attack(s1);
        a2.attack(s2);

    }


}