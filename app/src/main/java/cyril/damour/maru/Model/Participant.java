package cyril.damour.maru.Model;


import java.util.Objects;

    public class Participant {
        private long id;

        /**
         * Full name
         */
        private String name;

        /**
         * Mail
         */
        private String mail;


        public Participant(long id, String name, String getMail) {
            this.id = id;
            this.name = name;
            this.mail = mail;
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
        public String getMail() {return mail;}

        public void setMail(String mail) {this.mail = mail;}
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

}
