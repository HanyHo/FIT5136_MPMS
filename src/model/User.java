package model;

public class User
{
    private String email;
    private String password;
    private String fName;
    private String lName;
    private char gender;
    private int age;

    public User()
    {
// chu shi hua
    }

    public User(String email, String password, String fName, String lName, char gender, int age)
    {
        this.email =email;
        this.password = password;
        this. fName = fName;
        this. lName = lName;
        this.gender = gender;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
