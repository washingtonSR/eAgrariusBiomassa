package tapioca.tads.ufrn.eagrariusbiomassa;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Aluno on 05/10/2016.
 */
public class Fragment7 extends Fragment {
    @BindView(R.id.textResultado)
    TextView mTvResultado;
    private Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b) {
        View v = inflater.inflate(R.layout.fragment_7, container, false);
        unbinder = ButterKnife.bind(this, v);
        //logica do fragment
        return v;
    }

    public void updateResultado() {
        String[] biomassaResultado = ((MainActivity) getActivity()).getBiomassa().toStringArray();
        String resultado = "";
        for(String r : biomassaResultado) {
            resultado += r.concat("\n");
        }
        mTvResultado.setText(resultado);
    }
}

