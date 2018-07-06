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

public class Logog extends AppCompatActivity {
    Button rulelogog,registerlogog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logog);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulelogog=(Button)findViewById(R.id.rulelogog);
        registerlogog=(Button)findViewById(R.id.Registerlogog);
        rulelogog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Logog.this,Logogrules.class);
                startActivity(i);

            }



        });

    }


    public void browserlogog(View view)
    {
        Intent browserlogogIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdB06Cc_ChuSNq1EoikDOyZPF9DBnwuASAq291ygE9eqh2rvQ/viewform"));
        startActivity(browserlogogIntent);
    }

}
