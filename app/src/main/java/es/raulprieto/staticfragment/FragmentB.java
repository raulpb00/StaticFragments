package es.raulprieto.staticfragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import es.raulprieto.staticfragment.databinding.FragmentBBinding;

public class FragmentB extends Fragment {
    private final String TAG = "StaticFragment";
    private FragmentBBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false);
        View view = binding.getRoot();

        Log.d(TAG, "FragmentB -> onCreateView()");
        return view;
    }
}
