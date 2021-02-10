package com.wcoding;

public class TextBox extends UIControl {
    private String text = "";

    public TextBox(boolean isEnabled, String text) {
        super(isEnabled);
        this.text = text;
    }

    @Override
    public String toString(){
        return this.text;
    };

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}
