package themilks.com.ajudaeu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class primeiratela extends AppCompatActivity {
    Button botaoA;
    Button botaoB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primeira_tela);

        botaoA= (Button) findViewById(R.id.botaoA);
        botaoA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tela= new Intent(primeiratela.this, segundatela.class);
                startActivity(tela);
            }
        });

        botaoB= (Button) findViewById(R.id.botaoB);
        botaoB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent entrar= new Intent(primeiratela.this, cadastrotela.class);
                startActivity(entrar);
            }
        });

    }
}
