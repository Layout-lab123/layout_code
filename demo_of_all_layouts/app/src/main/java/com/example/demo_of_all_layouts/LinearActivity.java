package com.example.demo_of_all_layouts;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LinearActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linear);  // Directly setting the layout file
    }
}
