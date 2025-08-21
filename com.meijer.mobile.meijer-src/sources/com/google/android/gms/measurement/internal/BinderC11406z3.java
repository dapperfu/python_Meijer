package com.google.android.gms.measurement.internal;

import Qd.AbstractBinderC4671c;
import Qd.C4669a;
import Qd.InterfaceC4675g;
import Qd.InterfaceC4678j;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C10488b;
import com.google.android.gms.internal.measurement.C10516e0;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import id.C14726i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.measurement.internal.z3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC11406z3 extends AbstractBinderC4671c {

    /* renamed from: a, reason: collision with root package name */
    private final q6 f86905a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f86906b;

    /* renamed from: c, reason: collision with root package name */
    private String f86907c;

    final /* synthetic */ q6 A9() {
        return this.f86905a;
    }

    @Override // Qd.InterfaceC4672d
    public final void E8(B6 b62) throws IllegalStateException {
        C9(b62, false);
        G9(new RunnableC11222a3(this, b62));
    }

    @Override // Qd.InterfaceC4672d
    public final void F7(final B6 b62, final C11266g c11266g) throws IllegalStateException {
        C9(b62, false);
        G9(new Runnable() { // from class: com.google.android.gms.measurement.internal.w3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f86821a.t6(b62, c11266g);
            }
        });
    }

    @Override // Qd.InterfaceC4672d
    public final List M8(String str, String str2, boolean z10, B6 b62) {
        C9(b62, false);
        String str3 = b62.f85743a;
        com.google.android.gms.common.internal.r.l(str3);
        try {
            List<x6> list = (List) this.f86905a.b().p(new CallableC11254e3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.L(x6Var.f86872c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f86905a.a().m().c("Failed to query user properties. appId", C11343q2.v(b62.f85743a), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f86905a.a().m().c("Failed to query user properties. appId", C11343q2.v(b62.f85743a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final C4669a R7(B6 b62) throws IllegalStateException {
        C9(b62, false);
        com.google.android.gms.common.internal.r.f(b62.f85743a);
        try {
            return (C4669a) this.f86905a.b().q(new CallableC11309l3(this, b62)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f86905a.a().m().c("Failed to get consent. appId", C11343q2.v(b62.f85743a), e10);
            return new C4669a(null);
        }
    }

    @Override // Qd.InterfaceC4672d
    public final String S4(B6 b62) {
        C9(b62, false);
        return this.f86905a.n0(b62);
    }

    @Override // Qd.InterfaceC4672d
    public final List V2(B6 b62, Bundle bundle) throws IllegalStateException {
        C9(b62, false);
        com.google.android.gms.common.internal.r.l(b62.f85743a);
        q6 q6Var = this.f86905a;
        if (!q6Var.z0().F(null, C11245d2.f86289Z0)) {
            try {
                return (List) this.f86905a.b().p(new CallableC11350r3(this, b62, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f86905a.a().m().c("Failed to get trigger URIs. appId", C11343q2.v(b62.f85743a), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) q6Var.b().q(new CallableC11344q3(this, b62, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f86905a.a().m().c("Failed to get trigger URIs. appId", C11343q2.v(b62.f85743a), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final List W0(String str, String str2, String str3, boolean z10) {
        D9(str, true);
        try {
            List<x6> list = (List) this.f86905a.b().p(new CallableC11262f3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.L(x6Var.f86872c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f86905a.a().m().c("Failed to get user properties as. appId", C11343q2.v(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f86905a.a().m().c("Failed to get user properties as. appId", C11343q2.v(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void X7(final Bundle bundle, final B6 b62) throws IllegalStateException {
        C9(b62, false);
        final String str = b62.f85743a;
        com.google.android.gms.common.internal.r.l(str);
        G9(new Runnable() { // from class: com.google.android.gms.measurement.internal.x3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws SQLException {
                this.f86842a.o7(bundle, str, b62);
            }
        });
    }

    @Override // Qd.InterfaceC4672d
    public final void Y2(B6 b62, final Qd.J j10, final InterfaceC4678j interfaceC4678j) throws IllegalStateException {
        C9(b62, false);
        final String str = (String) com.google.android.gms.common.internal.r.l(b62.f85743a);
        this.f86905a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.u3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f86748a.m6(str, j10, interfaceC4678j);
            }
        });
    }

    @Override // Qd.InterfaceC4672d
    public final List c9(String str, String str2, B6 b62) {
        C9(b62, false);
        String str3 = b62.f85743a;
        com.google.android.gms.common.internal.r.l(str3);
        try {
            return (List) this.f86905a.b().p(new CallableC11270g3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f86905a.a().m().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final List g2(String str, String str2, String str3) {
        D9(str, true);
        try {
            return (List) this.f86905a.b().p(new CallableC11278h3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f86905a.a().m().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void h3(B6 b62) throws IllegalStateException {
        C9(b62, false);
        G9(new RunnableC11286i3(this, b62));
    }

    @Override // Qd.InterfaceC4672d
    public final List k5(B6 b62, boolean z10) {
        C9(b62, false);
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.l(str);
        try {
            List<x6> list = (List) this.f86905a.b().p(new Y2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.L(x6Var.f86872c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f86905a.a().m().c("Failed to get user properties. appId", C11343q2.v(b62.f85743a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f86905a.a().m().c("Failed to get user properties. appId", C11343q2.v(b62.f85743a), e);
            return null;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void p6(final B6 b62, final Bundle bundle, final InterfaceC4675g interfaceC4675g) throws IllegalStateException {
        C9(b62, false);
        final String str = (String) com.google.android.gms.common.internal.r.l(b62.f85743a);
        this.f86905a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.t3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f86707a.Z3(b62, bundle, interfaceC4675g, str);
            }
        });
    }

    @Override // Qd.InterfaceC4672d
    public final void q8(B6 b62) throws IllegalStateException {
        C9(b62, false);
        G9(new Z2(this, b62));
    }

    private final void B9(G g10, B6 b62) throws IOException {
        q6 q6Var = this.f86905a;
        q6Var.C();
        q6Var.i(g10, b62);
    }

    final void E9(G g10, B6 b62) throws IOException {
        q6 q6Var = this.f86905a;
        P2 p2B0 = q6Var.B0();
        String str = b62.f85743a;
        C10516e0 c10516e0 = TextUtils.isEmpty(str) ? null : (C10516e0) p2B0.f86000j.d(str);
        if (c10516e0 == null) {
            this.f86905a.a().u().b("EES not loaded for", b62.f85743a);
            B9(g10, b62);
            return;
        }
        try {
            Map mapX = q6Var.I0().X(g10.f85862b.U0(), true);
            String str2 = g10.f85861a;
            String strA = Qd.w.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (c10516e0.b(new C10488b(str2, g10.f85864d, mapX))) {
                if (c10516e0.c()) {
                    q6 q6Var2 = this.f86905a;
                    q6Var2.a().u().b("EES edited event", g10.f85861a);
                    B9(q6Var2.I0().k(c10516e0.e().c()), b62);
                } else {
                    B9(g10, b62);
                }
                if (c10516e0.d()) {
                    for (C10488b c10488b : c10516e0.e().f()) {
                        q6 q6Var3 = this.f86905a;
                        q6Var3.a().u().b("EES logging created event", c10488b.b());
                        B9(q6Var3.I0().k(c10488b), b62);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            this.f86905a.a().m().c("EES error. appId, eventName", b62.f85744b, g10.f85861a);
        }
        this.f86905a.a().u().b("EES was not applied to event", g10.f85861a);
        B9(g10, b62);
    }

    final G F9(G g10, B6 b62) {
        E e10;
        if ("_cmp".equals(g10.f85861a) && (e10 = g10.f85862b) != null && e10.I0() != 0) {
            String strR0 = e10.r0("_cis");
            if ("referrer broadcast".equals(strR0) || "referrer API".equals(strR0)) {
                this.f86905a.a().s().b("Event has been filtered ", g10.toString());
                return new G("_cmpx", e10, g10.f85863c, g10.f85864d);
            }
        }
        return g10;
    }

    final /* synthetic */ void I2(B6 b62) throws IOException, NumberFormatException {
        q6 q6Var = this.f86905a;
        q6Var.C();
        q6Var.O0(b62);
    }

    final /* synthetic */ void Z3(B6 b62, Bundle bundle, InterfaceC4675g interfaceC4675g, String str) throws IOException {
        q6 q6Var = this.f86905a;
        q6Var.C();
        try {
            interfaceC4675g.K4(q6Var.o0(b62, bundle));
        } catch (RemoteException e10) {
            this.f86905a.a().m().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    final /* synthetic */ void c2(B6 b62) throws IOException {
        q6 q6Var = this.f86905a;
        q6Var.C();
        q6Var.N0(b62);
    }

    @Override // Qd.InterfaceC4672d
    public final void e6(long j10, String str, String str2, String str3) throws IllegalStateException {
        G9(new RunnableC11230b3(this, str2, str3, str, j10));
    }

    @Override // Qd.InterfaceC4672d
    public final void g6(B6 b62) throws IllegalStateException {
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str);
        D9(str, false);
        G9(new RunnableC11294j3(this, b62));
    }

    @Override // Qd.InterfaceC4672d
    public final void j3(final B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f(b62.f85743a);
        com.google.android.gms.common.internal.r.l(b62.f85761s);
        a2(new Runnable() { // from class: com.google.android.gms.measurement.internal.s3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException, NumberFormatException {
                this.f86682a.I2(b62);
            }
        });
    }

    final /* synthetic */ void m6(String str, Qd.J j10, InterfaceC4678j interfaceC4678j) throws IOException {
        q6 q6Var = this.f86905a;
        q6Var.C();
        q6Var.b().f();
        q6Var.M0();
        List<t6> listM = q6Var.D0().m(str, j10, ((Integer) C11245d2.f86240B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (t6 t6Var : listM) {
            if (q6Var.r(str, t6Var.e())) {
                int i10 = t6Var.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) C11245d2.f86352z.b(null)).intValue()) {
                        if (q6Var.zzaZ().a() >= t6Var.h() + Math.min(((Long) C11245d2.f86348x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) C11245d2.f86350y.b(null)).longValue())) {
                        }
                    }
                    q6Var.a().u().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(t6Var.c()), Long.valueOf(t6Var.h()));
                }
                X5 x5B = t6Var.b();
                try {
                    com.google.android.gms.internal.measurement.V2 v22 = (com.google.android.gms.internal.measurement.V2) u6.U(com.google.android.gms.internal.measurement.Y2.L(), x5B.f86147b);
                    for (int i11 = 0; i11 < v22.u(); i11++) {
                        com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) v22.v(i11).q();
                        z22.l1(q6Var.zzaZ().a());
                        v22.w(i11, z22);
                    }
                    x5B.f86147b = ((com.google.android.gms.internal.measurement.Y2) v22.q()).g();
                    if (Log.isLoggable(q6Var.a().x(), 2)) {
                        x5B.f86152g = q6Var.I0().I((com.google.android.gms.internal.measurement.Y2) v22.q());
                    }
                    arrayList.add(x5B);
                } catch (zzmr unused) {
                    q6Var.a().p().b("Failed to parse queued batch. appId", str);
                }
            } else {
                q6Var.a().u().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(t6Var.c()), t6Var.e());
            }
        }
        Z5 z52 = new Z5(arrayList);
        try {
            interfaceC4678j.s8(z52);
            this.f86905a.a().u().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(z52.f86181a.size()));
        } catch (RemoteException e10) {
            this.f86905a.a().m().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    final /* synthetic */ void o7(Bundle bundle, String str, B6 b62) throws SQLException {
        q6 q6Var = this.f86905a;
        boolean zF = q6Var.z0().F(null, C11245d2.f86283W0);
        if (bundle.isEmpty() && zF) {
            C11367u c11367uD0 = this.f86905a.D0();
            c11367uD0.f();
            c11367uD0.h();
            try {
                c11367uD0.s0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c11367uD0.f85708a.a().m().b("Error clearing default event params", e10);
                return;
            }
        }
        C11367u c11367uD02 = q6Var.D0();
        c11367uD02.f();
        c11367uD02.h();
        byte[] bArrG = c11367uD02.f86107b.I0().H(new B(c11367uD02.f85708a, "", str, "dep", 0L, 0L, bundle)).g();
        X2 x22 = c11367uD02.f85708a;
        x22.a().u().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrG);
        try {
            if (c11367uD02.s0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                x22.a().m().b("Failed to insert default event parameters (got -1). appId", C11343q2.v(str));
            }
        } catch (SQLiteException e11) {
            c11367uD02.f85708a.a().m().c("Error storing default event parameters. appId", C11343q2.v(str), e11);
        }
        q6 q6Var2 = this.f86905a;
        C11367u c11367uD03 = q6Var2.D0();
        long j10 = b62.f85741D;
        if (c11367uD03.F(str, j10)) {
            q6Var2.D0().G(str, Long.valueOf(j10), null, bundle);
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void s9(B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f(b62.f85743a);
        com.google.android.gms.common.internal.r.l(b62.f85761s);
        a2(new RunnableC11302k3(this, b62));
    }

    final /* synthetic */ void t6(B6 b62, C11266g c11266g) throws IOException {
        q6 q6Var = this.f86905a;
        q6Var.C();
        q6Var.p0((String) com.google.android.gms.common.internal.r.l(b62.f85743a), c11266g);
    }

    @Override // Qd.InterfaceC4672d
    public final void y2(final B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f(b62.f85743a);
        com.google.android.gms.common.internal.r.l(b62.f85761s);
        a2(new Runnable() { // from class: com.google.android.gms.measurement.internal.y3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f86886a.c2(b62);
            }
        });
    }

    public BinderC11406z3(q6 q6Var, String str) {
        com.google.android.gms.common.internal.r.l(q6Var);
        this.f86905a = q6Var;
        this.f86907c = null;
    }

    private final void C9(B6 b62, boolean z10) {
        com.google.android.gms.common.internal.r.l(b62);
        String str = b62.f85743a;
        com.google.android.gms.common.internal.r.f(str);
        D9(str, false);
        this.f86905a.L0().m(b62.f85744b);
    }

    private final void D9(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f86906b == null) {
                        boolean z11 = true;
                        if (!"com.google.android.gms".equals(this.f86907c)) {
                            q6 q6Var = this.f86905a;
                            if (!com.google.android.gms.common.util.s.a(q6Var.zzaY(), Binder.getCallingUid()) && !id.j.a(q6Var.zzaY()).c(Binder.getCallingUid())) {
                                z11 = false;
                            }
                        }
                        this.f86906b = Boolean.valueOf(z11);
                    }
                    if (this.f86906b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f86905a.a().m().b("Measurement Service called with invalid calling package. appId", C11343q2.v(str));
                    throw e10;
                }
            }
            if (this.f86907c == null && C14726i.k(this.f86905a.zzaY(), Binder.getCallingUid(), str)) {
                this.f86907c = str;
            }
            if (str.equals(this.f86907c)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f86905a.a().m().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    final void G9(Runnable runnable) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(runnable);
        q6 q6Var = this.f86905a;
        if (q6Var.b().n()) {
            runnable.run();
        } else {
            q6Var.b().r(runnable);
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void O3(v6 v6Var, B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(v6Var);
        C9(b62, false);
        G9(new RunnableC11337p3(this, v6Var, b62));
    }

    @Override // Qd.InterfaceC4672d
    public final void S5(G g10, String str, String str2) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(g10);
        com.google.android.gms.common.internal.r.f(str);
        D9(str, true);
        G9(new RunnableC11323n3(this, g10, str));
    }

    final void a2(Runnable runnable) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(runnable);
        q6 q6Var = this.f86905a;
        if (q6Var.b().n()) {
            runnable.run();
        } else {
            q6Var.b().t(runnable);
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void b1(C11282i c11282i, B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(c11282i);
        com.google.android.gms.common.internal.r.l(c11282i.f86450c);
        C9(b62, false);
        C11282i c11282i2 = new C11282i(c11282i);
        c11282i2.f86448a = b62.f85743a;
        G9(new RunnableC11238c3(this, c11282i2, b62));
    }

    @Override // Qd.InterfaceC4672d
    public final void f3(G g10, B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(g10);
        C9(b62, false);
        G9(new RunnableC11316m3(this, g10, b62));
    }

    @Override // Qd.InterfaceC4672d
    public final byte[] v3(G g10, String str) {
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.l(g10);
        D9(str, true);
        q6 q6Var = this.f86905a;
        C11329o2 c11329o2T = q6Var.a().t();
        C11293j2 c11293j2K0 = q6Var.K0();
        String str2 = g10.f85861a;
        c11329o2T.b("Log and bundle. event", c11293j2K0.a(str2));
        long jB = q6Var.zzaZ().b() / 1000000;
        try {
            byte[] bArr = (byte[]) q6Var.b().q(new CallableC11330o3(this, g10, str)).get();
            if (bArr == null) {
                q6Var.a().m().b("Log and bundle returned null. appId", C11343q2.v(str));
                bArr = new byte[0];
            }
            q6Var.a().t().d("Log and bundle processed. event, size, time_ms", q6Var.K0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((q6Var.zzaZ().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            q6 q6Var2 = this.f86905a;
            q6Var2.a().m().d("Failed to log and bundle. appId, event, error", C11343q2.v(str), q6Var2.K0().a(g10.f85861a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            q6 q6Var22 = this.f86905a;
            q6Var22.a().m().d("Failed to log and bundle. appId, event, error", C11343q2.v(str), q6Var22.K0().a(g10.f85861a), e);
            return null;
        }
    }

    @Override // Qd.InterfaceC4672d
    public final void z3(C11282i c11282i) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(c11282i);
        com.google.android.gms.common.internal.r.l(c11282i.f86450c);
        com.google.android.gms.common.internal.r.f(c11282i.f86448a);
        D9(c11282i.f86448a, true);
        G9(new RunnableC11246d3(this, new C11282i(c11282i)));
    }
}
