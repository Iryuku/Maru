package cyril.damour.maru.Service;

import cyril.damour.maru.Model.Meeting;

import java.util.List;

public class DummyMeetingRoomApiService implements ParticipantsApiService {

    private List<Meeting> meetingRooms = DummyMeetingRoomGenerator.generateMeetingRoom();


    @Override
    public List<Meeting> getMeetingRoom() {
        return meetingRooms;
    }

    @Override
    public void deleteMeetingRoom(Meeting meetingRoom) {meetingRooms.remove(meetingRoom);

    }

    @Override
    public void createMeetingRoom(Meeting meetingRoom) {meetingRooms.add(meetingRoom);

    }

    @Override
    public Meeting getMeetingRoomById(int id) {
        return meetingRooms.get(id);
    }


}
