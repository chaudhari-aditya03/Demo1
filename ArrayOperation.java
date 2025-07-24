public class ArrayOperation 
{
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Grapes", "Orange", "Mango"};
       
        int[] vowelCounts = new int[fruits.length];
        
        for (int i = 0; i < fruits.length; i++)
        {
            String fruit = fruits[i];
            int count = 0;
            for (int j = 0; j < fruit.length(); j++) 
            {
                char ch = fruit.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    count++;
                }
            }
            vowelCounts[i] = count;
        }
        for (int i = 0; i < fruits.length; i++) 
        {
            System.out.println(fruits[i] + "   " + vowelCounts[i]);
        }
    }
}
