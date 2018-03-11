package com.example.lenovo.miwoks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class phrases_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_activity);

        ArrayList<word> number_list = new ArrayList<word>();
        number_list.add(new word("one", "trans" ));
        number_list.add(new word("two", "tran 2"));
        number_list.add(new word("three", "tran 3" ));
        number_list.add(new word("four", "tran 4" ));
        number_list.add(new word("five", "tran 5" ));
        number_list.add(new word("six", "tran 6" ));
        number_list.add(new word("seven", "tran 7"));
        number_list.add(new word("eight", "tran 8" ));
        number_list.add(new word("nine", "tran 9" ));
        number_list.add(new word("ten", "tran 10" ));

        WordAdapter itemsAdapter = new WordAdapter(this, number_list , R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}