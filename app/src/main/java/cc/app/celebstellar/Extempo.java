package cc.app.celebstellar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Extempo extends AppCompatActivity {
    Button ruleextempo,registerextempo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extempo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruleextempo=(Button)findViewById(R.id.ruleextempo);
        registerextempo=(Button)findViewById(R.id.Registerextempo);
        ruleextempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Extempo.this,Extemporules.class);
                startActivity(i);

            }



        });

    }


    public void browserextempo(View view)
    {
        Intent browserextempoIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdGcoL6v3xUKp79_Oxp9xRo0xuLGg_TcA9JVE2A7Q3LNnRbFw/viewform"));
        startActivity(browserextempoIntent);
    }

}
