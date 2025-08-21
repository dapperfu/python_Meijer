package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.ef0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8038ef0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f74753a;

    private static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                com.fullstory.FS.log_e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return com.fullstory.FS.log_e("PlayCore", e(this.f74753a, str, objArr));
        }
        return 0;
    }

    public final int b(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return com.fullstory.FS.log_e("PlayCore", e(this.f74753a, str, objArr), th2);
        }
        return 0;
    }

    public final int c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return com.fullstory.FS.log_i("PlayCore", e(this.f74753a, str, objArr));
        }
        return 0;
    }

    public final int d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return com.fullstory.FS.log_w("PlayCore", e(this.f74753a, str, objArr));
        }
        return 0;
    }

    public C8038ef0(String str) {
        this.f74753a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }
}
