package com.example.festivals;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FestivalAdapter extends BaseAdapter {

    private Context context;
    private String[] festivalNames;
    private int[] festivalImages;
    private LayoutInflater inflater;

    // Constructor to initialize context, names, images and inflater
    public FestivalAdapter(Context context, String[] festivalNames, int[] festivalImages) {
        this.context = context;
        this.festivalNames = festivalNames;
        this.festivalImages = festivalImages;
        this.inflater = LayoutInflater.from(context);  // Initialize inflater here for efficiency
    }

    @Override
    public int getCount() {
        return festivalNames.length;  // Number of items in the grid
    }

    @Override
    public Object getItem(int position) {
        return null;  // Not required in this case, but you can return the object if needed
    }

    @Override
    public long getItemId(int position) {
        return position;  // Returning position as the unique ID for each item
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Reuse the convertView for better performance
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);  // Use parent to match layout parameters
        }

        // Get references to the ImageView and TextView
        ImageView imageView = convertView.findViewById(R.id.festivalImage);
        TextView textView = convertView.findViewById(R.id.festivalName);

        // Set the festival image and name based on the current position
        imageView.setImageResource(festivalImages[position]);
        textView.setText(festivalNames[position]);

        return convertView;
}
}