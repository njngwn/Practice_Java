package cooperation2;

public class Car {
	String modelName;
	int totalRentalFee;
	
	public Car(String modelName) {
		this.modelName = modelName;
	}
	
	public void rent(int rentalFee) {
		totalRentalFee += rentalFee;
		System.out.println("자동차 (모델명: " + modelName + ") 대여 완료");
	}
	
	public void showInfo() {
		System.out.println("자동차 (모델명: " + modelName + ") 의 총 대여 수익은 " + totalRentalFee + "원 입니다.");
	}
}
