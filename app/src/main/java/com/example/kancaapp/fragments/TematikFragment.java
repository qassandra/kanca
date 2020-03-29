package com.example.kancaapp.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kancaapp.R;
import com.example.kancaapp.adapter.GridTematikAdapter;
import com.example.kancaapp.model.TematikAttribute;
import com.example.kancaapp.view.ViewModelTematik;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TematikFragment extends Fragment {
    private RecyclerView rvTematik;
    private GridTematikAdapter gridTematikAdapter;

    public TematikFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_tematik, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        gridTematikAdapter = new GridTematikAdapter();
        rvTematik = view.findViewById(R.id.rv_tematik);
        rvTematik.setLayoutManager(new GridLayoutManager(getContext(), 2));
        rvTematik.setHasFixedSize(true);
        ViewModelTematik viewModelTematik = new ViewModelProvider(this).get(ViewModelTematik.class);
        viewModelTematik.getTematik().observe(this, new Observer<ArrayList<TematikAttribute>>() {
            @Override
            public void onChanged(ArrayList<TematikAttribute> tematikAttributes) {
                if (tematikAttributes.size() > 0){
                    gridTematikAdapter.setData(tematikAttributes);
                    rvTematik.setAdapter(gridTematikAdapter);
                }
            }
        });
        viewModelTematik.setTematik();

    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
