package com.example.demo_of_all_layouts;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_grid);

        GridView gridView = findViewById(R.id.gridView);

        // Sample data for the grid
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"};

        // Create an ArrayAdapter to set the data in the GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);

        gridView.setAdapter(adapter);
    }
}
