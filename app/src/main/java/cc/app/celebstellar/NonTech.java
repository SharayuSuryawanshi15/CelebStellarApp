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

public class NonTech extends Fragment implements View.OnClickListener {

    View rootView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(rootView == null) {
            rootView = inflater.inflate(R.layout.nontech, container, false);
        }
        //getActivity().setTitle("NonTechnical Events");

        ImageButton ib =(ImageButton)rootView.findViewById(R.id.best);
        ImageButton ibt =(ImageButton)rootView.findViewById(R.id.tre);
        ImageButton ibb =(ImageButton)rootView.findViewById(R.id.bolly);
        ImageButton ibr =(ImageButton)rootView.findViewById(R.id.rangoli1);
        ImageButton ibe =(ImageButton)rootView.findViewById(R.id.ex);
        ImageButton ibs =(ImageButton)rootView.findViewById(R.id.shirt);
        ImageButton ibm =(ImageButton)rootView.findViewById(R.id.mad);
        ImageButton ibl =(ImageButton)rootView.findViewById(R.id.logo);

        ib.setOnClickListener(this);
        ibt.setOnClickListener(this);
        ibb.setOnClickListener(this);
        ibr.setOnClickListener(this);
        ibe.setOnClickListener(this);
        ibs.setOnClickListener(this);
        ibm.setOnClickListener(this);
        ibl.setOnClickListener(this);

     /*   ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Best.class)) ;
            }
        });*/
        return rootView;
    }

    @Override
    public void onClick(View v) {
// TODO Auto-generated method stub
        int viedId = v.getId();
        switch (viedId) {
            case R.id.best:
                startActivity(new Intent(getActivity(), Best.class));
                //your implementation here
                break;
            case R.id.tre:
                startActivity(new Intent(getActivity(), Tres.class));
                //your implementation here
                break;
            case R.id.bolly:
                startActivity(new Intent(getActivity(), Bolly.class));
                //your implementation here
                break;
            case R.id.rangoli1:
                startActivity(new Intent(getActivity(), Rangoli.class));
                //your implementation here
                break;
            case R.id.ex:
                startActivity(new Intent(getActivity(), Extempo.class));
                //your implementation here
                break;
            case R.id.shirt:
                startActivity(new Intent(getActivity(), Shirt.class));
                //your implementation here
                break;
            case R.id.mad:
                startActivity(new Intent(getActivity(), Mad.class));
                //your implementation here
                break;
            case R.id.logo:
                startActivity(new Intent(getActivity(), Logog.class));
                //your implementation here
                break;


        }
    }
}
