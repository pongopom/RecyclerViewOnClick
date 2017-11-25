package com.example.android.recyclerviewonclick;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by peterpomlett on 25/11/2017.
 */

public class PersonRecyclerViewAdapter extends RecyclerView.Adapter<PersonRecyclerViewAdapter.PersonViewHolder> {

    private Person[] dataSource;

    //TODO: POINT.3 In the Adapter class create a final private variable to hold ListItemClickListener call it listItemClickListener (DONE)
    private final ListItemClickListener listItemClickListener;

    //TODO: POINT.4 In the Adapter classes constructor add a parameter to pass in ListItemClickListener and set listItemClickListener to it. (DONE)
    public PersonRecyclerViewAdapter(Person[] dataSource, ListItemClickListener listItemClickListener) {
        this.dataSource = dataSource;
        this.listItemClickListener = listItemClickListener;
    }

    // UNUSED uncomment it you need to refresh recyclerView data
  /*  public void setDataSource(Person[] dataSource) {
        this.dataSource = dataSource;
        notifyDataSetChanged();
    }*/

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        return new PersonViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        if (dataSource == null) {
            return 0;
        }
        return dataSource.length;
    }

    //TODO: POINT.1 In the Adapter class create an interface call it ListItemClickListener (DONE)
    public interface ListItemClickListener {
        //TODO: POINT.2 Add a method to the ListItemClickListener interface call it onListItemClick with a parameter type of what ever object you want to pass back to the activity that is in your DataSource. (DONE)
        public void onListItemClick(Person person);
    }

    //TODO: POINT.5 Make the viewHolder class implement view.OnClickListener (DONE)
    public class PersonViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView firstNameTextView;
        TextView secondNameTextView;
        TextView favoriteProgramingLanguage;

        public PersonViewHolder(View itemView) {
            super(itemView);
            firstNameTextView = (TextView) itemView.findViewById(R.id.rvi_tv_first_name);
            secondNameTextView = (TextView) itemView.findViewById(R.id.rvi_tv_second_name);
            favoriteProgramingLanguage = (TextView) itemView.findViewById(R.id.rvi_programing_language);
            //TODO: POINT.6 In the viewHolders constructor setOnClickListener(this) on the view past in (DONE)
            itemView.setOnClickListener(this);
        }


        public void bind(int listIndex) {
            Person person = dataSource[listIndex];
            firstNameTextView.setText(person.getFirstName());
            secondNameTextView.setText(person.getSecondName());
            favoriteProgramingLanguage.setText(person.getFavoriteProgramingLanguage());
        }

        //TODO: POINT.7 In theViewHolder class override the onClick method (DONE)
        @Override
        public void onClick(View view) {
            //TODO: POINT.8 In the onClick method use getAdapterPosition() to get the object at that position in your DataSource (DONE)
            int position = getAdapterPosition();
            Person person = dataSource[position];
            //TODO: POINT.9 In the onClick method call listItemClickListener.onListItemClick(pass in the object) (DONE)
            listItemClickListener.onListItemClick(person);
        }
    }
}