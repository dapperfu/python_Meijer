package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class e0 {

    /* renamed from: d, reason: collision with root package name */
    private static WeakReference<e0> f89749d;

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f89750a;

    /* renamed from: b, reason: collision with root package name */
    private a0 f89751b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f89752c;

    private synchronized void d() {
        this.f89751b = a0.d(this.f89750a, "topic_operation_queue", ",", this.f89752c);
    }

    synchronized boolean a(d0 d0Var) {
        return this.f89751b.b(d0Var.e());
    }

    synchronized d0 c() {
        return d0.a(this.f89751b.f());
    }

    synchronized boolean e(d0 d0Var) {
        return this.f89751b.g(d0Var.e());
    }

    public static synchronized e0 b(Context context, Executor executor) {
        e0 e0Var;
        try {
            WeakReference<e0> weakReference = f89749d;
            e0Var = weakReference != null ? weakReference.get() : null;
            if (e0Var == null) {
                e0Var = new e0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                e0Var.d();
                f89749d = new WeakReference<>(e0Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return e0Var;
    }

    private e0(SharedPreferences sharedPreferences, Executor executor) {
        this.f89752c = executor;
        this.f89750a = sharedPreferences;
    }
}
