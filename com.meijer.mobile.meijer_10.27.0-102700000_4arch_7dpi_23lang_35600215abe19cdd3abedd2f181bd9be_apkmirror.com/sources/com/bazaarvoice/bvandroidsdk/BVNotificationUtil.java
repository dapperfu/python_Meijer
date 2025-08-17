package com.bazaarvoice.bvandroidsdk;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.core.app.m;
import androidx.core.app.q;
import com.bazaarvoice.bvandroidsdk.BVNotificationAnalyticsManager;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.Gson;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
class BVNotificationUtil {
    private static final int DEFAULT_NOTIF_VISIBILITY = 1;
    private static final long[] DEFAULT_VIBRATE_PATTERN = {0, 100};

    static final class ScheduleNotificationData<NotificationDataType extends BVNotificationData> {
        private String analyticsCgcType;
        private String analyticsViewName;
        private Context appContext;
        private String cgcId;
        private String featureName;
        private boolean initialSchedule;
        private NotificationDataType notificationData;

        public String getAnalyticsCgcType() {
            return this.analyticsCgcType;
        }

        public String getAnalyticsViewName() {
            return this.analyticsViewName;
        }

        Context getAppContext() {
            return this.appContext;
        }

        String getCgcId() {
            return this.cgcId;
        }

        public String getFeatureName() {
            return this.featureName;
        }

        NotificationDataType getNotificationData() {
            return this.notificationData;
        }

        boolean isInitialSchedule() {
            return this.initialSchedule;
        }

        ScheduleNotificationData(Context context, boolean z10, String str, NotificationDataType notificationdatatype, String str2, String str3, String str4) {
            this.appContext = context;
            this.initialSchedule = z10;
            this.cgcId = str;
            this.notificationData = notificationdatatype;
            this.analyticsViewName = str2;
            this.analyticsCgcType = str3;
            this.featureName = str4;
        }
    }

    private static void showNotification(Context context, String str, String str2, BVNotificationDisplayData bVNotificationDisplayData, Bitmap bitmap, int i10, int i11, int i12, long[] jArr) {
        q.f(context).j(i10, createNotification(context, str, str2, bVNotificationDisplayData, bitmap, i11, i12, jArr));
    }

    private static PendingIntent createButtonIntent(Context context, int i10, String str, String str2, String str3) {
        Intent intent = new Intent(BVNotificationService.ACTION_NOTIFICATION_BUTTON_TAPPED);
        intent.putExtra("extra_button_tapped", i10);
        intent.putExtra("extra_cgc_id", str);
        intent.putExtra("extra_remote_cgc_type", str2);
        intent.putExtra("extra_feature_name", str3);
        return PendingIntent.getBroadcast(context, i10, intent, 268435456);
    }

    private static PendingIntent getAlarmPendingIntent(Context context, String str, String str2, String str3, BVNotificationDisplayData bVNotificationDisplayData) {
        Intent intent = new Intent(context, (Class<?>) BVNotificationService.class);
        intent.setAction("com.bazaarvoice.bvandroidsdk.action.SHOW_NOTIF");
        intent.putExtra("extra_bv_notification_data_str", BVSDK.getInstance().getBvWorkerData().getGson().x(bVNotificationDisplayData));
        intent.putExtra("extra_cgc_id", str);
        intent.putExtra("extra_remote_cgc_type", str2);
        intent.putExtra("extra_feature_name", str3);
        return PendingIntent.getService(context, 0, intent, 268435456);
    }

    private static void setAlarm(Context context, long j10, PendingIntent pendingIntent) {
        ((AlarmManager) context.getSystemService("alarm")).set(3, j10, pendingIntent);
    }

    BVNotificationUtil() {
    }

    private static Notification createNotification(Context context, String str, String str2, BVNotificationDisplayData bVNotificationDisplayData, Bitmap bitmap, int i10, int i11, long[] jArr) {
        PendingIntent pendingIntentCreateButtonIntent = createButtonIntent(context, 0, bVNotificationDisplayData.getCgcId(), str, str2);
        PendingIntent pendingIntentCreateButtonIntent2 = createButtonIntent(context, 1, bVNotificationDisplayData.getCgcId(), str, str2);
        PendingIntent pendingIntentCreateButtonIntent3 = createButtonIntent(context, 2, bVNotificationDisplayData.getCgcId(), str, str2);
        m.e eVar = new m.e(context);
        if (bitmap != null) {
            eVar.k(bVNotificationDisplayData.getTitleText()).A(new m.b(eVar).j(bitmap).k(bVNotificationDisplayData.getTitleText()).l(bVNotificationDisplayData.getSummaryText()));
        }
        eVar.f(true).E(i10).y(i11).i(pendingIntentCreateButtonIntent).a(0, bVNotificationDisplayData.getPositiveText(), pendingIntentCreateButtonIntent).a(0, bVNotificationDisplayData.getNeutralText(), pendingIntentCreateButtonIntent2).a(0, bVNotificationDisplayData.getNegativeText(), pendingIntentCreateButtonIntent3);
        if (bVNotificationDisplayData.isHeadsUpEnabled()) {
            eVar.v(1).D(jArr);
        } else {
            eVar.v(0);
        }
        return eVar.c();
    }

    private static Bitmap getBigPictureBitmap(String str) {
        BVImageLoader bVImageLoader = new BVImageLoader(BVSDK.getInstance().getBvWorkerData().getOkHttpClient(), BVSDK.getInstance().getBvLogger());
        if (str == null) {
            return null;
        }
        return bVImageLoader.loadImage(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <NotificationDataType extends BVNotificationData> NotificationDataType getNotificationData(String str, String str2, Class<NotificationDataType> cls) throws Throwable {
        Response responseExecute;
        BVLogger bvLogger = BVSDK.getInstance().getBvLogger();
        String featureConfigUrl = BVRemoteConfig.getFeatureConfigUrl(str, str2);
        bvLogger.d("ContentValues", featureConfigUrl);
        Request requestB = new Request.a().t(featureConfigUrl).a(HttpHeaders.USER_AGENT, BVSDK.getInstance().getBvWorkerData().getBvSdkUserAgent()).b();
        OkHttpClient okHttpClient = BVSDK.getInstance().getBvWorkerData().getOkHttpClient();
        Gson gson = BVSDK.getInstance().getBvWorkerData().getGson();
        Response response = 0;
        try {
            try {
                responseExecute = FirebasePerfOkHttpClient.execute(okHttpClient.b(requestB));
                try {
                    if (!responseExecute.getIsSuccessful()) {
                        bvLogger.e("ContentValues", "Unexpected code: " + responseExecute);
                        if (responseExecute.getBody() != null) {
                            responseExecute.getBody().close();
                        }
                        return null;
                    }
                    NotificationDataType notificationdatatype = (NotificationDataType) gson.m(responseExecute.getBody().charStream(), cls);
                    if (responseExecute.getBody() != null) {
                        responseExecute.getBody().close();
                    }
                    return notificationdatatype;
                } catch (IOException e10) {
                    e = e10;
                    bvLogger.e("ContentValues", "Failed to get pin notification config", e);
                    if (responseExecute != null && responseExecute.getBody() != null) {
                        responseExecute.getBody().close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                response = requestB;
                if (response != 0 && response.getBody() != null) {
                    response.getBody().close();
                }
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            responseExecute = null;
        } catch (Throwable th3) {
            th = th3;
            if (response != 0) {
                response.getBody().close();
            }
            throw th;
        }
    }

    private static long getTimeForAlarm(boolean z10, BVNotificationData bVNotificationData) {
        long reviewRemindLaterDurationMillis;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z10) {
            reviewRemindLaterDurationMillis = bVNotificationData.getNotificationDelayMillis();
        } else {
            reviewRemindLaterDurationMillis = bVNotificationData.getReviewRemindLaterDurationMillis();
        }
        return jElapsedRealtime + reviewRemindLaterDurationMillis;
    }

    static void onNotifButtonTapBroadcast(Context context, Intent intent) {
        String notificationCgcId = BVNotificationService.getNotificationCgcId(intent);
        int buttonTapped = BVNotificationService.getButtonTapped(intent);
        int notificationId = BVNotificationService.getNotificationId(intent);
        String remoteCgcType = BVNotificationService.getRemoteCgcType(intent);
        if (buttonTapped != 0) {
            if (buttonTapped != 1) {
                if (buttonTapped != 2) {
                    return;
                }
                q.f(context).b(notificationId);
                BVNotificationAnalyticsManager.sendNotificationEventForStoreReviewFeatureUsed(BVNotificationAnalyticsManager.NotificationAction.Negative.getKey(), notificationCgcId, remoteCgcType);
                return;
            }
            q.f(context).b(notificationId);
            BVNotificationAnalyticsManager.sendNotificationEventForStoreReviewFeatureUsed(BVNotificationAnalyticsManager.NotificationAction.Neutral.getKey(), notificationCgcId, remoteCgcType);
            return;
        }
        q.f(context).b(notificationId);
        BVNotificationAnalyticsManager.sendNotificationEventForStoreReviewFeatureUsed(BVNotificationAnalyticsManager.NotificationAction.Positive.getKey(), notificationCgcId, remoteCgcType);
    }

    static void onShowNotif(Context context, Intent intent) {
        int notificationId = BVNotificationService.getNotificationId(intent);
        BVNotificationDisplayData displayData = BVNotificationService.getDisplayData(intent);
        showNotification(context, BVNotificationService.getRemoteCgcType(intent), BVNotificationService.getFeatureName(intent), displayData, getBigPictureBitmap(displayData.getImageUrl()), notificationId, 1, P6.a.f24819a, DEFAULT_VIBRATE_PATTERN);
    }

    static <NotificationDataType extends BVNotificationData> void scheduleNotification(ScheduleNotificationData<NotificationDataType> scheduleNotificationData, BVNotificationDisplayData bVNotificationDisplayData) {
        PendingIntent alarmPendingIntent = getAlarmPendingIntent(scheduleNotificationData.getAppContext(), scheduleNotificationData.getCgcId(), scheduleNotificationData.getAnalyticsCgcType(), scheduleNotificationData.getFeatureName(), bVNotificationDisplayData);
        setAlarm(scheduleNotificationData.getAppContext(), getTimeForAlarm(scheduleNotificationData.isInitialSchedule(), scheduleNotificationData.getNotificationData()), alarmPendingIntent);
        BVNotificationAnalyticsManager.sendNotificationEventForNotificationInView(scheduleNotificationData.getCgcId(), scheduleNotificationData.getAnalyticsViewName(), scheduleNotificationData.getAnalyticsCgcType());
    }
}
