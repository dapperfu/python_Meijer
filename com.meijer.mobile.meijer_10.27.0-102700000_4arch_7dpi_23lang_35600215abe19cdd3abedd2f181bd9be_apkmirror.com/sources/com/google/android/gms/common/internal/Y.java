package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import qd.C16519f;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f64826a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f64827b;

    /* renamed from: c, reason: collision with root package name */
    private static String f64828c;

    /* renamed from: d, reason: collision with root package name */
    private static int f64829d;

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f64826a) {
            try {
                if (f64827b) {
                    return;
                }
                f64827b = true;
                try {
                    bundle = C16519f.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f64828c = bundle.getString("com.google.app.id");
                f64829d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int a(Context context) {
        b(context);
        return f64829d;
    }
}
