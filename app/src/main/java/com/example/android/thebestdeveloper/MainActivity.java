package com.example.android.thebestdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreEasy=0;
    int scoreMedium=0;
    int scoreHard=0;
    int wrongEasy=0;
    int wrongMedium=0;
    int wrongHard=0;

    public void easyTest (View view){
        setContentView(R.layout.testeasy);
    }

    public void mediumTest (View view){ setContentView(R.layout.testmedium);}

    public void hardTest (View view){ setContentView(R.layout.testhard);}

    public void toMain (View view){ setContentView(R.layout.activity_main);}

    public void toSummary (View view) { setContentView(R.layout.summary);}

    public void onRadioButtonClickedHQ1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.hq1a1:
                if (checked)
                    // Pirates are the best
                    break;
            case R.id.hq1a2:
                if (checked)
                    // Ninjas rule
                    break;
            case R.id.hq1a3:
                if (checked)
                    // IDN
                    break;
        }
    }

    public void onRadioButtonClickedMQ1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mq1a1:
                if (checked)
                    scoreMedium=scoreMedium+1;
                    break;
            case R.id.mq1a2:
                if (checked)
                    wrongMedium=wrongMedium+1;
                    break;
            case R.id.mq1a3:
                if (checked)
                    wrongMedium=wrongMedium+1;
                    break;
        }
    }

    public void onRadioButtonClickedMQ2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mq2a1:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
            case R.id.mq2a2:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
            case R.id.mq2a3:
                if (checked)
                    scoreMedium=scoreMedium+1;
                break;
        }
    }

    public void onRadioButtonClickedMQ3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mq3a1:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
            case R.id.mq3a2:
                if (checked)
                    scoreMedium=scoreMedium+1;
                break;
            case R.id.mq3a3:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
        }
    }

    public void onRadioButtonClickedMQ4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mq4a1:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
            case R.id.mq4a2:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
            case R.id.mq4a3:
                if (checked)
                    scoreMedium=scoreMedium+1;
                break;
        }
    }

    public void onRadioButtonClickedMQ5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.mq5a1:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
            case R.id.mq5a2:
                if (checked)
                    scoreMedium=scoreMedium+1;
                break;
            case R.id.mq5a3:
                if (checked)
                    wrongMedium=wrongMedium+1;
                break;
        }
    }


    public void onRadioButtonClickedEQ1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.eq1a1:
                if (checked)
                    wrongEasy=wrongEasy+1;
                    break;
            case R.id.eq1a2:
                if (checked)
                    scoreEasy=scoreEasy+1;
                    break;
        }
    }

    public void onRadioButtonClickedEQ2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.eq2a1:
                if (checked)
                    scoreEasy=scoreEasy+1;
                break;
            case R.id.eq2a2:
                if (checked)
                    wrongEasy=wrongEasy+1;
                break;
        }
    }

    public void onRadioButtonClickedEQ3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.eq3a1:
                if (checked)
                    wrongEasy=wrongEasy+1;
                break;
            case R.id.eq3a2:
                if (checked)
                    scoreEasy=scoreEasy+1;
                break;
        }
    }

    public void onRadioButtonClickedEQ4(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.eq4a1:
                if (checked)
                    wrongEasy=wrongEasy+1;
                break;
            case R.id.eq4a2:
                if (checked)
                    scoreEasy=scoreEasy+1;
                break;
        }
    }

    public void onRadioButtonClickedEQ5(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.eq5a1:
                if (checked)
                    scoreEasy=scoreEasy+1;
                break;
            case R.id.eq5a2:
                if (checked)
                    wrongEasy=wrongEasy+1;
                break;
        }
    }

    public void tryAgain (View view){
        setContentView(R.layout.activity_main);
    }

    public void summary(int scoreHard ,int wrongHard ,int scoreMedium,int wrongMedium ,int scoreEasy , int wrongEasy){
        TextView quantityScoreEasyTextView = (TextView) findViewById(R.id.easyScore);
        quantityScoreEasyTextView.setText("" + scoreEasy);
        TextView quantityWrongEasyTextView = (TextView) findViewById(R.id.easyMisstakes);
        quantityWrongEasyTextView.setText("" + wrongEasy);
        TextView quantityScoreMediumTextView = (TextView) findViewById(R.id.mediumScore);
        quantityScoreMediumTextView.setText("" + scoreMedium);
        TextView quantityWrongMediumTextView = (TextView) findViewById(R.id.mediumMisstakes);
        quantityWrongMediumTextView.setText("" + wrongMedium);
        TextView quantityScoreHardTextView = (TextView) findViewById(R.id.hardScore);
        quantityScoreHardTextView.setText("" + scoreHard);
        TextView quantityWrongHardTextView = (TextView) findViewById(R.id.hardMisstakes);
        quantityWrongHardTextView.setText("" + wrongHard);
    }

}
