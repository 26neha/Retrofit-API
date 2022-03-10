public class User
{
    private long id;
    private String first_name;
    private String last_name;
    private String email;

    //Setters and getters
    @Override
    public String toString() {
        return "User [id=" + id + ", "
                + "first_name=" + first_name + ", "
                + "last_name=" + last_name + ", "
                + "email=" + email + "]";
    }
}
