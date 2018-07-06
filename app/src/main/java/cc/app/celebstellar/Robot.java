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

public class Robot extends AppCompatActivity {
    Button rulerobot,registerrobot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rulerobot=(Button)findViewById(R.id.rulerobot);
        registerrobot=(Button)findViewById(R.id.Registerrobot);
        rulerobot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(Robot.this,RobotRules.class);
                startActivity(i);

            }



        });

    }
    public void browserrobot(View view)
    {
        Intent browserrobotIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdnAaxbUdlDIyUzyORXuDz0kjR5HxWvkh6gfHo1iCfe14QhhA/viewform"));
        startActivity(browserrobotIntent);
    }

}
