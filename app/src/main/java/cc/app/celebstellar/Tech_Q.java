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

public class Tech_Q extends AppCompatActivity {
    Button ruletechq,registertechq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech__q);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruletechq=(Button)findViewById(R.id.ruletechq);
        registertechq=(Button)findViewById(R.id.Registertechq);
        ruletechq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Tech_Q.this,Techqrules.class);
                startActivity(i);

            }



        });

    }
    public void browsertechq(View view)
    {
        Intent browsertechqIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfLuiSCYa5MdJv0XDnNYUX30ngvWJX-DP6LV6_l70g158kXog/viewform"));
        startActivity(browsertechqIntent);
    }

}
