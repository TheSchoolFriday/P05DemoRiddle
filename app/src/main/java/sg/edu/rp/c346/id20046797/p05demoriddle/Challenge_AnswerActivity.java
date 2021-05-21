package sg.edu.rp.c346.id20046797.p05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Challenge_AnswerActivity extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge__answer);

        tvAnswer = findViewById(R.id.textViewChallengeAnswer);
        Intent intentAnswer = getIntent();

        tvAnswer.setText(intentAnswer.getStringExtra("question") + " " + intentAnswer.getStringExtra("answer"));
    }
}
