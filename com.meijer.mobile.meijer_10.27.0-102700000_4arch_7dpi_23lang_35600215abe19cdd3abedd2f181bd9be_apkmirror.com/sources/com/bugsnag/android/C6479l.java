package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.bugsnag.android.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6479l {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f63487a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    static C6487p f63488b;

    public static C6487p b() {
        if (f63488b == null) {
            synchronized (f63487a) {
                try {
                    if (f63488b == null) {
                        throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                    }
                } finally {
                }
            }
        }
        return f63488b;
    }

    public static C6487p f(Context context, C6496u c6496u) {
        synchronized (f63487a) {
            try {
                if (f63488b == null) {
                    f63488b = new C6487p(context, c6496u);
                } else {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f63488b;
    }

    public static void a(String str, String str2, Object obj) {
        b().a(str, str2, obj);
    }

    private static void c() {
        b().f63540q.g("Multiple Bugsnag.start calls detected. Ignoring.");
    }

    public static void d(Throwable th2) {
        b().B(th2);
    }

    public static void e(String str, String str2, String str3) {
        b().R(str, str2, str3);
    }
}
