package tech.ericwathome.recess.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class Auth {
    private User user;

    public Auth() {
    }

    public Auth(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auth)) return false;
        Auth auth = (Auth) o;
        return Objects.equals(getUser(), auth.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser());
    }

    @NonNull
    @Override
    public String toString() {
        return "Auth{" +
                "user=" + user +
                '}';
    }
}
