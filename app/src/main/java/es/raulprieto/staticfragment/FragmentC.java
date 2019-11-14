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

import es.raulprieto.staticfragment.databinding.FragmentCBinding;

public class FragmentC extends Fragment {
    private final String TAG = "StaticFragment";
    private FragmentCBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_c,container,false);
        View view = binding.getRoot();

        Log.d(TAG, "FragmentC -> onCreateView()");
        return view;
    }

    /**
     * This method can be used to initialize the components or widgets
     * as the view has already inflated and it is not null
     *
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(TAG, "FragmentC -> onViewCreated()");
        binding.webAbout.loadData(getString(R.string.previewContent),"text/html","UTF8");

    }
}
