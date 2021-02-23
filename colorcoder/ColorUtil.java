/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder;


/**
 * Common Singleton util class for MajorColor and MinorColor enums
 *
 * @author PDH2COB
 */
public class ColorUtil {

  private static ColorUtil instance = null;

  private ColorUtil() {

  }

  /**
   * @param color - Major color / Minor color values
   * @param index - 0,1,2,3,4
   * @return MinorColor based on index
   */
  public IColor getColorFromIndex(final IColor[] color, final int index) {
    for (IColor iColor : color) {
      if (iColor.getIndex() == index) {
        return iColor;
      }
    }
    return null;
  }

  /**
   * @return instance of ColorUtil
   */
  public static ColorUtil getInstance() {
    if (instance == null) {
      instance = new ColorUtil();
    }
    return instance;
  }

}
