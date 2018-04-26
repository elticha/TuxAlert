package lambdastudios.tuxalert;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tarjetaBienvenida3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_tarjeta_bienvenida3);
        Button nextWindow = (Button) findViewById(R.id.button_tarjeta_3);
        final Intent nextPage = new Intent(this,tarjetaBienvenida3.class);
        nextWindow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(nextPage);
                finish();
            }
        });
    }
}
