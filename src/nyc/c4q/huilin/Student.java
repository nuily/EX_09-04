package nyc.c4q.huilin;

/**
 * Created by huilin on 9/4/16.
 */
public class Student {

    private String firstName;       // other classes won't see these fields
    private String lastName;        // protected - in the same package
    private int idNumber;           // no actual keywords but package-protected (check API for differences)
    private String favoriteFood;

    public Student(String firstName, String lastName, int idNumber, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favoriteFood = favoriteFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFirstName(String firstName) {        // can change the parameter name or use /this.
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {      // get and set methods are for creating access
        this.lastName = lastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

//    public static boolean checkSameFavoriteFood(String food1, String food2) {
//        boolean result = false;
//        if (food1.equalsIgnoreCase(food2)) {
//            result = true;
//        }
//
//        return result;
//    }

    public static boolean checkSameFavoriteFood(Student student1, Student student2) {
        return student1.getFavoriteFood().equalsIgnoreCase(student2.getFavoriteFood());
    }

    // too many methods in main will make it hard to keep track

}

