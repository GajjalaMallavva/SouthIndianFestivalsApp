package com.example.festivals;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button exploreButton = findViewById(R.id.button4
        );  // Use your actual button ID
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the FestivalListActivity (or whichever activity you want to show)
                Intent intent = new Intent(MainActivity.this, FestivalListActivity.class);
                startActivity(intent);
            }
    });

}
}
