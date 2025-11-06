class Tempereature {
    private double min_Temp;
    private double max_Temp;

    //contructor
    public Tempereature(double min_Temp, double max_Temp) {
        this.min_Temp = min_Temp;
        this.max_Temp = max_Temp;
    }

    public double getMin_Temp() {
        return min_Temp;
    }

    public double getMax_Temp() {
        return max_Temp;
    }

    @Override
    public String toString() {
        return "Tempereature{" + "min_Temp=" + min_Temp + ", max_Temp=" + max_Temp + '}';
    }
}

class Weather {
    private Tempereature[] temp;

    public Weather(int days) {
        temp = new Tempereature[days];
    }

    public void addTempereture(int day, double min, double max) {
        try {
            if (temp[day] == null) {
                temp[day] = new Tempereature(min, max);
                System.out.println("Data Inserted");
            } else {
                System.out.println("The cell is filled");
            }
        } catch (Exception e) {
            System.out.println("Invalid data or day");
        }
    }

    public void printAll() {
        for (Tempereature t1 : temp) {
            System.out.println(t1);
        }
    }

    public void printMin() {
        System.out.println("----------Min Values--------");
        for (Tempereature t1 : temp) {
            System.out.println(t1.getMin_Temp());
        }
    }
    public void printMax() {
        System.out.println("---------Max Values---------");
        for (Tempereature t1 : temp) {
            System.out.println(t1.getMax_Temp());
        }
    }

    public void getMinTemp() {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < temp.length; i++) {
            if (min > temp[i].getMin_Temp()) {
                min = temp[i].getMin_Temp();
            }
        }
        System.out.println("Min: "+min);
    }

    public void getMaxTemp() {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < temp.length; i++) {
            if (max < temp[i].getMax_Temp()) {
                max = temp[i].getMax_Temp();
            }
        }
        System.out.println("Max: "+max);
    }

    public void avgMinTemp() {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i].getMin_Temp();
        }
        avg = sum / temp.length;
        System.out.println("Min Avg: "+avg);
    }

    public void avgMaxTemp() {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum += temp[i].getMax_Temp();
        }
        avg = sum / temp.length;
        System.out.println("Max Avg: "+avg);
    }

}

public class ObjectArray {
    public static void main(String[] args) {
        Weather weather = new Weather(7);
        weather.addTempereture(0, 21.1, 33.6);
        weather.addTempereture(1, 17.1, 27.3);
        weather.addTempereture(2, 18.2, 28.2);
        weather.addTempereture(3, 23.5, 29.9);
        weather.addTempereture(4, 24.8, 30.5);
        weather.addTempereture(5, 19.8, 29.0);
        weather.addTempereture(6, 17.8, 26.7);
        weather.printAll();
        weather.printMin();
        weather.printMax();
        weather.getMinTemp();
        weather.getMaxTemp();
        weather.avgMinTemp();
        weather.avgMaxTemp();
    }
}