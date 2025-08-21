package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import id.C14719b;
import java.util.HashMap;
import java.util.concurrent.Executor;
import qd.C16631b;

/* loaded from: classes4.dex */
final class p0 extends AbstractC6652i {

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f65759g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Context f65760h;

    /* renamed from: i, reason: collision with root package name */
    private volatile Handler f65761i;

    /* renamed from: j, reason: collision with root package name */
    private final n0 f65762j;

    /* renamed from: k, reason: collision with root package name */
    private final C16631b f65763k;

    /* renamed from: l, reason: collision with root package name */
    private final long f65764l;

    /* renamed from: m, reason: collision with root package name */
    private final long f65765m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Executor f65766n;

    @Override // com.google.android.gms.common.internal.AbstractC6652i
    protected final C14719b d(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        C14719b c14719bD;
        r.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f65759g) {
            try {
                m0 m0Var = (m0) this.f65759g.get(l0Var);
                if (executor == null) {
                    executor = this.f65766n;
                }
                if (m0Var == null) {
                    m0Var = new m0(this, l0Var);
                    m0Var.e(serviceConnection, serviceConnection, str);
                    c14719bD = m0.d(m0Var, str, executor);
                    this.f65759g.put(l0Var, m0Var);
                } else {
                    this.f65761i.removeMessages(0, l0Var);
                    if (m0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + l0Var.toString());
                    }
                    m0Var.e(serviceConnection, serviceConnection, str);
                    int iA = m0Var.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(m0Var.b(), m0Var.c());
                    } else if (iA == 2) {
                        c14719bD = m0.d(m0Var, str, executor);
                    }
                    c14719bD = null;
                }
                if (m0Var.j()) {
                    return C14719b.f137521e;
                }
                if (c14719bD == null) {
                    c14719bD = new C14719b(-1);
                }
                return c14719bD;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6652i
    protected final void e(l0 l0Var, ServiceConnection serviceConnection, String str) {
        r.m(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f65759g) {
            try {
                m0 m0Var = (m0) this.f65759g.get(l0Var);
                if (m0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + l0Var.toString());
                }
                if (!m0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + l0Var.toString());
                }
                m0Var.f(serviceConnection, str);
                if (m0Var.i()) {
                    this.f65761i.sendMessageDelayed(this.f65761i.obtainMessage(0, l0Var), this.f65764l);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    p0(Context context, Looper looper, Executor executor) {
        n0 n0Var = new n0(this, null);
        this.f65762j = n0Var;
        this.f65760h = context.getApplicationContext();
        this.f65761i = new Ad.e(looper, n0Var);
        this.f65763k = C16631b.b();
        this.f65764l = 5000L;
        this.f65765m = 300000L;
        this.f65766n = executor;
    }
}
