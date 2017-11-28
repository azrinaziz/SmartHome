package app.smarthome.smarthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainControl extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_control);

        //Create button
        Button btn_DoorModule = findViewById(R.id.btnDoor);
        Button btn_FireAlarmModule = findViewById(R.id.btnFireAlarm);
        Button btn_AlarmClockModule = findViewById(R.id.btnAlarm);
        Button btn_HomeTheaterModule = findViewById(R.id.btnHomeTheater);
        Button btn_StoveModule = findViewById(R.id.btnStove);
        Button btn_LightingModule = findViewById(R.id.btnLighting);
        Button btn_ClothHorseModule = findViewById(R.id.btnClothHorse);
        Button btn_DishWasherModule = findViewById(R.id.btnDishWasher);

        //Set Button Listener
        btn_DoorModule.setOnClickListener(this);
        btn_FireAlarmModule.setOnClickListener(this);
        btn_AlarmClockModule.setOnClickListener(this);
        btn_HomeTheaterModule.setOnClickListener(this);
        btn_StoveModule.setOnClickListener(this);
        btn_LightingModule.setOnClickListener(this);
        btn_ClothHorseModule.setOnClickListener(this);
        btn_DishWasherModule.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDoor:
                startActivity(new Intent(MainControl.this, DoorModule2.class));
                break;
            case R.id.btnFireAlarm:
                startActivity(new Intent(MainControl.this, FireAlarmModule2.class));
                break;
            case R.id.btnAlarm:
                startActivity(new Intent(MainControl.this, AlarmClockModule.class));
                break;
            case R.id.btnHomeTheater:
                startActivity(new Intent(MainControl.this, HomeTheaterModule.class));
                break;
            case R.id.btnStove:
                startActivity(new Intent(MainControl.this, StoveModule.class));
                break;
            case R.id.btnLighting:
                startActivity(new Intent(MainControl.this, LightingModule.class));
                break;
            case R.id.btnClothHorse:
                startActivity(new Intent(MainControl.this, ClothHorseModule.class));
                break;
            case R.id.btnDishWasher:
                startActivity(new Intent(MainControl.this, DishWasherModule.class));
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_control, menu);
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
