import java.util.Arrays;

public class Farm {
    private String address;
    private String OwnerName;
    private Sheep[] sheeps;
    private Cow[] cows;
    private Horse[] horses;

    public Farm(String address, String ownerName, Sheep[] sheeps, Cow[] cows, Horse[] horses) {
        this.address = address;
        OwnerName = ownerName;
        this.sheeps = sheeps;
        this.cows = cows;
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm " +
                "address: '" + address + '\'' +
                ", OwnerName: '" + OwnerName + '\'' +
                ", sheeps: " + Arrays.toString(sheeps) +
                ", cows: " + Arrays.toString(cows) +
                ", horses: " + Arrays.toString(horses)
                ;
    }
}