package e.promptnow5.liveat500px.dao;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by PromptNow5 on 1/4/2018.
 */

public class PhotoItemCollectionDao implements Parcelable {

    @SerializedName("success")
    private boolean success;
    @SerializedName("data")
    private List<PhotoItemDao> data;

    public PhotoItemCollectionDao(){

    }

    protected PhotoItemCollectionDao(Parcel in) {
        success = in.readByte() != 0;
        data = in.createTypedArrayList(PhotoItemDao.CREATOR);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (success ? 1 : 0));
        dest.writeTypedList(data);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PhotoItemCollectionDao> CREATOR = new Creator<PhotoItemCollectionDao>() {
        @Override
        public PhotoItemCollectionDao createFromParcel(Parcel in) {
            return new PhotoItemCollectionDao(in);
        }

        @Override
        public PhotoItemCollectionDao[] newArray(int size) {
            return new PhotoItemCollectionDao[size];
        }
    };

    public boolean isSuccess() {
        return success;
    }

    public PhotoItemCollectionDao setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public List<PhotoItemDao> getData() {
        return data;
    }

    public PhotoItemCollectionDao setData(List<PhotoItemDao> data) {
        this.data = data;
        return this;
    }
}
