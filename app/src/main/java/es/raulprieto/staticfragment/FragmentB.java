package es.raulprieto.staticfragment;


import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
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
    private final String SIZE = "size";
    private final String TEXT = "text";
    private FragmentBBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false);
        View view = binding.getRoot();

        Log.d(TAG, "FragmentB -> onCreateView()");
        return view;
    }

    /**
     * This method stores the fragment's dynamic state inside of the bundle
     *
     * @param outState bundle
     */
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putFloat(SIZE, binding.tvMessage.getTextSize());
        outState.putString(TEXT, binding.tvMessage.getText().toString());
        Log.d(TAG, "FragmentB -> onSaveInstanceState()");
    }

    /**
     * This method restores the dynamic state stored into the savedInstanceState bundle
     *
     * @param savedInstanceState bundle
     */
    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null){
            binding.tvMessage.setTextSize(TypedValue.COMPLEX_UNIT_PX,savedInstanceState.getFloat(SIZE));
            binding.tvMessage.setText(savedInstanceState.getString(TEXT));
        }
        Log.d(TAG, "FragmentB -> onViewStateRestored()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "FragmentB -> onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "FragmentB -> onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "FragmentB -> onDestroy()");
    }

    /**
     * Method used to communicate the Activity with the FragmentB
     *
     * @param text message's content
     * @param size message's size
     */
    public void setTextSize(String text, int size) {
        binding.tvMessage.setText(text);
        binding.tvMessage.setTextSize(size);
    }
}
