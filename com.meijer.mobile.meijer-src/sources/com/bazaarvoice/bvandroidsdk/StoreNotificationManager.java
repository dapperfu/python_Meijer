package com.bazaarvoice.bvandroidsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bazaarvoice.bvandroidsdk.BVNotificationUtil;

/* loaded from: classes4.dex */
public class StoreNotificationManager {
    private static final String ANALYTICS_CGC_TYPE = "store";
    private static final String ANALYTICS_VIEW_NAME = "StoreReviewPushNotification";
    public static final String FEATURE_NAME = "com.bazaarvoice.bvandroidsdk_storenotifications";
    private static final int MSG_DISPATCH_RESCHEDULE_NOTIFICATION = 2;
    private static final int MSG_DISPATCH_SCHEDULE_NOTIFICATION = 1;
    private static final String REMOTE_CONFIG_FEATURE_NAME = "conversations-stores";
    private static final String REMOTE_CONFIG_FILE_NAME = "geofenceConfig.json";
    private static final String S3_STATIC_MAPS_URL_TEMPLATE = "https://s3.amazonaws.com/incubator-mobile-apps/conversations-stores/%s/staticmaps/map_%s.png";
    private static final String TAG = "StoreNotifManager";
    private static StoreNotificationManager instance;
    private StoreBgHandler storeBgHandler = new StoreBgHandler(BVSDK.getInstance().getBvWorkerData().getBackgroundLooper(), this);

    private static class ScheduleStoreNotificationPayload {
        private long dwellMillis;
        private String storeId;

        public long getDwellMillis() {
            return this.dwellMillis;
        }

        public String getStoreId() {
            return this.storeId;
        }

        public ScheduleStoreNotificationPayload(String str, long j10) {
            this.storeId = str;
            this.dwellMillis = j10;
        }
    }

    private static class StoreBgHandler extends Handler {
        private StoreNotificationManager storeNotificationManager;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                ScheduleStoreNotificationPayload scheduleStoreNotificationPayload = (ScheduleStoreNotificationPayload) message.obj;
                this.storeNotificationManager.dispatchScheduleNotification(scheduleStoreNotificationPayload.getStoreId(), scheduleStoreNotificationPayload.getDwellMillis(), true);
            } else {
                if (i10 != 2) {
                    return;
                }
                ScheduleStoreNotificationPayload scheduleStoreNotificationPayload2 = (ScheduleStoreNotificationPayload) message.obj;
                this.storeNotificationManager.dispatchScheduleNotification(scheduleStoreNotificationPayload2.getStoreId(), scheduleStoreNotificationPayload2.getDwellMillis(), false);
            }
        }

        StoreBgHandler(Looper looper, StoreNotificationManager storeNotificationManager) {
            super(looper);
            this.storeNotificationManager = storeNotificationManager;
        }
    }

    private static String getGoogleMapScreenShot(String str, String str2) {
        return String.format(S3_STATIC_MAPS_URL_TEMPLATE, str2, str);
    }

    public static StoreNotificationManager getInstance() {
        if (instance == null) {
            instance = new StoreNotificationManager();
        }
        return instance;
    }

    void reScheduleNotification(String str) {
        ScheduleStoreNotificationPayload scheduleStoreNotificationPayload = new ScheduleStoreNotificationPayload(str, 0L);
        StoreBgHandler storeBgHandler = this.storeBgHandler;
        storeBgHandler.sendMessage(storeBgHandler.obtainMessage(2, scheduleStoreNotificationPayload));
    }

    public void scheduleNotification(String str, long j10) {
        ScheduleStoreNotificationPayload scheduleStoreNotificationPayload = new ScheduleStoreNotificationPayload(str, j10);
        StoreBgHandler storeBgHandler = this.storeBgHandler;
        storeBgHandler.sendMessage(storeBgHandler.obtainMessage(1, scheduleStoreNotificationPayload));
    }

    private StoreNotificationManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchScheduleNotification(String str, long j10, boolean z10) {
        BVUserProvidedData bvUserProvidedData = BVSDK.getInstance().getBvUserProvidedData();
        BVLogger bvLogger = BVSDK.getInstance().getBvLogger();
        String clientId = bvUserProvidedData.getBvConfig().getClientId();
        StoreNotificationData storeNotificationData = (StoreNotificationData) BVNotificationUtil.getNotificationData(REMOTE_CONFIG_FEATURE_NAME, REMOTE_CONFIG_FILE_NAME, StoreNotificationData.class);
        if (storeNotificationData == null) {
            bvLogger.e(TAG, "Failed to get PIN config data. Cancelling schedule call");
            return;
        }
        if (!storeNotificationData.isNotificationsEnabled()) {
            bvLogger.d(TAG, "PIN notifications are not enabled. Cancelling schedule call");
        } else if (j10 < storeNotificationData.getVisitDurationMillis() && z10) {
            bvLogger.d(TAG, "Was at geofence, but not long enough to trigger PIN. Cancelling schedule call");
        } else {
            BVNotificationUtil.scheduleNotification(new BVNotificationUtil.ScheduleNotificationData(bvUserProvidedData.getAppContext(), true, str, storeNotificationData, ANALYTICS_VIEW_NAME, "store", "com.bazaarvoice.bvandroidsdk_storenotifications"), new BVNotificationDisplayData(str, storeNotificationData.getPositiveText(), storeNotificationData.getNeutralText(), storeNotificationData.getNegativeText(), getGoogleMapScreenShot(str, clientId), storeNotificationData.getContentTitleText(), storeNotificationData.getSummaryText(), storeNotificationData.isHeadsUpEnabled()));
        }
    }
}
