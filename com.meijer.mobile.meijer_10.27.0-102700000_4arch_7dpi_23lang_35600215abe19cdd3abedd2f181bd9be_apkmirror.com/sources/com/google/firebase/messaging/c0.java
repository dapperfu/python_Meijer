package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
final class c0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference<c0> f88899d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f88900a;

    /* renamed from: b, reason: collision with root package name */
    private Y f88901b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f88902c;

    private synchronized void c() {
        this.f88901b = Y.c(this.f88900a, "topic_operation_queue", ",", this.f88902c);
    }

    synchronized b0 b() {
        return b0.a(this.f88901b.e());
    }

    synchronized boolean d(b0 b0Var) {
        return this.f88901b.f(b0Var.e());
    }

    public static synchronized c0 a(Context context, Executor executor) {
        c0 c0Var;
        try {
            WeakReference<c0> weakReference = f88899d;
            c0Var = weakReference != null ? weakReference.get() : null;
            if (c0Var == null) {
                c0Var = new c0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c0Var.c();
                f88899d = new WeakReference<>(c0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c0Var;
    }

    private c0(SharedPreferences sharedPreferences, Executor executor) {
        this.f88902c = executor;
        this.f88900a = sharedPreferences;
    }
}
