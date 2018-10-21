package com.example.sherin.sharedpreferanceproject;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
        }

    private void loadData() {
        SharedPreferences preferences = getSharedPreferences("db", MODE_PRIVATE);

        }

    private void initView() {
        btn1=findViewById(R.id.imgbtn1Id);
        btn2=findViewById(R.id.imgbtn2Id);
        btn3=findViewById(R.id.imgbtn3Id);

    }

    public void btnClick(View view) {

        if (view.getId() == R.id.imgbtn1Id) {

            btn1.setBackgroundResource(R.drawable.akru);

            } else if (view.getId() == R.id.imgbtn2Id) {

            btn2.setBackgroundResource(R.drawable.and);

            }
            else  if(view.getId()==R.id.imgbtn3Id)
        {
            btn3.setBackgroundResource(R.drawable.andro);
        }
            }
    private void saveScore(int score) {

        SharedPreferences preferences = getSharedPreferences("db", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putInt("score", score).commit();

    }
}



