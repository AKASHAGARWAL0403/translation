package com.example.lenovo.miwoks;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 3/11/2018.
 */

public class WordAdapter extends ArrayAdapter<word> {

     int color;
    private static final String LOG_TAG = WordAdapter.class.getSimpleName();


    public WordAdapter(Activity context , ArrayList<word> array_list , int colors)
    {
        super(context ,0 , array_list);
        color = colors;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.version_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.VersionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.version_number);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.VersionNumber());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image_akash);

        if(currentAndroidFlavor.has_image_check())
        image.setImageResource(currentAndroidFlavor.getImageURL());

        if(!currentAndroidFlavor.has_image_check())
            image.setVisibility(View.GONE);


        View view = (View)  listItemView.findViewById(R.id.text_layout);

        int colorr = ContextCompat.getColor(getContext() , color);

        view.setBackgroundColor(colorr);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
