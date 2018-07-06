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

public class C_Cpp extends AppCompatActivity  {
    Button ruleccpp,registerccpp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c__cpp);


        ruleccpp=(Button)findViewById(R.id.ruleccpp);
        registerccpp=(Button)findViewById(R.id.Registerccpp);
        ruleccpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(C_Cpp.this,CcppRules.class);
                startActivity(i);

            }

        });


    }
    public void browserccpp(View view)
    {
        Intent browserccppIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSelCBJlQQWjuqexww4OIm0KPDonh1zfYLIWcN5QHG5yroImNw/viewform"));
        startActivity(browserccppIntent);
    }

}
