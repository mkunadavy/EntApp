package come.example.regulatehct.entapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FootballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
    }

    public void goBack(View view) {
        Intent intent = new Intent(FootballActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
