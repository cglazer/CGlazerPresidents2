package presidents.cglazer.cglazerpresidents;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by student1 on 10/29/2015.
 */
public class PresidentPagerAdapter extends PagerAdapter {

    private President[] presidents;

    public PresidentPagerAdapter(President[] presidents) {
        this.presidents = presidents;
    }

    /**
     * @return the number of presidents
     */
    @Override
    public int getCount() {
        return presidents.length;
    }

    /**
     * @return professor unsure
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    /**
     * will create a page
     * we want to display presidents data
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //layout inflator reads xml and gives you views
        LayoutInflater inflater = LayoutInflater.from(container.getContext());
        View view = inflater.inflate(R.layout.president_pager_item, null);
        TextView number = (TextView) view.findViewById(R.id.number);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView birthYear = (TextView) view.findViewById(R.id.birth_year);
        TextView deathYear = (TextView) view.findViewById(R.id.death_year);
        TextView tookOffice = (TextView) view.findViewById(R.id.took_office);
        TextView leftOffice = (TextView) view.findViewById(R.id.left_office);
        TextView party = (TextView) view.findViewById(R.id.party);
        //position is the position in the array
        President president = presidents[position];
        name.setText(president.getPresident());
        number.append("Number President: ");
        number.append(String.valueOf(president.getNumber()));
        birthYear.append("Birth Year: ");
        birthYear.append(String.valueOf(president.getBirthYear()));
        deathYear.append("Death Year: ");
        if (president.getDeathYear() > 0) {
            deathYear.append(String.valueOf(president.getDeathYear()));
        }
        tookOffice.append("Took Office: ");
        tookOffice.append(president.getTookOffice());
        leftOffice.append("Left Office: ");
        if (president.getLeftOffice() != null) {
            leftOffice.append(president.getLeftOffice());
        }
        party.append("Party: ");
        party.append(president.getParty());
        container.addView(view);
        return view;
    }
}
