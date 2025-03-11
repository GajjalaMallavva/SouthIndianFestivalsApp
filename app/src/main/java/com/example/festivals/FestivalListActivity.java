package com.example.festivals;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class FestivalListActivity extends AppCompatActivity {

    int[] images = {
            R.drawable.onam, R.drawable.pongal, R.drawable.hampi,
            R.drawable.karaga, R.drawable.thrissur_pooram,
            R.drawable.chithirai_thiruvizha, R.drawable.ugadi,
            R.drawable.mahamaham,R.drawable.dasara,R.drawable.diwali,
    };

    String[] names = {
            "Onam Festival", "Pongal Festival", "Hampi Festival", "Karaga Festival",
            "Thrissur Pooram Festival", "Chithirai Thiruvizha Festival",
            "Ugadi Festival", "Mahamaham Festival","Dasara Festival","Diwali Festival"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_list);

        GridView gridView = findViewById(R.id.festivalGridView);
        FestivalAdapter adapter = new FestivalAdapter(this, names, images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FestivalListActivity.this, FestivalDetailActivity.class);
                intent.putExtra("festivalName", names[position]);
                intent.putExtra("festivalImage", images[position]);
                startActivity(intent);
            }
   });
}
}
