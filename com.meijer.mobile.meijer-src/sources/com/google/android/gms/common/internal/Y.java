package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import sd.C17067f;

/* loaded from: classes4.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f65666a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f65667b;

    /* renamed from: c, reason: collision with root package name */
    private static String f65668c;

    /* renamed from: d, reason: collision with root package name */
    private static int f65669d;

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f65666a) {
            try {
                if (f65667b) {
                    return;
                }
                f65667b = true;
                try {
                    bundle = C17067f.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
                if (bundle == null) {
                    return;
                }
                f65668c = bundle.getString("com.google.app.id");
                f65669d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int a(Context context) {
        b(context);
        return f65669d;
    }
}
