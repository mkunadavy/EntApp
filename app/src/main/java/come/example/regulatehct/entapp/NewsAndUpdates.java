package come.example.regulatehct.entapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;



public class NewsAndUpdates extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_and_updates);

        BottomNavigationView bottomNav = findViewById(R.id.news_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.news_frame,
                    new MoviesFragment()).commit();

        }

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.nav_movies:
                            selectedFragment = new MoviesFragment();
                            break;
                        case R.id.nav_football:
                            selectedFragment = new FootballFragment();
                            break;
                        case R.id.nav_upcoming:
                            selectedFragment = new UpcomingEventsFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.news_frame,
                            selectedFragment).commit();
                    return true;
                }

            };
}