package com.example.articulos.ui.altas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.articulos.R;

public class AltasFragment extends Fragment {

    private AltasViewModel altasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        altasViewModel =
                new ViewModelProvider(this).get(AltasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_altas, container, false);
        final TextView textView = root.findViewById(R.id.nav_altas);
        altasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}