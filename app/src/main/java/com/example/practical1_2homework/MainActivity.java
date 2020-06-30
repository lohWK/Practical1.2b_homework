package com.example.practical1_2homework;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private TextView btnZero;
    boolean color = true;
    private TextView btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnZero = (TextView) findViewById(R.id.button_zero);
        btnCount = (TextView) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);

        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        if((mCount%2) == 0)
            btnCount.setBackgroundColor(Color.CYAN);
        else
            btnCount.setBackgroundColor(Color.GREEN);
    }

    public void button_zero(View view) {
        if(color) {
            btnZero.setBackgroundColor(Color.GRAY);
            color = false;
            if (mShowCount != null)
                mShowCount.setText(Integer.toString(mCount - mCount));
            mCount = 0;
        }
        else{
            btnZero.setBackgroundColor(Color.BLUE);
        }
    }
}