package in.nssc.test3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
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
                Toast.makeText(Developer.this,
                        "Ritvik Pandey", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void MailtoDev(View view) {
        String email_eve3 = "ritvik.nssc@gmail.com";
        String subject_eve3 = "A bug in NSSC App";
        String body_eve3 = "Kindly include screenshot in the mail. ";
        String chooserTitle_eve3 = "Mail to Developer";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public static Intent ritvikFb1(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100012362144382"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ritvik.pandey.03"));
        }
    }

    public void mail_ritvik(View view) {
        String email_pub = "ritvik.nssc@gmail.com";
        String subject_pub = "NSSC App - NSSC 2k17";
        String body_pub = "-Kindly include screenshot in case of reporting a bug ";
        String chooserTitle_pub = "Mail to Developer";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_pub));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_pub);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_pub);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void ritvikFb(View view) {
        Intent ritvik_fb1= ritvikFb1(Developer.this);
        startActivity(ritvik_fb1);
    }
}
