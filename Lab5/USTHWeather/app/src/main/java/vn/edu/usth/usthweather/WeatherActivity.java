package vn.edu.usth.usthweather;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("onCreate","start");
        setContentView(R.layout.activity_weather);
        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.main, firstFragment).commit();
    }

    public WeatherActivity() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Weather", "onStart here");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Weather", "onStop here");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Weather", "onDestroy here");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Weather", "onPause here");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Weather", "onResume here");
    }
}