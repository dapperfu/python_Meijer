package com.google.firebase.messaging;

import android.R;
import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.m;
import com.fullstory.FS;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11333d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f88903a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    private static int l(int i10) {
        return i10 | 67108864;
    }

    /* renamed from: com.google.firebase.messaging.d$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final m.e f88904a;

        /* renamed from: b, reason: collision with root package name */
        public final String f88905b;

        /* renamed from: c, reason: collision with root package name */
        public final int f88906c;

        a(m.e eVar, String str, int i10) {
            this.f88904a = eVar;
            this.f88905b = str;
            this.f88906c = i10;
        }
    }

    private static Intent f(String str, J j10, PackageManager packageManager) {
        String strP = j10.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = j10.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            FS.log_w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int g() {
        return f88903a.incrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int i(J j10) {
        boolean zA = j10.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (j10.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return j10.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle j(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            FS.log_w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String k(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                FS.log_w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (TextUtils.isEmpty(string2)) {
                FS.log_w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            } else {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                FS.log_w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    FS.log_e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(com.adobe.marketing.mobile.u.a("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static String o(J j10) {
        String strP = j10.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!C11332c.a(resources.getDrawable(i10, null))) {
                return true;
            }
            FS.log_e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            FS.log_e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean q(J j10) {
        return j10.a("google.c.a.e");
    }

    private static PendingIntent a(Context context, J j10, String str, PackageManager packageManager) {
        Intent intentF = f(str, j10, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(j10.y());
        if (q(j10)) {
            intentF.putExtra("gcm.n.analytics_data", j10.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, J j10) {
        if (!q(j10)) {
            return null;
        }
        return c(context, context2, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(j10.x()));
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(context2.getPackageName()).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, Context context2, J j10, String str, Bundle bundle) throws JSONException {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        m.e eVar = new m.e(context2, str);
        String strN = j10.n(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.k(strN);
        }
        String strN2 = j10.n(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.j(strN2);
            eVar.A(new m.c().h(strN2));
        }
        eVar.y(m(packageManager, resources, packageName, j10.p("gcm.n.icon"), bundle));
        Uri uriN = n(packageName, j10, resources);
        if (uriN != null) {
            eVar.z(uriN);
        }
        eVar.i(a(context, j10, packageName, packageManager));
        PendingIntent pendingIntentB = b(context, context2, j10);
        if (pendingIntentB != null) {
            eVar.n(pendingIntentB);
        }
        Integer numH = h(context2, j10.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.h(numH.intValue());
        }
        eVar.f(!j10.a("gcm.n.sticky"));
        eVar.s(j10.a("gcm.n.local_only"));
        String strP = j10.p("gcm.n.ticker");
        if (strP != null) {
            eVar.B(strP);
        }
        Integer numM = j10.m();
        if (numM != null) {
            eVar.v(numM.intValue());
        }
        Integer numR = j10.r();
        if (numR != null) {
            eVar.E(numR.intValue());
        }
        Integer numL = j10.l();
        if (numL != null) {
            eVar.t(numL.intValue());
        }
        Long lJ = j10.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.w(true);
            eVar.F(lJ.longValue());
        }
        long[] jArrQ = j10.q();
        if (jArrQ != null) {
            eVar.D(jArrQ);
        }
        int[] iArrE = j10.e();
        if (iArrE != null) {
            eVar.r(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.m(i(j10));
        return new a(eVar, o(j10), 0);
    }

    static a e(Context context, J j10) throws PackageManager.NameNotFoundException {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context, j10, k(context, j10.k(), bundleJ), bundleJ);
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                FS.log_w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(Z1.b.c(context, i10));
            } catch (Resources.NotFoundException unused2) {
                FS.log_w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            FS.log_w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !p(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                FS.log_w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !p(resources, i10)) {
            return R.drawable.sym_def_app_icon;
        }
        return i10;
    }

    private static Uri n(String str, J j10, Resources resources) {
        String strO = j10.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if (!"default".equals(strO) && resources.getIdentifier(strO, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + strO);
        }
        return RingtoneManager.getDefaultUri(2);
    }
}
