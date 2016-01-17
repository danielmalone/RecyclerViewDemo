package com.finepointmobile.customrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by danielmalone on 1/16/16.
 */
public class ContactAdapterNew extends RecyclerView.Adapter<ContactAdapterNew.CustomViewHolder> {

    private List<Person> mPersonList;

    public ContactAdapterNew(List<Person> personList) {
        mPersonList = personList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.custom_layout, parent, false);

        return new CustomViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        Person person = mPersonList.get(position);
        holder.firstName.setText(person.firstName);
    }

    @Override
    public int getItemCount() {
        return mPersonList.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView firstName;

        public CustomViewHolder(View v) {
            super(v);
            firstName = (TextView) v.findViewById(R.id.txtName);
        }
    }
}
