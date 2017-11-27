package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Adoor extends AppCompatActivity {

    TextView DoorStatus;
    ImageView Door;
    String DoorBool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoor);

        DoorStatus = findViewById(R.id.txtADoor);
        Door = findViewById(R.id.imgADoor);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        DoorBool = globalValue.getDoorBool();

        if (DoorBool.equals("0")) //closed
        {
            Door.setImageResource(R.drawable.dooropen1);
            DoorStatus.setText("Door : Closed");
        }else if (DoorBool.equals("1")){
            Door.setImageResource(R.drawable.doorclose1);
            DoorStatus.setText("Door : Opened");
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_adoor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
