package sg.edu.rp.c346.id19011909.demoriddlechallange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity extends AppCompatActivity {

    //Creating Variable,
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        //Linking Variable,
        tvAnswer = findViewById(R.id.textView);

        //Setting Intent,
        Intent intentReceived = getIntent();
        String Selection = intentReceived.getStringExtra("Question");

        if(Selection.contentEquals("Q1")) {
            tvAnswer.setText(Selection + " answer is: Queue");
        }

        else
        {
            tvAnswer.setText(Selection + " answer is: Gone");
        }

    }
}