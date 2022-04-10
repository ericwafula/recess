package tech.ericwathome.recess.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class User {
    private Long id;
    private String username;
    private String email;
    private String email_verified_at;
    private Double created_at;
    private String access_token;
    private String refresh_token;
    private Long expires_at;

    public User() {
    }

    public User(Long id, String username, String email, String email_verified_at, Double created_at, String access_token, String refresh_token, Long expires_at) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.email_verified_at = email_verified_at;
        this.created_at = created_at;
        this.access_token = access_token;
        this.refresh_token = refresh_token;
        this.expires_at = expires_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail_verified_at() {
        return email_verified_at;
    }

    public void setEmail_verified_at(String email_verified_at) {
        this.email_verified_at = email_verified_at;
    }

    public Double getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Double created_at) {
        this.created_at = created_at;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public Long getExpires_at() {
        return expires_at;
    }

    public void setExpires_at(Long expires_at) {
        this.expires_at = expires_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getUsername(), user.getUsername()) && Objects.equals(getEmail(), user.getEmail()) && Objects.equals(getEmail_verified_at(), user.getEmail_verified_at()) && Objects.equals(getCreated_at(), user.getCreated_at()) && Objects.equals(getAccess_token(), user.getAccess_token()) && Objects.equals(getRefresh_token(), user.getRefresh_token()) && Objects.equals(getExpires_at(), user.getExpires_at());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getEmail(), getEmail_verified_at(), getCreated_at(), getAccess_token(), getRefresh_token(), getExpires_at());
    }

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", email_verified_at='" + email_verified_at + '\'' +
                ", created_at=" + created_at +
                ", access_token='" + access_token + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", expires_at=" + expires_at +
                '}';
    }
}
