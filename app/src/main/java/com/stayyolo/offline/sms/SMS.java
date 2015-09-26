package com.stayyolo.offline.sms;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.design.widget.Snackbar;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.stayyolo.offline.R;
import com.stayyolo.offline.location.AppLocationService;

/**
 * Created by parth on 27/9/15.
 */
public class SMS {

    public static final int sendToNumber = 51115;

    public static void sendSMS(Context context){


        Location gpsLocation = new AppLocationService(context)
                .getLocation(context,LocationManager.PASSIVE_PROVIDER);

        double lat = 0;
        double lng = 0;

        if (gpsLocation != null) {
            double latitude = gpsLocation.getLatitude();
            double longitude = gpsLocation.getLongitude();
            lat= latitude;
            lng = longitude;
            Toast.makeText(
                    context.getApplicationContext(),
                    "Mobile Location (GPS): \nLatitude: " + latitude
                            + "\nLongitude: " + longitude,
                    Toast.LENGTH_LONG).show();
        } else {
            Log.d("parth"," bad luck");
        }


        String smsMessage = "@bookola "+lat+","+lng;

        Log.d("parth",smsMessage);
//        try {
//            SmsManager smsManager = SmsManager.getDefault();
//            smsManager.sendTextMessage(""+sendToNumber, null, smsMessage, null, null);
////            Toast.makeText(getApplicationContext(), "SMS sent.",
////                    Toast.LENGTH_LONG).show();
//            Snackbar.make(((Activity) context).findViewById(R.id.rootView),"This is sample snack bar text", Snackbar.LENGTH_SHORT).show();
//
//
//        } catch (Exception e) {
////            Toast.makeText(getApplicationContext(),
////                    "Sending SMS failed.",
////                    Toast.LENGTH_LONG).show();
//            e.printStackTrace();
//        }



    }



}
