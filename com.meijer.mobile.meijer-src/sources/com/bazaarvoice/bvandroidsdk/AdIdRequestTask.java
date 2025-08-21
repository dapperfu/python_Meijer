package com.bazaarvoice.bvandroidsdk;

import Kc.a;
import android.content.Context;
import android.os.AsyncTask;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes4.dex */
class AdIdRequestTask extends AsyncTask<Void, Void, AdIdResult> {
    private static final String TAG = "AdIdRequestTask";
    private AdIdCallback adIdCallback;
    private Context applicationContext;

    interface AdIdCallback {
        void onAdInfoComplete(AdIdResult adIdResult);
    }

    static AdIdResult getAdId(Context context) throws GooglePlayServicesRepairableException, IllegalStateException, GooglePlayServicesNotAvailableException, IOException {
        String message;
        a.C0277a c0277aA = null;
        try {
            c0277aA = Kc.a.a(context);
            message = null;
        } catch (GooglePlayServicesNotAvailableException e10) {
            message = e10.getMessage();
        } catch (GooglePlayServicesRepairableException e11) {
            e11.printStackTrace();
            message = e11.getMessage();
        } catch (IOException e12) {
            message = e12.getMessage();
        }
        return new AdIdResult(c0277aA, message);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public AdIdResult doInBackground(Void... voidArr) {
        return getAdId(this.applicationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(AdIdResult adIdResult) {
        super.onPostExecute((AdIdRequestTask) adIdResult);
        if (adIdResult.getErrorMessage() != null) {
            FS.log_e(TAG, adIdResult.getErrorMessage());
        }
        AdIdCallback adIdCallback = this.adIdCallback;
        if (adIdCallback != null) {
            adIdCallback.onAdInfoComplete(adIdResult);
        }
        this.adIdCallback = null;
    }

    AdIdRequestTask(Context context, AdIdCallback adIdCallback) {
        if (context != null) {
            if (adIdCallback != null) {
                this.applicationContext = context;
                this.adIdCallback = adIdCallback;
                return;
            }
            throw new IllegalArgumentException("Must set callback");
        }
        throw new IllegalArgumentException("Must set application context");
    }
}
