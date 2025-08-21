package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import id.C14719b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
final class m0 implements ServiceConnection, q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f65739a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f65740b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f65741c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f65742d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f65743e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f65744f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p0 f65745g;

    public final int a() {
        return this.f65740b;
    }

    public final ComponentName b() {
        return this.f65744f;
    }

    public final IBinder c() {
        return this.f65742d;
    }

    public final boolean j() {
        return this.f65741c;
    }

    public m0(p0 p0Var, l0 l0Var) {
        this.f65745g = p0Var;
        this.f65743e = l0Var;
    }

    static /* bridge */ /* synthetic */ C14719b d(m0 m0Var, String str, Executor executor) throws RemoteException {
        try {
            Intent intentB = m0Var.f65743e.b(m0Var.f65745g.f65760h);
            m0Var.f65740b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.x.a();
            try {
                p0 p0Var = m0Var.f65745g;
                boolean zD = p0Var.f65763k.d(p0Var.f65760h, str, intentB, m0Var, 4225, executor);
                m0Var.f65741c = zD;
                if (zD) {
                    m0Var.f65745g.f65761i.sendMessageDelayed(m0Var.f65745g.f65761i.obtainMessage(1, m0Var.f65743e), m0Var.f65745g.f65765m);
                    C14719b c14719b = C14719b.f137521e;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return c14719b;
                }
                m0Var.f65740b = 2;
                try {
                    p0 p0Var2 = m0Var.f65745g;
                    p0Var2.f65763k.c(p0Var2.f65760h, m0Var);
                } catch (IllegalArgumentException unused) {
                }
                C14719b c14719b2 = new C14719b(16);
                StrictMode.setVmPolicy(vmPolicyA);
                return c14719b2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicyA);
                throw th2;
            }
        } catch (zzaj e10) {
            return e10.f65790a;
        }
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f65739a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f65739a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f65745g.f65761i.removeMessages(1, this.f65743e);
        p0 p0Var = this.f65745g;
        p0Var.f65763k.c(p0Var.f65760h, this);
        this.f65741c = false;
        this.f65740b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f65739a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f65739a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f65745g.f65759g) {
            try {
                this.f65745g.f65761i.removeMessages(1, this.f65743e);
                this.f65742d = iBinder;
                this.f65744f = componentName;
                Iterator it = this.f65739a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f65740b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f65745g.f65759g) {
            try {
                this.f65745g.f65761i.removeMessages(1, this.f65743e);
                this.f65742d = null;
                this.f65744f = componentName;
                Iterator it = this.f65739a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f65740b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }
}
