public class ProductManager {
    ILogger logger;
    public ProductManager(ILogger logger){
        this.logger = logger;
    }
    public void save(){
        logger.log("user data");
        System.out.println("saved");
    }
}
