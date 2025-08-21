package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.j;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class BVPixelDispatcher {
    private static final String ANALYTICS_THREAD_NAME = "BVPixelDispatcher";
    private static final int DISPATCH_EVENTS = 1;
    private static final int DISPATCH_EVENTS_WITH_DELAY = 2;
    private static final int ENQUEUE_EVENT = 0;
    private static final boolean FULL_LOGGING = false;
    private static final j JSON = j.g("application/json; charset=utf-8");
    private static final String PATH = "event";
    private static final String TAG = "BVPixelDispatcher";
    private final BvAnalyticsBatch analyticsBatch;
    private final long analyticsDelayMillis;
    private final Handler bgHandler;
    private final boolean dryRunAnalytics;
    private final OkHttpClient okHttpClient;
    private final HttpUrl url;

    static class BvAnalyticsBatch {
        private static final String TAG = "BVPixelVerify";
        private List<Map<String, Object>> eventArray;
        private final Map<String, Object> eventBatch;

        private String getSmartExtraInfo(Map<String, Object> map) {
            StringBuilder sb2 = new StringBuilder();
            if (map.containsKey("name")) {
                sb2.append(" - name:");
                sb2.append(map.get("name"));
            }
            if (map.containsKey("transition")) {
                sb2.append(" - transition:");
                sb2.append(map.get("transition"));
            }
            if (map.containsKey("durationSecs")) {
                sb2.append(" - durationSecs:");
                sb2.append(map.get("durationSecs"));
            }
            if (map.containsKey("locationId")) {
                sb2.append(" - locationId:");
                sb2.append(map.get("locationId"));
            }
            if (map.containsKey("appState")) {
                sb2.append(" - appState:");
                sb2.append(map.get("appState"));
            }
            if (map.containsKey("bvProduct")) {
                sb2.append(" - bvProduct:");
                sb2.append(map.get("bvProduct"));
            }
            return sb2.toString();
        }

        public void clear() {
            this.eventArray.clear();
        }

        public String getEventBatchJsonString() {
            return new JSONObject(this.eventBatch).toString();
        }

        public boolean isEmpty() {
            return this.eventArray.size() == 0;
        }

        void log(boolean z10) {
            for (Map<String, Object> map : this.eventArray) {
                StringBuilder sb2 = new StringBuilder();
                if (z10) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        sb2.append("\t");
                        sb2.append(entry.getKey());
                        sb2.append(" : ");
                        sb2.append(entry.getValue());
                        sb2.append("\n");
                    }
                } else {
                    sb2.append(String.format("type: %1$s, class: %2$s, source: %3$s", map.get("type"), map.get("cl"), map.get("source")));
                    sb2.append(getSmartExtraInfo(map));
                }
                FS.log_d(TAG, sb2.toString());
            }
        }

        public void putEvent(BVAnalyticsEvent bVAnalyticsEvent) {
            this.eventArray.add(bVAnalyticsEvent.toRaw());
        }

        public int size() {
            return this.eventArray.size();
        }

        public BvAnalyticsBatch() {
            HashMap map = new HashMap();
            this.eventBatch = map;
            ArrayList arrayList = new ArrayList();
            this.eventArray = arrayList;
            map.put("batch", arrayList);
            map.put("UA", BVEventValues.BVSDK_USER_AGENT);
        }

        public RequestBody toPostPayload() {
            return RequestBody.create(BVPixelDispatcher.JSON, getEventBatchJsonString());
        }
    }

    static class BvAnalyticsHandler extends Handler {
        private final Context appContext;
        private BVMobileParams bvMobileParams;
        private final BVPixelDispatcher bvPixelDispatcher;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.bvPixelDispatcher.sendAnalytics();
                    return;
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.bvPixelDispatcher.sendAnalytics();
                    this.bvPixelDispatcher.sendBatchWithDelay();
                    return;
                }
            }
            BvEnqueueEventPayload bvEnqueueEventPayload = (BvEnqueueEventPayload) message.obj;
            BVAnalyticsEvent event = bvEnqueueEventPayload.getEvent();
            if (event instanceof BVMobileAnalyticsEvent) {
                if (this.bvMobileParams == null) {
                    this.bvMobileParams = new BVMobileParams(this.appContext, bvEnqueueEventPayload.getClientId(), BVEventValues.BVEventSource.NATIVE_MOBILE_SDK);
                }
                ((BVMobileAnalyticsEvent) event).setBvMobileParams(this.bvMobileParams);
            }
            this.bvPixelDispatcher.addEventToBatch(event);
        }

        BvAnalyticsHandler(Looper looper, BVPixelDispatcher bVPixelDispatcher, Context context) {
            super(looper);
            this.bvPixelDispatcher = bVPixelDispatcher;
            this.appContext = context;
        }
    }

    static class BvAnalyticsThread extends HandlerThread {
        BvAnalyticsThread() {
            super("BVAnalytics-BVPixelDispatcher", 10);
        }
    }

    private static class BvEnqueueEventPayload {
        private final String clientId;
        private final BVAnalyticsEvent event;

        public String getClientId() {
            return this.clientId;
        }

        public BVAnalyticsEvent getEvent() {
            return this.event;
        }

        BvEnqueueEventPayload(BVAnalyticsEvent bVAnalyticsEvent, String str) {
            this.event = bVAnalyticsEvent;
            this.clientId = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <EventType extends BVAnalyticsEvent> void addEventToBatch(EventType eventtype) {
        this.analyticsBatch.putEvent(eventtype);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAnalytics() {
        Response response = null;
        try {
            try {
                if (this.analyticsBatch.isEmpty()) {
                    this.analyticsBatch.clear();
                    return;
                }
                this.analyticsBatch.log(false);
                if (this.dryRunAnalytics) {
                    this.analyticsBatch.clear();
                    FS.log_d("Analytics", "Not sending analytics for dry run");
                    this.analyticsBatch.clear();
                    return;
                }
                RequestBody postPayload = this.analyticsBatch.toPostPayload();
                FS.log_v("BVPixelDispatcher", this.url.getUrl() + "\n" + this.analyticsBatch.toString());
                Response responseExecute = FirebasePerfOkHttpClient.execute(this.okHttpClient.b(new Request.a().v(this.url).m("Content-Type", "application/json").m("X-Requested-With", "XMLHttpRequest").m(HttpHeaders.USER_AGENT, BVEventValues.BVSDK_USER_AGENT).p(postPayload).b()));
                if (responseExecute.getIsSuccessful()) {
                    FS.log_d("Analytics", "Successfully posted " + this.analyticsBatch.size() + " events");
                } else {
                    FS.log_d("Analytics", "Unsuccessfully posted Events: " + responseExecute.getCode() + ", message: " + responseExecute.getMessage());
                }
                this.analyticsBatch.clear();
                if (responseExecute.getBody() != null) {
                    responseExecute.getBody().close();
                }
            } catch (IOException e10) {
                FS.log_e("BVPixelDispatcher", "Failed to send analytics event", e10);
                this.analyticsBatch.clear();
                if (0 == 0 || response.getBody() == null) {
                    return;
                }
                response.getBody().close();
            }
        } catch (Throwable th2) {
            this.analyticsBatch.clear();
            if (0 != 0 && response.getBody() != null) {
                response.getBody().close();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBatchWithDelay() {
        Handler handler = this.bgHandler;
        handler.sendMessageDelayed(handler.obtainMessage(2), this.analyticsDelayMillis);
    }

    void dispatchBatchImmediately() {
        Handler handler = this.bgHandler;
        handler.sendMessage(handler.obtainMessage(1));
    }

    void enqueueEvent(BVAnalyticsEvent bVAnalyticsEvent, String str) {
        BvEnqueueEventPayload bvEnqueueEventPayload = new BvEnqueueEventPayload(bVAnalyticsEvent, str);
        Handler handler = this.bgHandler;
        handler.sendMessage(handler.obtainMessage(0, bvEnqueueEventPayload));
    }

    BVPixelDispatcher(Context context, HandlerThread handlerThread, BvAnalyticsBatch bvAnalyticsBatch, OkHttpClient okHttpClient, String str, long j10, boolean z10) {
        if (handlerThread.isAlive()) {
            this.bgHandler = new BvAnalyticsHandler(handlerThread.getLooper(), this, context.getApplicationContext());
            this.analyticsBatch = bvAnalyticsBatch;
            this.okHttpClient = okHttpClient;
            this.url = HttpUrl.m(str).k().c(PATH).g();
            this.analyticsDelayMillis = j10;
            this.dryRunAnalytics = z10;
            return;
        }
        throw new IllegalStateException("Must start bgHandlerThread before building BVPixel");
    }

    void beginDispatchWithDelay() {
        sendBatchWithDelay();
    }
}
