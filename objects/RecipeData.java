/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recipease.objects;

import java.util.HashSet;

/**
 *
 * @author Laura
 */
public class RecipeData {

String name;
String ingredients;
String method;
String cuisine;
String meal;
String serves;
String time;

    public RecipeData(){

    }
    
    //Set methods
    public void setName(String n){this.name = n;}
    public void setIngredients(String i){this.ingredients = i;}
    public void setMethod(String m){this.method = m;}
    public void setCuisine(String c){this.cuisine = c;}
    public void setMeal(String ml){this.meal = ml;}
    public void setServes(String s){this.serves = s;}
    public void setTime(String t){this.time = t;}
    
    
    //Get methods
    
    public String getName(){return name;}
    public String getIngredients(){return ingredients;}
    public String getMethod(){return method;}
    public String getCuisine(){return cuisine;}
    public String getMeal(){return meal;}
    public String getServes(){return serves;}
    public String getTime(){return time;}
    

    
}
