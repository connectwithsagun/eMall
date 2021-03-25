package com.savatechnology.emall.Models;


public class FavouriteList {

    private int imgProduct;
    private String tvProductTitle;
    private String tvSupplierName;




    public void setimgProduct(int imgProduct) {
        this.imgProduct = imgProduct;
    }

    public void setTvProductTitle(String tvProductTitle) {
        this.tvProductTitle = tvProductTitle;
    }

    public void setTvSupplierName(String tvSupplierName) {
        this.tvSupplierName = tvSupplierName;
    }





    public FavouriteList(int imgProduct, String tvProductTitle, String tvSupplierName){
        this.imgProduct=imgProduct;
        this.tvProductTitle=tvProductTitle;
        this.tvSupplierName=tvSupplierName;


    }

    public FavouriteList(){

    }


    public int getimgProduct() {
        return imgProduct;
    }

    public String gettvProductTitle() {
        return tvProductTitle;
    }

    public String gettvSupplierName() {
        return tvSupplierName;
    }



}