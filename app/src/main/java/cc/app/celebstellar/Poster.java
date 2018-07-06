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

public class Poster extends AppCompatActivity  {
    Button ruleposter,registerposter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poster);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruleposter=(Button)findViewById(R.id.ruleposter);
        registerposter=(Button)findViewById(R.id.Registerposter);
        ruleposter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Poster.this,Posterrules.class);
                startActivity(i);

            }

        });


    }
    public void browserposter(View view)
    {
        Intent browserposterIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSeitxU6s-sLMphnuZan5Z8q9MMNpUPOuF7yQ4uZFBOxcZ6oJw/viewform"));
        startActivity(browserposterIntent);
    }

}
