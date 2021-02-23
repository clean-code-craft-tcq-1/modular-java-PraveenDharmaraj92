package colorcoder;

/**
 * Class for color coding functionalities
 *
 * @author PDH2COB
 */
public class ColorCoder {

  private final ColorPair colorPair;

  /**
   * @param colorPair - colorPair object
   */
  public ColorCoder(final ColorPair colorPair) {
    this.colorPair = colorPair;
  }

  /**
   * Method to return ColorPair based on pair number
   *
   * @param pairNumber - pairNum
   * @return ColorPair
   */
  public ColorPair getColorFromPairNumber(final int pairNumber) {
    int zeroBasedPairNumber = pairNumber - 1;
    MajorColor majorColor = (MajorColor) ColorUtil.getInstance().getColorFromIndex(MajorColor.values(),
        zeroBasedPairNumber / this.colorPair.getMajorcolors().length);
    MinorColor minorColor = (MinorColor) ColorUtil.getInstance().getColorFromIndex(MinorColor.values(),
        zeroBasedPairNumber % this.colorPair.getMinorcolors().length);
    return new ColorPair(majorColor, minorColor);
  }

  /**
   * Method to return pair number from color pair
   *
   * @return pairNumber
   */
  public int getPairNumberFromColor() {
    return (this.colorPair.getMajorColor().getIndex() * this.colorPair.getMinorcolors().length) +
        this.colorPair.getMinorColor().getIndex() + 1;
  }


}
