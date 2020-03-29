package com.example.kancaapp.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.kancaapp.R;

public class ProfileFragment extends Fragment {
    TextView name, kelas, sd, hobi, membaca, progres, persen;
    public ProfileFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_profil, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name = view.findViewById(R.id.name);
        kelas = view.findViewById(R.id.kelas);
        sd = view.findViewById(R.id.sd);
        hobi = view.findViewById(R.id.hobi);
        membaca = view.findViewById(R.id.membaca);
        progres = view.findViewById(R.id.progress);
        persen = view.findViewById(R.id.persen);

        name.setText(R.string.john);
        kelas.setText(R.string.kelas);
        sd.setText(R.string.sd);
        hobi.setText(R.string.hobi);
        membaca.setText(R.string.baca);
        progres.setText(R.string.progres);
        persen.setText(R.string.persen);
    }
}
