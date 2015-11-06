package presidents.cglazer.cglazerpresidents;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by student1 on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity {
    //we need an intent to load detail activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        President presidents[] = (President[]) getIntent().getSerializableExtra("PRESIDENTS");
        PresidentPagerAdapter adapter = new PresidentPagerAdapter(presidents);
        //0 is the default value
        int position = getIntent().getIntExtra("POSITION", 0);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(position);
    }
}
