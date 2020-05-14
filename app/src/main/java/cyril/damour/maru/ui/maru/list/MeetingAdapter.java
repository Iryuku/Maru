package cyril.damour.maru.ui.maru.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import cyril.damour.maru.Model.Meeting;
import cyril.damour.maru.R;

import java.util.List;

import static cyril.damour.maru.Service.DummyMeetingRoomGenerator.DUMMY_MEETING;


public class MeetingAdapter extends RecyclerView.Adapter<MeetingAdapter.MeetingViewHolder> {

    List<Meeting> DUMMY_MEETING;
    public static class  MeetingViewHolder extends RecyclerView.ViewHolder
    {
        TextView id;
        TextView participant;
        TextView hourdebut;
        TextView date;
        TextView subject;
        public MeetingViewHolder (View itemView){
            super(itemView);
            id = itemView.findViewById(R.id.id);
            participant = itemView.findViewById(R.id.participant);
            hourdebut = itemView.findViewById(R.id.hourdebut);
            date = itemView.findViewById(R.id.date);
            subject = itemView.findViewById(R.id.subject);
        }
    }
    public MeetingAdapter(List<Meeting> DUMMY_MEETING){
        this.DUMMY_MEETING = DUMMY_MEETING;
    }
    @Override
    public MeetingViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_adapter, parent,false);
        MeetingViewHolder meetingViewHolder = new MeetingViewHolder(view);
        return meetingViewHolder;
    }

    @Override
    public void onBindViewHolder( MeetingViewHolder holder, int position) {
        Meeting meeting = DUMMY_MEETING.get(position);
        holder.id.setText(meeting.getId());
        holder.participant.setText(meeting.getParticipant());
        holder.subject.setText(meeting.getSubject());
        holder.date.setText(meeting.getDate());
        holder.hourdebut.setText(meeting.getHourDebut());
    }

    @Override
    public int getItemCount() {
        return DUMMY_MEETING.size();
    }


}