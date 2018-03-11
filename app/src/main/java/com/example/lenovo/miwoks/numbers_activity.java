package com.example.lenovo.miwoks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbers_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_activity);

        ArrayList<word> number_list = new ArrayList<word>();
        number_list.add(new word("one", "trans" , R.drawable.number_one));
        number_list.add(new word("two", "tran 2" ,R.drawable.number_two));
        number_list.add(new word("three", "tran 3" , R.drawable.number_three));
        number_list.add(new word("four", "tran 4" , R.drawable.number_four));
        number_list.add(new word("five", "tran 5" , R.drawable.number_five));
        number_list.add(new word("six", "tran 6" , R.drawable.number_six));
        number_list.add(new word("seven", "tran 7" ,R.drawable.number_seven));
        number_list.add(new word("eight", "tran 8" , R.drawable.number_eight));
        number_list.add(new word("nine", "tran 9" , R.drawable.number_nine));
        number_list.add(new word("ten", "tran 10" ,R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, number_list , R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}