package scufsj.android101.lifecyclesample;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        displayMessage("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        displayMessage("onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        displayMessage("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        displayMessage("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        displayMessage("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        displayMessage("onStop");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void displayMessage(String message) {
        Log.i("ActivityLifecycles", message);
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}
