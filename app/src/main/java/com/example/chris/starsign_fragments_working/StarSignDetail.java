package com.example.chris.starsign_fragments_working;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StarSignDetail extends Fragment {
    private long starSignId;


    public StarSignDetail() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            starSignId = savedInstanceState.getLong("starSignId");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_star_sign_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            StarSign starSign = StarSign.starSigns[(int) starSignId];
            title.setText(starSign.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(starSign.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("startSignId", starSignId);
    }

    public void setStarSign(long id){
        this.starSignId = id;
    }
}
