package cc.app.celebstellar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * Created by lenovo on 1/19/2018.
 */

public class Tech extends Fragment implements View.OnClickListener {



        View rootView;
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (rootView == null) {
                rootView = inflater.inflate(R.layout.tech, container, false);
            }




        ImageButton ibb =(ImageButton)rootView.findViewById(R.id.blind);
        ImageButton ibr =(ImageButton)rootView.findViewById(R.id.robot);
        ImageButton ibp =(ImageButton)rootView.findViewById(R.id.poster);
        ImageButton ibc =(ImageButton)rootView.findViewById(R.id.ccpp);
        ImageButton ibd =(ImageButton)rootView.findViewById(R.id.dd);
        ImageButton iba =(ImageButton)rootView.findViewById(R.id.aad);
        ImageButton ibt =(ImageButton)rootView.findViewById(R.id.tecq);
        ImageButton ibe =(ImageButton)rootView.findViewById(R.id.pp);
        //getActivity().setTitle("NonTechnical Events");

        ibb.setOnClickListener(this);
        ibr.setOnClickListener(this);
        ibp.setOnClickListener(this);
        ibc.setOnClickListener(this);
        ibd.setOnClickListener(this);
        iba.setOnClickListener(this);
        ibt.setOnClickListener(this);
        ibe.setOnClickListener(this);

        return rootView;
    }

    public void onClick(View v) {
// TODO Auto-generated method stub
        int viedId = v.getId();
        switch (viedId) {
            case R.id.blind:
                startActivity(new Intent(getActivity(), Blind.class));
                //your implementation here
                break;
            case R.id.robot:
                startActivity(new Intent(getActivity(), Robot.class));
                //your implementation here
                break;
            case R.id.poster:
                startActivity(new Intent(getActivity(), Poster.class));
                //your implementation here
                break;
            case R.id.ccpp:
                startActivity(new Intent(getActivity(), C_Cpp.class));
                //your implementation here
                break;
            case R.id.dd:
                startActivity(new Intent(getActivity(), Digital.class));
                //your implementation here
                break;
            case R.id.aad:
                startActivity(new Intent(getActivity(), Android_D.class));
                //your implementation here
                break;
            case R.id.tecq:
                startActivity(new Intent(getActivity(), Tech_Q.class));
                //your implementation here
                break;
            case R.id.pp:
                startActivity(new Intent(getActivity(), Paper.class));
                //your implementation here
                break;


        }
    }
}
