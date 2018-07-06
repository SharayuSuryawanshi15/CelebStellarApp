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

public class Digital extends AppCompatActivity {
Button ruledigital,registerdigital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruledigital=(Button)findViewById(R.id.ruledigital);
        registerdigital=(Button)findViewById(R.id.Registerdigital);
        ruledigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Digital.this,Digitalrules.class);
                startActivity(i);

            }



        });

    }
    public void browserdigital(View view)
    {
        Intent browserdigitalIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSc3fe0h6EBNUika9CVTyxsGMUSnVD9Qekjsuve5Gvg5hkdRRQ/viewform"));
        startActivity(browserdigitalIntent);
    }

}
