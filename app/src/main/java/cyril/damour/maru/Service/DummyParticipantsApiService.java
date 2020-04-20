package cyril.damour.maru.Service;

import java.util.List;

import cyril.damour.maru.Model.Participant;

public class DummyParticipantsApiService implements ParticipantsApiService {

        private List<Participant> participant = DummyParticipantsApiService.generateParticipants();
        /**
         * {@inheritDoc}
         */
        @Override
        public List<Participant> getParticipant() {
            return participant;
        }

    @Override
    public void deleteParticipant(Participant participant) {participant.remove(participant);

    }

    @Override
    public void createParticipant(Participant participant) {participant.add(participant);

    }

    @Override
        public Participant getParticipantById(int id) {
            return participant.get(id);
        }


    }
