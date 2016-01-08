package presidents.cglazer.cglazerpresidents;

import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by student1 on 1/7/2016.
 */
public class PresidentDetailViewHolder {
   //once we do this we can g
    @Bind(R.id.name)
    TextView name;
    @Bind(R.id.number)
    TextView number;

    public PresidentDetailViewHolder(View itemView, President president){
        ButterKnife.bind(this, itemView);
        name.setText(president.getPresident());
        number.setText(String.valueOf(president.getNumber()));
    }
}
