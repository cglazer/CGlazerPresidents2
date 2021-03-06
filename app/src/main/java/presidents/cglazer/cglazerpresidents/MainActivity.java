package presidents.cglazer.cglazerpresidents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements OnPresidentSelectedListener {

    private PresidentListFragment listFragment;
    private PresidentDetailFragment detailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        this.listFragment = (PresidentListFragment) manager.findFragmentById(R.id.presidentListFragment);
        this.detailFragment = (PresidentDetailFragment) manager.findFragmentById(R.id.detailfragment);
    }

    @Override
    public void onSelect(President[] presidents, int position) {
        if(detailFragment != null){
            detailFragment.showPresidentDetail(presidents, position);
        }else{
            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("PRESIDENTS", presidents);
            intent.putExtra("POSITION", position);
            this.startActivity(intent);
        }
    }
}
