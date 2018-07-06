package cc.app.celebstellar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Tres extends AppCompatActivity {
    Button ruletres,registertres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruletres=(Button)findViewById(R.id.ruletres);
        registertres=(Button)findViewById(R.id.Registertres);
        ruletres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Tres.this,TresRules.class);
                startActivity(i);

            }



        });

    }
    public void browsertres(View view)
    {
        Intent browsertresIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfc5_Nhxu_FKXzAh9XU0NkLmjKBwicKxRpMB5_GyO-6JjxFVA/alreadyresponded"));
        startActivity(browsertresIntent);
    }

}
