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

public class DoorModule2 extends AppCompatActivity implements View.OnClickListener{
    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_module2);

        TextView doorStatus = findViewById(R.id.txtDoorStatus2);
        TextView doorPermission = findViewById(R.id.txtDoorPermision2);
        TextView doorTitle = findViewById(R.id.txtDoorTitle2);
        ImageView imgDoor = findViewById(R.id.imgDoorCondition2);
        ImageView imgPermission = findViewById(R.id.imgDoorPermission2);
        Button btnCallPolice = findViewById(R.id.btnCallPoliceAtDoor);

        //set OnClickListener
        btnCallPolice.setOnClickListener(this);

        //get globalValue to check status
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String flagStatus = globalValue.getDoorOpenBool();
        String flagPermission = globalValue.getDoorBool();

        if (flagStatus.equals("0")) {
            imgDoor.setImageResource(R.drawable.lockeddoor2);
            doorStatus.setText("Closed");
        }else if (flagStatus.equals("1")){
            imgDoor.setImageResource(R.drawable.unlockeddoor2);
            doorStatus.setText("Opened");
        }

        if (flagPermission.equals("0")) {
            imgPermission.setImageResource(R.drawable.granted);
            doorPermission.setText("Granted");
            doorTitle.setText("All is calm at home.");
        }else if (flagPermission.equals("1")){
            imgPermission.setImageResource(R.drawable.intruders);
            doorPermission.setText("Not Granted!");
            doorTitle.setText("Intruders Alert!");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_door_module2, menu);
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

        //get globalValue to check status
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        globalValue.setDoorOpenBool("0");
        globalValue.setDoorBool("0");

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

        // set title
        alertDialogBuilder.setTitle("Dial Success");

        // set dialog message
        AlertDialog.Builder builder = alertDialogBuilder
                .setMessage("A police report have been made. You have successfully stop the break in. System recovered.")
                .setCancelable(false)
                .setPositiveButton("Good", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // if this button is clicked, close
                        // current activity
                        DoorModule2.this.finish();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();


    }
}
