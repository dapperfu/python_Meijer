package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import gd.C14243b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
final class m0 implements ServiceConnection, q0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f64899a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f64900b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64901c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f64902d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f64903e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f64904f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p0 f64905g;

    public final int a() {
        return this.f64900b;
    }

    public final ComponentName b() {
        return this.f64904f;
    }

    public final IBinder c() {
        return this.f64902d;
    }

    public final boolean j() {
        return this.f64901c;
    }

    public m0(p0 p0Var, l0 l0Var) {
        this.f64905g = p0Var;
        this.f64903e = l0Var;
    }

    static /* bridge */ /* synthetic */ C14243b d(m0 m0Var, String str, Executor executor) throws RemoteException {
        try {
            Intent intentB = m0Var.f64903e.b(m0Var.f64905g.f64920h);
            m0Var.f64900b = 3;
            StrictMode.VmPolicy vmPolicyA = com.google.android.gms.common.util.x.a();
            try {
                p0 p0Var = m0Var.f64905g;
                boolean zD = p0Var.f64923k.d(p0Var.f64920h, str, intentB, m0Var, 4225, executor);
                m0Var.f64901c = zD;
                if (zD) {
                    m0Var.f64905g.f64921i.sendMessageDelayed(m0Var.f64905g.f64921i.obtainMessage(1, m0Var.f64903e), m0Var.f64905g.f64925m);
                    C14243b c14243b = C14243b.f133305e;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return c14243b;
                }
                m0Var.f64900b = 2;
                try {
                    p0 p0Var2 = m0Var.f64905g;
                    p0Var2.f64923k.c(p0Var2.f64920h, m0Var);
                } catch (IllegalArgumentException unused) {
                }
                C14243b c14243b2 = new C14243b(16);
                StrictMode.setVmPolicy(vmPolicyA);
                return c14243b2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicyA);
                throw th2;
            }
        } catch (zzaj e10) {
            return e10.f64950a;
        }
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f64899a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f64899a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f64905g.f64921i.removeMessages(1, this.f64903e);
        p0 p0Var = this.f64905g;
        p0Var.f64923k.c(p0Var.f64920h, this);
        this.f64901c = false;
        this.f64900b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f64899a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f64899a.isEmpty();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f64905g.f64919g) {
            try {
                this.f64905g.f64921i.removeMessages(1, this.f64903e);
                this.f64902d = iBinder;
                this.f64904f = componentName;
                Iterator it = this.f64899a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f64900b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f64905g.f64919g) {
            try {
                this.f64905g.f64921i.removeMessages(1, this.f64903e);
                this.f64902d = null;
                this.f64904f = componentName;
                Iterator it = this.f64899a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f64900b = 2;
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
