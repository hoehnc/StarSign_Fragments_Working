package com.example.chris.starsign_fragments_working;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
        implements StarSignList.StarSignListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        StarSignDetail frag = (StarSignDetail) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setStarSign(1);
        */
    }

    @Override
    public void itemClicked(long id) {
        // Do things
        View fragmentContainer = findViewById(R.id.fragment_container);
        if (fragmentContainer != null) {
            StarSignDetail detail = new StarSignDetail();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            detail.setStarSign(id);
            ft.replace(R.id.fragment_container, detail);
            ft.addToBackStack(null);
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        } else {
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra(DetailActivity.EXTRA_STARSIGN_ID, (int)id);
            startActivity(intent);
        }
    }
}
