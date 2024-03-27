package com.example.ecoevolve;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tipTextView;
    private TextView challengeTextView;
    private Button changeTipButton;

    private String[] tips = {
            "Use reusable bags when shopping.",
            "Reduce water waste by fixing leaks.",
            "Lower your thermostat in the winter.",
            "Walk, bike, or use public transport."
    };

    private String[] challenges = {
            "Take a 5-minute shower today.",
            "Use a reusable water bottle.",
            "Plant a tree in your neighborhood.",
            "Reduce your meat consumption today."
    };

    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipTextView = findViewById(R.id.tipTextView);
        challengeTextView = findViewById(R.id.challengeTextView);
        changeTipButton = findViewById(R.id.changeTipButton);

        changeTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex = (currentIndex + 1) % tips.length;
                updateViews();
            }
        });

        updateViews();
    }

    private void updateViews() {
        tipTextView.setText(tips[currentIndex]);
        challengeTextView.setText(challenges[currentIndex]);
    }
}
