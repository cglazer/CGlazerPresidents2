package presidents.cglazer.cglazerpresidents;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewParent;

/**
 * Created by student1 on 10/29/2015.
 */
public class DetailActivity extends AppCompatActivity{
    //we need an intent to load detail activity



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ViewPager viewPager= (ViewPager) findViewById(R.id.viewPager);

        PresidentPagerAdapter adapter= new PresidentPagerAdapter(MainActivity.presidents);
        viewPager.setAdapter(adapter);

    }
}
