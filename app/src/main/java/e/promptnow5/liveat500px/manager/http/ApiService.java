package e.promptnow5.liveat500px.manager.http;

import e.promptnow5.liveat500px.dao.PhotoItemCollectionDao;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by PromptNow5 on 1/29/2018.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

    @POST("list/after/{id}")
    Call<PhotoItemCollectionDao> loadPhotoListAfterId(@Path("id") int id);

    @POST("list/before/{id}")
    Call<PhotoItemCollectionDao> loadPhotoListBeforeId(@Path("id") int id);

}
