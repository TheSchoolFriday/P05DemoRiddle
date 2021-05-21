package sg.edu.rp.c346.id20046797.p05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textViewAnswerQ1);
        Intent intentRecieved = getIntent();
//        tvAnswer.setText(intentRecieved.getStringExtra("moduleName") + " is my Module.");
        tvAnswer.setText(intentRecieved.getStringExtra("question") + " answer is: Queue");
    }
}