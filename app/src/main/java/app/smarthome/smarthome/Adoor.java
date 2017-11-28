package app.smarthome.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Adoor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoor);

        TextView doorStatus = findViewById(R.id.txtADoor);
        ImageView door = findViewById(R.id.imgADoor);

        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        String doorBool = globalValue.getDoorBool();

        if (doorBool.equals("0")) //closed
        {
            door.setImageResource(R.drawable.dooropen1);
            doorStatus.setText("Door : Closed");
        }else if (doorBool.equals("1")){
            door.setImageResource(R.drawable.doorclose1);
            doorStatus.setText("Door : Opened");
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

        return id == R.id.action_settings || super.onOptionsItemSelected(item);

    }
}
