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

/* loaded from: classes7.dex */
public class W {

    /* renamed from: e, reason: collision with root package name */
    private static W f88849e;

    /* renamed from: a, reason: collision with root package name */
    private String f88850a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f88851b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f88852c = null;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<Intent> f88853d = new ArrayDeque();

    private synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        try {
            String str2 = this.f88850a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(".")) {
                        this.f88850a = context.getPackageName() + serviceInfo.name;
                    } else {
                        this.f88850a = serviceInfo.name;
                    }
                    return this.f88850a;
                }
                FS.log_e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + q2.f92724c + serviceInfo.name);
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
        this.f88853d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }

    static synchronized W b() {
        try {
            if (f88849e == null) {
                f88849e = new W();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f88849e;
    }

    Intent c() {
        return this.f88853d.poll();
    }

    boolean d(Context context) {
        if (this.f88852c == null) {
            this.f88852c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f88851b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f88852c.booleanValue();
    }

    boolean e(Context context) {
        if (this.f88851b == null) {
            this.f88851b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f88851b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            FS.log_d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f88851b.booleanValue();
    }

    private W() {
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
                componentNameStartService = h0.g(context, intent);
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
