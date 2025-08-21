package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.Qd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7219Qd0 {

    /* renamed from: c, reason: collision with root package name */
    private static C7219Qd0 f70442c;

    /* renamed from: a, reason: collision with root package name */
    private final String f70443a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f70444b;

    static C7219Qd0 b(Context context) {
        if (f70442c == null) {
            f70442c = new C7219Qd0(context);
        }
        return f70442c;
    }

    final long a(String str, long j10) {
        return this.f70444b.getLong(str, -1L);
    }

    final String c(String str, String str2) {
        return this.f70444b.getString(str, null);
    }

    final void d(String str, Object obj) throws IOException {
        boolean zCommit;
        if (obj instanceof String) {
            zCommit = this.f70444b.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            zCommit = this.f70444b.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            zCommit = this.f70444b.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else {
            if (!(obj instanceof Integer)) {
                com.fullstory.FS.log_e("GpidLifecycleSPHandler", "Unexpected object class " + String.valueOf(obj.getClass()) + " for app " + this.f70443a);
                throw new IOException("Failed to store " + str + " for app " + this.f70443a);
            }
            zCommit = this.f70444b.edit().putInt(str, ((Integer) obj).intValue()).commit();
        }
        if (zCommit) {
            return;
        }
        throw new IOException("Failed to store " + str + " for app " + this.f70443a);
    }

    final void e(String str) throws IOException {
        if (this.f70444b.edit().remove(str).commit()) {
            return;
        }
        throw new IOException("Failed to remove " + str + " for app " + this.f70443a);
    }

    final boolean f(String str, boolean z10) {
        return this.f70444b.getBoolean(str, true);
    }

    final boolean g(String str) {
        return this.f70444b.contains(str);
    }

    private C7219Qd0(Context context) {
        this.f70443a = context.getPackageName();
        this.f70444b = context.getSharedPreferences("paid_storage_sp", 0);
    }
}
