package laweafome.foodcared1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.widget.DatePicker;

    public class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        Context c;

        public DatePickerFragment(){

        }

//auiuda c:

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            // Do something with the date chosen by the user
            // TextView tv1= (TextView) getActivity().findViewById(R.id.textview1);
            System.out.println(("Year: "+view.getYear()+" Month: "+view.getMonth()+" Day: "+view.getDayOfMonth()));

            Intent i=new Intent(getContext(),Inicio.class);
            i.putExtra("fecha","fecha");
            i.putExtra("dia",day);
            i.putExtra("mes",month+1);
            i.putExtra("ano",year);
            startActivity(i);


        }
}
