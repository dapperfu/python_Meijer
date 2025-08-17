package com.bazaarvoice.bvandroidsdk;

import android.os.AsyncTask;
import com.bazaarvoice.bvandroidsdk.AdIdRequestTask;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes4.dex */
public class BVRecommendations {
    private static final String TAG = "BVRecommendations";

    public interface BVRecommendationsCallback {
        void onFailure(Throwable th2);

        void onSuccess(BVRecommendationsResponse bVRecommendationsResponse);
    }

    public interface BVRecommendationsLoader {
        void loadRecommendations(RecommendationsRequest recommendationsRequest, BVRecommendationsCallback bVRecommendationsCallback);
    }

    private static final class GetRecommendationsTask extends AsyncTask<RequestData, Void, BVRecommendationsResponse> {
        private final BVLogger bvLogger;
        private final WeakReference<BVRecommendationsCallback> cbWeakRef;

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ee A[PHI: r4 r9
          0x00ee: PHI (r4v11 okhttp3.Response) = (r4v9 okhttp3.Response), (r4v10 okhttp3.Response), (r4v13 okhttp3.Response) binds: [B:32:0x00ec, B:43:0x0114, B:38:0x0104] A[DONT_GENERATE, DONT_INLINE]
          0x00ee: PHI (r9v11 java.lang.Exception) = (r9v9 java.lang.Exception), (r9v10 java.lang.Exception), (r9v13 java.lang.Exception) binds: [B:32:0x00ec, B:43:0x0114, B:38:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.bazaarvoice.bvandroidsdk.BVRecommendationsResponse doInBackground(com.bazaarvoice.bvandroidsdk.BVRecommendations.RequestData... r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bazaarvoice.bvandroidsdk.BVRecommendations.GetRecommendationsTask.doInBackground(com.bazaarvoice.bvandroidsdk.BVRecommendations$RequestData[]):com.bazaarvoice.bvandroidsdk.BVRecommendationsResponse");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(BVRecommendationsResponse bVRecommendationsResponse) {
            super.onPostExecute((GetRecommendationsTask) bVRecommendationsResponse);
            BVRecommendationsCallback bVRecommendationsCallback = this.cbWeakRef.get();
            if (bVRecommendationsCallback == null) {
                this.bvLogger.w(BVRecommendations.TAG, "Your Recommendations callback was recycled.");
                return;
            }
            if (bVRecommendationsResponse.isDidSucceed()) {
                this.bvLogger.d(BVRecommendations.TAG, "Successfully received the following recommendations:\n" + bVRecommendationsResponse.getRecommendedProducts().toString());
                bVRecommendationsCallback.onSuccess(bVRecommendationsResponse);
            } else {
                bVRecommendationsResponse.getErrorThrowable().printStackTrace();
                bVRecommendationsCallback.onFailure(bVRecommendationsResponse.getErrorThrowable());
            }
            this.cbWeakRef.clear();
        }

        GetRecommendationsTask(WeakReference<BVRecommendationsCallback> weakReference, BVLogger bVLogger) {
            this.cbWeakRef = weakReference;
            this.bvLogger = bVLogger;
        }
    }

    private static final class RequestData {
        private URL requestUrl;

        URL getRequestUrl() {
            return this.requestUrl;
        }

        RequestData(URL url) {
            this.requestUrl = url;
        }
    }

    private static final class RecAdIdCallback implements AdIdRequestTask.AdIdCallback {
        private WeakReference<BVRecommendationsCallback> bvRecCbWeakRef;
        private BVRecommendations recs;
        private RecommendationsRequest request;

        RecAdIdCallback(BVRecommendations bVRecommendations, RecommendationsRequest recommendationsRequest, WeakReference<BVRecommendationsCallback> weakReference) {
            this.recs = bVRecommendations;
            this.request = recommendationsRequest;
            this.bvRecCbWeakRef = weakReference;
        }

        @Override // com.bazaarvoice.bvandroidsdk.AdIdRequestTask.AdIdCallback
        public void onAdInfoComplete(AdIdResult adIdResult) {
            if (adIdResult.getAdInfo() != null) {
                this.recs.fetchRecommendations(adIdResult.getAdId(), this.request, this.bvRecCbWeakRef);
                return;
            }
            BVRecommendationsCallback bVRecommendationsCallback = this.bvRecCbWeakRef.get();
            if (bVRecommendationsCallback != null) {
                bVRecommendationsCallback.onFailure(new Exception(adIdResult.getErrorMessage()));
            }
        }
    }

    public void getRecommendedProducts(RecommendationsRequest recommendationsRequest, BVRecommendationsCallback bVRecommendationsCallback) {
        new AdIdRequestTask(BVSDK.getInstance().getBvUserProvidedData().getAppContext(), new RecAdIdCallback(this, recommendationsRequest, new WeakReference(bVRecommendationsCallback))).execute(new Void[0]);
    }

    public BVRecommendations() {
        String apiKeyShopperAdvertising = BVSDK.getInstance().getBvUserProvidedData().getBvConfig().getApiKeyShopperAdvertising();
        if (apiKeyShopperAdvertising != null && !apiKeyShopperAdvertising.isEmpty()) {
        } else {
            throw new IllegalStateException("BVRecommendations SDK requires a shopper advertising api key");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fetchRecommendations(String str, RecommendationsRequest recommendationsRequest, WeakReference<BVRecommendationsCallback> weakReference) {
        try {
            new GetRecommendationsTask(weakReference, BVSDK.getInstance().getBvLogger()).execute(new RequestData(new URL(RecommendationsRequest.toUrlString(BVSDK.getInstance(), str, recommendationsRequest))));
        } catch (MalformedURLException e10) {
            e10.printStackTrace();
            BVRecommendationsCallback bVRecommendationsCallback = weakReference.get();
            if (bVRecommendationsCallback != null) {
                bVRecommendationsCallback.onFailure(e10);
                weakReference.clear();
            }
        }
    }
}
