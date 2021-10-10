public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 12, "Verizon", "Galaxy S9 says Ring Ring Ring!");
        IPhone iphoneTen = new IPhone("X", 1, "AT&T", "iPhone X says Zingggg!");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());
        
        iphoneTen.displayInfo();
        System.out.println(iphoneTen.ring());
        System.out.println(iphoneTen.unlock());

    }
}