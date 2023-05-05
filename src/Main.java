import java.util.Scanner;

// ⇧을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main {
    public static void main(String[] args) {
        String carType = "";
        Integer carYear = 0;
        String fuelType = "";
        String color = "";
        Integer mileage = 0;
        String accident = "";
        Integer price = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("차 종류: ");
        carType = sc.nextLine();

        System.out.print("연식: ");
        carYear = Integer.parseInt(sc.nextLine());

        System.out.print("연료타입: ");
        fuelType = sc.nextLine();

        System.out.print("색상: ");
        color = sc.nextLine();

        System.out.print("주행거리: ");
        mileage = Integer.parseInt(sc.nextLine());

        System.out.print("사고유무: ");
        accident = sc.nextLine();

        System.out.print("판매가격: ");
        price = Integer.parseInt(sc.nextLine());


        AarinCarCenter carCenter1 = new AarinCarCenter();

        carCenter1.InputCar(carType, carYear, fuelType, color, mileage, accident,price);



    }
}