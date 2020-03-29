package com.example.kancaapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class TematikAttribute implements Parcelable {
    private String iconTematik;
    private String titleTematik;
    private String titleSubtema;
    private int idSubtema;

    public String getTitleSubtema() {
        return titleSubtema;
    }

    public void setTitleSubtema(String titleSubtema) {
        this.titleSubtema = titleSubtema;
    }

    public int getIdSubtema() {
        return idSubtema;
    }

    public void setIdSubtema(int idSubtema) {
        this.idSubtema = idSubtema;
    }

    public String getIconTematik() {
        return iconTematik;
    }

    public void setIconTematik(String iconTematik) {
        this.iconTematik = iconTematik;
    }

    public String getTitleTematik() {
        return titleTematik;
    }

    public void setTitleTematik(String titleTematik) {
        this.titleTematik = titleTematik;
    }

    public TematikAttribute() {
    }

    public TematikAttribute(JSONObject object){
        try{
            String tematikTitle = object.getString("title");
            String tematikIcon = object.getString("icon");
            JSONArray subtema = object.getJSONArray("subtema");
            for (int j = 0; j > subtema.length(); j++){
                JSONObject jsonObject = subtema.getJSONObject(j);
                String subtemaTitle = jsonObject.getString("subtema_title");
                Integer subtemaId = jsonObject.getInt("subtema_id");

                this.titleSubtema = subtemaTitle;
                this.idSubtema = subtemaId;
            }

            this.titleTematik = tematikTitle;
            this.iconTematik = tematikIcon;

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.iconTematik);
        dest.writeString(this.titleTematik);
        dest.writeString(this.titleSubtema);
        dest.writeInt(this.idSubtema);
    }

    protected TematikAttribute(Parcel in) {
        this.iconTematik = in.readString();
        this.titleTematik = in.readString();
        this.titleSubtema = in.readString();
        this.idSubtema = in.readInt();
    }

    public static final Creator<TematikAttribute> CREATOR = new Creator<TematikAttribute>() {
        @Override
        public TematikAttribute createFromParcel(Parcel source) {
            return new TematikAttribute(source);
        }

        @Override
        public TematikAttribute[] newArray(int size) {
            return new TematikAttribute[size];
        }
    };
}
