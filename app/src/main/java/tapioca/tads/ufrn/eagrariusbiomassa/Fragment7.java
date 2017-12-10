package tapioca.tads.ufrn.eagrariusbiomassa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by Aluno on 05/10/2016.
 */
public class Fragment7 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b){
        View v = inflater.inflate(R.layout.fragment_7, container, false);
        Toast.makeText(getContext(),((MainActivity)getActivity()).getBiomassa().toString(),Toast.LENGTH_SHORT).show();
//logica do fragment
        return v;
    }
}

