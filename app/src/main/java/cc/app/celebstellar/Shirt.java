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

public class Shirt extends AppCompatActivity {
    Button ruleshirt,registershirt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirt);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ruleshirt=(Button)findViewById(R.id.ruleshirt);
        registershirt=(Button)findViewById(R.id.Registershirt);
        ruleshirt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Shirt.this,ShirtRules.class);
                startActivity(i);

            }



        });

    }
    public void browsershirt(View view)
    {
        Intent browsershirtIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSfblnIJoXqeISiDjp2JNwQE8hsaELHe2YulFh1dZixMb7RVUA/viewform"));
        startActivity(browsershirtIntent);
    }

}
