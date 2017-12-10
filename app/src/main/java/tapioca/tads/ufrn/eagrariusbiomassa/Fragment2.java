package tapioca.tads.ufrn.eagrariusbiomassa;

import android.graphics.PorterDuff;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


/**
 * Created by Aluno on 05/10/2016.
 */
public class Fragment2 extends Fragment {
    @BindView(R.id.frag_02_bt_01)
    Button mBtSim;
    @BindView(R.id.frag_02_bt_02)
    Button mBtNao;
    private Unbinder unbinder;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b){
        View v = inflater.inflate(R.layout.fragment_2, container, false);
        unbinder = ButterKnife.bind(this, v);
        setListeners();
//logica do fragment
        return v;
    }
    public void setListeners(){
        mBtSim.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Button view = (Button) v;
                        view.getBackground().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        // Your action here on button click
                        ((MainActivity)getActivity()).onPageSelected(2);
                        ((MainActivity)getActivity()).pageSelect(2);
                        ((MainActivity)getActivity()).getBiomassa().setQ01(1);
                    case MotionEvent.ACTION_CANCEL: {
                        Button view = (Button) v;
                        view.getBackground().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return true;
            }
        });
        mBtNao.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Button view = (Button) v;
                        view.getBackground().setColorFilter(0x77000000, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        // Your action here on button click
                        ((MainActivity)getActivity()).onPageSelected(2);
                        ((MainActivity)getActivity()).pageSelect(2);
                        ((MainActivity)getActivity()).getBiomassa().setQ01(1);
                    case MotionEvent.ACTION_CANCEL: {
                        Button view = (Button) v;
                        view.getBackground().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return true;
            }
        });
    }
}

