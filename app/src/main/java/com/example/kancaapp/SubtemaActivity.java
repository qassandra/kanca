package com.example.kancaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.example.kancaapp.model.TematikAttribute;

public class SubtemaActivity extends AppCompatActivity {

    public static final String EXTRA_ITEM = "extra_item";
    public static final String EXTRA_POSITION = "extra_position";
     TextView subtema, subtemaTopic, subtema2, subtema3, subtema4;
     TematikAttribute tematikAttribute;


     private int tematikId;
     private int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtema);

        subtema = findViewById(R.id.subtema_number);
        subtemaTopic = findViewById(R.id.subtema_topic);
        subtema4 = findViewById(R.id.subtema_topic_4);
        subtema3 = findViewById(R.id.subtema_topic_3);
        subtema2 = findViewById(R.id.subtema_topic_2);
        tematikAttribute = getIntent().getParcelableExtra(EXTRA_ITEM);

        subtema.setText(R.string.subtema_1);
        subtemaTopic.setText(R.string.ciri_ciri_makhluk_hidup);
        subtema4.setText(R.string.subtema_topic_4);
        subtema3.setText(R.string.pertumbuhan_hewan);
        subtema2.setText(R.string.pertumbuhan_perkembangan);

    }
}
