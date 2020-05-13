package cyril.damour.maru.ui.maru.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import cyril.damour.maru.Model.MeetingRoom;
import cyril.damour.maru.R;

import java.util.List;
import java.util.Objects;


public class MyMeetingRecyclerViewAdapter extends RecyclerView.Adapter<MyMeetingRecyclerViewAdapter.ViewHolder> {
    private final List<MeetingRoom> MeetingRooms;
    Context mContext;
    public MyMeetingRecyclerViewAdapter(List(MeetingRoom) items){ MeetingRooms = items;}
    MyMeetingRecyclerViewAdapter(List(MeetingRoom) items, Context context){
    MeetingRooms = items;
    mContext = context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_meeting_fragment, parent, false);
                return new ViewHolder(view);
    }



}
