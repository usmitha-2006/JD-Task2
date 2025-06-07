import java.util.*;
public class onlineexam {
    static Scanner sc = new Scanner(System.in);
    static String username = "new", password = "oasis@2025";
    public static void main(String[] args) {
        if (!login())return;
        while (true){
            System.out.println("\n 1.Update Profile\n 2. Take exam \n 3.Logout");
            switch (sc.nextInt()){
                case 1 -> updateProfile();
                case 2 -> takeExam();
                case 3 -> {System.out.println("Logged out");return;}
                default -> System.out.println("Invalid option");

            }
        }
    } 
   static boolean login(){
    System.out.println("\nUsername:");
    String u = sc.next();
    System.out.println("\nPassword:");
    String p = sc.next();
    if (u.equals(username)&&p.equals(password)){
        System.out.println("\nLogin successful \n");
        return true;
    }
    System.out.println("Login failed \n");
    return false;
    }
    static void updateProfile(){
        System.out.println("\nNew username:\n");
        username = sc.next();
        System.out.println("\nNew password:\n");
        password = sc.next();
        System.out.println("\nProfile updated\n");
    }
    static void takeExam(){
        String[] q ={
            "1.Which is the national animal of India? \n A. Lion B.Tiger C.Bear D.None of the above \n",
            "2.Ram and Sita _____ friends \n A.are B.is C.no D.for \n"
        };
        char[] a = {'B', 'A'};
        int score = 0;
        long start = System.currentTimeMillis();

        for (int i = 0; i<q.length &&
        (System.currentTimeMillis() - start)< 300000; i++){
            System.out.println(q[i] + "\nAnswer");
            if (Character.toUpperCase(sc.next().charAt(0))==a[i]) score++;
                
            }
            System.out.println("Exam submitted \nScore:" +score+ "/" + q.length);
        }
    }
   
