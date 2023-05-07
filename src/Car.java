public class Car {

    private String carType = "";
    private Integer carYear = 0;
    private String fuelType = "";
    private String color = "";
    private Integer mileage = 0;
    private String accident = "";
    private Integer price = 0;
    private String carIsReady =  "";

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public void setCarYear(Integer carYear) {
        this.carYear = carYear;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCarIsReady() {
        return carIsReady;
    }

    public void setCarIsReady(String carIsReady) {
        this.carIsReady = carIsReady;
    }


    Car() {
    }
    Car(String carType) {
        this.carType = carType;
    }

    Car(String carType, Integer carYear) {
        this.carType = carType;
        this.carYear = carYear;
        }

    Car(String carType, Integer carYear, String fuelType) {
        this.carType = carType;
        this.carYear = carYear;
        this.fuelType = fuelType;
    }
    Car(String carType, Integer carYear, String fuelType, String color) {
        this.carType = carType;
        this.carYear = carYear;
        this.fuelType = fuelType;
        this.color = color;
    }

    Car(String carType, Integer carYear, String fuelType, String color, Integer mileage) {
        this.carType = carType;
        this.carYear = carYear;
        this.fuelType = fuelType;
        this.color = color;
        this.mileage = mileage;
    }
    Car(String carType, Integer carYear, String fuelType, String color, Integer mileage, String accident) {
        this.carType = carType;
        this.carYear = carYear;
        this.fuelType = fuelType;
        this.color = color;
        this.mileage = mileage;
        this.accident = accident;
    }
    Car(String carType, Integer carYear, String fuelType, String color, Integer mileage, String accident, Integer price) {
        this.carType = carType;
        this.carYear = carYear;
        this.fuelType = fuelType;
        this.color = color;
        this.mileage = mileage;
        this.accident = accident;
        this.price = price;
    }
    Car(String carType, Integer carYear, String fuelType, String color, Integer mileage, String accident, Integer price, String carIsReady) {
        this.carType = carType;
        this.carYear = carYear;
        this.fuelType = fuelType;
        this.color = color;
        this.mileage = mileage;
        this.accident = accident;
        this.price = price;
        this.carIsReady = carIsReady;
    }

    // 차량정보를 출력합니다.
    public void PrintInfo() {
        System.out.println("입력하신 차종:" + this.getCarType());
        System.out.println("입력하신 연식:" + this.getCarYear());
        System.out.println("입력하신 연료타입:" + this.getFuelType());
        System.out.println("입력하신 색상:" + this.getColor());
        System.out.println("입력하신 주행거리:" + this.getMileage());
        System.out.println("입력하신 사고유무:" + this.getAccident());
        System.out.println("입력하신 가격:" + this.getPrice());
    }

    // 차량 정보를 문자열로 리턴합니다.
    public String GetInfo() {
        // implement here
        String carInfo = this.getCarType() + ",";
        carInfo+= this.getCarYear().toString() + ",";
        carInfo+= this.getFuelType() + ",";
        carInfo+= this.getColor() + ",";
        carInfo+= this.getMileage().toString() + ",";
        carInfo+= this.getAccident() + ",";
        carInfo+= this.getPrice().toString() + ",";
        carInfo+= this.getCarIsReady();
        return carInfo;
    }


    // 문자열 carinfo를 파라미터로 받으면
    // carinfo를 쪼개서 car 객체의 멤버 변수에 mapping
    // e.g) carinfo = "i,1,i,1,1,1,1,exist"
    // expected)
    // - carType = i
    // - carYear = 1
    // - color = 1
    // ...

    public void makeCarfromCarinfo(String carinfo) {
        String[] infos = carinfo.split(",");
        this.carType = infos[0];
        this.carYear = Integer.valueOf(infos[1]);
        this.fuelType = infos[2];
        this.color = infos[3];
        this.mileage = Integer.valueOf(infos[4]);
        this.accident = infos[5];
        this.price = Integer.valueOf(infos[6]);
        this.carIsReady = infos[7];
    }
}
