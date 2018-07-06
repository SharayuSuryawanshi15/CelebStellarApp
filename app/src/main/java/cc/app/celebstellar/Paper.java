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

public class Paper extends AppCompatActivity {
    Button rulepaper,registerpaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulepaper=(Button)findViewById(R.id.rulepaper);
        registerpaper=(Button)findViewById(R.id.Registerpaper);
        rulepaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Paper.this,PaperRules.class);
                startActivity(i);

            }



        });

    }
    public void browserpaper(View view)
    {
        Intent browserpaperIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSc7_Ip0kr_lHOY_GEUyj4xJe_1DSuEr1IXDoQv2vxHSEC1kEA/viewform"));
        startActivity(browserpaperIntent);
    }

}
