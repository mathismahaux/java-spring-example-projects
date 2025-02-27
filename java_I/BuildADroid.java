public class Droid
{
  String name;
  int batteryLevel;

  public Droid(String droidName)
  {
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task)
  {
    System.out.println(name + " is performing task: " + task + ".");
    batteryLevel -= 10;
  }

  public void energyReport()
  {
    System.out.println("Remaining battery for " + name + ": " + batteryLevel + "%.");
  }

  public void energyTransfer(Droid d)
  {
    System.out.println("Transfering energy from " + name + " to " + d.name + "...");
    batteryLevel -= 10;
    d.batteryLevel += 10;
  }

  public String toString()
  {
    return "Hello, I'm the droid: " + name + ".";
  }

  public static void main(String[] args)
  {
    Droid codey = new Droid("Codey");
    Droid rTwo = new Droid("R2D2");
    System.out.println(codey);
    System.out.println(rTwo);
    codey.performTask("Cleaning");
    codey.energyReport();
    rTwo.performTask("Repairing the ship");
    rTwo.performTask("Zapping a bad guy");
    rTwo.energyReport();
    codey.energyTransfer(rTwo);
    codey.energyReport();
    rTwo.energyReport();
  }
}