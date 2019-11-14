package es.raulprieto.staticfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FragmentA.OnSetTextSizeListener {
    private final String TAG = "StaticFragment";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Activity -> onCreate()");
    }

    @Override
    public void onSetTextSize(String text, int size) {
        Toast.makeText(this,"Mensaje: "+text,Toast.LENGTH_SHORT).show();
    }
}
