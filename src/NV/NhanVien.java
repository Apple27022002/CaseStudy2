package NV;

public class NhanVien {

        private String iDCard;
        private String name;
        private int age;
        private String address;
        private int workingTimes;
        private int daysOff;
    public NhanVien(){}

    public NhanVien(String iDCard, String name, int age, String address, int workingTimes, int daysOff) {
        this.iDCard = iDCard;
        this.name = name;
        this.age = age;
        this.address = address;
        this.workingTimes = workingTimes;
        this.daysOff = daysOff;
    }

        public String getiDCard() {
        return iDCard;
    }

        public void setiDCard(String iDCard) {
        this.iDCard = iDCard;
    }

        public String getName() {
        return name;
    }

        public void setName(String name) {
        this.name = name;
    }

        public int getAge() {
        return age;
    }

        public void setAge(int age) {
        this.age = age;
    }

        public String getAddress() {
        return address;
    }

        public void setAddress(String address) {
        this.address = address;
    }

        public int getWorkingTimes() {
        return workingTimes;
    }

        public void setWorkingTimes(int workingTimes) {
        this.workingTimes = workingTimes;
    }

        public int getDaysOff() {
        return daysOff;
    }

        public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

        @Override
        public String toString() {
        return "NhanVien{" +
                "iDCard='" + iDCard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", workingTimes=" + workingTimes +
                ", daysOff=" + daysOff +
                '}';
    }
}

