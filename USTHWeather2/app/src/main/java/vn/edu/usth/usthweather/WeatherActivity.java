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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Create a new Fragment to be placed in the activity layout
        ForecastFragment firstFragment = new ForecastFragment();
        // Add the fragment to the 'container' FrameLayout
        getSupportFragmentManager().beginTransaction().add(
                R.id.main, firstFragment).commit();

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("WeatherActivity", "starting");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("WeatherActivity", "resume ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("WeatherActivity", "pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("WeatherActivity", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("WeatherActivity", "terminate");
    }

}