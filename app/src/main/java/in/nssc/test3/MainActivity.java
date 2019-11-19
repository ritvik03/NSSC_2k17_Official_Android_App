package in.nssc.test3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,View.OnClickListener {
    ViewFlipper viewFlipper2;
    NavigationView navigationView = null;
    Toolbar toolbar = null;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set fragment initially
        Toolbar toolbar2 = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar2);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar2, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(actionBarDrawerToggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        actionBarDrawerToggle.syncState();
    }

    private void replacefab_home(View view) {
        Intent toAct2 = new Intent(this,MainActivity2.class);
        startActivity(toAct2);
    }

    public static Intent openFacebook(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("fb://page/540259992686603"));
        } catch (Exception e){

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/nssc.iit"));
        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_home)
        //open Home
        {

        }else if (id == R.id.nav_camera) {
            // Open About Us
            Intent toAboutUs = new Intent(this,AboutUs.class);
            startActivity(toAboutUs);
        } else if (id == R.id.nav_gallery) {
            //open Events
            Intent toEvents = new Intent(this,Events2.class);
            startActivity(toEvents);

        }  else if (id == R.id.nav_contact) {
            //open Contacts
            Intent toContacts = new Intent(this,Contacts.class);
            startActivity(toContacts);

        } else if (id == R.id.nav_slideshow) {
            //Open guest talks
            Intent toGuestLec = new Intent(this,GuestLectures.class);
            startActivity(toGuestLec);

        } else if (id == R.id.nav_manage) {
            //open workshops
            Intent toWorkshops = new Intent(this,Workshops.class);
            startActivity(toWorkshops);

        } else if (id == R.id.directions) {
            //open workshops
            Intent toDirections = new Intent(this,Directions.class);
            startActivity(toDirections);

        }else if (id == R.id.nav_share) {
            //open website
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.nssc.in"));
            startActivity(browserIntent);

        }  else if (id == R.id.fb) {
            //open fb page
            Intent facebookIntent = openFacebook(MainActivity.this);
            startActivity(facebookIntent);

        }else if (id == R.id.youtube) {
            //open youtube
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String urlStr = "https://www.youtube.com/channel/UChnpOiISqo7ea5yuGc2ghXQ?sub_confirmation=1";
            intent.setData(Uri.parse(urlStr));
            startActivity(intent);

        }else if (id == R.id.insta) {
            //open instagram
            Uri uri = Uri.parse("https://www.instagram.com/_u/spacetech4u");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.instagram.android");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/spacetech4u/")));
            }

        }else if(id == R.id.twitter){

            try {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("twitter://user?screen_name=@SpaceTech4U"));
                startActivity(intent);

            }catch (Exception e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/#!/@SpaceTech4U")));
            }

        } else if (id == R.id.nav_send) {
            Intent toDev = new Intent(this,Developer.class);
            startActivity(toDev);
        }else if (id == R.id.exhibition) {
            Intent toDev = new Intent(this,Exhibition.class);
            startActivity(toDev);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void displaySelectedScreen(int id){
        Fragment fragment = null;

        switch(id){

        }
    }


    public void fab_home(View view) {
        Intent toabout_us_fab= new Intent(this,AboutUs.class);
        startActivity(toabout_us_fab);
    }

    public void gotoGuest(View view) {
        Intent gotogsttalk= new Intent(this,GuestLectures.class);
        startActivity(gotogsttalk);
    }

    public void gotoEve(View view) {
        Intent gotoeven= new Intent(this,Events2.class);
        startActivity(gotoeven);
    }

    @Override
    public void onClick(View v) {
        viewFlipper2.startFlipping();
        viewFlipper2.setFlipInterval(3000);
    }

    public void gotoWork(View view) {
        Intent gotoworkshop_fromicon= new Intent(this,Workshops.class);
        startActivity(gotoworkshop_fromicon);
    }

    public void gotoDir(View view) {
        Intent gotoDire = new Intent(this,Directions.class);
        startActivity(gotoDire);
    }

    public void gotoSch(View view) {
        Intent gotoSche= new Intent(this,Schedule.class);
        startActivity(gotoSche);
    }

    public void gotoContacts(View view) {
        Intent gotoCont= new Intent(this,Contacts.class);
        startActivity(gotoCont);
    }

    public void register_page(View view) {
        Intent register = new Intent(Intent.ACTION_VIEW, Uri.parse("http://nssc.in/register/"));
        startActivity(register);
    }

    public void toExhibition2(View view) {
        Intent toexh = new Intent(this,Exhibition.class);
        startActivity(toexh);
    }
}
