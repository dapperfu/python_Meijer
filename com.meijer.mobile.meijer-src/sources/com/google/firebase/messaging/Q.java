package com.google.firebase.messaging;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.fullstory.FS;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class Q {
    public static /* synthetic */ void a(Context context, boolean z10, C5517k c5517k) {
        try {
            if (!b(context)) {
                FS.log_e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            T.e(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z10) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate(null);
            }
        } finally {
            c5517k.e(null);
        }
    }

    private static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private static boolean b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    static void c(Context context) {
        if (T.c(context)) {
            return;
        }
        e(new androidx.privacysandbox.ads.adservices.measurement.k(), context, f(context));
    }

    static boolean d(Context context) {
        if (!com.google.android.gms.common.util.n.i()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        }
        if (!b(context)) {
            FS.log_e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "GMS core is set for proxying");
            return true;
        }
        return true;
    }

    @TargetApi(29)
    static AbstractC5516j<Void> e(Executor executor, final Context context, final boolean z10) {
        if (!com.google.android.gms.common.util.n.i()) {
            return C5519m.f(null);
        }
        final C5517k c5517k = new C5517k();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.P
            @Override // java.lang.Runnable
            public final void run() {
                Q.a(context, z10, c5517k);
            }
        });
        return c5517k.a();
    }
}
