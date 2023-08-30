package com.example.cis183_08_30_2023_buttonlabels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.logging.Logger;

public class MainActivity extends AppCompatActivity
{
    //Variables used to connect to the GUI
    Button btn_j_increase;
    Button btn_j_decrease;
    TextView tv_j_fontSize;
    TextView tv_j_greeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_j_increase = findViewById(R.id.btn_v_increase);
        btn_j_decrease = findViewById(R.id.btn_v_decrease);
        tv_j_fontSize = findViewById(R.id.tv_v_textSize);
        tv_j_greeting = findViewById(R.id.tv_v_greeting);

        tv_j_greeting.setText("hello");

        setButtonDecreaseListener();
        setButtonIncreaseListener();
    }

    public void setButtonIncreaseListener()
    {
        btn_j_increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.d("oh", "uh");

                //int count = Integer.parseInt(tv_j_fontSize.setText());
            }
        });
    }

    public void setButtonDecreaseListener()
    {
        btn_j_decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Log.d("ah", "um");

            }
        });

    }
}