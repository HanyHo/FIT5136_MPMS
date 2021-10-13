package dataAccess;

import connector.Dataconnector;
import model.User;

import java.util.ArrayList;

public class UserRepository {
    private Dataconnector dataConnector;
    private ArrayList<User> users;

    public UserRepository(){
        dataConnector = new Dataconnector("User.txt");
        users = new ArrayList<>();

    }

    public UserRepository(Dataconnector dataconnector, ArrayList<User> users) {
        this.dataConnector = dataconnector;
        this.users = users;
    }

    public void createUser(){
        ArrayList<String> userArrayList = dataConnector.readFile();
        for (String infoLine : userArrayList)
        {
            String regex;
            String[] lineSplit = infoLine.split(",");
            User user = new User(lineSplit[0],
                    lineSplit[1],
                    lineSplit[2],
                    lineSplit[3],
                    lineSplit[4].charAt(0),
                    Integer.parseInt(lineSplit[5]));
            users.add(user);
        }
    }

    // match email = password
    public User selectUserByEmailAndPassword(String email, String password){
        createUser();
        for(User user : users)
        {
            if (user.getEmail().equals(email) && user.getPassword().equals(password))
            {
                return user;
            }
        }
        return null;
    }

    public Dataconnector getDataconnector() {
        return dataConnector;
    }

    public void setDataconnector(Dataconnector dataconnector) {
        this.dataConnector = dataconnector;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
