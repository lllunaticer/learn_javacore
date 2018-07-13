package equals_;

public class EqualsTest {
    public static void main(String[] name){
        Employee alice1 = new Employee("Alice Adams", 75000, 1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987,12,15);
        Employee bob = new Employee("Bob Brandson", 50000, 1989,10,1);

        System.out.println("alice1 == alice2:"+(alice1 == alice2));

        System.out.println("alice1 == alice3:"+(alice1 == alice3));

        System.out.println("alice1.equals(alice3):"+alice1.equals(alice3));

        System.out.println("alice1.equals(bob):"+alice1.equals(bob));

        Manger carl = new Manger("Carl Cracker", 8000,1987,12,15);
        Manger boss = new Manger("Carl Cracker", 8000,1987,12,15);
        System.out.println("before bonus,carl.equals(boss):"+carl.equal(boss));
        boss.setBonus(5000);
        System.out.println("boss.toString:"+boss);
        System.out.println("carl.toString:"+carl);

        System.out.println("after bonus, carl.equals(boss):"+carl.equal(boss));
        System.out.println("alice1.hashCode():"+alice1.hashCode());
        System.out.println("alice3.hashCode():"+alice3.hashCode());
        System.out.println("carl.hashCode():"+carl.hashCode());
        System.out.println("boss.hashCode():"+boss.hashCode());
        System.out.println("bob.hashCode():"+bob.hashCode());
    }
}
