package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    public static final String TAG = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startGame();
            }
        });
    }
    public void startGame() {
        Intent intent = new Intent(this, GameActivity.class);
        EditText player1 = findViewById(R.id.player1);
        EditText player2 = findViewById(R.id.player2);
        String players = " Game " +player1.getText().toString() + " VS" + player2.getText().toString();
        intent.putExtra(TAG,players);
        startActivity(intent);
    }
}