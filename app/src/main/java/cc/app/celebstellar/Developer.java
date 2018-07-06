package cc.app.celebstellar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by lenovo on 1/19/2018.
 */

public class Developer extends Fragment implements View.OnClickListener {

        View rootView;
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (rootView == null) {
                rootView = inflater.inflate(R.layout.develop, container, false);
            }

        Button linkedinswara = (Button) rootView.findViewById(R.id.linkedinswara);
        Button linkedinshara = (Button) rootView.findViewById(R.id.linkedinshara);
        Button instashara = (Button) rootView.findViewById(R.id.instashara);
        Button instaswara = (Button) rootView.findViewById(R.id.instaswara);
        Button fbshara = (Button) rootView.findViewById(R.id.fbshara);
        Button fbswara = (Button) rootView.findViewById(R.id.fbswara);

        linkedinshara.setOnClickListener(this);
        linkedinswara.setOnClickListener(this);
        instashara.setOnClickListener(this);
        instaswara.setOnClickListener(this);
        fbshara.setOnClickListener(this);
        fbswara.setOnClickListener(this);

        return rootView;
    }


    @Override
    public void onClick(View v) {
        int viedId = v.getId();
        switch (viedId) {
            case R.id.linkedinshara:
                Intent browserlinkedinsharaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sharayu-suryawanshi-bb7095145"));
                startActivity(browserlinkedinsharaIntent);
                //your implementation here
                break;
            case R.id.linkedinswara:
                Intent browserlinkedinswaraIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/swaranjali-raskar-855115147"));
                startActivity(browserlinkedinswaraIntent);
                //your implementation here
                break;
            case R.id.instashara:
                Intent browserinstasharaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/sharayu_suryawanshi/"));
                startActivity(browserinstasharaIntent);
                //your implementation here
                break;
            case R.id.instaswara:
                Intent browserinstainswaraIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/swararaskar/"));
                startActivity(browserinstainswaraIntent);
                //your implementation here
                break;
            case R.id.fbshara:
                Intent browserfbsharaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sharayu.suryawanshi.927"));
                startActivity(browserfbsharaIntent);
                //your implementation here
                break;
            case R.id.fbswara:
                Intent browserfbswaraIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/swaranjaliraskar"));
                startActivity(browserfbswaraIntent);
                //your implementation here
                break;


        }
    }
}
