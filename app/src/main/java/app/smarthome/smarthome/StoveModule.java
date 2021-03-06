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

public class StoveModule extends AppCompatActivity implements View.OnClickListener{

    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stove_module);

        TextView stoveStatus = findViewById(R.id.txtGasLeaking);
        TextView stoveCondition = findViewById(R.id.txtGasCondition);
        TextView stoveTitle = findViewById(R.id.txtGasTitle);
        ImageView imgStoveStatus = findViewById(R.id.imgGasLeaking);
        ImageView imgStoveCondition = findViewById(R.id.imgGasCondition);
        Button btnTurnOff = findViewById(R.id.btnTurnOffForGas);

        btnTurnOff.setOnClickListener(this);

        //get globalValue to check status
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String flagStatus = globalValue.getGasBool();

        if (flagStatus.equals("0")) {
            imgStoveStatus.setImageResource(R.drawable.safe2);
            imgStoveCondition.setImageResource(R.drawable.granted);
            stoveStatus.setText("None");
            stoveCondition.setText("Safe");
            stoveTitle.setText("Kitchen is secured.");
        }else if (flagStatus.equals("1")){
            imgStoveStatus.setImageResource(R.drawable.fire3);
            imgStoveCondition.setImageResource(R.drawable.intruders);
            stoveStatus.setText("Leaking");
            stoveCondition.setText("Danger!");
            stoveTitle.setText("Gas is leaking!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stove_module, menu);
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
        globalValue.setGasBool("0");

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Successful Message");

        // set dialog message
        AlertDialog.Builder builder = alertDialogBuilder
                .setMessage("The gas has been switched off. The kitchen is secured once again. System recovered.")
                .setCancelable(false)
                .setPositiveButton("Good", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        StoveModule.this.finish();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();


    }

}
