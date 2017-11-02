/*
 * b. for-each loop(Enhanced for loop).
 *   The for-each loop is used to traverse array or collection in java. It is easier to use
 *   than simple for loop because we don't need to increment value and use subscript notation.
 *   It works on elements basis not index. It returns element one by one in the defined variable.
 *   It was introduced in Java 5. It provides a simpler way to iterate through the elements of a
 *   collection or array. It is inflexible and should be used only when there is a need to iterate 
 *   through the elements in sequential manner without knowing the index of currently processed element.
 *   
 *   Syntax:
 *   for(T element: Collection obj/ Array){
 *   //code to be executed.
 *   }
 *   
 *   
 */
public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {22,33,44,66};
        for(int i:arr) {
        	System.out.println(i);
        }
	}

}
