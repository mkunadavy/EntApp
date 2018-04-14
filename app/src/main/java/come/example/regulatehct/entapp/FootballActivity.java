package come.example.regulatehct.entapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FootballActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football);
    }

    public void goBack(View view) {
        Intent intent = new Intent(FootballActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void setLog(View view) {
        textView = (TextView) findViewById(R.id.table);

        textView.setTextColor(000);
        textView.setBackgroundColor(111);
    }
}
