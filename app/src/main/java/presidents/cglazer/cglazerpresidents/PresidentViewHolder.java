package presidents.cglazer.cglazerpresidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */

public class PresidentViewHolder extends RecyclerView.ViewHolder {
    //much better than find veiw by id
    //we added this annotation instead of the code commented below
    //we do @Binds once for each variable
    @Bind(R.id.name)
    TextView name;

    //itemView = president_list_item xml file
    public PresidentViewHolder(View itemView) {
        super(itemView);
        //this we only do once
        ButterKnife.bind(this, itemView); //added this name
        // name = (TextView) itemView.findViewById(R.id.name);
    }


    public void bind(President president) {

        name.setText(president.getPresident());
    }
}
