package com.amarpreetsinghprojects.newprojectmail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kulvi on 06/20/17.
 */

public class StudentAdapter extends BaseAdapter {

    ArrayList<Student> studentArrayList;
    Context c;

    public StudentAdapter(ArrayList<Student> studentArrayList, Context c) {
        this.studentArrayList = studentArrayList;
        this.c = c;
    }

    @Override
    public int getCount() {
        return studentArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater l = LayoutInflater.from(c);

        View v;
        ViewHolder viewHolder;

        if (convertView == null){
            v = l.inflate(R.layout.student_list_item,
                    parent,
                    false);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) v.findViewById(R.id.name);
            v.setTag(viewHolder);
        }

        else{
            v = convertView;
            viewHolder = (ViewHolder) v.getTag();
        }

        Student s = studentArrayList.get(position);
        viewHolder.name.setText(s.getName());
        return v;
    }

    static class ViewHolder {
        TextView name;


    }
}
