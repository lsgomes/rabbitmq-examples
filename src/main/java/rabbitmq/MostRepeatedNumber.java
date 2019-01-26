/**
 * 
 */
package rabbitmq;

import java.util.HashMap;

/**
 * 
 * @author Lucas Gomes
 *
 * Example to return the number which most repeated in array
 *
 */
public class MostRepeatedNumber {

	public static void main(String[] args) 
	{
		
		int[] numbers = { 5, 1, 5, 2, 2, 3, 5, 3, 3, 4, 5, 2, 2, 5};
		
        int number = mostRepeatedNumber(numbers);

        System.out.println( "The Most Repeated Number is " + number);
	}

	
	public static int mostRepeatedNumber( int[] numbers )
    {
        HashMap<Integer, Integer> repeats = new HashMap<Integer, Integer>();

        int index 	     = 0;

        int repetitions  = 0;
        int mostRepeated = 0;

        for (int number : numbers)
        {
            if ( repeats.containsKey(number) )
            {
                int count   = repeats.get(number);
                repetitions = count++;
                repeats.put(number, count++);
            }
            else
            {
                repetitions = 1;
                repeats.put(number, repetitions);
            }

            if ( repetitions > mostRepeated )
            {
                mostRepeated = repetitions;
                index = number;
            }

        }

        System.out.println( "Map containing the numbers and its respective count: " +  repeats);

        return index;
    }
}
