package com.example.demo_of_all_layouts;

import static androidx.core.content.ContextCompat.startActivity;

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

        Button linearButton = findViewById(R.id.linearButton);
        Button relativeButton = findViewById(R.id.relativeButton);
        Button constraintButton = findViewById(R.id.constraintButton);
        Button tableButton = findViewById(R.id.tableButton);
        Button frameButton = findViewById(R.id.frameButton);
        Button listButton = findViewById(R.id.listButton);
        Button gridButton = findViewById(R.id.gridButton);
        Button absoluteButton = findViewById(R.id.absoluteButton);
        Button webButton = findViewById(R.id.webButton);
        Button scrollButton = findViewById(R.id.scrollButton);

        linearButton.setOnClickListener(v -> startActivity(new Intent(this, LinearActivity.class)));
        relativeButton.setOnClickListener(v -> startActivity(new Intent(this, RelativeActivity.class)));
        constraintButton.setOnClickListener(v -> startActivity(new Intent(this, ConstraintActivity.class)));
        tableButton.setOnClickListener(v -> startActivity(new Intent(this, TableActivity.class)));
        frameButton.setOnClickListener(v -> startActivity(new Intent(this, FrameActivity.class)));
        listButton.setOnClickListener(v -> startActivity(new Intent(this, ListActivity.class)));
        gridButton.setOnClickListener(v -> startActivity(new Intent(this, GridActivity.class)));
        absoluteButton.setOnClickListener(v -> startActivity(new Intent(this, AbsoluteActivity.class)));
        webButton.setOnClickListener(v -> startActivity(new Intent(this, WebViewActivity.class)));
        scrollButton.setOnClickListener(v -> startActivity(new Intent(this, ScrollActivity.class)));
    }
}
