package com.example.chris.starsign_fragments_working;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetailActivity extends FragmentActivity {
    public static final String EXTRA_STARSIGN_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        StarSignDetail starSignDetail = (StarSignDetail)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int starSignID = (int) getIntent().getExtras().get(EXTRA_STARSIGN_ID);
        starSignDetail.setStarSign(starSignID);
    }
}
