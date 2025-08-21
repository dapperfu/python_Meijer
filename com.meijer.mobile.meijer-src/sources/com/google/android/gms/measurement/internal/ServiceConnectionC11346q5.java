package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
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
import com.google.android.gms.common.internal.AbstractC6646c;
import id.C14719b;
import java.util.Objects;
import qd.C16631b;

/* renamed from: com.google.android.gms.measurement.internal.q5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ServiceConnectionC11346q5 implements ServiceConnection, AbstractC6646c.a, AbstractC6646c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f86621a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C11301k2 f86622b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86623c;

    final /* synthetic */ void d(boolean z10) {
        this.f86621a = false;
    }

    public final void a(Intent intent) {
        C11387w5 c11387w5 = this.f86623c;
        c11387w5.f();
        Context contextZzaY = c11387w5.f85708a.zzaY();
        C16631b c16631bB = C16631b.b();
        synchronized (this) {
            try {
                if (this.f86621a) {
                    this.f86623c.f85708a.a().u().a("Connection attempt already in progress");
                    return;
                }
                C11387w5 c11387w52 = this.f86623c;
                c11387w52.f85708a.a().u().a("Using local app measurement service");
                this.f86621a = true;
                c16631bB.a(contextZzaY, intent, c11387w52.K(), 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        if (this.f86622b != null && (this.f86622b.isConnected() || this.f86622b.isConnecting())) {
            this.f86622b.disconnect();
        }
        this.f86622b = null;
    }

    public final void c() {
        C11387w5 c11387w5 = this.f86623c;
        c11387w5.f();
        Context contextZzaY = c11387w5.f85708a.zzaY();
        synchronized (this) {
            try {
                if (this.f86621a) {
                    this.f86623c.f85708a.a().u().a("Connection attempt already in progress");
                    return;
                }
                if (this.f86622b != null && (this.f86622b.isConnecting() || this.f86622b.isConnected())) {
                    this.f86623c.f85708a.a().u().a("Already awaiting connection attempt");
                    return;
                }
                this.f86622b = new C11301k2(contextZzaY, Looper.getMainLooper(), this, this);
                this.f86623c.f85708a.a().u().a("Connecting to remote service");
                this.f86621a = true;
                com.google.android.gms.common.internal.r.l(this.f86622b);
                this.f86622b.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnected(Bundle bundle) {
        this.f86623c.f85708a.b().m();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.r.l(this.f86622b);
                this.f86623c.f85708a.b().r(new RunnableC11311l5(this, (InterfaceC4672d) this.f86622b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f86622b = null;
                this.f86621a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.b
    public final void onConnectionFailed(C14719b c14719b) throws IllegalStateException {
        C11387w5 c11387w5 = this.f86623c;
        c11387w5.f85708a.b().m();
        C11343q2 c11343q2W = c11387w5.f85708a.w();
        if (c11343q2W != null) {
            c11343q2W.u().b("Service connection failed", c14719b);
        }
        synchronized (this) {
            this.f86621a = false;
            this.f86622b = null;
        }
        this.f86623c.f85708a.b().r(new RunnableC11339p5(this, c14719b));
    }

    @Override // com.google.android.gms.common.internal.AbstractC6646c.a
    public final void onConnectionSuspended(int i10) throws IllegalStateException {
        X2 x22 = this.f86623c.f85708a;
        x22.b().m();
        x22.a().t().a("Service connection suspended");
        x22.b().r(new RunnableC11318m5(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f86623c.f85708a.b().m();
        synchronized (this) {
            if (iBinder == null) {
                this.f86621a = false;
                this.f86623c.f85708a.a().m().a("Service connected with null binder");
                return;
            }
            InterfaceC4672d c11253e2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c11253e2 = iInterfaceQueryLocalInterface instanceof InterfaceC4672d ? (InterfaceC4672d) iInterfaceQueryLocalInterface : new C11253e2(iBinder);
                    this.f86623c.f85708a.a().u().a("Bound to IMeasurementService interface");
                } else {
                    this.f86623c.f85708a.a().m().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f86623c.f85708a.a().m().a("Service connect failed to get IMeasurementService");
            }
            if (c11253e2 == null) {
                this.f86621a = false;
                try {
                    C16631b c16631bB = C16631b.b();
                    C11387w5 c11387w5 = this.f86623c;
                    c16631bB.c(c11387w5.f85708a.zzaY(), c11387w5.K());
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f86623c.f85708a.b().r(new RunnableC11288i5(this, c11253e2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) throws IllegalStateException {
        X2 x22 = this.f86623c.f85708a;
        x22.b().m();
        x22.a().t().a("Service disconnected");
        x22.b().r(new RunnableC11296j5(this, componentName));
    }

    protected ServiceConnectionC11346q5(C11387w5 c11387w5) {
        Objects.requireNonNull(c11387w5);
        this.f86623c = c11387w5;
    }
}
