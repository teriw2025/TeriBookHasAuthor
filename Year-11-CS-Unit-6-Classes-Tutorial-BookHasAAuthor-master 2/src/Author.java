public class Author {
    //properties
    private String name;
    private String email;
    private char gender;

    //constructors
    public Author(String userName, String userEmail, char userGender){
        name = userName;
        email = userEmail;
        gender = userGender;
    }

    //methods
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }

    public String toString(){
        return name+" ("+gender+") "+"at "+email;
    }


}
