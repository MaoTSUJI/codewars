import java.util.List;

// TODO: complete this object/class

public class PaginationHelper<I> {

  private List<I> collection;
  private int itemsPerPage;

  /**
   * The constructor takes in an array of items and a integer indicating how many
   * items fit within a single page
   */
  public PaginationHelper(List<I> collection, int itemsPerPage) {
    this.collection = collection;
    this.itemsPerPage = itemsPerPage;
    System.out.println(collection + ", " + itemsPerPage);
  }

  /**
   * returns the number of items within the entire collection
   */
  public int itemCount() {
    return collection.size();
  }

  /**
   * returns the number of pages
   */
  public int pageCount() {
    return itemCount() % itemsPerPage > 0 ? itemCount() / itemsPerPage + 1 : itemCount() / itemsPerPage;
  }

  /**
   * returns the number of items on the current page. page_index is zero based.
   * this method should return -1 for pageIndex values that are out of range
   */
  public int pageItemCount(int pageIndex) {
    if (pageIndex + 1 > pageCount()) {
      return -1;
    } else if ((pageIndex + 1) == pageCount() && itemCount() % itemsPerPage > 0) {
      return itemCount() % itemsPerPage;
    }
    return itemsPerPage;
  }

  /**
   * determines what page an item is on. Zero based indexes this method should
   * return -1 for itemIndex values that are out of range
   */
  public int pageIndex(int itemIndex) {
    if (itemIndex < 0 || itemCount() == 0 || itemIndex > itemCount()) {
      return -1;
    }
    return itemIndex / itemsPerPage;
  }
}