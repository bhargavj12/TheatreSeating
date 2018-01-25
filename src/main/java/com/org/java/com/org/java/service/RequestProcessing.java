package com.org.java.com.org.java.service;

import com.org.java.com.org.java.models.PreSaleRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bhargav on 1/23/2018.
 */
public class RequestProcessing {


    public static List<PreSaleRequest> requestList = new ArrayList<>();

    // Method to store the requests in a list
    public void getPreSaleRequests(String requests) throws NumberFormatException{

        PreSaleRequest preSaleRequest = null;

        //Splitting multiple requests and saving the pre-sale requests in an array
        String[] tempRequest = requests.split(System.lineSeparator());

        for(String requestEntry: tempRequest){

            //Splitting the single request
            String[] requestArray = requestEntry.split(" ");
            preSaleRequest=new PreSaleRequest();

            //Saving the person's name
            preSaleRequest.setName(requestArray[0]);

            try{
                //Saving the requested tickets
                preSaleRequest.setTickets(Integer.valueOf(requestArray[1]));

            }catch (NumberFormatException e){

                throw new NumberFormatException(requestArray[1]+" is invalid pre-sale request");
            }
            preSaleRequest.setFlag(false);

            //Storing the request into a list
            requestList.add(preSaleRequest);

        }
            for(int i=0;i<requestList.size();i++){
                System.out.println(requestList.get(i).getName()+","+requestList.get(i).getTickets());
            }

        }




}