package app.smarthome.smarthome;

import android.content.Intent;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_SensorModule, btn_ControlModule, btn_ActuatorModule;
    //private Button btn_ControlModule;
   // private Button btn_ActuatorModule;

    String doorBool,tempBool,smokeBool,gasBool,humBool;
    int press = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create button
        btn_SensorModule = findViewById(R.id.btnSensor);
        btn_ControlModule = findViewById(R.id.btnControl);
        btn_ActuatorModule = findViewById(R.id.btnActuator);

        //Set Button Listener
        btn_SensorModule.setOnClickListener(this);
        btn_ControlModule.setOnClickListener(this);
        btn_ActuatorModule.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        switch (v.getId()) {
            case R.id.btnSensor:
                press = 1;
                Intent i = new Intent(new Intent(MainActivity.this, MainActivityMok.class));
                Bundle basket = new Bundle();
                basket.putString("doorKey", doorBool);
                basket.putString("tempKey", tempBool);
                basket.putString("gasKey", gasBool);
                basket.putString("smokeKey", smokeBool);
                basket.putString("humKey", humBool);
                i.putExtras(basket);
                startActivityForResult(i, 0);
                break;
            case R.id.btnControl:
                startActivity(new Intent(MainActivity.this, MainControl.class));
                break;
            case R.id.btnActuator:
                startActivity(new Intent(MainActivity.this, ActuatorModule.class));
                break;
        }
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && press == 1) {
            Bundle basket = data.getExtras();
            doorBool = basket.getString("doorKey");
            tempBool = basket.getString("tempKey");
            gasBool = basket.getString("gasKey");
            smokeBool = basket.getString("smokeKey");
            humBool = basket.getString("humKey");
            btn_ControlModule.setText(doorBool + "/" + tempBool + "/"+ gasBool + "/" + smokeBool + "/" + humBool);

//            final GlobalValue globalValue = (GlobalValue) getApplicationContext();
//
//            globalValue.setDoorBool(doorBool);
//            globalValue.setTempBool(tempBool);
//            globalValue.setGasBool(gasBool);
//            globalValue.setSmokeBool(smokeBool);
//            globalValue.setHumBool(humBool);

        }
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btnDoor:
//                startActivity(new Intent(MainActivity.this, DoorModule.class));
//                break;
//            case R.id.btnFireAlarm:
//                startActivity(new Intent(MainActivity.this, FireAlarmModule.class));
//                break;
//            case R.id.btnAlarm:
//                startActivity(new Intent(MainActivity.this, AlarmClockModule.class));
//                break;
//            case R.id.btnHomeTheater:
//                startActivity(new Intent(MainActivity.this, HomeTheaterModule.class));
//                break;
//            case R.id.btnStove:
//                startActivity(new Intent(MainActivity.this, StoveModule.class));
//                break;
//            case R.id.btnLighting:
//                startActivity(new Intent(MainActivity.this, LightingModule.class));
//                break;
//            case R.id.btnClothHorse:
//                startActivity(new Intent(MainActivity.this, ClothHorseModule.class));
//                break;
//            case R.id.btnDishWasher:
//                startActivity(new Intent(MainActivity.this, DishWasherModule.class));
//                break;
//        }
//    }

}
