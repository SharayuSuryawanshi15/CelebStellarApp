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

public class Best extends AppCompatActivity  {
    Button rulebest,registerbest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_best);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulebest=(Button)findViewById(R.id.rulebest);
        registerbest=(Button)findViewById(R.id.Registerbest);
        rulebest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Best.this,Bestrules.class);
                startActivity(i);

            }

        });


}
    public void browserbest(View view)
    {
        Intent browserbestIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfA0fa5EDM-_w6xxULOYjCTuZEKdlpt2dlREiV3oRsayFFfdw/viewform"));
        startActivity(browserbestIntent);
    }

}
