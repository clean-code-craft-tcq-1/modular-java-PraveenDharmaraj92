/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */
package colorcoder;


/**
 * Common interface for MajorColor, MinorColor enums
 * 
 * @author PDH2COB
 */
public interface IColor {

  /**
   * @return index
   */
  int getIndex();

  /**
   * @return values of MajorColor/MinorColor
   */
  IColor[] getValues();

}
