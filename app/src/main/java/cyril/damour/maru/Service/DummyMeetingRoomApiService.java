package cyril.damour.maru.Service;

import cyril.damour.maru.Model.MeetingRoom;

import java.util.List;

public class DummyMeetingRoomApiService implements ParticipantsApiService {

    private List<MeetingRoom> meetingRooms = DummyMeetingRoomGenerator.generateMeetingRoom();


    @Override
    public List<MeetingRoom> getMeetingRoom() {
        return meetingRooms;
    }

    @Override
    public void deleteMeetingRoom(MeetingRoom meetingRoom) {meetingRooms.remove(meetingRoom);

    }

    @Override
    public void createMeetingRoom(MeetingRoom meetingRoom) {meetingRooms.add(meetingRoom);

    }

    @Override
    public MeetingRoom getMeetingRoomById(int id) {
        return meetingRooms.get(id);
    }


}
