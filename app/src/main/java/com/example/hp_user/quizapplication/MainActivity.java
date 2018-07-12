package com.example.hp_user.quizapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public boolean checkRadioOptions(RadioButton radio) {
        if (radio.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkOptions(CheckBox chckbox) {
        if (chckbox.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View view) {
        int Score = 0;
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer_1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer_2);
        RadioButton answer3 = (RadioButton) findViewById(R.id.answer_3);
        EditText answer4 = (EditText) findViewById(R.id.answer_4);
        CheckBox answer5_1 = (CheckBox) findViewById(R.id.answer5_1);
        CheckBox answer5_2 = (CheckBox) findViewById(R.id.answer5_2);
        CheckBox answer5_3 = (CheckBox) findViewById(R.id.answer5_3);
        CheckBox answer5_4 = (CheckBox) findViewById(R.id.answer5_4);
        if (checkRadioOptions(answer1)) {
            Score++;
        }
        if (checkRadioOptions(answer2)) {
            Score++;
        }
        if (checkRadioOptions(answer3)) {
            Score++;
        }
        if (answer4.getText().toString().equalsIgnoreCase("User Interface")) {
            Score++;
        }
        if (checkOptions(answer5_1) && checkOptions(answer5_2) && checkOptions(answer5_3) && checkOptions(answer5_4)) {
            Score++;
        }
        Toast.makeText(this, "Your Score is " + Score, Toast.LENGTH_SHORT).show();
    }
}
