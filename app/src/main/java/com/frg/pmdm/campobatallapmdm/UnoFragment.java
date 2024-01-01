package com.frg.pmdm.campobatallapmdm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.frg.pmdm.campobatallapmdm.databinding.FragmentUnoBinding;

public class UnoFragment extends Fragment {

    FragmentUnoBinding binding;
    NavController navController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentUnoBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);

        requireActivity().addMenuProvider(new MenuProvider() {
            @Override
            public void onCreateMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
                getActivity().getMenuInflater().inflate(R.menu.second_menu, menu);
            }

            @Override
            public boolean onMenuItemSelected(@NonNull MenuItem menuItem) {
                int seleccionado = menuItem.getItemId();
                if (seleccionado == R.id.menu_segundo) {
                    navController.navigate(R.id.action_unoFragment_to_dosFragment);
                }
                if (seleccionado == R.id.menu_tercero) {
                    navController.navigate(R.id.action_unoFragment_to_tresFragment);
                }
                return false;
            }
        }, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
    }
}