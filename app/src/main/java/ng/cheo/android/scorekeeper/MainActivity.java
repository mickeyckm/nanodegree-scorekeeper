package ng.cheo.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreTextViewA;
    private TextView scoreTextViewB;
    private Integer scoreTeamA;
    private Integer scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init scores
        initScore();

        // Create textviews
        scoreTextViewA = (TextView) findViewById(R.id.scoreTeamA);
        scoreTextViewB = (TextView) findViewById(R.id.scoreTeamB);
    }

    private void initScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

    public void reset(View v) {
        initScore();
        updateCounter(scoreTextViewA, scoreTeamA);
        updateCounter(scoreTextViewB, scoreTeamB);
    }

    public void updateCounter(TextView textView, Integer score) {
        textView.setText(String.valueOf(score));
    }

    public void score(View v) {

        switch (v.getId()) {

            case R.id.twoPointsButtonA:
                scoreTeamA += 2;
                updateCounter(scoreTextViewA, scoreTeamA);
                break;
            case R.id.threePointsButtonA:
                scoreTeamA += 3;
                updateCounter(scoreTextViewA, scoreTeamA);
                break;
            case R.id.freeThrowButtonA:
                scoreTeamA += 1;
                updateCounter(scoreTextViewA, scoreTeamA);
                break;

            case R.id.twoPointsButtonB:
                scoreTeamB += 2;
                updateCounter(scoreTextViewB, scoreTeamB);
                break;
            case R.id.threePointsButtonB:
                scoreTeamB += 3;
                updateCounter(scoreTextViewB, scoreTeamB);
                break;
            case R.id.freeThrowButtonB:
                scoreTeamB += 1;
                updateCounter(scoreTextViewB, scoreTeamB);
                break;

        }

    }
}
