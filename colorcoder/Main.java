package colorcoder;

/**
 * Main class to test color pair functionality
 *
 * @author PDH2COB
 */
public class Main {

  /**
   * Method to test getColorFromPairNumber()
   *
   * @param pairNumber         - pairNumber
   * @param expectedMajorColor - major color
   * @param expectedMinorColor -minor color
   */
  public static void testColorFromPairNumber(final int pairNumber, final MajorColor expectedMajorColor,
      final MinorColor expectedMinorColor) {
    ColorPair expectedColorPair = new ColorPair(expectedMajorColor, expectedMinorColor);
    ColorCoder colorCoder = new ColorCoder(expectedColorPair);
    ColorPair actualColorPair = colorCoder.getColorFromPairNumber(pairNumber);
    System.out.println("Got pair " + actualColorPair.toString());
    assert (expectedColorPair.getMajorColor() == actualColorPair.getMajorColor());
    assert (expectedColorPair.getMinorColor() == actualColorPair.getMinorColor());
  }

  /**
   * Method to test getPairNumberFromColor()
   *
   * @param majorColor         major color
   * @param minorColor         minor color
   * @param expectedPairNumber - expected output
   */
  public static void testPairNumberFromColor(final MajorColor majorColor, final MinorColor minorColor,
      final int expectedPairNumber) {
    ColorPair colorPair = new ColorPair(majorColor, minorColor);
    ColorCoder colorCoder = new ColorCoder(colorPair);
    int pairNumber = colorCoder.getPairNumberFromColor();
    System.out.println("Got pair number " + pairNumber);
    assert (pairNumber == expectedPairNumber);
  }

  /**
   * Main method
   *
   * @param args
   */
  public static void main(final String[] args) {
    testColorFromPairNumber(4, MajorColor.WHITE, MinorColor.BROWN);
    testColorFromPairNumber(5, MajorColor.WHITE, MinorColor.SLATE);

    testPairNumberFromColor(MajorColor.BLACK, MinorColor.ORANGE, 12);
    testPairNumberFromColor(MajorColor.VIOLET, MinorColor.SLATE, 25);

    ColorCoderReportUtil.getInstance().printColorCodeManual();
  }
}
