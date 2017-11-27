package app.smarthome.smarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class humiditySensor extends Activity implements View.OnClickListener{
    Button submit;
    EditText humidity;
    String humidityValue;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.humiditysensor);

        submit = findViewById(R.id.button);
        humidity = findViewById(R.id.fillin);

        //get globalValue to restore previous result
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        humidity.setText(globalValue.getHumBool());

        submit.setOnClickListener(this);
    }

    public void onClick(View view) {

        humidityValue =  humidity.getText().toString();

        Intent i = new Intent();
        Bundle basket = new Bundle();
        basket.putString("humKey",humidityValue);
        i.putExtras(basket);
        setResult(RESULT_OK, i);

        finish();
    }
}
