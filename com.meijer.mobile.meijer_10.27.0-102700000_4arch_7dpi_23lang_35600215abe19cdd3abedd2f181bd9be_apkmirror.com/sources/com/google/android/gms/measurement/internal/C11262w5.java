package com.google.android.gms.measurement.internal;

import Od.C4463a;
import Od.InterfaceC4466d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC10570y0;
import com.medallia.digital.mobilesdk.l8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import od.C16023b;

/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11262w5 extends AbstractC11136f2 {

    /* renamed from: c, reason: collision with root package name */
    private final ServiceConnectionC11221q5 f85986c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4466d f85987d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f85988e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC11263x f85989f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledExecutorService f85990g;

    /* renamed from: h, reason: collision with root package name */
    private final R5 f85991h;

    /* renamed from: i, reason: collision with root package name */
    private final List f85992i;

    /* renamed from: j, reason: collision with root package name */
    private final AbstractC11263x f85993j;

    final /* synthetic */ void E(AtomicReference atomicReference, B6 b62, Bundle bundle) {
        InterfaceC4466d interfaceC4466d;
        synchronized (atomicReference) {
            try {
                interfaceC4466d = this.f85987d;
            } catch (RemoteException e10) {
                this.f84868a.a().m().b("Failed to request trigger URIs; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4466d == null) {
                this.f84868a.a().m().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4466d.R2(b62, bundle, new O4(this, atomicReference));
            H();
        }
    }

    final /* synthetic */ void F(AtomicReference atomicReference, B6 b62, Od.J j10) {
        InterfaceC4466d interfaceC4466d;
        synchronized (atomicReference) {
            try {
                interfaceC4466d = this.f85987d;
            } catch (RemoteException e10) {
                this.f84868a.a().m().b("[sgtm] Failed to get upload batches; remote exception", e10);
                atomicReference.notifyAll();
            }
            if (interfaceC4466d == null) {
                this.f84868a.a().m().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4466d.x4(b62, j10, new P4(this, atomicReference));
            H();
        }
    }

    final /* synthetic */ ServiceConnectionC11221q5 K() {
        return this.f85986c;
    }

    final /* synthetic */ void M(InterfaceC4466d interfaceC4466d) {
        this.f85987d = null;
    }

    final /* synthetic */ ScheduledExecutorService N() {
        return this.f85990g;
    }

    final /* synthetic */ void O(ScheduledExecutorService scheduledExecutorService) {
        this.f85990g = scheduledExecutorService;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC11136f2
    protected final boolean k() {
        return false;
    }

    final Boolean v() {
        return this.f85988e;
    }

    private final boolean P() {
        this.f84868a.c();
        return true;
    }

    private final B6 T(boolean z10) {
        Pair pairB;
        X2 x22 = this.f84868a;
        x22.c();
        C11144g2 c11144g2J = this.f84868a.J();
        String string = null;
        if (z10) {
            X2 x23 = x22.a().f84868a;
            if (x23.v().f84973e != null && (pairB = x23.v().f84973e.b()) != null && pairB != E2.f84970A) {
                String strValueOf = String.valueOf(pairB.second);
                String str = (String) pairB.first;
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length());
                sb2.append(strValueOf);
                sb2.append(":");
                sb2.append(str);
                string = sb2.toString();
            }
        }
        return c11144g2J.m(string);
    }

    final /* synthetic */ void C() {
        InterfaceC4466d interfaceC4466d = this.f85987d;
        if (interfaceC4466d == null) {
            this.f84868a.a().m().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            B6 b6T = T(false);
            com.google.android.gms.common.internal.r.l(b6T);
            interfaceC4466d.y2(b6T);
            H();
        } catch (RemoteException e10) {
            this.f84868a.a().m().b("Failed to send storage consent settings to the service", e10);
        }
    }

    final /* synthetic */ void D() {
        InterfaceC4466d interfaceC4466d = this.f85987d;
        if (interfaceC4466d == null) {
            this.f84868a.a().m().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            B6 b6T = T(false);
            com.google.android.gms.common.internal.r.l(b6T);
            interfaceC4466d.d3(b6T);
            H();
        } catch (RemoteException e10) {
            this.f84868a.a().m().b("Failed to send Dma consent settings to the service", e10);
        }
    }

    final /* synthetic */ void G(B6 b62, C11141g c11141g) {
        InterfaceC4466d interfaceC4466d = this.f85987d;
        if (interfaceC4466d == null) {
            this.f84868a.a().m().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC4466d.B7(b62, c11141g);
            H();
        } catch (RemoteException e10) {
            this.f84868a.a().m().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c11141g.f85558a), e10);
        }
    }

    final /* synthetic */ InterfaceC4466d L() {
        return this.f85987d;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void Z(Od.InterfaceC4466d r59, kd.AbstractC15136a r60, com.google.android.gms.measurement.internal.B6 r61) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11262w5.Z(Od.d, kd.a, com.google.android.gms.measurement.internal.B6):void");
    }

    protected C11262w5(X2 x22) {
        super(x22);
        this.f85992i = new ArrayList();
        this.f85991h = new R5(x22.zzaZ());
        this.f85986c = new ServiceConnectionC11221q5(this);
        this.f85989f = new W4(this, x22);
        this.f85993j = new C11099a5(this, x22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void H() {
        f();
        this.f85991h.a();
        this.f84868a.u();
        this.f85989f.b(((Long) C11120d2.f85448Z.b(null)).longValue());
    }

    private final void R(Runnable runnable) throws IllegalStateException {
        f();
        if (U()) {
            runnable.run();
            return;
        }
        List list = this.f85992i;
        long size = list.size();
        X2 x22 = this.f84868a;
        x22.u();
        if (size >= 1000) {
            x22.a().m().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f85993j.b(l8.b.f92525b);
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void J() {
        f();
        C11204o2 c11204o2U = this.f84868a.a().u();
        List list = this.f85992i;
        c11204o2U.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.f84868a.a().m().b("Task exception while flushing queue", e10);
            }
        }
        this.f85992i.clear();
        this.f85993j.d();
    }

    final boolean A() {
        f();
        h();
        if (!w() || this.f84868a.A().U() >= ((Integer) C11120d2.f85419K0.b(null)).intValue()) {
            return true;
        }
        return false;
    }

    final boolean B() {
        f();
        h();
        if (!w() || this.f84868a.A().U() >= 241200) {
            return true;
        }
        return false;
    }

    final /* synthetic */ void I(ComponentName componentName) {
        f();
        if (this.f85987d != null) {
            this.f85987d = null;
            this.f84868a.a().u().b("Disconnected from device MeasurementService", componentName);
            f();
            u();
        }
    }

    public final boolean U() {
        f();
        h();
        if (this.f85987d != null) {
            return true;
        }
        return false;
    }

    protected final void V() {
        f();
        h();
        R(new RunnableC11107b5(this, T(true)));
    }

    protected final void W(boolean z10) {
        f();
        h();
        if (A()) {
            R(new RunnableC11115c5(this, T(false)));
        }
    }

    protected final void X(boolean z10) {
        f();
        h();
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.v5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f85924a.C();
            }
        });
    }

    protected final void Y() throws IllegalStateException {
        f();
        h();
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.r5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f85835a.D();
            }
        });
    }

    protected final void a0(G g10, String str) {
        com.google.android.gms.common.internal.r.l(g10);
        f();
        h();
        P();
        R(new RunnableC11123d5(this, true, T(true), this.f84868a.C().n(g10), g10, str));
    }

    protected final void b0(C11157i c11157i) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(c11157i);
        f();
        h();
        this.f84868a.c();
        R(new RunnableC11131e5(this, true, T(true), this.f84868a.C().p(c11157i), new C11157i(c11157i), c11157i));
    }

    protected final void c0(AtomicReference atomicReference, String str, String str2, String str3) throws IllegalStateException {
        f();
        h();
        R(new RunnableC11139f5(this, atomicReference, null, str2, str3, T(false)));
    }

    protected final void d0(InterfaceC10570y0 interfaceC10570y0, String str, String str2) throws IllegalStateException {
        f();
        h();
        R(new RunnableC11147g5(this, str, str2, T(false), interfaceC10570y0));
    }

    protected final void e0(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) throws IllegalStateException {
        f();
        h();
        R(new RunnableC11155h5(this, atomicReference, null, str2, str3, T(false), z10));
    }

    protected final void f0(InterfaceC10570y0 interfaceC10570y0, String str, String str2, boolean z10) throws IllegalStateException {
        f();
        h();
        R(new N4(this, str, str2, T(false), z10, interfaceC10570y0));
    }

    protected final void g0(final AtomicReference atomicReference, final Bundle bundle) throws IllegalStateException {
        f();
        h();
        final B6 b6T = T(false);
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f85845a.E(atomicReference, b6T, bundle);
            }
        });
    }

    protected final void h0(final AtomicReference atomicReference, final Od.J j10) throws IllegalStateException {
        f();
        h();
        final B6 b6T = T(false);
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.t5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f85874a.F(atomicReference, b6T, j10);
            }
        });
    }

    protected final void i0(final C11141g c11141g) throws IllegalStateException {
        f();
        h();
        final B6 b6T = T(true);
        com.google.android.gms.common.internal.r.l(b6T);
        R(new Runnable() { // from class: com.google.android.gms.measurement.internal.u5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f85914a.G(b6T, c11141g);
            }
        });
    }

    protected final C4463a j0() {
        f();
        h();
        InterfaceC4466d interfaceC4466d = this.f85987d;
        if (interfaceC4466d == null) {
            u();
            this.f84868a.a().t().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        B6 b6T = T(false);
        com.google.android.gms.common.internal.r.l(b6T);
        try {
            C4463a c4463aV7 = interfaceC4466d.V7(b6T);
            H();
            return c4463aV7;
        } catch (RemoteException e10) {
            this.f84868a.a().m().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    protected final void m(v6 v6Var) {
        f();
        h();
        P();
        R(new Q4(this, T(true), this.f84868a.C().o(v6Var), v6Var));
    }

    protected final void n() throws IllegalStateException {
        f();
        h();
        B6 b6T = T(false);
        P();
        this.f84868a.C().m();
        R(new R4(this, b6T));
    }

    public final void o(AtomicReference atomicReference) {
        f();
        h();
        R(new S4(this, atomicReference, T(false)));
    }

    public final void p(InterfaceC10570y0 interfaceC10570y0) throws IllegalStateException {
        f();
        h();
        R(new T4(this, T(false), interfaceC10570y0));
    }

    protected final void q() throws IllegalStateException {
        f();
        h();
        B6 b6T = T(true);
        P();
        this.f84868a.u().F(null, C11120d2.f85458c1);
        this.f84868a.C().s();
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
        if (this.f84868a.u().F(null, C11120d2.f85458c1) && this.f84868a.C().q(e10)) {
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
                X2 x22 = this.f84868a;
                if (!x22.u().k()) {
                    x22.c();
                    List<ResolveInfo> listQueryIntentServices = x22.zzaY().getPackageManager().queryIntentServices(new Intent().setClassName(x22.zzaY(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        Context contextZzaY = x22.zzaY();
                        x22.c();
                        intent.setComponent(new ComponentName(contextZzaY, "com.google.android.gms.measurement.AppMeasurementService"));
                        this.f85986c.a(intent);
                        return;
                    }
                    x22.a().m().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            this.f85986c.c();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C11262w5.w():boolean");
    }

    protected final void x(InterfaceC4466d interfaceC4466d) {
        f();
        com.google.android.gms.common.internal.r.l(interfaceC4466d);
        this.f85987d = interfaceC4466d;
        H();
        J();
    }

    public final void y() {
        f();
        h();
        ServiceConnectionC11221q5 serviceConnectionC11221q5 = this.f85986c;
        serviceConnectionC11221q5.b();
        try {
            C16023b.b().c(this.f84868a.zzaY(), serviceConnectionC11221q5);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f85987d = null;
    }

    public final void z(InterfaceC10570y0 interfaceC10570y0, G g10, String str) throws IllegalStateException {
        f();
        h();
        X2 x22 = this.f84868a;
        if (x22.A().V(12451000) != 0) {
            x22.a().p().a("Not bundling data. Service unavailable or out of date");
            x22.A().b0(interfaceC10570y0, new byte[0]);
        } else {
            R(new Z4(this, g10, str, interfaceC10570y0));
        }
    }
}
