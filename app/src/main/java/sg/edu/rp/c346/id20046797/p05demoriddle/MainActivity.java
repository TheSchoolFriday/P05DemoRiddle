    package sg.edu.rp.c346.id20046797.p05demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

    TextView tvQ1;
    Button btnRevealQ1, btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        btnRevealQ2 = findViewById(R.id.buttonRevealQ2);

        btnRevealQ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, AnswerActivity1.class); // This is for the None Challenge.
                Intent intent = new Intent(MainActivity.this, Challenge_AnswerActivity.class);
                intent.putExtra("question", "Q1)");
                intent.putExtra("answer", "Queue is the answer.");

                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent2 = new Intent(MainActivity.this, AnswerActivity2.class);  // This is for the None Challenge.
                Intent intent2 = new Intent(MainActivity.this, Challenge_AnswerActivity.class);
                intent2.putExtra("question", "Q2)");
                intent2.putExtra("answer", "is Gone.");

                startActivity(intent2);
            }
        });
    }
}