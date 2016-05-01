package com.am.resistoridentifier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Spinner c2v_digit1;
    Spinner c2v_digit2;
    Spinner c2v_multiplier;
    Spinner c2v_tolerance;
    TextView c2v_value;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnClick = (Button) findViewById(R.id.c2v_button) ;
        btnClick.setOnClickListener(this);

        c2v_digit1 = (Spinner) findViewById(R.id.c2v_digit1spinner);
        ArrayAdapter aadigit1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ResistorDigitBand.values());
        c2v_digit1.setAdapter(aadigit1);

        c2v_digit2 = (Spinner) findViewById(R.id.c2v_digit2spinner);
        ArrayAdapter aadigit2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ResistorDigitBand.values());
        c2v_digit2.setAdapter(aadigit2);

        c2v_multiplier = (Spinner) findViewById(R.id.c2v_multiplierspinner);
        ArrayAdapter aamult = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ResistorMultiplierBand.values());
        c2v_multiplier.setAdapter(aamult);

        c2v_tolerance = (Spinner) findViewById(R.id.c2v_tolerancespinner);
        ArrayAdapter aatoler = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ResistorToleranceBand.values());
        c2v_tolerance.setAdapter(aatoler);

        c2v_value = (TextView) findViewById(R.id.c2v_value);



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

    @Override
    public void onClick(View v) {

        int digit1value = ((ResistorDigitBand) c2v_digit1.getItemAtPosition(c2v_digit1.getSelectedItemPosition())).getValue();
        int digit2value = ((ResistorDigitBand) c2v_digit2.getItemAtPosition(c2v_digit2.getSelectedItemPosition())).getValue();
        double multipliervalue = ((ResistorMultiplierBand) c2v_multiplier.getItemAtPosition(c2v_multiplier.getSelectedItemPosition())).getValue();
        double tolerancevalue = ((ResistorToleranceBand) c2v_tolerance.getItemAtPosition(c2v_tolerance.getSelectedItemPosition())).getValue();

        String result = ((digit1value*10)+(digit2value))*multipliervalue+" "+tolerancevalue+"%\n";

        c2v_value.setText(result);
    }
}
