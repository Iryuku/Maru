package cyril.damour.maru.ui.maru.list;

import androidx.appcompat.app.AppCompatActivity;

//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cyril.damour.maru.DI.DI;
import cyril.damour.maru.R;
import cyril.damour.maru.Service.ParticipantsApiService;



public class AddMeetingActivity extends AppCompatActivity {

private ParticipantsApiService mApiService;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_meeting);
       // ButterKnife.bind(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mApiService = DI.getNewInstanceApiService();
       // init();
    }

}
