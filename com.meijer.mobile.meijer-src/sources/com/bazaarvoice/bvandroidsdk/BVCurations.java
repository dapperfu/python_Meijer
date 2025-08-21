package com.bazaarvoice.bvandroidsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public class BVCurations {
    private static final int MSG_DELIVER_GET_FEED = 3;
    private static final int MSG_DELIVER_POST_CONTENT = 4;
    private static final int MSG_DISPATCH_GET_FEED = 1;
    private static final int MSG_DISPATCH_POST_CONTENT = 2;
    private final CurationsBgHandler bgHandler = new CurationsBgHandler(BVSDK.getInstance().getBvWorkerData().getBackgroundLooper(), this);
    private final CurationsUiHandler uiHandler = new CurationsUiHandler(this);
    private final CurationsAnalyticsManager curationsAnalyticsManager = new CurationsAnalyticsManager(BVSDK.getInstance());

    private static class CurationsBgHandler extends Handler {
        private BVCurations curations;

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i10 = message.what;
            if (i10 == 1) {
                this.curations.dispatchGetFeed((RequestData) message.obj);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.curations.dispatchPostContent((RequestData) message.obj);
            }
        }

        CurationsBgHandler(Looper looper, BVCurations bVCurations) {
            super(looper);
            this.curations = bVCurations;
        }
    }

    private static class CurationsUiHandler extends Handler {
        private final BVCurations curations;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 3) {
                this.curations.deliverGetFeed((ResponseData) message.obj);
            } else {
                if (i10 != 4) {
                    return;
                }
                this.curations.deliverPostContent((ResponseData) message.obj);
            }
        }

        CurationsUiHandler(BVCurations bVCurations) {
            super(Looper.getMainLooper());
            this.curations = bVCurations;
        }
    }

    private static class DelegateFeedCb implements BVCallback<List<CurationsFeedItem>> {
        private final WeakReference<CurationsFeedCallback> cbWeakRef;

        @Override // com.bazaarvoice.bvandroidsdk.BVCallback
        public void onFailure(BazaarException bazaarException) {
            CurationsFeedCallback curationsFeedCallback = this.cbWeakRef.get();
            if (curationsFeedCallback == null) {
                return;
            }
            curationsFeedCallback.onFailure(bazaarException);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BVCallback
        public void onSuccess(List<CurationsFeedItem> list) {
            CurationsFeedCallback curationsFeedCallback = this.cbWeakRef.get();
            if (curationsFeedCallback == null) {
                return;
            }
            curationsFeedCallback.onSuccess(list);
        }

        DelegateFeedCb(CurationsFeedCallback curationsFeedCallback) {
            this.cbWeakRef = new WeakReference<>(curationsFeedCallback);
        }
    }

    private static class DelegatePostCb implements BVCallback<CurationsPostResponse> {
        private final WeakReference<CurationsPostCallback> cbWeakRef;

        @Override // com.bazaarvoice.bvandroidsdk.BVCallback
        public void onFailure(BazaarException bazaarException) {
            CurationsPostCallback curationsPostCallback = this.cbWeakRef.get();
            if (curationsPostCallback == null) {
                return;
            }
            curationsPostCallback.onFailure(bazaarException);
        }

        @Override // com.bazaarvoice.bvandroidsdk.BVCallback
        public void onSuccess(CurationsPostResponse curationsPostResponse) {
            CurationsPostCallback curationsPostCallback = this.cbWeakRef.get();
            if (curationsPostCallback == null) {
                return;
            }
            curationsPostCallback.onSuccess(curationsPostResponse);
        }

        DelegatePostCb(CurationsPostCallback curationsPostCallback) {
            this.cbWeakRef = new WeakReference<>(curationsPostCallback);
        }
    }

    private static class RequestData<ResponseType> {
        private final BVCallback<ResponseType> callback;
        private final Object obj1;
        private final String url;

        BVCallback<ResponseType> getCallback() {
            return this.callback;
        }

        Object getObj1() {
            return this.obj1;
        }

        public String getUrl() {
            return this.url;
        }

        RequestData(String str, BVCallback<ResponseType> bVCallback, Object obj) {
            this.url = str;
            this.callback = bVCallback;
            this.obj1 = obj;
        }
    }

    private static class ResponseData<ResponseType> {
        private final boolean didSucceed;
        private final Throwable errorThrowable;
        private final RequestData<ResponseType> requestData;
        private final ResponseType response;

        Throwable getErrorThrowable() {
            return this.errorThrowable;
        }

        RequestData<ResponseType> getRequestData() {
            return this.requestData;
        }

        ResponseType getResponse() {
            return this.response;
        }

        boolean isSuccess() {
            return this.didSucceed;
        }

        ResponseData(boolean z10, Throwable th2, ResponseType responsetype, RequestData<ResponseType> requestData) {
            this.didSucceed = z10;
            this.errorThrowable = th2;
            this.response = responsetype;
            this.requestData = requestData;
        }
    }

    public void getCurationsFeedItems(CurationsFeedRequest curationsFeedRequest, CurationsFeedCallback curationsFeedCallback) {
        RequestData requestData = new RequestData(curationsFeedRequest.toUrlQueryString(), new DelegateFeedCb(curationsFeedCallback), curationsFeedRequest);
        CurationsBgHandler curationsBgHandler = this.bgHandler;
        curationsBgHandler.sendMessage(curationsBgHandler.obtainMessage(1, requestData));
    }

    public void postContentToCurations(CurationsPostRequest curationsPostRequest, CurationsPostCallback curationsPostCallback) {
        RequestData requestData = new RequestData(curationsPostRequest.toUrlQueryString(), new DelegatePostCb(curationsPostCallback), curationsPostRequest);
        CurationsBgHandler curationsBgHandler = this.bgHandler;
        curationsBgHandler.sendMessage(curationsBgHandler.obtainMessage(2, requestData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverGetFeed(ResponseData<List<CurationsFeedItem>> responseData) {
        List<CurationsFeedItem> response = responseData.getResponse();
        Throwable errorThrowable = responseData.getErrorThrowable();
        BVCallback<List<CurationsFeedItem>> callback = responseData.getRequestData().getCallback();
        if (responseData.isSuccess()) {
            callback.onSuccess(response);
        } else {
            callback.onFailure(new BazaarException("Failed to get curations feed", errorThrowable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverPostContent(ResponseData<CurationsPostResponse> responseData) {
        CurationsPostResponse response = responseData.getResponse();
        Throwable errorThrowable = responseData.getErrorThrowable();
        BVCallback<CurationsPostResponse> callback = responseData.getRequestData().getCallback();
        if (responseData.isSuccess()) {
            callback.onSuccess(response);
            this.curationsAnalyticsManager.sendUploadPhotoFeatureEvent("none");
        } else {
            callback.onFailure(new BazaarException("Failed to get curations feed", errorThrowable));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchGetFeed(RequestData<List<CurationsFeedItem>> requestData) {
        ResponseData responseData;
        try {
            responseData = new ResponseData(true, null, getCurationsFeedItems((CurationsFeedRequest) requestData.getObj1()), requestData);
        } catch (Throwable th2) {
            th2.printStackTrace();
            responseData = new ResponseData(false, th2, null, requestData);
        }
        CurationsUiHandler curationsUiHandler = this.uiHandler;
        curationsUiHandler.sendMessage(curationsUiHandler.obtainMessage(3, responseData));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0197 A[PHI: r0 r3 r4
      0x0197: PHI (r0v11 okhttp3.Response) = (r0v9 okhttp3.Response), (r0v10 okhttp3.Response), (r0v14 okhttp3.Response) binds: [B:54:0x0195, B:65:0x01bd, B:60:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r3v13 com.bazaarvoice.bvandroidsdk.CurationsPostResponse) = 
      (r3v11 com.bazaarvoice.bvandroidsdk.CurationsPostResponse)
      (r3v12 com.bazaarvoice.bvandroidsdk.CurationsPostResponse)
      (r3v15 com.bazaarvoice.bvandroidsdk.CurationsPostResponse)
     binds: [B:54:0x0195, B:65:0x01bd, B:60:0x01ad] A[DONT_GENERATE, DONT_INLINE]
      0x0197: PHI (r4v4 java.lang.Exception) = (r4v2 java.lang.Exception), (r4v3 java.lang.Exception), (r4v6 java.lang.Exception) binds: [B:54:0x0195, B:65:0x01bd, B:60:0x01ad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchPostContent(com.bazaarvoice.bvandroidsdk.BVCurations.RequestData<com.bazaarvoice.bvandroidsdk.CurationsPostResponse> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bazaarvoice.bvandroidsdk.BVCurations.dispatchPostContent(com.bazaarvoice.bvandroidsdk.BVCurations$RequestData):void");
    }

    List<CurationsFeedItem> getCurationsFeedItems(CurationsFeedRequest curationsFeedRequest) throws Throwable {
        OkHttpClient okHttpClient = BVSDK.getInstance().getBvWorkerData().getOkHttpClient();
        Gson gson = BVSDK.getInstance().getBvWorkerData().getGson();
        BVLogger bvLogger = BVSDK.getInstance().getBvLogger();
        Request requestB = new Request.a().t(curationsFeedRequest.toUrlQueryString()).a("Content-Type", "application/x-www-form-urlencoded").a(HttpHeaders.USER_AGENT, BVSDK.getInstance().getBvWorkerData().getBvSdkUserAgent()).b();
        bvLogger.v(getClass().getSimpleName(), requestB.getUrl().getUrl());
        Response response = null;
        try {
            try {
                Response responseExecute = FirebasePerfOkHttpClient.execute(okHttpClient.b(requestB));
                if (responseExecute.getIsSuccessful()) {
                    CurationsFeedResponse curationsFeedResponse = (CurationsFeedResponse) gson.m(responseExecute.getBody().charStream(), CurationsFeedResponse.class);
                    if (curationsFeedResponse.code.intValue() == 200) {
                        List<CurationsFeedItem> updates = curationsFeedResponse.getUpdates();
                        if (responseExecute.getBody() != null) {
                            responseExecute.getBody().close();
                        }
                        return updates;
                    }
                    throw new Exception("Curations 'code' not 200");
                }
                throw new Exception("Unsuccessful response for curations with error code: " + responseExecute.getCode());
            } catch (JsonIOException e10) {
                e = e10;
                throw new Exception("Failed to parse curations", e);
            } catch (JsonSyntaxException e11) {
                e = e11;
                throw new Exception("Failed to parse curations", e);
            } catch (IOException e12) {
                throw new IOException("Request for curations failed", e12);
            } catch (Exception e13) {
                throw new Exception("Exception while getting curations", e13);
            }
        } catch (Throwable th2) {
            if (0 != 0 && response.getBody() != null) {
                response.getBody().close();
            }
            throw th2;
        }
    }
}
