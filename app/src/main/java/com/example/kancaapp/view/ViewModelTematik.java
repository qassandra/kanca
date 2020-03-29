package com.example.kancaapp.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.kancaapp.model.TematikAttribute;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import cz.msebera.android.httpclient.Header;

public class ViewModelTematik extends ViewModel {
    public static final String url = "https://my-json-server.typicode.com/kancaapp/kancaapp/db";
    private MutableLiveData<ArrayList<TematikAttribute>> listTematik = new MutableLiveData<>();

    public void setTematik(){
        AsyncHttpClient client = new AsyncHttpClient();
        final ArrayList<TematikAttribute> listItems = new ArrayList<>();

        client.get(url, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                try {
                    String result = new String(responseBody);
                    JSONObject responseObject = new JSONObject(result);
                    JSONArray list = responseObject.getJSONArray("tematik");


                    for (int i = 0; i < list.length(); i++){
                        JSONObject object = list.getJSONObject(i);
                        TematikAttribute tematikAttribute = new TematikAttribute(object);
                        listItems.add(tematikAttribute);
                    }
                    listTematik.postValue(listItems);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });

    }
    public LiveData<ArrayList<TematikAttribute>> getTematik(){
        return listTematik;
    }

}
