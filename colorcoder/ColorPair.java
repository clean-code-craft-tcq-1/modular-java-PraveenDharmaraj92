package colorcoder;

/**
 * Class for color pair
 *
 * @author PDH2COB
 */
public class ColorPair {

  private final String majorColors[] = { "White", "Red", "Black", "Yellow", "Violet" };

  private final String minorColors[] = { "Blue", "Orange", "Green", "Brown", "Slate" };

  private final MajorColor majorColor;
  private final MinorColor minorColor;

  /**
   * @param majorColor - major color
   * @param minorColor - minor color
   */
  public ColorPair(final MajorColor majorColor, final MinorColor minorColor) {
    this.majorColor = majorColor;
    this.minorColor = minorColor;
  }

  /**
   * @return major color
   */
  public MajorColor getMajorColor() {
    return this.majorColor;
  }

  /**
   * @return minor color
   */
  public MinorColor getMinorColor() {
    return this.minorColor;
  }


  /**
   * @return major color array
   */
  public String[] getMajorcolors() {
    return this.majorColors;
  }

  /**
   * @return minor color array
   */
  public String[] getMinorcolors() {
    return this.minorColors;
  }

  @Override
  public String toString() {
    String colorPairStr = this.majorColors[this.majorColor.getIndex()];
    colorPairStr += " ";
    colorPairStr += this.minorColors[this.minorColor.getIndex()];
    return colorPairStr;
  }

}
