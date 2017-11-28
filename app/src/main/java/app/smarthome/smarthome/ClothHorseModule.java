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
import android.widget.TextView;

public class ClothHorseModule extends AppCompatActivity implements View.OnClickListener {

    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloth_horse);

        TextView txtHum = findViewById(R.id.txtHumLevel);
        TextView txtHum2 = findViewById(R.id.txtHum);
        TextView txtTemp = findViewById(R.id.txtTemp2);
        TextView txtTemp2 = findViewById(R.id.txtTemp);
        TextView txtTitle = findViewById(R.id.txtClothHorseTitle);
        Button btnTurnOnClothHorse = findViewById(R.id.btnClothHorse);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String gga22 = globalValue.getClothHorseBool();
        int ga21 = Integer.parseInt(gga22);
        if (ga21 == 0){
            btnTurnOnClothHorse.setText("TURN ON RAIN PROTECTION");
        } else if (ga21 == 1){
            btnTurnOnClothHorse.setText("TURN OFF RAIN PROTECTION");
        }

        btnTurnOnClothHorse.setOnClickListener(this);

        String humidity = globalValue.getHumBool();
        String temperature = globalValue.getTempBool();

        int humidity2 = Integer.parseInt(humidity);
        int temperature2 = Integer.parseInt(temperature);

        txtHum.setText(humidity);
        txtTemp.setText(temperature);

        if (humidity2 < 50){
            txtHum2.setText("Low");
        }else if (humidity2 >= 50 && humidity2 < 85){
            txtHum2.setText("Medium");
        }else if (humidity2 >= 85){
            txtHum2.setText("High");
        }

        if (temperature2 < 20){
            txtTemp2.setText("Low");
        }else if (temperature2 >= 20 && temperature2 < 26){
            txtTemp2.setText("Average");
        }else if (temperature2 >= 26){
            txtTemp2.setText("High");
        }

        if (txtTemp2.getText().equals("Low") && txtHum2.getText().equals("High")){
            txtTitle.setText("It's raining!");
        } else if ((txtTemp2.getText().equals("Average") && txtHum2.getText().equals("High"))){
            txtTitle.setText("It's going to rain.");
        } else {
            txtTitle.setText("Weather is fine.");
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cloth_horse, menu);
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
        String gga2 = globalValue.getClothHorseBool();
        String flag = "";

        int ga2 = Integer.parseInt(gga2);
        if (ga2 == 1){
            globalValue.setClothHorseBool("0");
            flag = "off";
        } else if (ga2 == 0){
            globalValue.setClothHorseBool("1");
            flag = "on";
        }

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Successful Message");

        // set dialog message
        AlertDialog.Builder builder = alertDialogBuilder
                .setMessage("Rain protection mode " + flag + ".")
                .setCancelable(false)
                .setPositiveButton("Good", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        ClothHorseModule.this.finish();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }
}
