package com.example.chris.starsign_fragments_working;


import android.os.Bundle;
import android.app.ListFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class StarSignList extends ListFragment {


    public StarSignList() {
        // Required empty public constructor
    }

    static interface StarSignListListener {
        void itemClicked(long id);
    };

    private StarSignListListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] names = new String[StarSign.starSigns.length];
        for (int i= 0; i < names.length; i++) {
            names[i] = StarSign.starSigns[i].getName();
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1,names);
        setListAdapter(adapter);

        // Inflate the layout for this fragment
         //return inflater.inflate(R.layout.fragment_star_sign_list, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (StarSignListListener)activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null) {
            listener.itemClicked(id);
        }
    }

}
