package themilks.ajudaeu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CategoriasActivity extends AppCompatActivity {
    ImageButton BotaoA;
    ImageButton BotaoB;
    ImageButton BotaoC;
    ImageButton BotaoD;
    ImageButton BotaoE;
    ImageButton BotaoF;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        BotaoA= (ImageButton) findViewById(R.id.BotaoA);
        BotaoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela= new Intent(CategoriasActivity.this,AlvenariaActivity.class);
                startActivity(tela);
            }
        });

        BotaoB= (ImageButton) findViewById(R.id.BotaoB);
        BotaoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela2= new Intent(CategoriasActivity.this,DiaristaActivity.class);
                startActivity(tela2);
            }
        });


        BotaoC= (ImageButton) findViewById(R.id.BotaoC);
        BotaoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela3= new Intent(CategoriasActivity.this,JardimActivity.class);
                startActivity(tela3);
            }
        });

        BotaoD= (ImageButton) findViewById(R.id.BotaoD);
        BotaoD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela4= new Intent(CategoriasActivity.this,InfoActivity.class);
                startActivity(tela4);
            }
        });

        BotaoE= (ImageButton) findViewById(R.id.BotaoE);
        BotaoE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela5= new Intent(CategoriasActivity.this,EletricaActivity.class);
                startActivity(tela5);
            }
        });

        BotaoF= (ImageButton) findViewById(R.id.BotaoF);
        BotaoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela6= new Intent(CategoriasActivity.this,HidraulicaActivity.class);
                startActivity(tela6);
            }
        });


    }
}
