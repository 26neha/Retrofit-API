import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UserService {

    @GET("/api/users/{id}")
    public Call<UserApiResponse> getUser(@Path("id") long id);



}
