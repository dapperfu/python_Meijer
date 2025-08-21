package com.bazaarvoice.bvandroidsdk;

import android.app.IntentService;
import android.content.Intent;

/* loaded from: classes4.dex */
public class BVNotificationService extends IntentService {
    public static final String ACTION_NOTIFICATION_BUTTON_TAPPED = "com.bazaarvoice.bvandroidsdk.action.NOTIFICATION_BUTTON_TAPPED";
    static final String ACTION_SHOW_NOTIF = "com.bazaarvoice.bvandroidsdk.action.SHOW_NOTIF";
    static final String EXTRA_ANALYTICS_CGC_TYPE = "extra_remote_cgc_type";
    static final String EXTRA_BUTTON_TAPPED = "extra_button_tapped";
    static final String EXTRA_CGC_ID = "extra_cgc_id";
    static final String EXTRA_DISPLAY_DATA = "extra_bv_notification_data_str";
    static final String EXTRA_FEATURE_NAME = "extra_feature_name";
    public static final int NEGATIVE = 2;
    public static final int NEUTRAL = 1;
    public static final int POSITIVE = 0;
    private static final String SERVICE_NAME = "BVSDK-BVNotificationService";

    public BVNotificationService() {
        super(SERVICE_NAME);
    }

    public static int getButtonTapped(Intent intent) {
        return intent.getIntExtra(EXTRA_BUTTON_TAPPED, -1);
    }

    static BVNotificationDisplayData getDisplayData(Intent intent) {
        return (BVNotificationDisplayData) BVSDK.getInstance().getBvWorkerData().getGson().o(intent.getStringExtra(EXTRA_DISPLAY_DATA), BVNotificationDisplayData.class);
    }

    public static String getFeatureName(Intent intent) {
        return intent.getStringExtra(EXTRA_FEATURE_NAME);
    }

    public static String getNotificationCgcId(Intent intent) {
        return intent.getStringExtra(EXTRA_CGC_ID);
    }

    static String getRemoteCgcType(Intent intent) {
        return intent.getStringExtra(EXTRA_ANALYTICS_CGC_TYPE);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        action.getClass();
        if (action.equals(ACTION_NOTIFICATION_BUTTON_TAPPED)) {
            BVNotificationUtil.onNotifButtonTapBroadcast(getApplicationContext(), intent);
        } else if (action.equals(ACTION_SHOW_NOTIF)) {
            BVNotificationUtil.onShowNotif(getApplicationContext(), intent);
        }
    }

    static int getNotificationId(Intent intent) {
        try {
            return Integer.parseInt(getNotificationCgcId(intent));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
