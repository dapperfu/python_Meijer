package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import gd.C14243b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import od.C16023b;

/* loaded from: classes4.dex */
final class p0 extends AbstractC6527i {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f64919g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Context f64920h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Handler f64921i;

    /* renamed from: j, reason: collision with root package name */
    private final n0 f64922j;

    /* renamed from: k, reason: collision with root package name */
    private final C16023b f64923k;

    /* renamed from: l, reason: collision with root package name */
    private final long f64924l;

    /* renamed from: m, reason: collision with root package name */
    private final long f64925m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Executor f64926n;

    @Override // com.google.android.gms.common.internal.AbstractC6527i
    protected final C14243b d(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C14243b c14243bD;
        r.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f64919g) {
            try {
                m0 m0Var = (m0) this.f64919g.get(l0Var);
                if (executor == null) {
                    executor = this.f64926n;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.e(serviceConnection, serviceConnection, str);
                    c14243bD = m0.d(m0Var, str, executor);
                    this.f64919g.put(l0Var, m0Var);
                } else {
                    this.f64921i.removeMessages(0, l0Var);
                    if (m0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + l0Var.toString());
                    }
                    m0Var.e(serviceConnection, serviceConnection, str);
                    int iA = m0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(m0Var.b(), m0Var.c());
                    } else if (iA == 2) {
                        c14243bD = m0.d(m0Var, str, executor);
                    }
                    c14243bD = null;
                }
                if (m0Var.j()) {
                    return C14243b.f133305e;
                }
                if (c14243bD == null) {
                    c14243bD = new C14243b(-1);
                }
                return c14243bD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6527i
    protected final void e(l0 l0Var, ServiceConnection serviceConnection, String str) {
        r.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f64919g) {
            try {
                m0 m0Var = (m0) this.f64919g.get(l0Var);
                if (m0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + l0Var.toString());
                }
                if (!m0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + l0Var.toString());
                }
                m0Var.f(serviceConnection, str);
                if (m0Var.i()) {
                    this.f64921i.sendMessageDelayed(this.f64921i.obtainMessage(0, l0Var), this.f64924l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    p0(Context context, Looper looper, Executor executor) {
        n0 n0Var = new n0(this, null);
        this.f64922j = n0Var;
        this.f64920h = context.getApplicationContext();
        this.f64921i = new yd.e(looper, n0Var);
        this.f64923k = C16023b.b();
        this.f64924l = 5000L;
        this.f64925m = 300000L;
        this.f64926n = executor;
    }
}
