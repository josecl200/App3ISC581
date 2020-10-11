package edu.pucmm.isc581.app3isc581;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Eligió: "+ getIntent().getStringExtra("DISTRO"));
    }
}