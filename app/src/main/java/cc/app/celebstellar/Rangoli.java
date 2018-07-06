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

public class Rangoli extends AppCompatActivity {
    Button rulerangoli,registerrangoli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangoli);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulerangoli=(Button)findViewById(R.id.rulerangoli);
        registerrangoli=(Button)findViewById(R.id.Registerrangoli);
        rulerangoli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Rangoli.this,RangoliRules.class);
                startActivity(i);

            }



        });

    }
    public void browserrangoli(View view)
    {
        Intent browserrangoliIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSe-HgLShJL2pxUEk0WB_s70RoSvQTVjfBwGHt63eNVsF1VM1w/viewform"));
        startActivity(browserrangoliIntent);
    }

}
