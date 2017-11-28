package app.smarthome.smarthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActuatorModule extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actuator_module);

        Button btnDoorAct = findViewById(R.id.btnDoorActuator);
        Button btnFireAct = findViewById(R.id.btnSmokeAlarmActuator);
        Button btmAlarmAct = findViewById(R.id.btnAlarmClockActuator);
        Button btnTheaterAct = findViewById(R.id.btnHomeTheaterActuator);
        Button btnStoveAct = findViewById(R.id.btnStoveActuator);
        Button btnLLightAct = findViewById(R.id.btnLivingLightActuator);
        Button btnDLightAct = findViewById(R.id.btnDiningLightActuator);
        Button btnKLightAct = findViewById(R.id.btnKitchenLightActuator);
        Button btnMLightAct = findViewById(R.id.btnMasterLightActuator);
        Button btnClothAct = findViewById(R.id.btnClothHorseActuator);
        Button btnDishwasherAct = findViewById(R.id.btnDishWasherActuator);

        btnDoorAct.setOnClickListener(this);
        btnFireAct.setOnClickListener(this);
        btmAlarmAct.setOnClickListener(this);
        btnTheaterAct.setOnClickListener(this);
        btnStoveAct.setOnClickListener(this);
        btnLLightAct.setOnClickListener(this);
        btnDLightAct.setOnClickListener(this);
        btnKLightAct.setOnClickListener(this);
        btnMLightAct.setOnClickListener(this);
        btnClothAct.setOnClickListener(this);
        btnDishwasherAct.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actuator_module, menu);
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
        switch (v.getId()) {
            case R.id.btnDoorActuator:
                startActivity(new Intent(ActuatorModule.this, Adoor.class));
                break;
            case R.id.btnSmokeAlarmActuator:
                startActivity(new Intent(ActuatorModule.this, Asmoke.class));
                break;
            case R.id.btnAlarmClockActuator:
                startActivity(new Intent(ActuatorModule.this, Aalarm.class));
                break;
            case R.id.btnHomeTheaterActuator:
                startActivity(new Intent(ActuatorModule.this, Ahometheater.class));
                break;
            case R.id.btnStoveActuator:
                startActivity(new Intent(ActuatorModule.this, Astove.class));
                break;
            case R.id.btnLivingLightActuator:
                startActivity(new Intent(ActuatorModule.this, ALLight.class));
                break;
            case R.id.btnDiningLightActuator:
                startActivity(new Intent(ActuatorModule.this, ADLight.class));
                break;
            case R.id.btnKitchenLightActuator:
                startActivity(new Intent(ActuatorModule.this, AKLight.class));
                break;
            case R.id.btnMasterLightActuator:
                startActivity(new Intent(ActuatorModule.this, AMLight.class));
                break;
            case R.id.btnClothHorseActuator:
                startActivity(new Intent(ActuatorModule.this, ACloth.class));
                break;
            case R.id.btnDishWasherActuator:
                startActivity(new Intent(ActuatorModule.this, ADish.class));
                break;
        }
    }
}
