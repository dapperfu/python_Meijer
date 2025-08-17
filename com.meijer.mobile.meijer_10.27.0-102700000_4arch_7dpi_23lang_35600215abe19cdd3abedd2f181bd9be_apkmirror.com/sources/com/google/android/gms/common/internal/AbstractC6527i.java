package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import gd.C14243b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6527i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f64885a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f64886b = 9;

    /* renamed from: c, reason: collision with root package name */
    private static p0 f64887c;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f64888d;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f64889e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f64890f;

    public static int a() {
        return 4225;
    }

    protected abstract C14243b d(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void e(l0 l0Var, ServiceConnection serviceConnection, String str);

    public static AbstractC6527i b(Context context) {
        synchronized (f64885a) {
            try {
                if (f64887c == null) {
                    f64887c = new p0(context.getApplicationContext(), f64890f ? c().getLooper() : context.getMainLooper(), f64889e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f64887c;
    }

    public static HandlerThread c() {
        synchronized (f64885a) {
            try {
                HandlerThread handlerThread = f64888d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f64886b);
                f64888d = handlerThread2;
                handlerThread2.start();
                return f64888d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        e(new l0(str, str2, 4225, z10), serviceConnection, str3);
    }
}
