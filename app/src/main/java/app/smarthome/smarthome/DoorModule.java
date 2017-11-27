package app.smarthome.smarthome;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DoorModule extends AppCompatActivity /*implements View.OnClickListener*/{

//    TextView doorStatus, doorPermission, doorTitle;
//    String flagStatus, flagPermission;
//    ImageView imgDoor, imgPermission;
//    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_door_module);

//        doorStatus = (TextView) findViewById(R.id.txtDoorStatus);
//        doorPermission = (TextView) findViewById(R.id.txtDoorPermission);
//        doorTitle = (TextView) findViewById(R.id.txtDoorTitle);
//        imgDoor = (ImageView) findViewById(R.id.imgDoor);
//        imgPermission = (ImageView) findViewById(R.id.imgPermission);

//        //Back button
//        btnBack = (Button) findViewById(R.id.btnBackAtDoor);
//        btnBack.setOnClickListener(this);

//        //get globalValue to check status
//        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
//        flagStatus = globalValue.getDoorOpenBool();
//        flagPermission = globalValue.getDoorBool();

//        if (flagStatus.equals("0")) {
//            imgDoor.setImageResource(R.drawable.lockeddoor2);
//            doorStatus.setText("Closed");
//        }else if (flagStatus.equals("1")){
//            imgDoor.setImageResource(R.drawable.unlockeddoor2);
//            doorStatus.setText("Opened");
//        }
//
//        if (flagPermission.equals("0")) {
//            imgPermission.setImageResource(R.drawable.granted);
//            doorPermission.setText("Granted");
//            doorTitle.setText("All is calm at home.");
//        }else if (flagPermission.equals("1")){
//            imgPermission.setImageResource(R.drawable.intruders);
//            doorPermission.setText("Not Granted!");
//            doorTitle.setText("Intruders Alert!");
//        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_door_module, menu);
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

//    @Override
//    public void onClick(View v) {
//        finish();
//    }
}
