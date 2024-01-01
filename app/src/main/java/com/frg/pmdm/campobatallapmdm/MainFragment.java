package com.frg.pmdm.campobatallapmdm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frg.pmdm.campobatallapmdm.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {

    FragmentMainBinding bind;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (bind = FragmentMainBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        bind.btnUNO.setOnClickListener(v-> navController.navigate(R.id.action_mainFragment_to_unoFragment));

    }
}