package es.raulprieto.staticfragment;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements FragmentA.OnSetTextSizeListener {
    private final String TAG = "StaticFragment";
    private Fragment fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity -> onCreate()");
        fragmentB = getSupportFragmentManager().findFragmentById(R.id.fragmentB);
    }

    @Override
    public void onSetTextSize(String text, int size) {
        Toast.makeText(this, "Mensaje: " + text, Toast.LENGTH_SHORT).show();
        ((FragmentB) fragmentB).setTextSize(text,size);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, "Activity -> onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "Activity -> onRestoreInstanceState()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "Activity -> onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "Activity -> onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity -> onDestroy()");
    }
}
