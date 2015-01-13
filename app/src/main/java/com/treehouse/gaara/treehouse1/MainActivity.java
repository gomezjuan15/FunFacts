package com.treehouse.gaara.treehouse1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare our View variables
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.myRelativeLayout);

        View.OnClickListener showFactButtonListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked, so update the fact label with a new fact
                relativeLayout.setBackgroundColor(mColorWheel.getColor());
                factLabel.setText(mFactBook.getFact());
            }
        };
        showFactButton.setOnClickListener(showFactButtonListener);

        //Toast.makeText(this, "Our activity was created", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Our activity is created");
    }
}
