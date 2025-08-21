package com.google.android.gms.measurement.internal;

import Qd.C4669a;
import Qd.InterfaceC4672d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC10695y0;
import com.medallia.digital.mobilesdk.l8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import qd.C16631b;

/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11387w5 extends AbstractC11261f2 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC11346q5 f86826c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4672d f86827d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f86828e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC11388x f86829f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f86830g;

    /* renamed from: h, reason: collision with root package name */
    private final R5 f86831h;

    /* renamed from: i, reason: collision with root package name */
    private final List f86832i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC11388x f86833j;

    final /* synthetic */ void E(AtomicReference atomicReference, B6 b62, Bundle bundle) {
        InterfaceC4672d interfaceC4672d;
        synchronized (atomicReference) {
            try {
                interfaceC4672d = this.f86827d;
            } catch (RemoteException e10) {
                this.f85708a.a().m().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4672d == null) {
                this.f85708a.a().m().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4672d.p6(b62, bundle, new O4(this, atomicReference));
            H();
        }
    }

    final /* synthetic */ void F(AtomicReference atomicReference, B6 b62, Qd.J j10) {
        InterfaceC4672d interfaceC4672d;
        synchronized (atomicReference) {
            try {
                interfaceC4672d = this.f86827d;
            } catch (RemoteException e10) {
                this.f85708a.a().m().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4672d == null) {
                this.f85708a.a().m().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4672d.Y2(b62, j10, new P4(this, atomicReference));
            H();
        }
    }

    final /* synthetic */ ServiceConnectionC11346q5 K() {
        return this.f86826c;
    }

    final /* synthetic */ void M(InterfaceC4672d interfaceC4672d) {
        this.f86827d = null;
    }

    final /* synthetic */ ScheduledExecutorService N() {
        return this.f86830g;
    }

    final /* synthetic */ void O(ScheduledExecutorService scheduledExecutorService) {
        this.f86830g = scheduledExecutorService;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11261f2
    protected final boolean k() {
        return false;
    }

    final Boolean v() {
        return this.f86828e;
    }

    private final boolean P() {
        this.f85708a.c();
        return true;
    }

    private final B6 T(boolean z10) {
        Pair pairB;
        X2 x22 = this.f85708a;
        x22.c();
        C11269g2 c11269g2J = this.f85708a.J();
        String string = null;
        if (z10) {
            X2 x23 = x22.a().f85708a;
            if (x23.v().f85813e != null && (pairB = x23.v().f85813e.b()) != null && pairB != E2.f85810A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return c11269g2J.m(string);
    }

    final /* synthetic */ void C() {
        InterfaceC4672d interfaceC4672d = this.f86827d;
        if (interfaceC4672d == null) {
            this.f85708a.a().m().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            B6 b6T = T(false);
            com.google.android.gms.common.internal.r.l(b6T);
            interfaceC4672d.y2(b6T);
            H();
        } catch (RemoteException e10) {
            this.f85708a.a().m().b("Failed to send storage consent settings to the service", e10);
        }
    }

    final /* synthetic */ void D() {
        InterfaceC4672d interfaceC4672d = this.f86827d;
        if (interfaceC4672d == null) {
            this.f85708a.a().m().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            B6 b6T = T(false);
            com.google.android.gms.common.internal.r.l(b6T);
            interfaceC4672d.j3(b6T);
            H();
        } catch (RemoteException e10) {
            this.f85708a.a().m().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    final /* synthetic */ void G(B6 b62, C11266g c11266g) {
        InterfaceC4672d interfaceC4672d = this.f86827d;
        if (interfaceC4672d == null) {
            this.f85708a.a().m().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC4672d.F7(b62, c11266g);
            H();
        } catch (RemoteException e10) {
            this.f85708a.a().m().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c11266g.f86398a), e10);
        }
    }

    final /* synthetic */ InterfaceC4672d L() {
        return this.f86827d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void Z(Qd.InterfaceC4672d r59, md.AbstractC15707a r60, com.google.android.gms.measurement.internal.B6 r61) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11387w5.Z(Qd.d, md.a, com.google.android.gms.measurement.internal.B6):void");
    }

    protected C11387w5(X2 x22) {
        super(x22);
        this.f86832i = new ArrayList();
        this.f86831h = new R5(x22.zzaZ());
        this.f86826c = new ServiceConnectionC11346q5(this);
        this.f86829f = new W4(this, x22);
        this.f86833j = new C11224a5(this, x22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void H() {
        f();
        this.f86831h.a();
        this.f85708a.u();
        this.f86829f.b(((Long) C11245d2.f86288Z.b(null)).longValue());
    }

    private final void R(Runnable runnable) throws IllegalStateException {
        f();
        if (U()) {
            runnable.run();
            return;
        }
        List list = this.f86832i;
        long size = list.size();
        X2 x22 = this.f85708a;
        x22.u();
        if (size >= 1000) {
            x22.a().m().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f86833j.b(l8.b.f93364b);
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        f();
        C11329o2 c11329o2U = this.f85708a.a().u();
        List list = this.f86832i;
        c11329o2U.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f85708a.a().m().b("Task exception while flushing queue", e10);
            }
        }
        this.f86832i.clear();
        this.f86833j.d();
    }

    final boolean A() {
        f();
        h();
        if (!w() || this.f85708a.A().U() >= ((Integer) C11245d2.f86259K0.b(null)).intValue()) {
            return true;
        }
        return false;
    }

    final boolean B() {
        f();
        h();
        if (!w() || this.f85708a.A().U() >= 241200) {
            return true;
        }
        return false;
    }

    final /* synthetic */ void I(ComponentName componentName) {
        f();
        if (this.f86827d != null) {
            this.f86827d = null;
            this.f85708a.a().u().b("Disconnected from device MeasurementService", componentName);
            f();
            u();
        }
    }

    public final boolean U() {
        f();
        h();
        if (this.f86827d != null) {
            return true;
        }
        return false;
    }

    protected final void V() {
        f();
        h();
        R(new RunnableC11232b5(this, T(true)));
    }

    protected final void W(boolean z10) {
        f();
        h();
        if (A()) {
            R(new RunnableC11240c5(this, T(false)));
        }
    }

    protected final void X(boolean z10) {
        f();
        h();
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f86764a.C();
            }
        });
    }

    protected final void Y() throws IllegalStateException {
        f();
        h();
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.r5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f86675a.D();
            }
        });
    }

    protected final void a0(G g10, String str) {
        com.google.android.gms.common.internal.r.l(g10);
        f();
        h();
        P();
        R(new RunnableC11248d5(this, true, T(true), this.f85708a.C().n(g10), g10, str));
    }

    protected final void b0(C11282i c11282i) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(c11282i);
        f();
        h();
        this.f85708a.c();
        R(new RunnableC11256e5(this, true, T(true), this.f85708a.C().p(c11282i), new C11282i(c11282i), c11282i));
    }

    protected final void c0(AtomicReference atomicReference, String str, String str2, String str3) throws IllegalStateException {
        f();
        h();
        R(new RunnableC11264f5(this, atomicReference, null, str2, str3, T(false)));
    }

    protected final void d0(InterfaceC10695y0 interfaceC10695y0, String str, String str2) throws IllegalStateException {
        f();
        h();
        R(new RunnableC11272g5(this, str, str2, T(false), interfaceC10695y0));
    }

    protected final void e0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) throws IllegalStateException {
        f();
        h();
        R(new RunnableC11280h5(this, atomicReference, null, str2, str3, T(false), z10));
    }

    protected final void f0(InterfaceC10695y0 interfaceC10695y0, String str, String str2, boolean z10) throws IllegalStateException {
        f();
        h();
        R(new N4(this, str, str2, T(false), z10, interfaceC10695y0));
    }

    protected final void g0(final AtomicReference atomicReference, final Bundle bundle) throws IllegalStateException {
        f();
        h();
        final B6 b6T = T(false);
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f86685a.E(atomicReference, b6T, bundle);
            }
        });
    }

    protected final void h0(final AtomicReference atomicReference, final Qd.J j10) throws IllegalStateException {
        f();
        h();
        final B6 b6T = T(false);
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.t5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f86714a.F(atomicReference, b6T, j10);
            }
        });
    }

    protected final void i0(final C11266g c11266g) throws IllegalStateException {
        f();
        h();
        final B6 b6T = T(true);
        com.google.android.gms.common.internal.r.l(b6T);
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.u5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f86754a.G(b6T, c11266g);
            }
        });
    }

    protected final C4669a j0() {
        f();
        h();
        InterfaceC4672d interfaceC4672d = this.f86827d;
        if (interfaceC4672d == null) {
            u();
            this.f85708a.a().t().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        B6 b6T = T(false);
        com.google.android.gms.common.internal.r.l(b6T);
        try {
            C4669a c4669aR7 = interfaceC4672d.R7(b6T);
            H();
            return c4669aR7;
        } catch (RemoteException e10) {
            this.f85708a.a().m().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    protected final void m(v6 v6Var) {
        f();
        h();
        P();
        R(new Q4(this, T(true), this.f85708a.C().o(v6Var), v6Var));
    }

    protected final void n() throws IllegalStateException {
        f();
        h();
        B6 b6T = T(false);
        P();
        this.f85708a.C().m();
        R(new R4(this, b6T));
    }

    public final void o(AtomicReference atomicReference) {
        f();
        h();
        R(new S4(this, atomicReference, T(false)));
    }

    public final void p(InterfaceC10695y0 interfaceC10695y0) throws IllegalStateException {
        f();
        h();
        R(new T4(this, T(false), interfaceC10695y0));
    }

    protected final void q() throws IllegalStateException {
        f();
        h();
        B6 b6T = T(true);
        P();
        this.f85708a.u().F(null, C11245d2.f86298c1);
        this.f85708a.C().s();
        R(new U4(this, b6T, true));
    }

    protected final void r() throws IllegalStateException {
        f();
        h();
        R(new V4(this, T(true)));
    }

    protected final void s(E4 e42) {
        f();
        h();
        R(new X4(this, e42));
    }

    public final void t(Bundle bundle) {
        boolean z10;
        f();
        h();
        E e10 = new E(bundle);
        P();
        if (this.f85708a.u().F(null, C11245d2.f86298c1) && this.f85708a.C().q(e10)) {
            z10 = true;
        } else {
            z10 = false;
        }
        R(new Y4(this, true, T(false), z10, e10, bundle));
    }

    final void u() {
        f();
        h();
        if (!U()) {
            if (!w()) {
                X2 x22 = this.f85708a;
                if (!x22.u().k()) {
                    x22.c();
                    List<ResolveInfo> listQueryIntentServices = x22.zzaY().getPackageManager().queryIntentServices(new Intent().setClassName(x22.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        Context contextZzaY = x22.zzaY();
                        x22.c();
                        intent.setComponent(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
                        this.f86826c.a(intent);
                        return;
                    }
                    x22.a().m().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            this.f86826c.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean w() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11387w5.w():boolean");
    }

    protected final void x(InterfaceC4672d interfaceC4672d) {
        f();
        com.google.android.gms.common.internal.r.l(interfaceC4672d);
        this.f86827d = interfaceC4672d;
        H();
        J();
    }

    public final void y() {
        f();
        h();
        ServiceConnectionC11346q5 serviceConnectionC11346q5 = this.f86826c;
        serviceConnectionC11346q5.b();
        try {
            C16631b.b().c(this.f85708a.zzaY(), serviceConnectionC11346q5);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f86827d = null;
    }

    public final void z(InterfaceC10695y0 interfaceC10695y0, G g10, String str) throws IllegalStateException {
        f();
        h();
        X2 x22 = this.f85708a;
        if (x22.A().V(12451000) != 0) {
            x22.a().p().a("Not bundling data. Service unavailable or out of date");
            x22.A().b0(interfaceC10695y0, new byte[0]);
        } else {
            R(new Z4(this, g10, str, interfaceC10695y0));
        }
    }
}
