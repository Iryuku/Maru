package cyril.damour.maru.Model;


import java.util.Objects;

    public class Participant {
        private long id;

        private String name;

        private String email;


        public Participant(long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {return email;}

        public void setEmail(String email) {this.email = email;}
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Participant meetingGenerator = (Participant) o;
            return Objects.equals(id, meetingGenerator.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        public void add(Participant participant) {
        }

        public void remove(Participant participant) {
        }
    }

