package racingcar;

public class Race {

    private Race() {
    }

    public static void start() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        RacingCars racingCars = RacingCars.createRacingCars();
        System.out.println("시도할 회수는 몇회인가요?");
        MovingCount movingCount = MovingCount.createMovingCount();
        CarsPosition racingScore = CarsPosition.createPositionWithRacingCars(racingCars);
    }
}
