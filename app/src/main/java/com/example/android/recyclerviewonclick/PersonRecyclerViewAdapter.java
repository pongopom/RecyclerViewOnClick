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

    public PersonRecyclerViewAdapter(Person[] dataSource) {
        this.dataSource = dataSource;
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

    public class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView firstNameTextView;
        TextView secondNameTextView;
        TextView favoriteProgramingLanguage;

        public PersonViewHolder(View itemView) {
            super(itemView);
            firstNameTextView = (TextView) itemView.findViewById(R.id.rvi_tv_first_name);
            secondNameTextView = (TextView) itemView.findViewById(R.id.rvi_tv_second_name);
            favoriteProgramingLanguage = (TextView) itemView.findViewById(R.id.rvi_programing_language);
        }


        public void bind(int listIndex) {
            Person person = dataSource[listIndex];
            firstNameTextView.setText(person.getFirstName());
            secondNameTextView.setText(person.getSecondName());
            favoriteProgramingLanguage.setText(person.getFavoriteProgramingLanguage());
        }

    }
}