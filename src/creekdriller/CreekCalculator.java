/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creekdriller;
/**
 *
 * @author garysmith
 */
public class CreekCalculator {
    private Double radius;
    private Double horizToCreekCentre;
    private Double vertToCreekCentre;
    private Double rodLength;
    private Double angleA;
    private Double angleB;
    
    CreekCalculator(){}
public void setHorizToCreekCentre(Double htcc){
    this.horizToCreekCentre = htcc;
}
public void setVertToCreekCentre(Double vtcc){
    this.vertToCreekCentre = vtcc;
}
public void setRodLength(Double rodLen){
    this.rodLength = rodLen;
}
public Double getRadius(){
    try{
    Double sq = Double.parseDouble("2");
    Double htccSquared = Math.pow((2 * this.horizToCreekCentre), sq);
    Double vtccSquared = Math.pow(this.vertToCreekCentre, sq);
    
    this.radius = (htccSquared + 4 * vtccSquared)/(8 * this.vertToCreekCentre);
    return this.radius;
    }
    catch(Exception e){
        System.out.println(e);
        return Double.parseDouble("0");
    }
}
public Double getAngleA(){
    this.angleA = Math.sin((this.rodLength/2)/this.radius);
    return this.angleA;
}
public Double getAngleB(){
    this.angleB = 180 - this.angleA;
    return this.angleB;
}
}
