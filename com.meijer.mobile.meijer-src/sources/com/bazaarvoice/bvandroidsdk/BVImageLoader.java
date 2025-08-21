package com.bazaarvoice.bvandroidsdk;

import M6.b;
import android.graphics.Bitmap;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
final class BVImageLoader implements ImageLoader {
    private final BVLogger bvLogger;
    private final OkHttpClient okHttpClient;

    @Override // com.bazaarvoice.bvandroidsdk.ImageLoader
    public Bitmap loadImage(String str) {
        Bitmap bitmapD = null;
        try {
            Response responseExecute = FirebasePerfOkHttpClient.execute(this.okHttpClient.b(new Request.a().t(str).b()));
            if (responseExecute.getIsSuccessful()) {
                bitmapD = b.d(responseExecute.getBody().bytes(), HttpResponseStatus.ERROR_BAD_REQUEST, 260);
            } else {
                this.bvLogger.e("ContentValues", "Unexpected code " + responseExecute);
            }
            responseExecute.getBody().close();
            return bitmapD;
        } catch (IOException e10) {
            e10.printStackTrace();
            return bitmapD;
        }
    }

    BVImageLoader(OkHttpClient okHttpClient, BVLogger bVLogger) {
        this.okHttpClient = okHttpClient;
        this.bvLogger = bVLogger;
    }
}
