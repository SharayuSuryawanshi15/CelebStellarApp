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

public class Android_D extends AppCompatActivity {
    Button ruleandroid,registerandroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android__d);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruleandroid=(Button)findViewById(R.id.ruleandroid);
        registerandroid=(Button)findViewById(R.id.Registerandroid);
        ruleandroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Android_D.this,Androidrules.class);
                startActivity(i);

            }



        });

    }


    public void browserandroid(View view)
    {
        Intent browserandroidIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSexXmFInRKulb11FjpqFPEEVOXnPoQlGS30ltbteShIOb5FTA/viewform"));
        startActivity(browserandroidIntent);
    }

}
