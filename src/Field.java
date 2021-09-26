public class Field {
    private String field;
    boolean isOccupied;

    public Field (String field) {
        this.field = field;
        this.isOccupied = false;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
        isOccupied = true;
    }

    public boolean getOccupation() {
        return isOccupied;
    }

}

