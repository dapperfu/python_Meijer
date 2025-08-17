package com.google.android.gms.measurement.internal;

import Od.AbstractBinderC4465c;
import Od.C4463a;
import Od.InterfaceC4469g;
import Od.InterfaceC4472j;
import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C10363b;
import com.google.android.gms.internal.measurement.C10391e0;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmr;
import gd.C14250i;
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
public final class BinderC11281z3 extends AbstractBinderC4465c {

    /* renamed from: a, reason: collision with root package name */
    private final q6 f86065a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f86066b;

    /* renamed from: c, reason: collision with root package name */
    private String f86067c;

    final /* synthetic */ q6 A9() {
        return this.f86065a;
    }

    @Override // Od.InterfaceC4466d
    public final void B7(final B6 b62, final C11141g c11141g) throws IllegalStateException {
        C9(b62, false);
        G9(new Runnable() { // from class: com.google.android.gms.measurement.internal.w3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f85981a.f6(b62, c11141g);
            }
        });
    }

    @Override // Od.InterfaceC4466d
    public final String I4(B6 b62) {
        C9(b62, false);
        return this.f86065a.n0(b62);
    }

    @Override // Od.InterfaceC4466d
    public final void K8(B6 b62) throws IllegalStateException {
        C9(b62, false);
        G9(new RunnableC11097a3(this, b62));
    }

    @Override // Od.InterfaceC4466d
    public final List O2(B6 b62, Bundle bundle) throws IllegalStateException {
        C9(b62, false);
        com.google.android.gms.common.internal.r.l(b62.f84903a);
        q6 q6Var = this.f86065a;
        if (!q6Var.z0().F(null, C11120d2.f85449Z0)) {
            try {
                return (List) this.f86065a.b().p(new CallableC11225r3(this, b62, bundle)).get();
            } catch (InterruptedException | ExecutionException e10) {
                this.f86065a.a().m().c("Failed to get trigger URIs. appId", C11218q2.v(b62.f84903a), e10);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) q6Var.b().q(new CallableC11219q3(this, b62, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            this.f86065a.a().m().c("Failed to get trigger URIs. appId", C11218q2.v(b62.f84903a), e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Od.InterfaceC4466d
    public final void R2(final B6 b62, final Bundle bundle, final InterfaceC4469g interfaceC4469g) throws IllegalStateException {
        C9(b62, false);
        final String str = (String) com.google.android.gms.common.internal.r.l(b62.f84903a);
        this.f86065a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.t3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f85867a.N3(b62, bundle, interfaceC4469g, str);
            }
        });
    }

    @Override // Od.InterfaceC4466d
    public final List S8(String str, String str2, boolean z10, B6 b62) {
        C9(b62, false);
        String str3 = b62.f84903a;
        com.google.android.gms.common.internal.r.l(str3);
        try {
            List<x6> list = (List) this.f86065a.b().p(new CallableC11129e3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.L(x6Var.f86032c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f86065a.a().m().c("Failed to query user properties. appId", C11218q2.v(b62.f84903a), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f86065a.a().m().c("Failed to query user properties. appId", C11218q2.v(b62.f84903a), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Od.InterfaceC4466d
    public final List U0(String str, String str2, String str3, boolean z10) {
        D9(str, true);
        try {
            List<x6> list = (List) this.f86065a.b().p(new CallableC11137f3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.L(x6Var.f86032c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f86065a.a().m().c("Failed to get user properties as. appId", C11218q2.v(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            this.f86065a.a().m().c("Failed to get user properties as. appId", C11218q2.v(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Od.InterfaceC4466d
    public final C4463a V7(B6 b62) throws IllegalStateException {
        C9(b62, false);
        com.google.android.gms.common.internal.r.f(b62.f84903a);
        try {
            return (C4463a) this.f86065a.b().q(new CallableC11184l3(this, b62)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f86065a.a().m().c("Failed to get consent. appId", C11218q2.v(b62.f84903a), e10);
            return new C4463a(null);
        }
    }

    @Override // Od.InterfaceC4466d
    public final List X4(B6 b62, boolean z10) {
        C9(b62, false);
        String str = b62.f84903a;
        com.google.android.gms.common.internal.r.l(str);
        try {
            List<x6> list = (List) this.f86065a.b().p(new Y2(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (x6 x6Var : list) {
                if (z10 || !z6.L(x6Var.f86032c)) {
                    arrayList.add(new v6(x6Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            this.f86065a.a().m().c("Failed to get user properties. appId", C11218q2.v(b62.f84903a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            this.f86065a.a().m().c("Failed to get user properties. appId", C11218q2.v(b62.f84903a), e);
            return null;
        }
    }

    @Override // Od.InterfaceC4466d
    public final List a9(String str, String str2, B6 b62) {
        C9(b62, false);
        String str3 = b62.f84903a;
        com.google.android.gms.common.internal.r.l(str3);
        try {
            return (List) this.f86065a.b().p(new CallableC11145g3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f86065a.a().m().b("Failed to get conditional user properties", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Od.InterfaceC4466d
    public final void b3(B6 b62) throws IllegalStateException {
        C9(b62, false);
        G9(new RunnableC11161i3(this, b62));
    }

    @Override // Od.InterfaceC4466d
    public final void b8(final Bundle bundle, final B6 b62) throws IllegalStateException {
        C9(b62, false);
        final String str = b62.f84903a;
        com.google.android.gms.common.internal.r.l(str);
        G9(new Runnable() { // from class: com.google.android.gms.measurement.internal.x3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws SQLException {
                this.f86002a.d7(bundle, str, b62);
            }
        });
    }

    @Override // Od.InterfaceC4466d
    public final List e2(String str, String str2, String str3) {
        D9(str, true);
        try {
            return (List) this.f86065a.b().p(new CallableC11153h3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f86065a.a().m().b("Failed to get conditional user properties as", e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // Od.InterfaceC4466d
    public final void r8(B6 b62) throws IllegalStateException {
        C9(b62, false);
        G9(new Z2(this, b62));
    }

    @Override // Od.InterfaceC4466d
    public final void x4(B6 b62, final Od.J j10, final InterfaceC4472j interfaceC4472j) throws IllegalStateException {
        C9(b62, false);
        final String str = (String) com.google.android.gms.common.internal.r.l(b62.f84903a);
        this.f86065a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.u3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f85908a.W5(str, j10, interfaceC4472j);
            }
        });
    }

    private final void B9(G g10, B6 b62) throws IOException {
        q6 q6Var = this.f86065a;
        q6Var.C();
        q6Var.i(g10, b62);
    }

    final void E9(G g10, B6 b62) throws IOException {
        q6 q6Var = this.f86065a;
        P2 p2B0 = q6Var.B0();
        String str = b62.f84903a;
        C10391e0 c10391e0 = TextUtils.isEmpty(str) ? null : (C10391e0) p2B0.f85160j.d(str);
        if (c10391e0 == null) {
            this.f86065a.a().u().b("EES not loaded for", b62.f84903a);
            B9(g10, b62);
            return;
        }
        try {
            Map mapX = q6Var.I0().X(g10.f85022b.W0(), true);
            String str2 = g10.f85021a;
            String strA = Od.w.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            if (c10391e0.b(new C10363b(str2, g10.f85024d, mapX))) {
                if (c10391e0.c()) {
                    q6 q6Var2 = this.f86065a;
                    q6Var2.a().u().b("EES edited event", g10.f85021a);
                    B9(q6Var2.I0().k(c10391e0.e().c()), b62);
                } else {
                    B9(g10, b62);
                }
                if (c10391e0.d()) {
                    for (C10363b c10363b : c10391e0.e().f()) {
                        q6 q6Var3 = this.f86065a;
                        q6Var3.a().u().b("EES logging created event", c10363b.b());
                        B9(q6Var3.I0().k(c10363b), b62);
                    }
                    return;
                }
                return;
            }
        } catch (zzd unused) {
            this.f86065a.a().m().c("EES error. appId, eventName", b62.f84904b, g10.f85021a);
        }
        this.f86065a.a().u().b("EES was not applied to event", g10.f85021a);
        B9(g10, b62);
    }

    final /* synthetic */ void F2(B6 b62) throws IOException, NumberFormatException {
        q6 q6Var = this.f86065a;
        q6Var.C();
        q6Var.O0(b62);
    }

    final G F9(G g10, B6 b62) {
        E e10;
        if ("_cmp".equals(g10.f85021a) && (e10 = g10.f85022b) != null && e10.K0() != 0) {
            String strQ0 = e10.q0("_cis");
            if ("referrer broadcast".equals(strQ0) || "referrer API".equals(strQ0)) {
                this.f86065a.a().s().b("Event has been filtered ", g10.toString());
                return new G("_cmpx", e10, g10.f85023c, g10.f85024d);
            }
        }
        return g10;
    }

    final /* synthetic */ void N3(B6 b62, Bundle bundle, InterfaceC4469g interfaceC4469g, String str) throws IOException {
        q6 q6Var = this.f86065a;
        q6Var.C();
        try {
            interfaceC4469g.y4(q6Var.o0(b62, bundle));
        } catch (RemoteException e10) {
            this.f86065a.a().m().c("Failed to return trigger URIs for app", str, e10);
        }
    }

    @Override // Od.InterfaceC4466d
    public final void S5(long j10, String str, String str2, String str3) throws IllegalStateException {
        G9(new RunnableC11105b3(this, str2, str3, str, j10));
    }

    @Override // Od.InterfaceC4466d
    public final void U5(B6 b62) throws IllegalStateException {
        String str = b62.f84903a;
        com.google.android.gms.common.internal.r.f(str);
        D9(str, false);
        G9(new RunnableC11169j3(this, b62));
    }

    final /* synthetic */ void W5(String str, Od.J j10, InterfaceC4472j interfaceC4472j) throws IOException {
        q6 q6Var = this.f86065a;
        q6Var.C();
        q6Var.b().f();
        q6Var.M0();
        List<t6> listM = q6Var.D0().m(str, j10, ((Integer) C11120d2.f85400B.b(null)).intValue());
        ArrayList arrayList = new ArrayList();
        for (t6 t6Var : listM) {
            if (q6Var.r(str, t6Var.e())) {
                int i10 = t6Var.i();
                if (i10 > 0) {
                    if (i10 <= ((Integer) C11120d2.f85512z.b(null)).intValue()) {
                        if (q6Var.zzaZ().a() >= t6Var.h() + Math.min(((Long) C11120d2.f85508x.b(null)).longValue() * (1 << (i10 - 1)), ((Long) C11120d2.f85510y.b(null)).longValue())) {
                        }
                    }
                    q6Var.a().u().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(t6Var.c()), Long.valueOf(t6Var.h()));
                }
                X5 x5B = t6Var.b();
                try {
                    com.google.android.gms.internal.measurement.V2 v22 = (com.google.android.gms.internal.measurement.V2) u6.U(com.google.android.gms.internal.measurement.Y2.L(), x5B.f85307b);
                    for (int i11 = 0; i11 < v22.u(); i11++) {
                        com.google.android.gms.internal.measurement.Z2 z22 = (com.google.android.gms.internal.measurement.Z2) v22.v(i11).q();
                        z22.l1(q6Var.zzaZ().a());
                        v22.w(i11, z22);
                    }
                    x5B.f85307b = ((com.google.android.gms.internal.measurement.Y2) v22.q()).g();
                    if (Log.isLoggable(q6Var.a().x(), 2)) {
                        x5B.f85312g = q6Var.I0().I((com.google.android.gms.internal.measurement.Y2) v22.q());
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
            interfaceC4472j.v8(z52);
            this.f86065a.a().u().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(z52.f85341a.size()));
        } catch (RemoteException e10) {
            this.f86065a.a().m().c("[sgtm] Failed to return upload batches for app", str, e10);
        }
    }

    final /* synthetic */ void b2(B6 b62) throws IOException {
        q6 q6Var = this.f86065a;
        q6Var.C();
        q6Var.N0(b62);
    }

    @Override // Od.InterfaceC4466d
    public final void d3(final B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f(b62.f84903a);
        com.google.android.gms.common.internal.r.l(b62.f84921s);
        a2(new Runnable() { // from class: com.google.android.gms.measurement.internal.s3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException, NumberFormatException {
                this.f85842a.F2(b62);
            }
        });
    }

    final /* synthetic */ void d7(Bundle bundle, String str, B6 b62) throws SQLException {
        q6 q6Var = this.f86065a;
        boolean zF = q6Var.z0().F(null, C11120d2.f85443W0);
        if (bundle.isEmpty() && zF) {
            C11242u c11242uD0 = this.f86065a.D0();
            c11242uD0.f();
            c11242uD0.h();
            try {
                c11242uD0.s0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e10) {
                c11242uD0.f84868a.a().m().b("Error clearing default event params", e10);
                return;
            }
        }
        C11242u c11242uD02 = q6Var.D0();
        c11242uD02.f();
        c11242uD02.h();
        byte[] bArrG = c11242uD02.f85267b.I0().H(new B(c11242uD02.f84868a, "", str, "dep", 0L, 0L, bundle)).g();
        X2 x22 = c11242uD02.f84868a;
        x22.a().u().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrG.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrG);
        try {
            if (c11242uD02.s0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                x22.a().m().b("Failed to insert default event parameters (got -1). appId", C11218q2.v(str));
            }
        } catch (SQLiteException e11) {
            c11242uD02.f84868a.a().m().c("Error storing default event parameters. appId", C11218q2.v(str), e11);
        }
        q6 q6Var2 = this.f86065a;
        C11242u c11242uD03 = q6Var2.D0();
        long j10 = b62.f84901D;
        if (c11242uD03.F(str, j10)) {
            q6Var2.D0().G(str, Long.valueOf(j10), null, bundle);
        }
    }

    final /* synthetic */ void f6(B6 b62, C11141g c11141g) throws IOException {
        q6 q6Var = this.f86065a;
        q6Var.C();
        q6Var.p0((String) com.google.android.gms.common.internal.r.l(b62.f84903a), c11141g);
    }

    @Override // Od.InterfaceC4466d
    public final void s9(B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f(b62.f84903a);
        com.google.android.gms.common.internal.r.l(b62.f84921s);
        a2(new RunnableC11177k3(this, b62));
    }

    @Override // Od.InterfaceC4466d
    public final void y2(final B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.f(b62.f84903a);
        com.google.android.gms.common.internal.r.l(b62.f84921s);
        a2(new Runnable() { // from class: com.google.android.gms.measurement.internal.y3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IOException {
                this.f86046a.b2(b62);
            }
        });
    }

    public BinderC11281z3(q6 q6Var, String str) {
        com.google.android.gms.common.internal.r.l(q6Var);
        this.f86065a = q6Var;
        this.f86067c = null;
    }

    private final void C9(B6 b62, boolean z10) {
        com.google.android.gms.common.internal.r.l(b62);
        String str = b62.f84903a;
        com.google.android.gms.common.internal.r.f(str);
        D9(str, false);
        this.f86065a.L0().m(b62.f84904b);
    }

    private final void D9(String str, boolean z10) {
        if (!TextUtils.isEmpty(str)) {
            if (z10) {
                try {
                    if (this.f86066b == null) {
                        boolean z11 = true;
                        if (!"com.google.android.gms".equals(this.f86067c)) {
                            q6 q6Var = this.f86065a;
                            if (!com.google.android.gms.common.util.s.a(q6Var.zzaY(), Binder.getCallingUid()) && !gd.j.a(q6Var.zzaY()).c(Binder.getCallingUid())) {
                                z11 = false;
                            }
                        }
                        this.f86066b = Boolean.valueOf(z11);
                    }
                    if (this.f86066b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f86065a.a().m().b("Measurement Service called with invalid calling package. appId", C11218q2.v(str));
                    throw e10;
                }
            }
            if (this.f86067c == null && C14250i.k(this.f86065a.zzaY(), Binder.getCallingUid(), str)) {
                this.f86067c = str;
            }
            if (str.equals(this.f86067c)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.f86065a.a().m().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @Override // Od.InterfaceC4466d
    public final void C3(v6 v6Var, B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(v6Var);
        C9(b62, false);
        G9(new RunnableC11212p3(this, v6Var, b62));
    }

    final void G9(Runnable runnable) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(runnable);
        q6 q6Var = this.f86065a;
        if (q6Var.b().n()) {
            runnable.run();
        } else {
            q6Var.b().r(runnable);
        }
    }

    @Override // Od.InterfaceC4466d
    public final void I5(G g10, String str, String str2) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(g10);
        com.google.android.gms.common.internal.r.f(str);
        D9(str, true);
        G9(new RunnableC11198n3(this, g10, str));
    }

    @Override // Od.InterfaceC4466d
    public final void Y0(C11157i c11157i, B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(c11157i);
        com.google.android.gms.common.internal.r.l(c11157i.f85610c);
        C9(b62, false);
        C11157i c11157i2 = new C11157i(c11157i);
        c11157i2.f85608a = b62.f84903a;
        G9(new RunnableC11113c3(this, c11157i2, b62));
    }

    final void a2(Runnable runnable) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(runnable);
        q6 q6Var = this.f86065a;
        if (q6Var.b().n()) {
            runnable.run();
        } else {
            q6Var.b().t(runnable);
        }
    }

    @Override // Od.InterfaceC4466d
    public final void a3(G g10, B6 b62) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(g10);
        C9(b62, false);
        G9(new RunnableC11191m3(this, g10, b62));
    }

    @Override // Od.InterfaceC4466d
    public final byte[] o3(G g10, String str) {
        com.google.android.gms.common.internal.r.f(str);
        com.google.android.gms.common.internal.r.l(g10);
        D9(str, true);
        q6 q6Var = this.f86065a;
        C11204o2 c11204o2T = q6Var.a().t();
        C11168j2 c11168j2K0 = q6Var.K0();
        String str2 = g10.f85021a;
        c11204o2T.b("Log and bundle. event", c11168j2K0.a(str2));
        long jB = q6Var.zzaZ().b() / 1000000;
        try {
            byte[] bArr = (byte[]) q6Var.b().q(new CallableC11205o3(this, g10, str)).get();
            if (bArr == null) {
                q6Var.a().m().b("Log and bundle returned null. appId", C11218q2.v(str));
                bArr = new byte[0];
            }
            q6Var.a().t().d("Log and bundle processed. event, size, time_ms", q6Var.K0().a(str2), Integer.valueOf(bArr.length), Long.valueOf((q6Var.zzaZ().b() / 1000000) - jB));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            q6 q6Var2 = this.f86065a;
            q6Var2.a().m().d("Failed to log and bundle. appId, event, error", C11218q2.v(str), q6Var2.K0().a(g10.f85021a), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            q6 q6Var22 = this.f86065a;
            q6Var22.a().m().d("Failed to log and bundle. appId, event, error", C11218q2.v(str), q6Var22.K0().a(g10.f85021a), e);
            return null;
        }
    }

    @Override // Od.InterfaceC4466d
    public final void p3(C11157i c11157i) throws IllegalStateException {
        com.google.android.gms.common.internal.r.l(c11157i);
        com.google.android.gms.common.internal.r.l(c11157i.f85610c);
        com.google.android.gms.common.internal.r.f(c11157i.f85608a);
        D9(c11157i.f85608a, true);
        G9(new RunnableC11121d3(this, new C11157i(c11157i)));
    }
}
