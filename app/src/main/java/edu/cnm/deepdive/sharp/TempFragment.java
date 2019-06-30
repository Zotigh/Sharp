package edu.cnm.deepdive.sharp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.Objects;


public class TempFragment extends Fragment {

  private Spinner spinner;
  ArrayAdapter<CharSequence> adapter;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_temp, container, false);

    spinner = view.findViewById(R.id.spinnerI);

    adapter = ArrayAdapter.createFromResource(Objects.requireNonNull(getActivity()), R.array.listI, android.R.layout.simple_spinner_item );
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spinner.setAdapter(adapter);
    spinner.setOnItemSelectedListener();
    return view;
  }

  @Override
  public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    String text = parent.getItemAtPosition(position).toString();
    Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
  }

  @Override
  public void onNothingSelected(AdapterView<?> parent) {

  }
}
