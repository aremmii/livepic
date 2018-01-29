package e.promptnow5.liveat500px.manager.http;

import e.promptnow5.liveat500px.dao.PhotoItemCollectionDao;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by PromptNow5 on 1/29/2018.
 */

public interface ApiService {

    @POST("list")
    Call<PhotoItemCollectionDao> loadPhotoList();

    @Multipart
    @POST("list/after/{id}")
    Call<PhotoItemCollectionDao> loadPhotoListAfterId(@Part("id") int id);

    @Multipart
    @POST("list/before/{id}")
    Call<PhotoItemCollectionDao> loadPhotoListBeforeId(@Part("id") int id);

}
