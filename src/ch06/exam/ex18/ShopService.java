package ch06.exam.ex18;

public class ShopService {
    private static final ShopService instance = new ShopService();

    private ShopService(){
    }
    public static ShopService getInstance(){
        return instance;
    }
}
