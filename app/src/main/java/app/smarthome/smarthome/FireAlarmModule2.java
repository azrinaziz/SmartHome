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
import android.widget.ImageView;
import android.widget.TextView;

public class FireAlarmModule2 extends AppCompatActivity implements View.OnClickListener {
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_alarm_module2);

        TextView smokeLevel = findViewById(R.id.txtSmokeLevel2);
        TextView smokeCondition = findViewById(R.id.txtSmokeCondition2);
        TextView smokeTitle = findViewById(R.id.txtSmokeTitle2);
        ImageView imgSmokeLevel = findViewById(R.id.imgSmokeLevel2);
        ImageView imgSmokeCondition = findViewById(R.id.imgSmokeCondition2);
        Button btnCallPolice = findViewById(R.id.btnCallPoliceForSmoke);

        //set call police button
        btnCallPolice.setOnClickListener(this);

        //get globalValue to check status
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String flagLevel = globalValue.getSmokeBool();

        if (flagLevel.equals("0")) {
            imgSmokeLevel.setImageResource(R.drawable.firealarm2);
            imgSmokeCondition.setImageResource(R.drawable.air);
            smokeCondition.setText("Clear");
            smokeLevel.setText("Low");
            smokeTitle.setText("Air condition is good.");
        }else if (flagLevel.equals("1")) {
            imgSmokeLevel.setImageResource(R.drawable.firealarm1);
            imgSmokeCondition.setImageResource(R.drawable.fire3);
            smokeCondition.setText("Danger!");
            smokeLevel.setText("High");
            smokeTitle.setText("Fire Alert!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fire_alarm_module2, menu);
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
        //get globalValue to check status
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        globalValue.setSmokeBool("0");

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Dial Success");

        // set dialog message
        AlertDialog.Builder builder = alertDialogBuilder
                .setMessage("A fire report have been made. Fire have been successfully put off. System recovered.")
                .setCancelable(false)
                .setPositiveButton("Good", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        FireAlarmModule2.this.finish();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }
}
