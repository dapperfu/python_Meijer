package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;

/* renamed from: com.google.android.gms.internal.ads.Go, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6895Go extends ContextWrapper {
    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        throw null;
    }

    public static Context a(Context context) {
        if (context instanceof C6895Go) {
            return ((C6895Go) context).getBaseContext();
        }
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
