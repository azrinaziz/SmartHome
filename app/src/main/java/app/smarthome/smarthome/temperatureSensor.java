package app.smarthome.smarthome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class temperatureSensor extends Activity implements View.OnClickListener{

    private EditText temp;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperaturesensor);

        Button submit = findViewById(R.id.button);
        temp = findViewById(R.id.fillin);

        //get globalValue to restore previous result
        final GlobalValue globalValue = (GlobalValue) getApplicationContext();
        temp.setText(globalValue.getTempBool());

        submit.setOnClickListener(this);
    }

    public void onClick(View view) {

        String temperature = temp.getText().toString();

        Intent i = new Intent();
        Bundle basket = new Bundle();
        basket.putString("tempKey", temperature);
        i.putExtras(basket);
        setResult(RESULT_OK, i);

        finish();
    }
}
