package cyril.damour.maru.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cyril.damour.maru.Model.Participant;

public class DummyParticipantsGenerator {

        public static List<Participant> DUMMY_Participants = Arrays.asList(
                new Participant(1, "Barbara", "Barbara.maréu@gmail.com"),
                new Participant(2, "Denis", "Denis.maréu@gmail.com"),
                new Participant(3, "Jules", "Jules.maréu@gmail.com"),
                new Participant(4, "Larry","Larry.maréu@gmail.com"),
                new Participant(5,"Francis", "Francis.maréu@gmail.com"),
                new Participant(6,"Alexandra", "Alexandra.marué@gmail.com")
        );

        static List<Participant> generateParticipants() {
            return new ArrayList<>(DUMMY_Participants);
        }
    }

