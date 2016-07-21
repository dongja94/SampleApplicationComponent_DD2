package com.begentgroup.sampleapplicationcomponent;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    public static OneFragment newInstance(String input) {
        OneFragment fragment = new OneFragment();
        Bundle b = new Bundle();
        b.putString(KEY_INPUT, input);
        fragment.setArguments(b);
        return fragment;
    }

    public static final String KEY_INPUT = "input";

    public OneFragment() {
        // Required empty public constructor
    }

    String inputText;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle b = getArguments();
        if (b != null) {
            inputText = b.getString(KEY_INPUT);
        }
    }

    EditText inputView;
    TextView messageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        inputView = (EditText)view.findViewById(R.id.edit_input);
        inputView.setText(inputText);
        messageView = (TextView)view.findViewById(R.id.text_message);
        Button btn = (Button)view.findViewById(R.id.btn_send);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messageView.setText(inputView.getText().toString());
            }
        });
        return view;
    }

}
