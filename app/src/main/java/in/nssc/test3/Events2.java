package in.nssc.test3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Events2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events2);
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
                gotohome_eve(view);
            }
        });
    }
    public void openMagneteer2(View view){
        Intent toMagneteer = new Intent(this,Magneteer.class);
        startActivity(toMagneteer);
    }
    public void openColoniser2(View view){
        Intent toColoniser = new Intent(this,Colonizer.class);
        startActivity(toColoniser);
    }
    public void openFirocious2(View view) {
        Intent toFirocious = new Intent(this, Firocious.class);
        startActivity(toFirocious);
    }
    public void openSpaceDeb2(View view) {
        Intent toSpaceDeb = new Intent(this, SpaceDebate.class);
        startActivity(toSpaceDeb);
    }
    public void openHov2(View view) {
        Intent toHoverpod = new Intent(this, Hoverpod.class);
        startActivity(toHoverpod);
    }


    public void openCAD2(View view) {
        Intent toCAD = new Intent(this,CAD.class);
        startActivity(toCAD);
    }

    public void openTshirt2(View view) {
        Intent toshirtD=new Intent(this,TshirtDesigning.class);
        startActivity(toshirtD);
    }

    public void openCase2(View view) {
        Intent toCase= new Intent(this,CaseStudy.class);
        startActivity(toCase);
    }

    public void openQuiz2(View view) {
        Intent toQuiz = new Intent(this,Quiz.class);
        startActivity(toQuiz);
    }

    public void openPP2(View view) {
        Intent toPP= new Intent(this,PaperPresentation.class);
        startActivity(toPP);
    }

    public void openBC2(View view) {
        Intent toBC = new Intent(this,BraitenbergChallenge.class);
        startActivity(toBC);
    }
    public void gotohome_eve(View view){
        Intent gotohome_events = new Intent(this,MainActivity.class);
        startActivity(gotohome_events);
    }

    public void openLift(View view) {
        Intent toLift = new Intent(this,LiftOff.class);
        startActivity(toLift);
    }

    public void openAstro(View view) {
        Intent toAstro = new Intent(this,AstroPhotography.class);
        startActivity(toAstro);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}
