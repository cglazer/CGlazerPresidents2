package presidents.cglazer.cglazerpresidents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by student1 on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity {
    //we need an intent to load detail activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        PresidentDetailFragment fragment = (PresidentDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detailfragment);
        Intent intent = getIntent();
        President[] presidents = (President[]) intent.getSerializableExtra("PRESIDENTS");
        int position = intent.getIntExtra("POSITION", 0);
        fragment.showPresidentDetail(presidents, position);


    }
}
