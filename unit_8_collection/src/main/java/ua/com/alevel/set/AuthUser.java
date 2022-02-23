package ua.com.alevel.set;

//public class AuthUser implements Comparable<AuthUser> {
public class AuthUser {

    private String email;
    private String id;

    public AuthUser(String email, String id) {
        this.email = email;
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AuthUser{" +
                "email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthUser)) return false;

        AuthUser authUser = (AuthUser) o;

        if (email != null ? !email.equals(authUser.email) : authUser.email != null) return false;
        return id != null ? id.equals(authUser.id) : authUser.id == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }

//    @Override
    public int compareTo(AuthUser o) {
        int compareId = this.id.compareTo(o.getId());
        if (compareId == 0) {
            return this.email.compareTo(o.getEmail());
        }
        return compareId;
    }
}
