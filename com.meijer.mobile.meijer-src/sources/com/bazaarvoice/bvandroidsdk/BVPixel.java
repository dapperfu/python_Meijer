package com.bazaarvoice.bvandroidsdk;

import android.content.Context;
import android.os.HandlerThread;
import com.bazaarvoice.bvandroidsdk.BVLocaleServiceManager;
import com.bazaarvoice.bvandroidsdk.BVPixelDispatcher;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public class BVPixel {
    private static final int ANALYTICS_DELAY_SECONDS = 10;
    private static BVPixel singleton;
    private final BVPixelDispatcher bvPixelDispatcher;
    private final String defaultClientId;

    public static class Builder {
        private final String analyticsRootUrl;
        private final Context appContext;
        private final String clientId;
        private boolean dryRunAnalytics;
        private final BVPixelDispatcher.BvAnalyticsBatch bvAnalyticsBatch = new BVPixelDispatcher.BvAnalyticsBatch();
        private HandlerThread bgHandlerThread = new BVPixelDispatcher.BvAnalyticsThread();
        private OkHttpClient okHttpClient = new OkHttpClient();

        public Builder bgHandlerThread(HandlerThread handlerThread) {
            BVAnalyticsUtils.warnShouldNotBeEmpty("bgHandlerThread", handlerThread);
            this.bgHandlerThread = handlerThread;
            return this;
        }

        public Builder dryRunAnalytics(boolean z10) {
            this.dryRunAnalytics = z10;
            return this;
        }

        public Builder okHttpClient(OkHttpClient okHttpClient) {
            BVAnalyticsUtils.warnShouldNotBeEmpty("okHttpClient", okHttpClient);
            this.okHttpClient = okHttpClient;
            return this;
        }

        public Builder(Context context, String str, boolean z10, boolean z11, Locale locale) {
            this.appContext = context.getApplicationContext();
            this.clientId = str;
            this.analyticsRootUrl = BVLocaleServiceManager.getInstance().resourceFor(BVLocaleServiceManager.Service.ANALYTICS, locale, z10);
            this.dryRunAnalytics = z11;
        }

        public BVPixel build() {
            BVPixel.confirmBvPixelNotCreated();
            if (!this.bgHandlerThread.isAlive()) {
                this.bgHandlerThread.start();
            }
            BVPixel unused = BVPixel.singleton = new BVPixel(new BVPixelDispatcher(this.appContext, this.bgHandlerThread, this.bvAnalyticsBatch, this.okHttpClient, this.analyticsRootUrl, TimeUnit.SECONDS.toMillis(10L), this.dryRunAnalytics), this.clientId);
            return BVPixel.singleton;
        }
    }

    public static Builder builder(Context context, String str, boolean z10, boolean z11, Locale locale) {
        return new Builder(context, str, z10, z11, locale);
    }

    private static void confirmBvPixelCreated() {
        if (singleton == null) {
            synchronized (BVPixel.class) {
                try {
                    if (singleton == null) {
                        throw new IllegalStateException("Must initialize BVPixel first.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void confirmBvPixelNotCreated() {
        if (singleton != null) {
            synchronized (BVPixel.class) {
                try {
                    if (singleton != null) {
                        throw new IllegalStateException("BVPixel singleton already exists.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static void destroy() {
        synchronized (BVPixel.class) {
            singleton = null;
        }
    }

    static <EventType extends BVAnalyticsEvent> boolean shouldDispatchImmediately(EventType eventtype) {
        return (eventtype instanceof BVPersonalizationEvent) || (eventtype instanceof BVPageViewEvent);
    }

    public <EventType extends BVAnalyticsEvent> void track(EventType eventtype) {
        trackEventForClient(eventtype, this.defaultClientId);
    }

    public <EventType extends BVAnalyticsEvent> void trackEventForClient(EventType eventtype, String str) {
        this.bvPixelDispatcher.enqueueEvent(eventtype, str);
        if (shouldDispatchImmediately(eventtype)) {
            this.bvPixelDispatcher.dispatchBatchImmediately();
        }
    }

    BVPixel(BVPixelDispatcher bVPixelDispatcher, String str) {
        this.defaultClientId = str;
        this.bvPixelDispatcher = bVPixelDispatcher;
        bVPixelDispatcher.beginDispatchWithDelay();
    }

    public static BVPixel getInstance() {
        confirmBvPixelCreated();
        return singleton;
    }
}
