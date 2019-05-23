package edu.cnm.deepdive.fizzbuzz;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.options, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    boolean handled = true;
    switch(item.getItemId()){
      case R.id.play:
        // TODO Start running game, hide Play item, show Pause item.
        break;
      case R.id.pause:
        // TODO Pause running game, hide Pause item, show Play item.
        break;
      case R.id.settings:
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
        break;
      default:
        handled = super.onOptionsItemSelected(item);
        break;
    }
    return handled;
  }
}
