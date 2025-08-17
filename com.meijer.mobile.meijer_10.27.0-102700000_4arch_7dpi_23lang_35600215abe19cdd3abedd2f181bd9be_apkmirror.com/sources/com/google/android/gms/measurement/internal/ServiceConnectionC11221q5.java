package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC6521c;
import gd.C14243b;
import java.util.Objects;
import od.C16023b;

/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC11221q5 implements ServiceConnection, AbstractC6521c.a, AbstractC6521c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f85781a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C11176k2 f85782b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85783c;

    final /* synthetic */ void d(boolean z10) {
        this.f85781a = false;
    }

    public final void a(Intent intent) {
        C11262w5 c11262w5 = this.f85783c;
        c11262w5.f();
        Context contextZzaY = c11262w5.f84868a.zzaY();
        C16023b c16023bB = C16023b.b();
        synchronized (this) {
            try {
                if (this.f85781a) {
                    this.f85783c.f84868a.a().u().a("Connection attempt already in progress");
                    return;
                }
                C11262w5 c11262w52 = this.f85783c;
                c11262w52.f84868a.a().u().a("Using local app measurement service");
                this.f85781a = true;
                c16023bB.a(contextZzaY, intent, c11262w52.K(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f85782b != null && (this.f85782b.isConnected() || this.f85782b.isConnecting())) {
            this.f85782b.disconnect();
        }
        this.f85782b = null;
    }

    public final void c() {
        C11262w5 c11262w5 = this.f85783c;
        c11262w5.f();
        Context contextZzaY = c11262w5.f84868a.zzaY();
        synchronized (this) {
            try {
                if (this.f85781a) {
                    this.f85783c.f84868a.a().u().a("Connection attempt already in progress");
                    return;
                }
                if (this.f85782b != null && (this.f85782b.isConnecting() || this.f85782b.isConnected())) {
                    this.f85783c.f84868a.a().u().a("Already awaiting connection attempt");
                    return;
                }
                this.f85782b = new C11176k2(contextZzaY, Looper.getMainLooper(), this, this);
                this.f85783c.f84868a.a().u().a("Connecting to remote service");
                this.f85781a = true;
                com.google.android.gms.common.internal.r.l(this.f85782b);
                this.f85782b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnected(Bundle bundle) {
        this.f85783c.f84868a.b().m();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.r.l(this.f85782b);
                this.f85783c.f84868a.b().r(new RunnableC11186l5(this, (InterfaceC4466d) this.f85782b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f85782b = null;
                this.f85781a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.b
    public final void onConnectionFailed(C14243b c14243b) throws IllegalStateException {
        C11262w5 c11262w5 = this.f85783c;
        c11262w5.f84868a.b().m();
        C11218q2 c11218q2W = c11262w5.f84868a.w();
        if (c11218q2W != null) {
            c11218q2W.u().b("Service connection failed", c14243b);
        }
        synchronized (this) {
            this.f85781a = false;
            this.f85782b = null;
        }
        this.f85783c.f84868a.b().r(new RunnableC11214p5(this, c14243b));
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c.a
    public final void onConnectionSuspended(int i10) throws IllegalStateException {
        X2 x22 = this.f85783c.f84868a;
        x22.b().m();
        x22.a().t().a("Service connection suspended");
        x22.b().r(new RunnableC11193m5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f85783c.f84868a.b().m();
        synchronized (this) {
            if (iBinder == null) {
                this.f85781a = false;
                this.f85783c.f84868a.a().m().a("Service connected with null binder");
                return;
            }
            InterfaceC4466d c11128e2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c11128e2 = iInterfaceQueryLocalInterface instanceof InterfaceC4466d ? (InterfaceC4466d) iInterfaceQueryLocalInterface : new C11128e2(iBinder);
                    this.f85783c.f84868a.a().u().a("Bound to IMeasurementService interface");
                } else {
                    this.f85783c.f84868a.a().m().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f85783c.f84868a.a().m().a("Service connect failed to get IMeasurementService");
            }
            if (c11128e2 == null) {
                this.f85781a = false;
                try {
                    C16023b c16023bB = C16023b.b();
                    C11262w5 c11262w5 = this.f85783c;
                    c16023bB.c(c11262w5.f84868a.zzaY(), c11262w5.K());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f85783c.f84868a.b().r(new RunnableC11163i5(this, c11128e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws IllegalStateException {
        X2 x22 = this.f85783c.f84868a;
        x22.b().m();
        x22.a().t().a("Service disconnected");
        x22.b().r(new RunnableC11171j5(this, componentName));
    }

    protected ServiceConnectionC11221q5(C11262w5 c11262w5) {
        Objects.requireNonNull(c11262w5);
        this.f85783c = c11262w5;
    }
}
