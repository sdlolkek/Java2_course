/**
 Class that represents a rectangle.
*/
public class Rectangle
{
    private int width;
    private int height; 
 private int area;
 
 /** @param - width and heigth
   @return - area
   */
    public void setDimensions(int newWidth, int newHeight)
    {
        width = newWidth;
        height = newHeight;
  area = width * height;
    }

    public int getArea()
    {
  return area;
 }
}