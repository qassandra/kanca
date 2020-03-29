package com.example.kancaapp.fragments;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.kancaapp.R;

public class HistoryFragment extends Fragment {
    ImageView icon;
    TextView subtema, titleSub, progres, titleTema, lanjutkan;
    Toolbar toolbar;


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_riwayat, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        subtema = view.findViewById(R.id.subtema);
        titleSub = view.findViewById(R.id.subtemaTitle);
        progres = view.findViewById(R.id.persen);
        titleTema = view.findViewById(R.id.textView);
        lanjutkan = view.findViewById(R.id.lanjutkan);
        toolbar = view.findViewById(R.id.)

        subtema.setText(R.string.subtema);
        titleSub.setText(R.string.sayang_hewan);
        progres.setText(R.string.sub_progress);
        titleTema.setText(R.string.hewan_dan_tumbuhan);
        lanjutkan.setText(R.string.lanjutkan);


    }
}
