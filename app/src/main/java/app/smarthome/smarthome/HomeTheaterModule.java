package app.smarthome.smarthome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeTheaterModule extends AppCompatActivity implements View.OnClickListener {

    private final Context context = this;
    private EditText autoPlayTime;
    private EditText sleepTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_threater_module);

        Button btnSet = findViewById(R.id.btnHomeTheaterSet);
        btnSet.setOnClickListener(this);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        autoPlayTime = findViewById(R.id.txtAutoPlayMovie);
        sleepTime = findViewById(R.id.txtSleepMode);
        autoPlayTime.setText(globalValue.getAutoPlayTime());
        sleepTime.setText(globalValue.getSleepTime());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_threater_module, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return id == R.id.action_settings || super.onOptionsItemSelected(item);

    }

    @Override
    public void onClick(View v) {

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        globalValue.setAutoPlayTime(autoPlayTime.getText().toString());
        globalValue.setSleepTime(sleepTime.getText().toString());

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Successful Message");

        // set dialog message
        AlertDialog.Builder builder = alertDialogBuilder
                .setMessage("Home Theater have been set to auto play at " + autoPlayTime.getText().toString() + " and sleep at " + sleepTime.getText().toString() + ". Have a nice day.")
                .setCancelable(false)
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        HomeTheaterModule.this.finish();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }
}
