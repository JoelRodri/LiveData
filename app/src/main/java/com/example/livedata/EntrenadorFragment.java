package com.example.livedata;

import static java.util.concurrent.TimeUnit.SECONDS;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.example.livedata.databinding.FragmentEntrenadorBinding;


public class EntrenadorFragment extends Fragment {

    private FragmentEntrenadorBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentEntrenadorBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EntrenadorViewModel entrenadorViewModel = new ViewModelProvider(this).get(EntrenadorViewModel.class);

        entrenadorViewModel.obtenerEjercicio().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer ejercicio) {
                Glide.with(EntrenadorFragment.this).load(ejercicio).into(binding.ejercicio);
            }
        });

        entrenadorViewModel.obtenerRepeticion().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(String repeticion) {
                if (repeticion.equals("CAMBIO1")){
                    binding.cambio.setText("Bienvenido a la batalla por la \"F1 2022\"");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO2")){
                    binding.cambio.setText("MERCEDES");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO3")){
                    binding.cambio.setText("Lewis HAMILTON");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO4")){
                    binding.cambio.setText("Balteri BOTTAS");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO5")){
                    binding.cambio.setText("RED BULL");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO6")){
                    binding.cambio.setText("Max VERSTAPPEN");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO7")){
                    binding.cambio.setText("Checo PEREZ");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO8")){
                    binding.cambio.setText("MCCLAREN");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO9")){
                    binding.cambio.setText("Lando NORRIS");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO10")){
                    binding.cambio.setText("Daniel RICCIARDO");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO11")){
                    binding.cambio.setText("FERRARI");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO12")){
                    binding.cambio.setText("Carlos SAINZ JR");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO13")){
                    binding.cambio.setText("Charles LECLERC");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO14")){
                    binding.cambio.setText("ALPINE");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else if (repeticion.equals("CAMBIO15")){
                    binding.cambio.setText("Fernando ALONSO");
                    binding.cambio.setVisibility(View.VISIBLE);
                } else{
                    binding.cambio.setVisibility(View.GONE);
                }


            }
        });
    }
}