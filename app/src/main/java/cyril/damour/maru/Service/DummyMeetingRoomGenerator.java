package cyril.damour.maru.Service;
import cyril.damour.maru.Model.Participant;
import cyril.damour.maru.Model.MeetingRoom;
import cyril.damour.maru.Model.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DummyMeetingRoomGenerator {

    public static List<Participant> DUMMY_PARTICIPANT = Arrays.asList(
            new Participant(1,"Barbara","Barbara.maréu@gmail.com"),
            new Participant(2,"Denis","Denis.maréu@gmail.com"),
            new Participant(3,"Jules","Jules.maréu@gmail.com"),
            new Participant(4,"Larry","Larry.maréu@gmail.com")
    );
    public static List<Room> DUMMY_ROOM = Arrays.asList(
      new Room (1,"Salle de conférence 1"),
      new Room (2, "Salle de conférence 2"),
      new Room (3,"Salle de conférence 3")
    );
    public static List<MeetingRoom>DUMMY_MEETINGROOM=Arrays.asList(
            new MeetingRoom(1,"29/06/2020","10h00","Budget",1,"Barbara"),
    );
}
