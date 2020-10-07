package ObjectPoolPattern;

public class ObjectPoolPatternDemo {
	public static void main(String[] args) {
	    OliphauntPool pool = new OliphauntPool();
	    System.out.println(pool.toString());
	    Oliphaunt oliphaunt1 = pool.checkOut();
	    System.out.println("Kontrol Edilen:" + oliphaunt1);
	    System.out.println(pool.toString());
	    Oliphaunt oliphaunt2 = pool.checkOut();
	    System.out.println("Kontrol Edilen:"  + oliphaunt2);
	    Oliphaunt oliphaunt3 = pool.checkOut();
	    System.out.println("Kontrol Edilen:"  + oliphaunt3);
	    System.out.println(pool.toString());
	    System.out.println("Kontrol Edilmiþ:" + oliphaunt1);
	    pool.checkIn(oliphaunt1);
	    System.out.println("Kontrol Edilmiþ:" + oliphaunt2);
	    pool.checkIn(oliphaunt2);
	    System.out.println(pool.toString());
	    Oliphaunt oliphaunt4 = pool.checkOut();
	    System.out.println("Kontrol Edilen:" + oliphaunt4);
	    Oliphaunt oliphaunt5 = pool.checkOut();
	    System.out.println("Kontrol Edilen:" + oliphaunt5);
	    System.out.println(pool.toString());
	  }
	}