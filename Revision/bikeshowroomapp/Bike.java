public class Bike {
   int bikeQty;

   public Bike(int bikeQty) {
      this.bikeQty = bikeQty;
   }

   public int getBikeQty() {
      return bikeQty;
   }

   public void orderedQty(int orderedQty) throws InvalidStockException {
      if (orderedQty <= 0) {
         throw new InvalidStockException("Invalid ordered qty");
      } else if (orderedQty > bikeQty) {
         System.out.println("Order qty is greater than available qty so Allocation is done for available qty: " + bikeQty);
         System.out.println("Backordered quantity = " + (orderedQty - bikeQty));
         orderedQty = bikeQty;

      } else {
         bikeQty = bikeQty - orderedQty;
         System.out.println("Ordered for: " +orderedQty+ " bikes has been allocated");
         System.out.println("Remaining quantity: " + bikeQty);
      }

   }
}
