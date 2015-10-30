package edu.osu.settyblue.xreport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Log.i("SettingsActivity", "onCreate called.");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i("SettingsActivity", "onResume called.");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i("SettingsActivity", "onPause called.");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.i("SettingsActivity", "onStop called.");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("SettingsActivity", "onRestart called.");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("SettingsActivity", "onDestroy called.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.menu_settings, menu);
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
