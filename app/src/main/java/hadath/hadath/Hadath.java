package hadath.hadath;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Hadath extends AppCompatActivity {

    private TextView mTextMessage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadath);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Toast.makeText(Hadath.this, "hello", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_myEvents:
                        Toast.makeText(Hadath.this, "events", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_notification:
                        Toast.makeText(Hadath.this, "notification", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.action_profile:
                        Toast.makeText(Hadath.this, "profile", Toast.LENGTH_SHORT).show();
                        break;
                }//switch


                return true;
            }
        });

    }

}