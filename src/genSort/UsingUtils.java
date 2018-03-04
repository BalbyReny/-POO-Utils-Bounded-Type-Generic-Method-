package genSort;

public class UsingUtils
{
    public static void main(String args[])
    {
        //para utilizar quickSort desde Utils los arrays deben ser definidos de cualquier clase wrapper que herede de Number
        Integer[] intVector = {101, 99, 12, 19, 21, 111, 345, 25, 77, 81};
        Utils.quickSort(intVector);
        System.out.println("Integer Vector: ");
        Utils.printArray(intVector);
        
        Float[] floatVector = {19.1f, 456.6f, 23.45f, 12.34f, 11.11f, 354.55f, 78.45f, 28.33f, 45.99f, 108.88f};
        Utils.quickSort(floatVector);
        System.out.println("Float Vector: ");
        Utils.printArray(floatVector);
        
        Double[] doubleVector = {259.3, 12.34, 123.904, 56.423, 190.9, 69.01, 135.8, 359.99, 177.842, 202.51};
        Utils.quickSort(doubleVector);
        System.out.println("Double Vector: ");
        Utils.printArray(doubleVector);
        
        Byte[] byteVector = {0x75, 0x43, 0x3c, 0x6f, 0x5a, 0x7d, 0x4a, 0x22, 0x77, 0x0a};
        Utils.quickSort(byteVector);
        System.out.println("Byte Vector: ");
        Utils.printArray(byteVector);
        
        //Utils.printArray funciona con cualquier tipo
        String [] strVector = {"zz", "aa", "cc", "hh", "bb", "ee", "ll"};
        System.out.println("String Vector: (unsorted bc Utils.quickSort doesn't apply to this type)");
        Utils.printArray(strVector);
        //pero esto no es posible ya que String no hereda de Number
        //Utils.quickSort(strVector);
    }
}