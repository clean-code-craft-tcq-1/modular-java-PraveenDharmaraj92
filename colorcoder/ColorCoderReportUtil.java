package colorcoder;

/**
 * Class for ColorCode Reporting
 *
 * @author PDH2COB
 */
public class ColorCoderReportUtil {

  private static ColorCoderReportUtil instance = null;

  private ColorCoderReportUtil() {

  }


  /**
   * Method to print color pairs and corresponding pair numbers
   */
  public void printColorCodeManual() {
    for (int majorCode = 0; majorCode <= (MajorColor.values().length - 1); majorCode++) {
      MajorColor majorColor = (MajorColor) ColorUtil.getInstance().getColorFromIndex(MajorColor.values(), majorCode);
      for (int minorCode = 0; minorCode <= (MinorColor.values().length - 1); minorCode++) {
        MinorColor minorColor = (MinorColor) ColorUtil.getInstance().getColorFromIndex(MinorColor.values(), minorCode);

        ColorPair colorPair = new ColorPair(majorColor, minorColor);
        int pairNum = new ColorCoder(colorPair).getPairNumberFromColor();
        System.out.println(colorPair.toString() + "-" + pairNum);
      }
    }
  }

  /**
   * @return instance of ColorUtil
   */
  public static ColorCoderReportUtil getInstance() {
    if (instance == null) {
      instance = new ColorCoderReportUtil();
    }
    return instance;
  }


}

