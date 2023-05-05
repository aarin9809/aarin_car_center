import java.io.*;

public class AarinCarCenter {
    void InputCar(String carType,
                  Integer carYear,
                  String fuelType,
                  String color,
                  Integer mileage,
                  String accident,
                  Integer price) throws IOException,FileNotFoundException {
        System.out.println("입력하신 차종:" + carType);
        System.out.println("입력하신 연식:" + carYear);
        System.out.println("입력하신 연료타입:" + fuelType);
        System.out.println("입력하신 색상:" + color);
        System.out.println("입력하신 주행거리:" + mileage);
        System.out.println("입력하신 사고유무:" + accident);
        System.out.println("입력하신 가격:" + price);

        // 차량 정보를 파일로 저장

        PrintWriter pw = new PrintWriter(new FileWriter("./db/car_data.txt", true));

        String carInfo = carType + ",";
        carInfo+= carYear.toString() + ",";
        carInfo+= fuelType + ",";
        carInfo+= color + ",";
        carInfo+= mileage.toString() + ",";
        carInfo+= accident + ",";
        carInfo+= price.toString();
        pw.println(carInfo);
        pw.close();
    }
}
