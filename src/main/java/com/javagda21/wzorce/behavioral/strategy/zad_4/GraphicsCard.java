package com.javagda21.wzorce.behavioral.strategy.zad_4;

public class GraphicsCard {

    private  IGraphicsSetting iGraphicsSetting;

    public GraphicsCard(IGraphicsSetting iGraphicsSetting) {
        this.iGraphicsSetting = iGraphicsSetting;
    }

    public void setiGraphicsSetting (IGraphicsSetting iGraphicsSetting){
        this.iGraphicsSetting = iGraphicsSetting;
    }

    public void processFrame (int [][] frame){}
}
