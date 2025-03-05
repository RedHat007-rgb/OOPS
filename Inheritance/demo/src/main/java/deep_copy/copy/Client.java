package deep_copy.copy;

public class Client {

    public static void main(String[] args) {
        
        Address add=new Address();
        add.house_number="234";
        add.country="India";
        add.district="warangal";
        add.state="Telangana";

        Person p1=new Person("preetham",add);
        System.out.println(p1);
        System.out.println(p1.address.getCountry());
        
        
        

        Person p2 =  new Person(p1); 
        // System.out.println(p2.address.getCountry());
        Person p3 = p2;
         System.out.println(System.identityHashCode(p1));
         System.out.println(System.identityHashCode(p2));
        // System.out.println(System.identityHashCode(p3));
        System.out.println(System.identityHashCode(p1.address));
        System.out.println(System.identityHashCode(p2.address));

        
    }
}
