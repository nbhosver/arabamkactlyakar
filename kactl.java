public static void main(String[] args) {


	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Aracınızın ortalama yakıt tüketimi nekadar: (Örnek: 8,4)= ");
	
	float tüketim = scanner.nextFloat();
	
	System.out.print("Aldıgınız yakıtın litfe fiyatı= ");
	
	float litrefiyatı = scanner.nextFloat();
	
	System.out.print("Gitmek istediğiniz km miktarı= ");
	
	float gidilecekkm = scanner.nextFloat();
	
	float yolculukmaliyeti = tüketim * litrefiyatı / 100  * gidilecekkm;
	
	float kmmaliyeti = tüketim * litrefiyatı / 100;
	
	System.out.println("Tahmini ulaşım maliyeti: " + yolculukmaliyeti + "tl dir");
	
	System.out.println("Tahmini km başı ödenecek tutar: " + kmmaliyeti);
}
