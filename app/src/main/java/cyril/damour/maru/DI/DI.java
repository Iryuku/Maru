package cyril.damour.maru.DI;
import cyril.damour.maru.Service.DummyMeetingRoomApiService;
import cyril.damour.maru.Service.ParticipantsApiService;

/**
 * Dependency injector to get instance of services
 */
public class DI {

    private static ParticipantsApiService service = new DummyMeetingRoomApiService();

    /**
     * Get an instance on @{@link MeetingRoomApiService}
     * @return
     */
    public static ParticipantsApiService getNeighbourApiService() {
        return service;
    }

    /**
     * Get always a new instance on @{@link ParticipantsApiService}. Useful for tests, so we ensure the context is clean.
     * @return
     */
    public static ParticipantsApiService getNewInstanceApiService() {
        return new DummyMeetingRoomApiService();
    }
}
