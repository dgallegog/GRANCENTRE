package com.example.grancentre;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Tallers#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Tallers extends Fragment implements View.OnClickListener {
    TextView[] textViewArray = new TextView[3];
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Tallers() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tallers.
     */
    // TODO: Rename and change types and number of parameters
    public static Tallers newInstance(String param1, String param2) {
        Tallers fragment = new Tallers();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View v=inflater.inflate(R.layout.fragment_tallers, container, false);

        AppCompatButton boton = v.findViewById(R.id.pichweb);
        boton.setOnClickListener(this);
        boton = v.findViewById(R.id.tasWeb);
        boton.setOnClickListener(this);
        boton = v.findViewById(R.id.butGiralt);
        boton.setOnClickListener(this);
        textViewArray[0] = v.findViewById(R.id.num1);
        textViewArray[1] = v.findViewById(R.id.num3);
        textViewArray[2] = v.findViewById(R.id.num2);
        for (int i = 0;i<3;i++)
        {
            textViewArray[i].setOnClickListener(this);
        }
        return v;
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        if(view == getView().findViewById(R.id.pichweb))
        {
            String url = "http://www.tallerdenpich.es/ca";

            i.setData(Uri.parse(url));
          
        }
        else if(view == getView().findViewById(R.id.tasWeb))
        {
            String url = "http://tasmania.cat/";

            i.setData(Uri.parse(url));

        }
        else if(view == getView().findViewById(R.id.butGiralt))
        {
            String url = "http://www.shopiteca.com/";

            i.setData(Uri.parse(url));

        }else
        {
            String u = ((TextView)view).getText().toString();
            i = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",u, null));
        }

        startActivity(i);
    }
}