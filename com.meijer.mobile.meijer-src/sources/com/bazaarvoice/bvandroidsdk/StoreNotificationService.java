package com.bazaarvoice.bvandroidsdk;

import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes4.dex */
public final class StoreNotificationService extends IntentService {
    private static final String TAG = "StoreNotifService";

    public StoreNotificationService() {
        super(TAG);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        if (action.equals(BVLocationManager.ACTION_GEOFENCE_VISIT)) {
            onGeofenceEvent(intent);
        } else if (action.equals(BVNotificationService.ACTION_NOTIFICATION_BUTTON_TAPPED)) {
            onNotificationButtonTappedEvent(intent);
        }
    }

    private void onGeofenceEvent(Intent intent) {
        BVVisit bvVisit = BVLocationManager.getBvVisit(intent);
        StoreNotificationManager.getInstance().scheduleNotification(bvVisit.getStoreId(), bvVisit.getDwellTimeMillis());
    }

    private void onNotificationButtonTappedEvent(Intent intent) {
        String str;
        BVLogger bvLogger = BVSDK.getInstance().getBvLogger();
        String featureName = BVNotificationService.getFeatureName(intent);
        featureName.getClass();
        if (!featureName.equals("com.bazaarvoice.bvandroidsdk_storenotifications")) {
            return;
        }
        int buttonTapped = BVNotificationService.getButtonTapped(intent);
        String notificationCgcId = BVNotificationService.getNotificationCgcId(intent);
        if (buttonTapped != 0) {
            if (buttonTapped != 1) {
                if (buttonTapped != 2) {
                    str = "";
                } else {
                    str = "negative";
                }
            } else {
                StoreNotificationManager.getInstance().reScheduleNotification(notificationCgcId);
                str = "neutral";
            }
        } else {
            str = "positive";
        }
        bvLogger.d(TAG, "Store notification tapped " + str + " for storeId " + notificationCgcId);
    }
}
