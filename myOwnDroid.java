export class Droid {
    int batteryLevel;

    /*
    Create a Droid with batteryLevel 100
    start Methode => activate()       => batterylevel 95
    start Methode => chargeBattery(5) => batterylevel 100
    start Methode => hover(1)         => batterylevel 80

    */
    public constructor(int batteryLevel) {
        this.batteryLevel = 100;
    }

    public void activate() {
        System.out.println('Activate. How can I help you?');
        this.batteryLevel -= 5;{
            if (batteryLevel >= 100) {
                System.out.println('Battery level ist full, Loading not possible!');
                checkBatteryLevel();
            } else {
                System.out.println('Droid charging...');
                this.batteryLevel += hours;
                checkBatteryLevel();
            }
        }
        checkBatteryLevel();
    }

    public int chargeBattery(int hours)

    public int checkBatteryLevel() {
        System.out.println('Battery level is:' + batteryLevel +'percent.');
    }

    public void hover(int feet) {
        if (feet >2) {
            System.out.println(`Error! I can't hover above 2 feet`);
        } else {
            System.out.println('Hovering');
            this.batteryLevel -= feet;
            checkBatteryLevel();
        }
    }

    public static void main (String[] args) {
        Droide = new Droid(constructor());
        activate();
        chargeBattery(5);
        hover(1);
    }

}