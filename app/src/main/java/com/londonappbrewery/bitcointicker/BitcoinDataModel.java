package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by alex on 2/16/2018.
 */

public class BitcoinDataModel {


    //todo declare member variables here (data u want to get from the JSON)
    private double mAsk;
    private double price;

    //todo create a static method that takes in JSON
    public static BitcoinDataModel fromJson(JSONObject jsonObject) {

        try{
        BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();
        bitcoinDataModel.mAsk = jsonObject.getDouble("ask");
        bitcoinDataModel.price = jsonObject.getJSONObject("changes").getJSONObject("price").getDouble("hour");
        return bitcoinDataModel;
        }
        catch (JSONException e){
            e.printStackTrace();
            return null;
        }



    }

    public double getAsk() {
        return mAsk;
    }

    public double getPrice() {
        return price;
    }
}
