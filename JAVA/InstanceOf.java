public class InstanceOf {
    public static void main(String[] args) {

        InstanceOf obj = new InstanceOf();
        InstanceOf obj3 = new InstanceOf();
        System.out.println(obj3 instanceof InstanceOf);
        System.out.println(obj instanceof InstanceOf);
    }
}
