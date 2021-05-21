package sg.edu.rp.c346.id20046797.p05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer2 = findViewById(R.id.textViewAnswerQ2);
        Intent intent = getIntent();
        tvAnswer2.setText(intent.getStringExtra("question")  + " " + intent.getStringExtra("answer"));
    }
}