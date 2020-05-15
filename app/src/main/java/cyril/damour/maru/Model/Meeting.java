package cyril.damour.maru.Model;
import java.util.List;
import java.util.Objects;

public class Meeting {
private long id;
private String date;
private String hourDebut;
private String subject;
private long idRoom;
private List<Participant>participant;

     public Meeting(long id, String date, String hourDebut, String subject, long idRoom, List<Participant>participant) {
    this.id = id;
    this.date= date;
    this.hourDebut= hourDebut;
    this.subject= subject;
    this.idRoom= idRoom;
    this.participant= participant;

}
    public List<Participant> getParticipant() {
        return participant;
    }

    public void setParticipant(List<Participant> participant) {
        this.participant = participant;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date= date;
    }

    public String getHourDebut() {
        return hourDebut;
    }

    public void setHourDebut(String hourDebut) {
        this.hourDebut = hourDebut;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject =subject;
    }

    public long getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(long idRoom) {
        this.idRoom = idRoom;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meetingRoom = (Meeting) o;
        return Objects.equals(id, meetingRoom.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
