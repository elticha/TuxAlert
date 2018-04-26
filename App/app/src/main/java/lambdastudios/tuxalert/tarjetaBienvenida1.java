package lambdastudios.tuxalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarjetaBienvenida1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tarjeta_bienvenida1);
        Button nextWindow = (Button) findViewById(R.id.button_tarjeta_1);
        final Intent nextPage = new Intent(this,tarjetaBienvenida2.class);
        nextWindow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(nextPage);
                finish();
            }
        });
    }
}