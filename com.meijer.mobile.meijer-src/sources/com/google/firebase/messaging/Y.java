package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.q2;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes8.dex */
public class Y {

    /* renamed from: e, reason: collision with root package name */
    private static Y f89694e;

    /* renamed from: a, reason: collision with root package name */
    private String f89695a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f89696b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f89697c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f89698d = new ArrayDeque();

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f89695a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f89695a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f89695a = serviceInfo.name;
                    }
                    return this.f89695a;
                }
                FS.log_e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + q2.f93563c + serviceInfo.name);
                return null;
            }
            FS.log_e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Starting service");
        }
        this.f89698d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }

    static synchronized Y b() {
        try {
            if (f89694e == null) {
                f89694e = new Y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f89694e;
    }

    Intent c() {
        return this.f89698d.poll();
    }

    boolean d(Context context) {
        if (this.f89697c == null) {
            this.f89697c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f89696b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f89697c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f89696b == null) {
            this.f89696b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f89696b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f89696b.booleanValue();
    }

    private Y() {
    }

    private int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strF = f(context, intent);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                FS.log_d("FirebaseMessaging", "Restricting intent to a specific service: " + strF);
            }
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = j0.g(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                FS.log_d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                FS.log_e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return HttpResponseStatus.ERROR_NOT_FOUND;
            }
            return -1;
        } catch (IllegalStateException e10) {
            FS.log_e("FirebaseMessaging", "Failed to start service while in background: " + e10);
            return HttpResponseStatus.ERROR_PAYMENT_REQUIRED;
        } catch (SecurityException e11) {
            FS.log_e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return HttpResponseStatus.ERROR_UNAUTHORIZED;
        }
    }
}
