public class Ticket {
    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    private String startStation;
    private String endStation;
    private Float price;

    public Ticket(){};

    public Ticket(String startStation, String endStation, Float price) {
        this.startStation = startStation;
        this.endStation = endStation;
        this.price = price;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[")
                .append(this.startStation)
                .append("===>")
                .append(this.endStation)
                .append(":")
                .append(this.price)
                .append("]");
        return stringBuilder.toString();
    }
}
