package task.taskproject.models;

import java.util.HashMap;

/**
 * Created by Shivappa.battur on 14/10/2018.
 */

public class User {

    private String fullName;
    private String email;
    private HashMap<String, Object> timestampJoined;

    public User() {
    }

    /**
     * Use this constructor to create new User.
     * Takes user name, email and timestampJoined as params
     *
     * @param timestampJoined
     */
    public User(String mFullName, String mEmail, HashMap<String, Object> timestampJoined) {
        this.fullName = mFullName;
        this.email = mEmail;
        this.timestampJoined = timestampJoined;
    }


    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public HashMap<String, Object> getTimestampJoined() {
        return timestampJoined;
    }
}
