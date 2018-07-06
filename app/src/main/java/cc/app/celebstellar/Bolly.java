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

public class Bolly extends AppCompatActivity  {
    Button rulebolly,registerbolly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolly);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulebolly=(Button)findViewById(R.id.rulebolly);
        registerbolly=(Button)findViewById(R.id.Registerbolly);
        rulebolly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Bolly.this,Bollyrules.class);
                startActivity(i);

            }

        });


    }
    public void browserbolly(View view)
    {
        Intent browserbollyIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdmvFZDEkzNhwJ0Gs9nZNNF5mK-AGj5NpH7-ymGSLWDB28RoA/alreadyresponded"));
        startActivity(browserbollyIntent);
    }

}
