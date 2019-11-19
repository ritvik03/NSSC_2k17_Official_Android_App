package in.nssc.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Workshops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshops);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "National Student\'s Space Challenge", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                toHomefromWork(view);
            }
        });
    }

    public void toHomefromWork(View view) {
        Intent toHomefrmwrk= new Intent(this,MainActivity.class);
        startActivity(toHomefrmwrk);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public void Work_RC(View view) {
        Intent toRC = new Intent(this,RC.class);
        startActivity(toRC);
    }

    public void Work_Botix(View view) {
        Intent toBot = new Intent(this,Bot.class);
        startActivity(toBot);
    }

    public void Work_GWave(View view) {
        Intent toGW = new Intent(this,GW.class);
        startActivity(toGW);
    }

    public void Work_Ballooning(View view) {
        Intent toBaloon = new Intent(this,Ballooning.class);
        startActivity(toBaloon);
    }
}
