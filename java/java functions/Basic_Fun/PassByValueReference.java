public class PassByValueReference {
    public static void main(String[] args) {
        MyObject obj = new MyObject("original");
        System.out.println("Before method call: " + obj.name); // Output: original
        modifyObject(obj);
        System.out.println("After method call: " + obj.name);  // Output: changed (state was modified)
    }

    public static void modifyObject(MyObject myObj) {
        myObj.name = "changed"; // This changes the 'name' field of the original object
    }
}

class MyObject {
    String name;
    MyObject(String name) { this.name = name; }
}