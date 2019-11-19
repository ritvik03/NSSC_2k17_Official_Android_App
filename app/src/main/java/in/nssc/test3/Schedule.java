package in.nssc.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
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
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                gotoHomefromSch(view);
            }
        });
    }


    public void gotoHomefromSch(View view) {
        Intent gotoHomefrmSch= new Intent(this,MainActivity.class);
        startActivity(gotoHomefrmSch);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public void toExhibition(View view) {
        Intent toEx = new Intent(this,Exhibition.class);
        startActivity(toEx);
    }

    public void toHome(View view) {
        Intent toHm = new Intent(this,MainActivity.class);
        startActivity(toHm);
    }

    public void toGl(View view) {
        Intent toGuestl = new Intent(this,GuestLectures.class);
        startActivity(toGuestl);
    }

    public void toWorksho(View view) {
        Intent towoe = new Intent(this,Workshops.class);
        startActivity(towoe);

    }

    public void topp(View view) {
        Intent toppr = new Intent(this,PaperPresentation.class);
        startActivity(toppr);
    }

    public void toLift(View view) {
        Intent toli = new Intent(this,LiftOff.class);
        startActivity(toli);
    }

    public void toCol(View view) {
        Intent tocol = new Intent(this,Colonizer.class);
        startActivity(tocol);
    }

    public void toHove(View view) {
        Intent tohover = new Intent(this,Hoverpod.class);
        startActivity(tohover);
    }

    public void toFir(View view) {
        Intent tofiro = new Intent(this,Firocious.class);
        startActivity(tofiro);
    }

    public void toMag(View view) {
        Intent tomagn = new Intent(this,Magneteer.class);
        startActivity(tomagn);
    }

    public void toDes(View view) {
        Intent todes = new Intent(this,CAD.class);
        startActivity(todes);
    }

    public void toBrai(View view) {
        Intent totenb = new Intent(this,BraitenbergChallenge.class);
        startActivity(totenb);
    }

    public void toCase(View view) {
        Intent tocase = new Intent(this,CaseStudy.class);
        startActivity(tocase);
    }

    public void toEve(View view) {
        Intent toeve = new Intent(this,Events2.class);
        startActivity(toeve);
    }

    public void toQuiz(View view) {
        Intent toQui = new Intent(this,Quiz.class);
        startActivity(toQui);
    }
}
