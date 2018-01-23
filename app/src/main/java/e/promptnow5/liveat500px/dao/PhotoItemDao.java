package e.promptnow5.liveat500px.dao;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by PromptNow5 on 1/4/2018.
 */

public class PhotoItemDao implements Parcelable {

    @SerializedName("id")
    private int id;
    @SerializedName("link")
    private String link;
    @SerializedName("image_url")
    private String imageUrl;
    @SerializedName("caption")
    private String caption;
    @SerializedName("user_id")
    private int userId;
    @SerializedName("username")
    private String userName;
    @SerializedName("profile_picture")
    private String profilePicture;
    @SerializedName("tags")
    private List<String> tags = new ArrayList<String>();
    @SerializedName("created_time")
    private Date createdTime;
    @SerializedName("camera")
    private String camera;
    @SerializedName("lens")
    private String lens;
    @SerializedName("focal_length")
    private String focalLength;
    @SerializedName("iso")
    private String iso;
    @SerializedName("shutter_speed")
    private String shutterSpeed;
    @SerializedName("aperture")
    private String aperture;

    public PhotoItemDao(){

    }

    protected PhotoItemDao(Parcel in) {
        id = in.readInt();
        link = in.readString();
        imageUrl = in.readString();
        caption = in.readString();
        userId = in.readInt();
        userName = in.readString();
        profilePicture = in.readString();
        tags = in.createStringArrayList();
        camera = in.readString();
        lens = in.readString();
        focalLength = in.readString();
        iso = in.readString();
        shutterSpeed = in.readString();
        aperture = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(link);
        dest.writeString(imageUrl);
        dest.writeString(caption);
        dest.writeInt(userId);
        dest.writeString(userName);
        dest.writeString(profilePicture);
        dest.writeStringList(tags);
        dest.writeString(camera);
        dest.writeString(lens);
        dest.writeString(focalLength);
        dest.writeString(iso);
        dest.writeString(shutterSpeed);
        dest.writeString(aperture);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PhotoItemDao> CREATOR = new Creator<PhotoItemDao>() {
        @Override
        public PhotoItemDao createFromParcel(Parcel in) {
            return new PhotoItemDao(in);
        }

        @Override
        public PhotoItemDao[] newArray(int size) {
            return new PhotoItemDao[size];
        }
    };

    public int getId() {
        return id;
    }

    public PhotoItemDao setId(int id) {
        this.id = id;
        return this;
    }

    public String getLink() {
        return link;
    }

    public PhotoItemDao setLink(String link) {
        this.link = link;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public PhotoItemDao setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public PhotoItemDao setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public PhotoItemDao setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public PhotoItemDao setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public PhotoItemDao setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public PhotoItemDao setTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public PhotoItemDao setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    public String getCamera() {
        return camera;
    }

    public PhotoItemDao setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public String getLens() {
        return lens;
    }

    public PhotoItemDao setLens(String lens) {
        this.lens = lens;
        return this;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public PhotoItemDao setFocalLength(String focalLength) {
        this.focalLength = focalLength;
        return this;
    }

    public String getIso() {
        return iso;
    }

    public PhotoItemDao setIso(String iso) {
        this.iso = iso;
        return this;
    }

    public String getShutterSpeed() {
        return shutterSpeed;
    }

    public PhotoItemDao setShutterSpeed(String shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
        return this;
    }

    public String getAperture() {
        return aperture;
    }

    public PhotoItemDao setAperture(String aperture) {
        this.aperture = aperture;
        return this;
    }
}
