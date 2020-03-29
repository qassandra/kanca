package com.example.kancaapp.data;

import com.example.kancaapp.model.TematikAttribute;

import java.util.ArrayList;

public class TematikData {
    private static String[] tematikTitle ={"Makhluk Hidup", "Hewan dan Tumbuhan", "Benda di Sekitarku", "Kewajiban dan Hakku"

    };

    private static String[] tematikIcon = {"https://raw.githubusercontent.com/semicologne/KancaApp-KidsApp-/master/icons/bunga.png", "https://raw.githubusercontent.com/semicologne/KancaApp-KidsApp-/master/icons/hewan.png"
    ,"https://raw.githubusercontent.com/semicologne/KancaApp-KidsApp-/master/icons/benda.png","https://raw.githubusercontent.com/semicologne/KancaApp-KidsApp-/master/icons/keluargaku.png"};

    public static ArrayList<TematikAttribute> getListData(){
        ArrayList<TematikAttribute> list = new ArrayList<>();
        for (int position = 0; position < tematikTitle.length; position++){
            TematikAttribute tematikAttribute = new TematikAttribute();
            tematikAttribute.setIconTematik(tematikIcon[position]);
            tematikAttribute.setTitleTematik(tematikTitle[position]);
            list.add(tematikAttribute);
        }
        return list;
    }
}
