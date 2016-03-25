package com.balu.project0;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView text = (TextView) findViewById(R.id.textView);
        Button button1 = (Button) findViewById(R.id.button);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "We'll use this later, if necessary", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });






    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub

        int id = v.getId();
        switch (id) {
            case R.id.button:
                Toast.makeText(getBaseContext(), "This button will launch 'Spotify Streamer' ", Toast.LENGTH_LONG).show();
                //Your Operation
                break;
            case R.id.button2:
                Toast.makeText(getBaseContext(), "This button will launch 'Scores App'", Toast.LENGTH_LONG).show();
                //Your Operation
                break;
            case R.id.button3:
                Toast.makeText(getBaseContext(), "This button will launch 'Library App'", Toast.LENGTH_LONG).show();
                //Your Operation
                break;
            case R.id.button4:
                Toast.makeText(getBaseContext(), "This button will launch 'Build It Bigger'", Toast.LENGTH_LONG).show();
                //Your Operation
                break;
            case R.id.button5:
                Toast.makeText(getBaseContext(), "This button will launch 'Bacon Reader'", Toast.LENGTH_LONG).show();
                //Your Operation
                break;
            case R.id.button6:
                Toast.makeText(getBaseContext(), "This button will launch 'My Capstone App'", Toast.LENGTH_LONG).show();
                //Your Operation
                break;


        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
