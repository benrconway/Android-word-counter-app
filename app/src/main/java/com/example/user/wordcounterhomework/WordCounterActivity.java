package com.example.user.wordcounterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText textInput;
    TextView textOutput;
    Button countButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        textInput = (EditText) findViewById(R.id.counting_input);
        textOutput = (TextView) findViewById(R.id.counter_output);
        countButton = (Button) findViewById(R.id.count_button);
    }

    public void onCountButtonClicked(View Button){
        String textForCounting = textInput.getText().toString();
        textOutput.setText(WordCounter.countWords(textForCounting));
    }
}
