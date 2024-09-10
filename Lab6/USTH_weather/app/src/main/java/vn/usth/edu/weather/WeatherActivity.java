package vn.usth.edu.weather;

import android.os.Bundle;
import android.util.Log;
import android.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    public WeatherActivity() {
        super();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Log.i("onCreate", "onCreate State");
        setContentView(R.layout.activity_main);
        // Create a new Fragment to be placed in the activity
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(R.id.main, firstFragment).commit();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("onStart", "onStart State");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("onResume", "onResume State");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("onPause", "onPause State");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("onStop", "onStop State");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy", "onDestroy State");
    }
}
