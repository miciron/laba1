package com.dungeonm.a123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textview = findViewById(R.id.editTextText);
        final Button button = findViewById(R.id.bt1);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String text1 = textview.getText().toString();
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                intent.putExtra("key", text1);
                startActivity(intent);
                finish();
            }
        });
    }

}