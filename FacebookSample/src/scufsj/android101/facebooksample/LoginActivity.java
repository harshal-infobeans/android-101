package scufsj.android101.facebooksample;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;

import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.widget.UserSettingsFragment;

public class LoginActivity extends FragmentActivity {

    private UserSettingsFragment userSettingsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // TODO: get key hashes
        // try {
        // PackageInfo info =
        // getPackageManager().getPackageInfo("scufsj.android101.facebooksample",
        // PackageManager.GET_SIGNATURES);
        //
        // for (Signature signature : info.signatures) {
        // MessageDigest md = MessageDigest.getInstance("SHA");
        // md.update(signature.toByteArray());
        // Log.e("KeyHash:", Base64.encodeToString(md.digest(),
        // Base64.DEFAULT));
        // }
        // } catch (NameNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // } catch (NoSuchAlgorithmException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        FragmentManager fragmentManager = getSupportFragmentManager();
        userSettingsFragment = (UserSettingsFragment) fragmentManager.findFragmentById(R.id.login_fragment);
        userSettingsFragment.setSessionStatusCallback(new Session.StatusCallback() {
            @Override
            public void call(Session session, SessionState state, Exception exception) {
                Log.d("LoginActivity", String.format("New session state: %s", state.toString()));
                if (session.isOpened()) {
                    // TODO: call friends list activity

                    // Ex: make request to the /me API
                    // Request.executeMeRequestAsync(session, new
                    // Request.GraphUserCallback() {
                    //
                    // // callback after Graph API response
                    // // with user object
                    // @Override
                    // public void onCompleted(GraphUser user, Response
                    // response) {
                    // if (user != null) {
                    // Log.d("LoginActivity", "Hello " + user.getName() + "!");
                    // }
                    // }
                    // });
                }
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        userSettingsFragment.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

}
