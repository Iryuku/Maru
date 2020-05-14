package cyril.damour.maru.Service;
import android.os.Bundle;

import androidx.recyclerview.widget.RecyclerView;

import cyril.damour.maru.Model.Participant;
import cyril.damour.maru.Model.Meeting;
import cyril.damour.maru.Model.Room;
import cyril.damour.maru.R;
import cyril.damour.maru.ui.maru.list.MeetingAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyMeetingRoomGenerator {

        public static List<Participant> DUMMY_PARTICIPANT = Arrays.asList(
                new Participant(1, "Barbara", "Barbara.maréu@gmail.com"),
                new Participant(2, "Denis", "Denis.maréu@gmail.com"),
                new Participant(3, "Jules", "Jules.maréu@gmail.com"),
                new Participant(4, "Larry", "Larry.maréu@gmail.com")
        );
        public static List<Room> DUMMY_ROOM = Arrays.asList(
                new Room(1, "Salle de conférence 1"),
                new Room(2, "Salle de conférence 2"),
                new Room(3, "Salle de conférence 3")
        );
        public static List<Meeting> DUMMY_MEETING = Arrays.asList(
                new Meeting(1, "29/06/2020", "10h00", "Budget", 1, DUMMY_PARTICIPANT)
        );

        static List<Meeting> generateMeetingRoom () {
            return new ArrayList<>(DUMMY_MEETING);
        }

}