package salesanalysis;

public class SalesAnalysis {

	    private double[] sales;
	    

	    public SalesAnalysis(int i) {
	     this.sales = new double[i];
	       
	    }

	    public void addSale(double saleAmount, int i) {
			sales[i]=saleAmount;
		

	           
	    }

	    public double calculateTotalSales() {
	        double totalSales = 0;
	        for (double sale : sales) {
	            totalSales = totalSales + sale;
	        }
	        return totalSales;
	    }

	    public double calculateAverageDailySales() {
	        double totalSales = calculateTotalSales();
	        double avgsales = totalSales / sales.length;
	        return avgsales;
	    }

	    public int findBestSalesDay() {
	    	int bestDay=0;
			double highestSale=sales[0];
			for(int i=0; i<sales.length;i++) {
				if(sales[i]>highestSale) {
					highestSale=sales[i];
					bestDay=i;
				}
			}
	        return bestDay;
	    }

	    public int findWorstSalesDay() {
	    	int worstDay=0;
			double lowestSale=sales[0];
			for(int i=0; i<sales.length;i++) {
				if(sales[i]<lowestSale) {
					lowestSale=sales[i];
					worstDay=i;
				}
			}
	        return worstDay;
	    }

	    public void displaySalesReport() {
			System.out.println("Total Sales: "+calculateTotalSales());
			System.out.println("Average daily sales: "+calculateAverageDailySales());
			System.out.println("Best Sales Day: "+findBestSalesDay());
			System.out.println("Worst Sales Day: "+findWorstSalesDay());
			
		}
	
	public static void main(String[] args) {
		SalesAnalysis obj = new SalesAnalysis(7);
		obj.addSale(1000.00, 0);
		obj.addSale(3000.00, 1);
		obj.addSale(2500.00, 2);
		obj.addSale(500.00, 3);
		obj.addSale(4000.00, 4);
		obj.addSale(3500.00, 5);
		obj.addSale(1500.00, 6);
         obj.displaySalesReport();
	}

}
