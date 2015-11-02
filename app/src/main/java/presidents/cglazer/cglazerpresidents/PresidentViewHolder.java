package presidents.cglazer.cglazerpresidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Chaya Glazer on 10/23/2015.
 */

public class PresidentViewHolder extends RecyclerView.ViewHolder {

    private TextView name;

    //itemView = president_list_item xml file
    public PresidentViewHolder(View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
    }


    public void bind(President president) {

        name.setText(president.getPresident());
    }
}
