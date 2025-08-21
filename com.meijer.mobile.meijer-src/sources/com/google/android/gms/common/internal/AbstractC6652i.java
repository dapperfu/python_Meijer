package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import id.C14719b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.common.internal.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6652i {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f65725a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f65726b = 9;

    /* renamed from: c, reason: collision with root package name */
    private static p0 f65727c;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f65728d;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f65729e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f65730f;

    public static int a() {
        return 4225;
    }

    protected abstract C14719b d(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void e(l0 l0Var, ServiceConnection serviceConnection, String str);

    public static AbstractC6652i b(Context context) {
        synchronized (f65725a) {
            try {
                if (f65727c == null) {
                    f65727c = new p0(context.getApplicationContext(), f65730f ? c().getLooper() : context.getMainLooper(), f65729e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f65727c;
    }

    public static HandlerThread c() {
        synchronized (f65725a) {
            try {
                HandlerThread handlerThread = f65728d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f65726b);
                f65728d = handlerThread2;
                handlerThread2.start();
                return f65728d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        e(new l0(str, str2, 4225, z10), serviceConnection, str3);
    }
}
