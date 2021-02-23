package colorcoder;

/**
 * Enumeration for Minor Colors
 *
 * @author PDH2COB
 */
public enum MinorColor implements IColor {

                                          BLUE(0),
                                          ORANGE(1),
                                          GREEN(2),
                                          BROWN(3),
                                          SLATE(4);

  private int index;

  private MinorColor(final int index) {
    this.index = index;
  }

  @Override
  public int getIndex() {
    return this.index;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public IColor[] getValues() {
    return MinorColor.values();
  }


}
