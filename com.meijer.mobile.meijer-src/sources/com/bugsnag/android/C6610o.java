package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.bugsnag.android.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6610o {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f64325a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    static C6617s f64326b;

    public static C6617s b() {
        if (f64326b == null) {
            synchronized (f64325a) {
                try {
                    if (f64326b == null) {
                        throw new IllegalStateException("You must call Bugsnag.start before any other Bugsnag methods");
                    }
                } finally {
                }
            }
        }
        return f64326b;
    }

    public static C6617s g(Context context, C6627x c6627x) {
        synchronized (f64325a) {
            try {
                if (f64326b == null) {
                    f64326b = new C6617s(context, c6627x);
                } else {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f64326b;
    }

    public static void a(String str, String str2, Object obj) {
        b().a(str, str2, obj);
    }

    public static void c(String str) {
        b().w(str);
    }

    private static void d() {
        b().f64376q.g("Multiple Bugsnag.start calls detected. Ignoring.");
    }

    public static void e(Throwable th2) {
        b().B(th2);
    }

    public static void f(String str, String str2, String str3) {
        b().R(str, str2, str3);
    }
}
