package cyril.damour.maru.Service;
import java.util.List;

import cyril.damour.maru.Model.Meeting;


public interface ParticipantsApiService {

        List<Meeting> getMeetingRoom();

        void deleteMeetingRoom(Meeting meetingRoom);

        void createMeetingRoom(Meeting meetingRoom);
        Meeting getMeetingRoomById(int id);
    }

