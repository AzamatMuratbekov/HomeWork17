public abstract class PetsAnimals {
    private String NickName;
    private String gender;
    private String weight;
    private String age;

    public PetsAnimals(String nickName, String gender, String weight, String age) {
        NickName = nickName;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PetsAnimals: " +
                "NickName: '" + NickName + '\'' +
                ", gender: '" + gender + '\'' +
                ", weight: '" + weight + '\'' +
                ", age: '" + age + '\'' ;
    }
}