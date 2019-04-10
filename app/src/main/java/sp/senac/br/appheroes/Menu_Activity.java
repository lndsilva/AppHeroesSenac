package sp.senac.br.appheroes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);
    }

    public void abrirPersonagem(View view) {


        switch (view.getId()) {
            case R.id.idBatman:
                Intent intent = new Intent(Menu_Activity.this, Batman_Activity.class);
                startActivity(intent);
                break;
        }


    }
}
