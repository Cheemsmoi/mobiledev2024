package vn.usth.edu.weather;

import android.os.Bundle;
import android.util.Log;
import android.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class WeatherActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

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

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        setContentView(R.layout.activity_main);

        tabLayout.setupWithViewPager(viewPager);

        WeatherAdapter adapter = new WeatherAdapter(getSupportFragmentManager(),
                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        adapter.addFragment(new WeatherAndForecastFragment(), "Ha Noi");
        adapter.addFragment(new WeatherAndForecastFragment(), "Paris");
        adapter.addFragment(new WeatherAndForecastFragment(), "Moscow");
        viewPager.setAdapter(adapter);

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
