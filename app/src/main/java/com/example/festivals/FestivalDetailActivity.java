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
            case "Onam Festival":
                return "Onam is a major annual festival celebrated primarily in the southern Indian state of Kerala. " +
                        "It typically falls in the Malayalam month of Chingam, which corresponds to August or September in the Gregorian calendar." +
                        " The festival marks the homecoming of the mythical King Mahabali and is a harvest festival that celebrates prosperity, unity, " +
                        "and cultural heritage. Onam spans ten days, with the main celebrations taking place on Thiruvonam, the final day of the festival. " +
                        "Traditional activities include floral decorations (Pookalam), grand feasts (Onam Sadya), boat races, tiger dances (Pulikali), and various cultural performances.";
            case "Pongal Festival":
                return "Pongal is a popular harvest festival celebrated in the southern Indian state of Tamil Nadu. It typically takes place in mid-January, usually from January 14 to 17," +
                        " marking the arrival of the sun in the zodiac sign of Capricorn. The festival is named after the dish Pongal, a sweet rice dish cooked as part of the celebrations." +
                        " It is dedicated to honoring the sun god, farmers, and livestock for their contribution to agriculture. Pongal is celebrated with family gatherings, rituals, feasts, " +
                        "and various cultural events, including traditional dances, kolam (decorative floor designs), and the worship of cattle. The festival consists of four days, " +
                        "with each day having its own significance and traditions.";
            case "Hampi Festival":
                return "The Hampi Utsav is a vibrant cultural festival celebrated annually in the UNESCO World Heritage site of Hampi, located in the state of Karnataka. " +
                        "The festival typically takes place in November or December, usually around the first week of the month, coinciding with the Karnataka State Tourism Department's" +
                        " efforts to promote the historical and cultural heritage of the region. Hampi Utsav showcases the rich history of the Vijayanagara Empire with a variety of cultural performances, " +
                        "including classical dance, music, folk arts and drama. The festival also features traditional processions, light and sound shows, and an exhibition of local crafts, attracting tourists " +
                        "and locals alike to celebrate the region's ancient glory.";
            case "Karaga Festival":
                return "The Karaga Festival is a significant cultural and religious event celebrated in the state of Karnataka, primarily in the city of Bengaluru. " +
                        "It usually takes place in the month of March or April, during the full moon day of the Chaitra month, as per the Hindu lunar calendar. " +
                        "The festival is dedicated to the worship of the Hindu goddess Draupadi and is a symbol of strength, courage, and devotion." +
                        " The highlight of the Karaga Festival is the grand procession where a decorated earthen pot (Karaga) is carried on the head by a designated Karaga bearer," +
                        "typically a male dressed as a woman, symbolizing the goddess. The festival includes various rituals, processions, traditional dances, and performances," +
                        " and it is particularly famous for its association with the city's ancient traditions and the devotion of the people.";
            case "Thrissur Pooram Festival":
                return "Thrissur Pooram is one of the most famous and grand festivals in Kerala, celebrated annually in the month of May." +
                        " It is held at the Vadakkunnathan Temple in Thrissur, in honor of the temple’s presiding deity, Lord Shiva. " +
                        "The festival is renowned for its spectacular procession of decorated elephants,vibrant drum performances, " +
                        "and the traditional display of fireworks, which draw large crowds from across the country and the world." +
                        "Thrissur Pooram is marked by the Kodiyettam (flag hoisting), Arattu (sacred bathing of idols), and the iconic Parade of Elephants with their ceremonial umbrellas, " +
                        "which make it a vivid showcase of Kerala’s cultural and religious heritage. The festival is celebrated by various groups from the surrounding areas, " +
                        "and its energy and grandeur make it a highlight of Kerala's festival calendar.";
            case "Chithirai Thiruvizha Festival":
                return "Chithirai Thiruvizha is a grand annual festival celebrated in the state of Tamil Nadu, primarily in the temple town of Madurai. It usually takes place in the month of April or May, " +
                        "during the Tamil month of Chithirai. The festival marks the celestial wedding of the divine couple, Lord Meenakshi (the goddess) and Lord Sundareshwarar (Shiva),and is one of the most important events in Tamil culture. " +
                        "The highlight of Chithirai Thiruvizha is the Meenakshi Kalyanam (wedding procession), which features a grand procession of elephants,decorated chariots, traditional music, and dances. " +
                        "The festivities also include rituals, temple prayers, and a vibrant street procession, drawing thousands of devotees and tourists to witness the colorful celebrations that reflect Tamil Nadu's rich cultural and religious heritage.";
            case "Ugadi Festival":
                return "Ugadi is the New Year festival celebrated primarily in the states of Andhra Pradesh, Telangana, and Karnataka, marking the beginning of the Telugu and Kannada lunar calendar year." +
                        " It typically falls in March or April, with the date varying based on the lunar cycle, but it usually coincides with the first day of the Chaitra month." +
                        " Ugadi is a festival of renewal and joy, signifying the arrival of spring. The celebrations include cleaning homes, wearing new clothes, and preparing a special dish called \"Ugadi Pachadi,\"" +
                        " which combines six distinct tastes to represent various aspects of life. The day is marked by prayers, cultural performances, and social gatherings, symbolizing new beginnings, prosperity, and the hope for a good year ahead.";
            case "Mahamaham Festival":
                return "The Mahamaham Festival is a significant religious and cultural event celebrated in the state of Tamil Nadu, particularly in the town of Kumbakonam. It occurs once every 12 years, " +
                        "during the Tamil month of Maasi (usually February or March), when the alignment of the planets is considered most auspicious. The festival is centered around the Mahamaham tank in Kumbakonam," +
                        " where thousands of devotees gather to take a holy dip, believed to cleanse them of sins and bring spiritual rejuvenation. The festival also features various rituals, processions, and temple activities," +
                        " with a special focus on worshiping Lord Shiva. Mahamaham draws large crowds from across India and is considered one of the most important pilgrimage events in Tamil Nadu, showcasing the state's rich religious traditions.";
            case "Dasara Festival":
                return "Dasara, also known as Dussehra, is a major Hindu festival celebrated with great fervor in the state of Karnataka, particularly in the city of Mysuru. " +
                        "The festival usually falls in September or October, during the Ashvin month of the Hindu calendar, and lasts for ten days, " +
                        "culminating on Vijayadashami (the tenth day). Dasara marks the victory of good over evil, commemorating the triumph of Lord Rama over the demon king Ravana, " +
                        "as well as the victory of Goddess Durga over the buffalo demon Mahishasura, whose defeat is particularly significant in Karnataka. The Mysuru Dasara is famous for its grand procession," +
                        " featuring decorated elephants, traditional dances, and cultural performances, along with the lighting of the Mysore Palace and various other rituals that showcase the state's royal heritage. " +
                        "It is one of the largest and most celebrated festivals in Karnataka.\n";
            case "Diwali Festival":
                return "Diwali, also known as Deepavali, is a major Hindu festival celebrated across India, with special significance in states like Uttar Pradesh, Rajasthan, Gujarat, Maharashtra, and Tamil Nadu." +
                        " It usually falls in October or November, on the 13th day of the dark fortnight of Ashvin month, and is celebrated over five days, with the third day being the main event. " +
                        "Diwali marks the victory of light over darkness and good over evil, symbolized by the return of Lord Rama to Ayodhya after defeating Ravana. The festival is known for its widespread customs, " +
                        "including lighting oil lamps (diyas), bursting fireworks, exchanging sweets, and performing religious rituals. Though celebrated across India, the way Diwali is observed can vary by region, " +
                        "with distinct traditions and cultural expressions. It is one of the most widely celebrated and joyous festivals in India.\n";
            default:
                return "Details not available for this festival.";
 }
}
}
