package printObj;

abstract class CallDesk {

	// Create Static Member as Kind of Desktop list
	static String[] kindOf;
	static String name;
	static int listNum;
	

	static {
		kindOf = new String[] {"Hp print", "SAMSUMG print", "HTC print"};
		name = "";
		listNum = 0;
	}

	
	//SuperClass Constructor
	CallDesk(int num, String name) {
		this.listNum = num;
		this.name = name;
	}
	
	public CallDesk() {
	}

	
	//Abstract Method
	abstract void com1();

	abstract void com2();

	abstract void com3();
	}

class Desktop extends CallDesk {
	
	Desktop() {
		super();
	}

	Desktop(int num, String kind) {
		super(num, kind);
	}

	// 임재우
	@Override
	void com1() {

	}

	// 신유수
	@Override
	void com2() {

	}

	// 강현욱
	@Override
	void com3() {

	}
	
	
	//Print Method
	void printpaper(){
		System.out.println("인쇄를 시작합니다.");
		System.out.println( "프린터 넘버  : "+super.listNum+ "\n프린터 사용자  : "+ super.name +"\n프린터 종류  : "+ super.kindOf[super.listNum]);
		System.out.println("처리 중 입니다");
	}
}

public class PrintCo {

	public static void main(String[] args) {
		
		CallDesk c = new Desktop();		// 생성자에 파라미터를 주지 않고 실행한다.
		
		
		c.com1();						// 객체생성에 파라미터를 주세요.
		c.com2();						// 객체생성에 파라미터를 주세요.
		c.com3();						// 객체생성에 파라미터를 주세요.
		
		
		//수정 1차 테스트
		//kyfkhthjllasadd
		

	}

}
