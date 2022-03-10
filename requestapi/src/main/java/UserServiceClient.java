import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserServiceClient
{
    public static void main(String[] args)
    {
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        UserService service = retrofit.create(UserService.class);

        // Calling '/api/users/2'
        Call<UserApiResponse> callSync = service.getUser(2);

        try {
            Response<UserApiResponse> response = callSync.execute();
            UserApiResponse apiResponse = response.body();
            System.out.println(apiResponse);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}