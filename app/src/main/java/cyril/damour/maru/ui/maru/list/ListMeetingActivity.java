package cyril.damour.maru.ui.maru.list;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cyril.damour.maru.DI.DI;
import cyril.damour.maru.Model.Meeting;
import cyril.damour.maru.Model.Participant;
import cyril.damour.maru.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cyril.damour.maru.Service.ParticipantsApiService;

import static java.security.AccessController.getContext;

public class ListMeetingActivity extends AppCompatActivity {
    // UI Components
    MeetingAdapter mMeetingAdapter;
    ParticipantsApiService mParticipantsApiService;
    @BindView(R.id.list_reunion_toolbar)
    Toolbar mToolbar;
    @BindView(R.id.list_reunion_recycler_view)
    RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_list_activity);
        ButterKnife.bind(this);
        mParticipantsApiService = DI.getParticipantsApiService();
        List<Meeting> mMeetings = mParticipantsApiService.getMeetingRoom();
        mMeetingAdapter = new MeetingAdapter(mMeetings);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRecyclerView.setAdapter(mMeetingAdapter);
    }

  /**  @OnClick(R.id.list_reunion_add_btn)
    void addMeeting() {

    }**/
}

