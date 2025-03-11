package com.example.festivals;



import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FestivalDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_festival_detail);

        ImageView festivalImage = findViewById(R.id.festivalImage);
        TextView festivalName = findViewById(R.id.festivalName);
        TextView festivalDescription = findViewById(R.id.festivalDescription);

        // Get data from intent
        int image = getIntent().getIntExtra("festivalImage", 0);
        String name = getIntent().getStringExtra("festivalName");

        // Set data to views
        festivalImage.setImageResource(image);
        festivalName.setText(name);
        festivalDescription.setText(getFestivalDescription(name));
    }

    private String getFestivalDescription(String name) {
        switch (name) {
            case "Onam":
                return "Onam is the harvest festival celebrated in Kerala, marking the homecoming of King Mahabali. "
                        + "It is a 10-day festival featuring vibrant floral decorations (Pookalam), traditional feasts (Onam Sadhya), "
                        + "and cultural performances.";
            case "Pongal":
                return "Pongal is a harvest festival celebrated predominantly in Tamil Nadu. It is dedicated to the Sun God and marks the beginning of the Tamil month of Thai. "
                        + "Traditional sweet rice dishes are prepared during this time.";
            case "Hampi Festival":
                return "Hampi Festival, also known as Vijaya Utsav, celebrates the rich cultural heritage of the Vijayanagara Empire. "
                        + "Held in Karnataka, the festival features dance, music, and vibrant processions.";
            case "Karaga":
                return "Karaga is one of the oldest festivals in Karnataka, celebrated in Bangalore. It is a unique festival dedicated to Draupadi and involves a procession led by a man dressed as a woman carrying a sacred pot.";
            case "Thrissur Pooram":
                return "Thrissur Pooram is one of the most spectacular temple festivals in Kerala, known for its grand elephant processions, traditional percussion music (Panchavadyam), and magnificent fireworks.";
            case "Chithirai Thiruvizha":
                return "Chithirai Thiruvizha is celebrated in Madurai, Tamil Nadu, and is one of the longest festivals in the world. "
                        + "It reenacts the celestial wedding of Lord Sundareswarar (Shiva) and Goddess Meenakshi.";
            case "Ugadi":
                return "Ugadi marks the New Year for people in Andhra Pradesh, Telangana, and Karnataka. It is celebrated with traditional dishes like Ugadi Pachadi and reflects the six flavors of life.";
            case "Mahamaham Festival":
                return "Mahamaham Festival is a grand event held once every 12 years in Kumbakonam, Tamil Nadu. It is a sacred bath festival where devotees take a dip in the Mahamaham tank, believed to cleanse sins.";
            default:
                return "Details not available for this festival.";
 }
}
}