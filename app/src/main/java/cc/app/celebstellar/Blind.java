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

public class Blind extends AppCompatActivity {
    Button ruleblind,registerblind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blind);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruleblind =(Button)findViewById(R.id.ruleblind);
        registerblind=(Button)findViewById(R.id.Registerblind);
        ruleblind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Blind.this,Blindrule.class);
                startActivity(i);

            }



        });

    }
    public void browserblind(View view)
    {
        Intent browserblindIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScQ8RCKyGx-rNS6AI3QHuJJG2A4IpokdlLPHVB0H2qI9dCvhg/viewform"));
        startActivity(browserblindIntent);
    }

}
