package com.bazaarvoice.bvandroidsdk;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bazaarvoice.bvandroidsdk.BVConfig;
import com.bazaarvoice.bvandroidsdk.BVEventValues;
import com.bazaarvoice.bvandroidsdk.BVPixel;
import com.google.gson.Gson;
import com.google.gson.f;
import java.io.File;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;
import okhttp3.b;

/* loaded from: classes4.dex */
public class BVSDK {
    private static final String BACKGROUND_THREAD_NAME = "BackgroundThread";
    private static final String BAZAARVOICE_ROOT_REVIEW_HIGHLIGHTS_URL_PRODUCTION = "https://rh.nexus.bazaarvoice.com/";
    private static final String BAZAARVOICE_ROOT_REVIEW_HIGHLIGHTS_URL_STAGING = "https://rh-stg.nexus.bazaarvoice.com/";
    private static final String BAZAARVOICE_ROOT_URL_PRODUCTION = "https://api.bazaarvoice.com/";
    private static final String BAZAARVOICE_ROOT_URL_STAGING = "https://stg.api.bazaarvoice.com/";
    static final int BVHandlePayload = 123;
    private static final String BVSDK_USER_AGENT = "Mozilla/5.0 (Linux; Android " + Build.VERSION.RELEASE + " " + Build.DEVICE + " " + Build.MODEL + ") bvsdk-android/8.19.0";
    private static final String IMMEDIATE_BV_THREAD_NAME = "BV-ImmediateThread";
    private static final String NOTIFICATION_CONFIG_URL = "https://s3.amazonaws.com/";
    private static final String SCHEDULED_BV_THREAD_NAME = "BV-ScheduledThread";
    static final String SDK_VERSION = "8.19.0";
    private static final String SHOPPER_MARKETING_API_ROOT_URL_PRODUCTION = "https://my.network.bazaarvoice.com/";
    private static final String SHOPPER_MARKETING_API_ROOT_URL_STAGING = "https://my.network-stg.bazaarvoice.com/";
    private static final String TAG = "BVSDK";
    static volatile BVSDK singleton;
    final HandlerThread backgroundThread;
    final BazaarEnvironment bazaarEnvironment;
    final BVActivityLifecycleCallbacks bvActivityLifecycleCallbacks;
    final BVAuthenticatedUser bvAuthenticatedUser;
    final BVLogger bvLogger;
    final BVPixel bvPixel;
    final BVUserProvidedData bvUserProvidedData;
    final BVWorkerData bvWorkerData;
    final Handler handler;

    static final class BVWorkerData {
        private final Looper backgroundLooper;
        private final HandlerThread backgroundThread;
        private final BVRootApiUrls bvRootApiUrls;
        private final String bvSdkUserAgent;
        private final Gson gson;
        private final OkHttpClient okHttpClient;

        public Looper getBackgroundLooper() {
            return this.backgroundLooper;
        }

        public HandlerThread getBackgroundThread() {
            return this.backgroundThread;
        }

        public String getBvSdkUserAgent() {
            return this.bvSdkUserAgent;
        }

        public Gson getGson() {
            return this.gson;
        }

        public OkHttpClient getOkHttpClient() {
            return this.okHttpClient;
        }

        public BVRootApiUrls getRootApiUrls() {
            return this.bvRootApiUrls;
        }

        public BVWorkerData(Gson gson, BVRootApiUrls bVRootApiUrls, OkHttpClient okHttpClient, String str, HandlerThread handlerThread, Looper looper) {
            this.gson = gson;
            this.bvRootApiUrls = bVRootApiUrls;
            this.okHttpClient = okHttpClient;
            this.bvSdkUserAgent = str;
            this.backgroundThread = handlerThread;
            this.backgroundLooper = looper;
        }
    }

    static class BackgroundThread extends HandlerThread {
        BackgroundThread() {
            super("BVSDK-BackgroundThread", 10);
        }
    }

    public static class Builder {
        private final Application application;
        private BazaarEnvironment bazaarEnvironment;
        private BVConfig.Builder bvConfigBuilder;
        private BVLogLevel logLevel;
        private OkHttpClient okHttpClient;

        public Builder(Application application, String str) {
            if (application == null) {
                throw new IllegalArgumentException("Application must not be null");
            }
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("clientId must be valid");
            }
            this.application = application;
            BVConfig.Builder builder = new BVConfig.Builder();
            this.bvConfigBuilder = builder;
            builder.clientId(str);
        }

        public Builder analyticsDefaultLocale(Locale locale) {
            this.bvConfigBuilder.analyticsDefaultLocale(locale).build();
            return this;
        }

        public Builder apiKeyConversations(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("apiKeyConversations must be valid");
            }
            this.bvConfigBuilder.apiKeyConversations(str).build();
            return this;
        }

        public Builder apiKeyConversationsStores(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("apiKeyConversationsStores must be valid");
            }
            this.bvConfigBuilder.apiKeyConversationsStores(str).build();
            return this;
        }

        public Builder apiKeyCurations(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("apiKeyCurations must be valid");
            }
            this.bvConfigBuilder.apiKeyCurations(str).build();
            return this;
        }

        public Builder apiKeyLocation(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("apiKeyCurations must be valid");
            }
            this.bvConfigBuilder.apiKeyLocation(str).build();
            return this;
        }

        public Builder apiKeyShopperAdvertising(String str) {
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("apiKeyShopperAdvertising must be valid");
            }
            this.bvConfigBuilder.apiKeyShopperAdvertising(str).build();
            return this;
        }

        public Builder bazaarEnvironment(BazaarEnvironment bazaarEnvironment) {
            this.bazaarEnvironment = bazaarEnvironment;
            return this;
        }

        public BVSDK build() {
            BVSDK.confirmBVSDKNotCreated();
            if (this.logLevel == null) {
                this.logLevel = BVLogLevel.ERROR;
            }
            BVLogger bVLogger = new BVLogger(this.logLevel);
            if (this.application == null) {
                bVLogger.e(BVSDK.TAG, "Application object is required.");
                throw new IllegalStateException("Must provide an application object");
            }
            BVConfig bVConfigBuild = this.bvConfigBuilder.build();
            if (bVConfigBuild.getClientId() == null) {
                bVLogger.e(BVSDK.TAG, "A clientId must be provided to use the BazaarVoice SDK");
                throw new IllegalStateException("Must provide a client id");
            }
            if (this.bazaarEnvironment == null) {
                bVLogger.d(BVSDK.TAG, "BazaarEnvironment set to STAGING");
                this.bazaarEnvironment = BazaarEnvironment.STAGING;
            }
            if (this.okHttpClient == null) {
                bVLogger.d(BVSDK.TAG, "No OkHttpClient provided, using internal client");
                this.okHttpClient = new OkHttpClient();
            }
            bVLogger.d(BVSDK.TAG, "Initializing BVSDK");
            try {
                this.okHttpClient = BVSDK.addSupportForTLS1_2OnPreLollipop(this.okHttpClient.B().b(new b(new File(this.application.getCacheDir(), "bvsdk_http_cache"), 10485760L)).d(30L, TimeUnit.SECONDS)).a();
            } catch (KeyManagementException unused) {
                bVLogger.e("BVSDK", "BVSDK failed to enable TLS v1.2 support for pre lollipop. Support for TLS v1.2 or higher is required");
            } catch (KeyStoreException unused2) {
                bVLogger.e("BVSDK", "BVSDK failed to enable TLS v1.2 support for pre lollipop. Support for TLS v1.2 or higher is required");
            } catch (NoSuchAlgorithmException unused3) {
                bVLogger.e("BVSDK", "BVSDK failed to enable TLS v1.2 support for pre lollipop. Support for TLS v1.2 or higher is required");
            }
            Locale analyticsDefaultLocale = bVConfigBuild.getAnalyticsDefaultLocale();
            if (analyticsDefaultLocale == null) {
                analyticsDefaultLocale = Locale.getDefault();
                bVLogger.w("BVSDK", "BVSDK is currently using user region settings. Please see the documentation regarding setting proper locale settings for dealing with user data privacy.");
            }
            Gson gsonB = new f().i().b();
            BazaarEnvironment bazaarEnvironment = this.bazaarEnvironment;
            BazaarEnvironment bazaarEnvironment2 = BazaarEnvironment.STAGING;
            String str = bazaarEnvironment == bazaarEnvironment2 ? BVSDK.SHOPPER_MARKETING_API_ROOT_URL_STAGING : BVSDK.SHOPPER_MARKETING_API_ROOT_URL_PRODUCTION;
            String str2 = bazaarEnvironment == bazaarEnvironment2 ? BVSDK.BAZAARVOICE_ROOT_REVIEW_HIGHLIGHTS_URL_STAGING : BVSDK.BAZAARVOICE_ROOT_REVIEW_HIGHLIGHTS_URL_PRODUCTION;
            List listAsList = Arrays.asList(0, 5000, 12000, 24000);
            BVRootApiUrls bVRootApiUrls = new BVRootApiUrls(str, this.bazaarEnvironment == bazaarEnvironment2 ? BVSDK.BAZAARVOICE_ROOT_URL_STAGING : BVSDK.BAZAARVOICE_ROOT_URL_PRODUCTION, BVSDK.NOTIFICATION_CONFIG_URL, str2);
            BVUserProvidedData bVUserProvidedData = new BVUserProvidedData(this.application, bVConfigBuild, new BVMobileInfo(this.application.getApplicationContext()));
            BackgroundThread backgroundThread = new BackgroundThread();
            backgroundThread.start();
            BVAuthenticatedUser bVAuthenticatedUser = new BVAuthenticatedUser(this.application.getApplicationContext(), str, bVUserProvidedData.getBvConfig().getApiKeyShopperAdvertising(), this.okHttpClient, bVLogger, gsonB, listAsList, backgroundThread);
            BVPixel bVPixelBuild = new BVPixel.Builder(this.application, bVUserProvidedData.getBvConfig().getClientId(), this.bazaarEnvironment == bazaarEnvironment2, bVUserProvidedData.getBvConfig().isDryRunAnalytics(), analyticsDefaultLocale).bgHandlerThread(backgroundThread).okHttpClient(this.okHttpClient).dryRunAnalytics(bVUserProvidedData.getBvConfig().isDryRunAnalytics()).build();
            BVSDK.singleton = new BVSDK(bVUserProvidedData, bVLogger, new BVActivityLifecycleCallbacks(bVPixelBuild, bVLogger), bVAuthenticatedUser, new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bazaarvoice.bvandroidsdk.BVSDK.Builder.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message.what != BVSDK.BVHandlePayload) {
                        return false;
                    }
                    BVHandlerCallbackPayload bVHandlerCallbackPayload = (BVHandlerCallbackPayload) message.obj;
                    bVHandlerCallbackPayload.getInternalCB().performOnMainThread(bVHandlerCallbackPayload);
                    return true;
                }
            }), backgroundThread, bVPixelBuild, new BVWorkerData(gsonB, bVRootApiUrls, this.okHttpClient, BVSDK.BVSDK_USER_AGENT, backgroundThread, backgroundThread.getLooper()), this.bazaarEnvironment);
            bVLogger.d(BVSDK.TAG, "BVSDK Initialized");
            return BVSDK.singleton;
        }

        public Builder dryRunAnalytics(boolean z10) {
            this.bvConfigBuilder.dryRunAnalytics(z10).build();
            return this;
        }

        public Builder logLevel(BVLogLevel bVLogLevel) {
            if (bVLogLevel == null) {
                throw new IllegalArgumentException("logLevel must not be null");
            }
            this.logLevel = bVLogLevel;
            return this;
        }

        public Builder okHttpClient(OkHttpClient okHttpClient) {
            if (okHttpClient == null) {
                throw new IllegalArgumentException("OkHttpClient must not be null");
            }
            if (this.okHttpClient != null) {
                throw new IllegalStateException("OkHttpClient already set");
            }
            this.okHttpClient = okHttpClient;
            return this;
        }

        Builder(Application application, BazaarEnvironment bazaarEnvironment, BVConfig bVConfig) {
            if (application == null) {
                throw new IllegalArgumentException("Application must not be null");
            }
            if (bazaarEnvironment != null) {
                this.application = application;
                this.bazaarEnvironment = bazaarEnvironment;
                this.bvConfigBuilder = bVConfig.newBuilder();
                return;
            }
            throw new IllegalArgumentException("bazaarEnvironment must be valid");
        }
    }

    private static final class NamedThreadFactory implements ThreadFactory {
        private String threadName;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(this.threadName);
            return thread;
        }

        public NamedThreadFactory(String str) {
            this.threadName = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OkHttpClient.Builder addSupportForTLS1_2OnPreLollipop(OkHttpClient.Builder builder) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException {
        return builder;
    }

    public static Builder builder(Application application, String str) {
        return new Builder(application, str);
    }

    public static Builder builder(Application application, BazaarEnvironment bazaarEnvironment) {
        return builderWithConfig(application, bazaarEnvironment, BVConfig.BVConfigUtil.getBvConfig(application.getApplicationContext(), bazaarEnvironment));
    }

    public static Builder builderWithConfig(Application application, BazaarEnvironment bazaarEnvironment, BVConfig bVConfig) {
        return new Builder(application, bazaarEnvironment, bVConfig);
    }

    private static void confirmBVSDKCreated() {
        if (singleton == null) {
            synchronized (BVSDK.class) {
                try {
                    if (singleton == null) {
                        throw new IllegalStateException("Must initialize BVSDK first.");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void confirmBVSDKNotCreated() {
        if (singleton != null) {
            synchronized (BVSDK.class) {
                try {
                    if (singleton != null) {
                        throw new IllegalStateException("BVSDK singleton already exists");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static void destroy() {
        synchronized (BVSDK.class) {
            singleton = null;
        }
    }

    private void startAppLifecycleMonitoring() {
        this.bvUserProvidedData.getApplication().registerActivityLifecycleCallbacks(this.bvActivityLifecycleCallbacks);
        this.bvPixel.track(new BVMobileAppLifecycleEvent(BVEventValues.AppState.LAUNCHED));
    }

    BVAuthenticatedUser getAuthenticatedUser() {
        return this.bvAuthenticatedUser;
    }

    BazaarEnvironment getBazaarEnvironment() {
        return this.bazaarEnvironment;
    }

    BVLogger getBvLogger() {
        return this.bvLogger;
    }

    BVPixel getBvPixel() {
        return this.bvPixel;
    }

    BVUserProvidedData getBvUserProvidedData() {
        return this.bvUserProvidedData;
    }

    BVWorkerData getBvWorkerData() {
        return this.bvWorkerData;
    }

    void postPayloadToMainThread(BVHandlerCallbackPayload bVHandlerCallbackPayload) {
        Message messageObtainMessage = this.handler.obtainMessage();
        messageObtainMessage.what = BVHandlePayload;
        messageObtainMessage.obj = bVHandlerCallbackPayload;
        this.handler.sendMessage(messageObtainMessage);
    }

    public void setUserAuthString(String str) {
        if (str == null || str.isEmpty()) {
            this.bvLogger.w(TAG, "userAuthString must not be empty");
            return;
        }
        this.bvAuthenticatedUser.setUserAuthString(str);
        this.bvPixel.track(new BVPersonalizationEvent(str));
        this.bvAuthenticatedUser.updateUser("user auth string update");
    }

    BVSDK(BVUserProvidedData bVUserProvidedData, BVLogger bVLogger, BVActivityLifecycleCallbacks bVActivityLifecycleCallbacks, BVAuthenticatedUser bVAuthenticatedUser, Handler handler, HandlerThread handlerThread, BVPixel bVPixel, BVWorkerData bVWorkerData, BazaarEnvironment bazaarEnvironment) {
        this.bvUserProvidedData = bVUserProvidedData;
        this.bvLogger = bVLogger;
        this.bvActivityLifecycleCallbacks = bVActivityLifecycleCallbacks;
        this.bvAuthenticatedUser = bVAuthenticatedUser;
        this.handler = handler;
        this.backgroundThread = handlerThread;
        this.bvPixel = bVPixel;
        this.bvWorkerData = bVWorkerData;
        this.bazaarEnvironment = bazaarEnvironment;
        bVLogger.d("BVSDK", "BVSDK environment set to " + bazaarEnvironment.toString());
        startAppLifecycleMonitoring();
    }

    public static BVSDK getInstance() {
        confirmBVSDKCreated();
        return singleton;
    }

    private static X509TrustManager getSystemDefaultTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
    }
}
