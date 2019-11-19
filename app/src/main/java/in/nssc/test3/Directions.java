package in.nssc.test3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Directions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directions);
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
                gotohome_dir(view);
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public void maptoVikramshila(View view) {
        String address1 = "22.315945,87.311089" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent tovikram = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(tovikram);
    }
    public void gotohome_dir(View view){
        Intent gotohome_directions = new Intent(this,MainActivity.class);
        startActivity(gotohome_directions);
    }

    public void maptoGymkhana(View view) {
        String address1 = "22.318731,87.302530" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoLBS(View view) {
        String address1 = "22.318731,87.302530" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoMS(View view) {
        String address1 = "22.321734,87.304875" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoCCD(View view) {
        String address1 = "22.319323,87.305815" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoTikka(View view) {
        String address1 = "22.316850, 87.307271" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoMainBuilding(View view) {
        String address1 = "22.319728, 87.310004" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoTechM(View view) {
        String address1 = "22.314584, 87.300215" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoHeritage(View view) {
        String address1 = "22.319167, 87.305826" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoDream(View view) {
        String address1 = "22.313798, 87.305801" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoSubway(View view) {
        String address1 = "22.315624, 87.316887" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoPan(View view) {
        String address1 = "22.319412, 87.300021" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoIosys(View view) {
        String address1 = "22.319650, 87.303963" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoFCity(View view) {
        String address1 = "22.321051, 87.307337" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoSuper(View view) {
        String address1 = "22.315828, 87.29878" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoVeg(View view) {
        String address1 = "22.319168, 87.304938" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoGPark(View view) {
        String address1 = "22.317319, 87.302127" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoBillo(View view) {
        String address1 = "22.320808, 87.305848" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoBask(View view) {
        String address1 = "22.319122, 87.305732" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoNehru(View view) {
        String address1 = "22.319504, 87.315463" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void toKali(View view) {
        String address1 = "22.316468, 87.310544" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoTata(View view) {
        String address1 = "22.315656, 87.308758" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoBRH(View view) {
        String address1 = "22.316654, 87.295713" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoMMM(View view) {
        String address1 = "22.321571, 87.301233" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoVS(View view) {
        String address1 = "22.320349, 87.304792" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoAzad(View view) {
        String address1 = "22.318514, 87.298701" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoHJB(View view) {
        String address1 = "22.320570, 87.302266" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }

    public void maptoVSRC(View view) {
        String address1 = "22.308976, 87.31" ;
        String url = "http://maps.google.com/maps?daddr="+address1;
        Intent topoint = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
        startActivity(topoint);
    }
}
