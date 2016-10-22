package ng.cheo.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View v) {
        TextView scoreTextViewA = (TextView) findViewById(R.id.scoreTeamA);
        scoreTextViewA.setText("0");
        TextView scoreTextViewB = (TextView) findViewById(R.id.scoreTeamB);
        scoreTextViewB.setText("0");
    }

    public void increment(View v, String team, Integer score) {
        TextView scoreTextView = null;

        if (team.equals("A")) {
            scoreTextView = (TextView) findViewById(R.id.scoreTeamA);
        }
        else if (team.equals("B")) {
            scoreTextView = (TextView) findViewById(R.id.scoreTeamB);
        }

        Integer currentScore = Integer.parseInt(scoreTextView.getText().toString());
        currentScore += score;
        scoreTextView.setText(currentScore.toString());
    }

    public void twoPointsTeamA(View v) {
        increment(v, "A", 2);
    }

    public void threePointsTeamA(View v) {
        increment(v, "A", 3);
    }

    public void freeThrowTeamA(View v) {
        increment(v, "A", 1);
    }

    public void twoPointsTeamB(View v) {
        increment(v, "B", 2);
    }

    public void threePointsTeamB(View v) {
        increment(v, "B", 3);
    }

    public void freeThrowTeamB(View v) {
        increment(v, "B", 1);
    }
}
