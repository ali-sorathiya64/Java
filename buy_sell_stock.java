public class buy_sell_stock {

    public static int buyAndSellStocks(int prices[]){

int buyPrice =Integer.MAX_VALUE;

int maxP =0;
for (int i=0; i<prices.length; i++){

    if (buyPrice < prices[i]){
        int profit =  prices[i]- buyPrice ;  
        maxP = Math.max(maxP, profit);   
    }

    else{
        
    
    buyPrice = prices[i];
    }
   
}
return maxP;

    }
    public static void main(String args[]){

        int price []={7,1,5,3,6,4};
      System.out.println ( buyAndSellStocks(price));
    }
}
