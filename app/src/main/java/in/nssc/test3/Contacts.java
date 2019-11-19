package in.nssc.test3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class Contacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
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
                gotoHome(view);
            }
        });
    }

    public void mail_nikhil(View view) {
        String email_nikhil = "nikhil@nssc.in";
        String subject_nikhil = "<enter subject> - NSSC 2k17";
        String body_nikhil = "- Kindly include your contact number in the mail ";
        String chooserTitle_nikhil = "Mail to Governor NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_nikhil));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_nikhil);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_nikhil);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }
    public static Intent nikhil_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000841881872"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nikhil.mannan.1"));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }

    public static Intent charan_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100005169186728"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/charan.koushik.3"));
        }
    }
    public static Intent pub_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100009529705986"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pratu3"));
        }
    }
    public static Intent pub2_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000871722562"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/ayush.mohanty.77"));
        }
    }
    public static Intent des_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002335537222"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/yash.wantassel.7"));
        }
    }
    public static Intent eve1_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001713301543"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rohan.sewani"));
        }
    }
    public static Intent eve3_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002076589490"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/akashgholapchem.sci?ref=br_rs"));
        }
    }
    public static Intent eve2_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100005834141295"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100005834141295"));
        }
    }
    public static Intent spon_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002135392608"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/aastha.gg.iitkgp"));
        }
    }
    public static Intent spon2_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100000624661807"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sourabh61"));
        }
    }
    public static Intent work_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100002354944759"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/onkar.vakhare"));
        }
    }
    public static Intent gue_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100001977061479"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/siddhant.physics"));
        }
    }
    public static Intent web_fb_func(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/100003109084622"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/raj.banoudha.1"));
        }
    }

    public void gov_fb(View view) {
        Intent nikhil_fb= nikhil_fb_func(Contacts.this);
        startActivity(nikhil_fb);
    }

    public void mail_charan(View view) {
        String email_charan = "charan@nssc.in";
        String subject_charan = "<enter subject> - NSSC 2k17";
        String body_charan = "- Kindly include your contact number in the mail. ";
        String chooserTitle_charan = "Mail to Finance Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_charan));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_charan);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_charan);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void fin_fb(View view) {
        Intent charan_fb1= charan_fb_func(Contacts.this);
        startActivity(charan_fb1);
    }

    public void mail_pub(View view) {
        String email_pub = "pratiksha@nssc.in";
        String subject_pub = "<enter subject> - NSSC 2k17";
        String body_pub = "- Kindly include your contact number in the mail. ";
        String chooserTitle_pub = "Mail to Publicity Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_pub));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_pub);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_pub);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void pub_fb(View view) {
        Intent pub_fb1= pub_fb_func(Contacts.this);
        startActivity(pub_fb1);
    }

    public void mail_pub2(View view) {
        String email_pub2 = "ayushmohanty@nssc.in";
        String subject_pub2 = "<enter subject> - NSSC 2k17";
        String body_pub2 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_pub2 = "Mail to Publicity Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_pub2));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_pub2);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_pub2);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void pub_fb2(View view) {
        Intent pub_fb2= pub2_fb_func(Contacts.this);
        startActivity(pub_fb2);
    }

    public void mail_des(View view) {
        String email_des = "yash@nssc.in";
        String subject_des = "<enter subject> - NSSC 2k17";
        String body_des = "- Kindly include your contact number in the mail. ";
        String chooserTitle_pub2 = "Mail to Design Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_des));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_des);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_des);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void des_fb(View view) {
        Intent des_fb= des_fb_func(Contacts.this);
        startActivity(des_fb);
    }

    public void mail_eve1(View view) {
        String email_eve1 = "rohan@nssc.in";
        String subject_eve1 = "<enter subject> - NSSC 2k17";
        String body_eve1 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve1 = "Mail to Event Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve1));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve1);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve1);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void eve1_fb(View view) {
        Intent eve1_fb= eve1_fb_func(Contacts.this);
        startActivity(eve1_fb);
    }

    public void mail_eve2(View view) {
        String email_eve2 = "atul@nssc.in";
        String subject_eve2 = "<enter subject> - NSSC 2k17";
        String body_eve2 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve2 = "Mail to Event Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve2));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve2);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve2);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void mail_eve3(View view) {
        String email_eve3 = "akash@nssc.in";
        String subject_eve3 = "<enter subject> - NSSC 2k17";
        String body_eve3 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve3 = "Mail to Event Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void eve3_fb(View view) {
        Intent eve3_fb= eve3_fb_func(Contacts.this);
        startActivity(eve3_fb);
    }

    public void eve2_fb(View view) {
        Intent eve2_fb= eve2_fb_func(Contacts.this);
        startActivity(eve2_fb);
    }

    public void mail_spon(View view) {
        String email_eve3 = "aastha@nssc.in";
        String subject_eve3 = "<enter subject> - NSSC 2k17";
        String body_eve3 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve3 = "Mail to Sponsorship Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void spon_fb(View view) {
        Intent spon_fb= spon_fb_func(Contacts.this);
        startActivity(spon_fb);
    }

    public void mail_spon2(View view) {
        String email_eve3 = "sourabh@nssc.in";
        String subject_eve3 = "<enter subject> - NSSC 2k17";
        String body_eve3 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve3 = "Mail to Sponsorship Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void spon2_fb(View view) {
        Intent spon2_fb= spon2_fb_func(Contacts.this);
        startActivity(spon2_fb);
    }

    public void mail_work(View view) {
        String email_eve3 = "onkar@nssc.in";
        String subject_eve3 = "<enter subject> - NSSC 2k17";
        String body_eve3 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve3 = "Mail to Workshop Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void work_fb(View view) {
        Intent work_fb= work_fb_func(Contacts.this);
        startActivity(work_fb);

    }

    public void mail_gue(View view) {
        String email_eve3 = "siddhant@nssc.in";
        String subject_eve3 = "<enter subject> - NSSC 2k17";
        String body_eve3 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve3 = "Mail to Guest Lecture Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void gue_fb(View view) {
        Intent gue_fb= gue_fb_func(Contacts.this);
        startActivity(gue_fb);
    }

    public void mail_web(View view) {
        String email_eve3 = "raj@nssc.in";
        String subject_eve3 = "<enter subject> - NSSC 2k17";
        String body_eve3 = "- Kindly include your contact number in the mail. ";
        String chooserTitle_eve3 = "Mail to Finance Head NSSC 2k17";
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email_eve3));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject_eve3);
        emailIntent.putExtra(Intent.EXTRA_TEXT, body_eve3);
//emailIntent.putExtra(Intent.EXTRA_HTML_TEXT, body); //If you are using HTML in your body text

        startActivity(Intent.createChooser(emailIntent, "Chooser Title"));
    }

    public void web_fb(View view) {
        Intent web_fb= web_fb_func(Contacts.this);
        startActivity(web_fb);
    }

    public void gotoHome(View view) {
        Intent gotohome_contacts= new Intent(this,MainActivity.class);
        startActivity(gotohome_contacts);
    }
}
