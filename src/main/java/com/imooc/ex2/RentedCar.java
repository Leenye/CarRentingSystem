package com.imooc.ex2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RentedCar {
    Map<String,Integer> carMap = new HashMap<String, Integer>();
    private int totalNum;
    private float cost;

    public Map<String, Integer> getCarMap() {
        return carMap;
    }

    public int getTotalNum() {
        calculateTotalNum();
        return totalNum;
    }

    public float getCost() {
        calculateTotalCost();
        return cost;
    }

    public void setCarMap(Map<String, Integer> carMap) {
        this.carMap = carMap;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    private void calculateTotalNum(){
        Iterator iterator = carMap.values().iterator();
        while (iterator.hasNext()){
            totalNum = totalNum + Integer.valueOf(iterator.next().toString());
        }
    }

    private void calculateTotalCost(){
        int totalCar = AvailableCar.getAvailableCars().size();

        Set entries = carMap.entrySet( );
        if(entries != null) {
            Iterator iterator = entries.iterator( );
            while(iterator.hasNext( )) {
                Map.Entry entry = (Map.Entry) iterator.next( );
                Object key = entry.getKey( );
                Object value = entry.getValue();
                for (int i = 0; i < totalCar; i++){
                    Car currentCar = AvailableCar.getAvailableCars().get(i);
                    if (key.toString().equals(currentCar.getName())){
                        cost += Integer.valueOf(value.toString())*currentCar.getRent();
                        continue;
                    }
                }
            }
            }
        }
}
