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

public class Mad extends AppCompatActivity  {
    Button rulemad,registermad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulemad=(Button)findViewById(R.id.rulemad);
        registermad=(Button)findViewById(R.id.Registermad);
        rulemad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Mad.this,Madrules.class);
                startActivity(i);

            }

        });


    }
    public void browsermad(View view)
    {
        Intent browsermadIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScNwh3mvnIlDZtL7W08Vg8qeoo75Rq50bMM4cQAUEinAkhOUg/viewform"));
        startActivity(browsermadIntent);
    }

}
