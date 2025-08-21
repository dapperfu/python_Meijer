package com.google.android.gms.internal.ads;

import Oc.InterfaceC4401i0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class CX implements InterfaceC9840vX {

    /* renamed from: a, reason: collision with root package name */
    private final C9481s60 f66641a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC9135ou f66642b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f66643c;

    /* renamed from: d, reason: collision with root package name */
    private final C9519sX f66644d;

    /* renamed from: e, reason: collision with root package name */
    private final Z80 f66645e;

    /* renamed from: f, reason: collision with root package name */
    private C7245Qz f66646f;

    final /* synthetic */ void e() {
        this.f66644d.a().C(V60.d(4, null, null));
    }

    final /* synthetic */ void f() {
        this.f66644d.a().C(V60.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean zza() {
        C7245Qz c7245Qz = this.f66646f;
        return c7245Qz != null && c7245Qz.f();
    }

    public CX(AbstractC9135ou abstractC9135ou, Context context, C9519sX c9519sX, C9481s60 c9481s60) {
        this.f66642b = abstractC9135ou;
        this.f66643c = context;
        this.f66644d = c9519sX;
        this.f66641a = c9481s60;
        this.f66645e = abstractC9135ou.F();
        c9481s60.R(c9519sX.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean a(Oc.Y1 y12, String str, C9626tX c9626tX, InterfaceC9733uX interfaceC9733uX) throws JSONException, RemoteException {
        Nc.v.t();
        if (Rc.D0.i(this.f66643c) && y12.f23372s == null) {
            Sc.p.d("Failed to load the ad because app ID is missing.");
            this.f66642b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80637a.e();
                }
            });
            return false;
        }
        if (str == null) {
            Sc.p.d("Ad unit ID should not be null for NativeAdLoader.");
            this.f66642b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81080a.f();
                }
            });
            return false;
        }
        R60.a(this.f66643c, y12.f23359f);
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue() && y12.f23359f) {
            this.f66642b.s().p(true);
        }
        int i10 = ((C9947wX) c9626tX).f80332a;
        long jA = Nc.v.c().a();
        String strA = EnumC8014eN.PUBLIC_API_CALL.a();
        Long lValueOf = Long.valueOf(jA);
        Bundle bundleA = C8228gN.a(new Pair(strA, lValueOf), new Pair(EnumC8014eN.DYNAMITE_ENTER.a(), lValueOf));
        C9481s60 c9481s60 = this.f66641a;
        c9481s60.h(y12);
        c9481s60.a(bundleA);
        c9481s60.c(i10);
        Context context = this.f66643c;
        C9695u60 c9695u60J = c9481s60.j();
        K80 k80B = J80.b(context, V80.f(c9695u60J), 8, y12);
        InterfaceC4401i0 interfaceC4401i0 = c9695u60J.f79588n;
        if (interfaceC4401i0 != null) {
            this.f66644d.d().g0(interfaceC4401i0);
        }
        FH fhO = this.f66642b.o();
        GB gb2 = new GB();
        gb2.f(this.f66643c);
        gb2.k(c9695u60J);
        fhO.i(gb2.l());
        XE xe2 = new XE();
        xe2.n(this.f66644d.d(), this.f66642b.d());
        fhO.n(xe2.q());
        fhO.c(this.f66644d.c());
        W80 w80E = null;
        fhO.d(new C8608jy(null));
        GH ghZzg = fhO.zzg();
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            w80E = ghZzg.e();
            w80E.i(8);
            w80E.b(y12.f23369p);
            w80E.f(y12.f23366m);
        }
        W80 w80 = w80E;
        this.f66642b.E().c(1);
        AbstractC9135ou abstractC9135ou = this.f66642b;
        Xj0 xj0B = U70.b();
        ScheduledExecutorService scheduledExecutorServiceE = abstractC9135ou.e();
        C8207gA c8207gAA = ghZzg.a();
        C7245Qz c7245Qz = new C7245Qz(xj0B, scheduledExecutorServiceE, c8207gAA.h(c8207gAA.i()));
        this.f66646f = c7245Qz;
        c7245Qz.e(new BX(this, interfaceC9733uX, w80, k80B, ghZzg));
        return true;
    }
}
