package com.google.android.gms.common.internal;

import android.util.Log;
import com.fullstory.FS;

/* renamed from: com.google.android.gms.common.internal.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6528j {

    /* renamed from: a, reason: collision with root package name */
    private final String f64891a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64892b;

    public void b(String str, String str2) {
        if (a(3)) {
            FS.log_d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            FS.log_e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th2) {
        if (a(6)) {
            FS.log_e(str, g(str2), th2);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            FS.log_v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            FS.log_w(str, g(str2));
        }
    }

    private final String g(String str) {
        String str2 = this.f64892b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f64891a, i10);
    }

    public C6528j(String str, String str2) {
        boolean z10;
        r.m(str, "log tag cannot be null");
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            z10 = true;
        } else {
            z10 = false;
        }
        r.c(z10, "tag \"%s\" is longer than the %d character maximum", objArr);
        this.f64891a = str;
        this.f64892b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
