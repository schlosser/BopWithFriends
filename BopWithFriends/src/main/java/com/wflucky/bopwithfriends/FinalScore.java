package com.wflucky.bopwithfriends;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Andrew
 */
public class FinalScore extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_score);
        TextView finalScore = (TextView) findViewById(R.id.final_score);
        Intent intent = getIntent();
        String endMsg = intent.getStringExtra("ENDMESSAGE");
        finalScore.setText(endMsg + "! \n" +
                "Score:" + intent.getIntExtra("FANTASTICSCORE", 12345));
    }

    public void replay(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}
