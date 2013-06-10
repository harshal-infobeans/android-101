package scufsj.android101.lifecyclesample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class SampleLifecycleFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayMessage("onCreate");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        displayMessage("onActivityCreated");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        displayMessage("onAttach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sample_fragment, container, false);
        displayMessage("onCreateView");
        return v;
    }

    @Override
    public void onPause() {
        super.onPause();
        displayMessage("onPause");
    }

    @Override
    public void onResume() {
        super.onResume();
        displayMessage("onResume");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        displayMessage("onSaveInstanceState");
    }

    @Override
    public void onStart() {
        super.onStart();
        displayMessage("onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        displayMessage("onStop");
    }

    private void displayMessage(String message) {
        Log.i("SampleLifecycleFragment", message);
        Toast.makeText(getActivity().getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}
