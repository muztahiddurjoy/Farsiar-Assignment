
public class Task8 {
    public static void main(String[] args) {
        int id = 24141029;
        int year = id/1000000;
        int semester = (id/100000)%10;
        if(semester==1){
            System.out.println("Student Joined Brac in Spring "+year);
        }
        else if(semester==2){
            System.out.println("Student Joined Brac in Fall "+year);
        }
        else if(semester==3){
            System.out.println("Student Joined Brac in Summer "+year);
        }
    }
}
