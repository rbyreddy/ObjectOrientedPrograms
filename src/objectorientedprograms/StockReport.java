package objectorientedprograms;

public class StockReport {

        private String stockNames;
        private Double numOfShare;
        private Double sharePrice;
        private double totalSharePrice;

        public StockReport(String stockNames, Double numOfShare, Double sharePrice) {
            super();
            this.stockNames = stockNames;
            this.numOfShare = numOfShare;
            this.sharePrice = sharePrice;
        }




        public String getStockNames() {
            return stockNames;
        }

        public void setStockNames(String stockNames) {
            this.stockNames = stockNames;
        }

        public Double getNumOfShare() {
            return numOfShare;
        }

        public void setNumOfShare(Double numOfShare) {
            this.numOfShare = numOfShare;
        }

        public Double getSharePrice() {
            return sharePrice;
        }

        public void setSharePrice(Double sharePrice) {
            this.sharePrice = sharePrice;
        }

        @Override
        public String toString() {
            return "StockReport{" +
                    "stockNames='" + stockNames + '\'' +
                    ", numOfShare=" + numOfShare +
                    ", sharePrice=" + sharePrice +
                    '}';
        }
        public StockReport() {
            this.stockNames = stockNames;
            this.numOfShare = numOfShare;
            this.sharePrice = sharePrice;
            this.totalSharePrice=totalSharePrice;

        }
    }

