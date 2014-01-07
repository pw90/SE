/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Adam Szaraniec
 */
public class Instance {
    
    public Instance() {
        
    }
    
    private int customer;

    private int x;

    private int y;

    private int demand;

    private int readyTime;

    private int dueDate;

    private int serviceTime;
    
    private String data;
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(data);
        ArrayList numbers = new ArrayList();
        
        while (m.find()) {
          numbers.add(m.group());
        }
        
        this.customer    = Integer.parseInt(numbers.get(0).toString());
        this.x           = Integer.parseInt(numbers.get(1).toString());
        this.y           = Integer.parseInt(numbers.get(2).toString());
        this.demand      = Integer.parseInt(numbers.get(3).toString());
        this.readyTime   = Integer.parseInt(numbers.get(4).toString());
        this.dueDate     = Integer.parseInt(numbers.get(5).toString());
        this.serviceTime = Integer.parseInt(numbers.get(6).toString());
    }

    
    /**
     * @return the customer
     */
    public int getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(int customer) {
        this.customer = customer;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the demand
     */
    public int getDemand() {
        return demand;
    }

    /**
     * @param demand the demand to set
     */
    public void setDemand(int demand) {
        this.demand = demand;
    }

    /**
     * @return the readyTime
     */
    public int getReadyTime() {
        return readyTime;
    }

    /**
     * @param readyTime the readyTime to set
     */
    public void setReadyTime(int readyTime) {
        this.readyTime = readyTime;
    }

    /**
     * @return the dueDate
     */
    public int getDueDate() {
        return dueDate;
    }

    /**
     * @param dueDate the dueDate to set
     */
    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * @return the serviceTime
     */
    public int getServiceTime() {
        return serviceTime;
    }

    /**
     * @param serviceTime the serviceTime to set
     */
    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }
    
}
