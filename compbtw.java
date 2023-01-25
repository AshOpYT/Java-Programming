public class compbtw
{
 public static void main(String[] args)
 {
  int start = 1;
  int end = 10;
  int count = 0;
  int i = 1;

  System.out.format("Composite Numbers between %d and %d:\n", start, end);
  for(start=start; start<=end; start++)
  {
   for(i=1; i<=start; i++)
   {
    if(start % i == 0)
     count++;
   }
   if(count > 2)
    System.out.format("%d ", start);
   count = 0;
  }
 }
}
