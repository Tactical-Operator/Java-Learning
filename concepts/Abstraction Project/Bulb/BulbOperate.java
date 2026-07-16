public class BulbOperate{
    public static void main(String []args){
        Switchable types[]=new Switchable[3];

        SmartBulb sb=new SmartBulb();
        DimmableBulb db =new DimmableBulb();
        RegularBulb rb=new RegularBulb();

        types[0]=sb;
        types[1]=db;
        types[2]=rb;

         // Loop through the array and turn each bulb on and off
        for (int i = 0; i < types.length; i++) {
            types[i].turnOn(); // Turn on the bulb
            types[i].turnOff(); // Turn off the bulb
        }

        // Increase brightness of the SmartBulb directly
        sb.increase(); 
        // Calls the increase() method of SmartBulb

        // Decrease brightness of the DimmableBulb by casting to Adjustable
        ((Adjustable) types[1]).decrease();
        // Cast types[1] (DimmableBulb) to Adjustable and call decrease() 

        // Connect the SmartBulb to the network by casting to Connectable
        ((Connectable) types[0]).connect();
         //Cast types[0] (SmartBulb) to Connectable and call connect()

    }
}