import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class AarinCarCenter {
    void InputCar(Car c) throws IOException,FileNotFoundException {
             // 차량 정보를 파일로 저장

        PrintWriter pw = new PrintWriter(new FileWriter("./db/car_data.txt", true));


        System.out.println("입고된 차량 정보:" + c.GetInfo());
        pw.println(c.GetInfo());
        pw.close();
    }


    void OutputCar(String carType) throws IOException,FileNotFoundException {

        BufferedReader br = new BufferedReader(new FileReader("./db/car_data.txt"));
        ArrayList<String> starr = new ArrayList<>();

        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            String[]  arr= line.split(",");
            if (Objects.equals(arr[arr.length - 1], "exist")) {
                if (Objects.equals(arr[0], carType)) {
                    System.out.println("차량상태를 변경합니다 : " + arr[0]);
                    arr[arr.length - 1] = "sold";
                }
            }

            String str = String.join(",", arr);
            starr.add(str);
        }
        br.close();

        PrintWriter pw = new PrintWriter(new FileWriter("./db/car_data.txt"));
        for (int i=0; i<starr.toArray().length; i++){
            pw.println(starr.get(i));
        }
        pw.close();

    }
    void PrintCarDBInfo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("./db/car_data.txt"));
        // Car 배열 만들기
        ArrayList<Car> cars = new ArrayList<Car>();


        while(true) {
            String line = br.readLine();
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
            // Car 배열에 car 객체 넣기
            Car car = new Car();
            car.makeCarfromCarinfo(line);
            cars.add(car);
        }
        // Car 배열을  순회하면서 car.PrintInfo();
        for (int i=0; i<cars.size(); i++) {
            cars.get(i).PrintInfo();
        }
        br.close();
    }

    void Menu() {
        System.out.println("=========================");
        System.out.print("사용 하실 기능을 선택해주세요. >> ");
        System.out.println("1. 입고   2. 출고    3. 조회    4. 종료");
        System.out.println("=========================");
    }
}
