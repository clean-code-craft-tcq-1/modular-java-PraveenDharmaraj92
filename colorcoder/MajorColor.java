package colorcoder;

/**
 * Enumeration for Major colors
 *
 * @author PDH2COB
 */
public enum MajorColor implements IColor {

                                          WHITE(0),
                                          RED(1),
                                          BLACK(2),
                                          YELLOW(3),
                                          VIOLET(4);

  private int index;

  private MajorColor(final int index) {
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
    return MajorColor.values();
  }

}
