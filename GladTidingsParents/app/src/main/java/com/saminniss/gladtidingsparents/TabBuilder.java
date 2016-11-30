package com.saminniss.gladtidingsparents;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class TabBuilder extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public TabBuilder() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TabBuilder newInstance(int sectionNumber) {
        TabBuilder fragment = new TabBuilder();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = null;

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 0:
                rootView = inflater.inflate(R.layout.academy, container, false);
                //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
                //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            break;
            case 1:
                rootView = inflater.inflate(R.layout.dev_center, container, false);
            break;
            case 2:
                rootView = inflater.inflate(R.layout.payments, container, false);
            break;
            case 3:
                rootView = inflater.inflate(R.layout.contact_us, container, false);
            break;
        }

        return rootView;
    }
}
