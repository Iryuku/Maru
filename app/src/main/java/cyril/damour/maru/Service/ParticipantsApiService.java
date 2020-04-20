package cyril.damour.maru.Service;
import java.util.List;

import cyril.damour.maru.Model.Participant;

interface ParticipantsApiService {

        List<Participant> getParticipant();


        void deleteParticipant(Participant participant);

        void createParticipant(Participant participant);
        Participant getParticipantById(int id);

    }

