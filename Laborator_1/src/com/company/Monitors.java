package com.company;

public class Monitors {
    private String Brand;
    private String Model;
    private String Color;
    private int Dimension;
    private String Resolution;

    public Monitors (String Brand, String Model, String Color, int Dimension, String Resolution){
        this.Brand = Brand;
        this.Model = Model;
        this.Color = Color;
        this.Dimension = Dimension;
        this.Resolution = Resolution;
    }
    public void updateBrand(String Brand){
        this.Brand = Brand;
    }
    public void updateModel(String Model){
        this.Model = Model;
    }
    public void updateColor(String Color){
        this.Color = Color;
    }
    public void updateDimension(int Dimension){
        this.Dimension = Dimension;
    }
    public void updateResolution(String Resolution){
        this.Resolution = Resolution;
    }
    public String getBrand(){
        return Brand;
    }
    public String getModel(){
        return Model;
    }
    public String getColor(){
        return Color;
    }
    public int getDimension(){
        return Dimension;
    }
    public String getResolution(){
        return Resolution;
    }
    public void print(){
        System.out.println("Brand: "+getBrand()+";\nModel: "+getModel()+";\nColor: "+getColor()+";\nDimension: "+getDimension()+";\nResolution: "+getResolution()+";\n");
    }
    public boolean isEqual(Monitors o){
      if((Color == o.Color) && (Dimension == o.Dimension) && (Resolution == o.Resolution)){
          return true;
      }
      else return false;
    }
}