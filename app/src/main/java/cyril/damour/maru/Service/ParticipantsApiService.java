package cyril.damour.maru.Service;
import java.util.List;

import cyril.damour.maru.Model.MeetingRoom;


public interface ParticipantsApiService {

        List<MeetingRoom> getMeetingRoom();

        void deleteMeetingRoom(MeetingRoom meetingRoom);

        void createMeetingRoom(MeetingRoom meetingRoom);
        MeetingRoom getMeetingRoomById(int id);
    }

