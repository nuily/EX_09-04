package nyc.c4q.huilin;

public class Main {

    public static void main(String[] args) {
        Student helen = new Student("Helen", "Chan", 3311, "ice cream");
        Student hui = new Student("Hui", "Lin", 3312, "pocky");

        System.out.println(Student.checkSameFavoriteFood(helen, hui));

//        System.out.println(Student.checkSameFavoriteFood(student1.getFavoriteFood(), student2.getFavoriteFood()));
//        keep this in the student class since the methods are related to the class
// helen.checkSameFavoriteFood(); method belongs to every student, not just helen so don't use static methods as
// it returns about things in the class independent of the instances


    }
}
