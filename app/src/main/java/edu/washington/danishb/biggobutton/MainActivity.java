package edu.washington.danishb.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    int pushCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button pushMe = (Button)findViewById(R.id.btnPushMe);
        pushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                pushCount++;
                pushMe.setText("You have pushed me " + pushCount + " times!");
            }
        });
    }
}
