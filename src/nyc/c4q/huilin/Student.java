package nyc.c4q.huilin;

/**
 * Created by huilin on 9/4/16.
 */
public class Student {

    private String firstName;
    private String lastName;
    private int idNumber;
    private String favoriteFood;

    public Student (String firstName, String lastName, int idNumber, String favoriteFood) {

    };



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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public static boolean checkSameFavoriteFood ()
}

