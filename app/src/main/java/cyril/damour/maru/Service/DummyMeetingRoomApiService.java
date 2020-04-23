package cyril.damour.maru.Service;

import cyril.damour.maru.Model.MeetingRoom;

import java.util.List;

public class DummyMeetingRoomApiService implements ParticipantsApiService {

    private List<MeetingRoom> meetingRoom = DummyMeetingRoomGenerator.generateMeetingRoom();


    @Override
    public List<MeetingRoom> getMeetingRoom() {
        return meetingRoom;
    }

    @Override
    public void deleteMeetingRoom(MeetingRoom meetingRoom) {meetingRoom.remove(meetingRoom);

    }

    @Override
    public void createParticipant(MeetingRoom meetingRoom) {meetingRoom.add(meetingRoom);

    }

    @Override
    public MeetingRoom getMeetingRoomById(int id) {
        return meetingRoom.get(id);
    }


}
