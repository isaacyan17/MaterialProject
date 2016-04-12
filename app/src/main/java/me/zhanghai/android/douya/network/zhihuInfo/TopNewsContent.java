package me.zhanghai.android.douya.network.zhihuInfo;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * @author  yanjinqiang
 * @time 2016/4/12.
 */
public class TopNewsContent implements Parcelable {
    public String ga_prefix;
    public long id;
    public String image;
    public String titile;
    public long type;


    protected TopNewsContent(Parcel in) {
        ga_prefix = in.readString();
        id = in.readLong();
        image = in.readString();
        titile = in.readString();
        type = in.readLong();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ga_prefix);
        dest.writeLong(id);
        dest.writeString(image);
        dest.writeString(titile);
        dest.writeLong(type);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<TopNewsContent> CREATOR = new Creator<TopNewsContent>() {
        @Override
        public TopNewsContent createFromParcel(Parcel in) {
            return new TopNewsContent(in);
        }

        @Override
        public TopNewsContent[] newArray(int size) {
            return new TopNewsContent[size];
        }
    };
}
