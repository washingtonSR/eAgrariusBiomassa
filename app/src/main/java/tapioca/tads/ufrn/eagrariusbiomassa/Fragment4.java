package tapioca.tads.ufrn.eagrariusbiomassa;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Aluno on 05/10/2016.
 */
public class Fragment4 extends Fragment {
    @BindView(R.id.frag_04_bt_01)
    Button mBt29;
    @BindView(R.id.frag_04_bt_02)
    Button mBt26;
    @BindView(R.id.frag_04_bt_03)
    Button mBt23;
    private Unbinder unbinder;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle b){
        View v = inflater.inflate(R.layout.fragment_4, container, false);
        unbinder = ButterKnife.bind(this, v);
        setListeners();
//logica do fragment
        return v;
    }

    public void setListeners(){
        mBt29.setOnTouchListener(new View.OnTouchListener() {

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
                        ((MainActivity)getActivity()).onPageSelected(4);
                        ((MainActivity)getActivity()).pageSelect(4);
                        ((MainActivity)getActivity()).getBiomassa().setQ03(1);
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
        mBt26.setOnTouchListener(new View.OnTouchListener() {

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
                        ((MainActivity)getActivity()).onPageSelected(4);
                        ((MainActivity)getActivity()).pageSelect(4);
                        ((MainActivity)getActivity()).getBiomassa().setQ03(2);
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
        mBt23.setOnTouchListener(new View.OnTouchListener() {

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
                        ((MainActivity)getActivity()).onPageSelected(4);
                        ((MainActivity)getActivity()).pageSelect(4);
                        ((MainActivity)getActivity()).getBiomassa().setQ03(3);
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

