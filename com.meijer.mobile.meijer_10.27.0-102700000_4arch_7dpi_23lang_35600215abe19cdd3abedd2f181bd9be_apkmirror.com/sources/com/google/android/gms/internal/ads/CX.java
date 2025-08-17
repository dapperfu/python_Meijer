package com.google.android.gms.internal.ads;

import Mc.InterfaceC4123i0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class CX implements InterfaceC9715vX {

    /* renamed from: a, reason: collision with root package name */
    private final C9356s60 f65801a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC9010ou f65802b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f65803c;

    /* renamed from: d, reason: collision with root package name */
    private final C9394sX f65804d;

    /* renamed from: e, reason: collision with root package name */
    private final Z80 f65805e;

    /* renamed from: f, reason: collision with root package name */
    private C7120Qz f65806f;

    final /* synthetic */ void e() {
        this.f65804d.a().g0(V60.d(4, null, null));
    }

    final /* synthetic */ void f() {
        this.f65804d.a().g0(V60.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean zza() {
        C7120Qz c7120Qz = this.f65806f;
        return c7120Qz != null && c7120Qz.f();
    }

    public CX(AbstractC9010ou abstractC9010ou, Context context, C9394sX c9394sX, C9356s60 c9356s60) {
        this.f65802b = abstractC9010ou;
        this.f65803c = context;
        this.f65804d = c9394sX;
        this.f65801a = c9356s60;
        this.f65805e = abstractC9010ou.F();
        c9356s60.R(c9394sX.d());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean a(Mc.Y1 y12, String str, C9501tX c9501tX, InterfaceC9608uX interfaceC9608uX) throws JSONException, RemoteException {
        Lc.v.t();
        if (Pc.D0.i(this.f65803c) && y12.f19185s == null) {
            Qc.p.d("Failed to load the ad because app ID is missing.");
            this.f65802b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79797a.e();
                }
            });
            return false;
        }
        if (str == null) {
            Qc.p.d("Ad unit ID should not be null for NativeAdLoader.");
            this.f65802b.d().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.yX
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80240a.f();
                }
            });
            return false;
        }
        R60.a(this.f65803c, y12.f19172f);
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue() && y12.f19172f) {
            this.f65802b.s().p(true);
        }
        int i10 = ((C9822wX) c9501tX).f79492a;
        long jA = Lc.v.c().a();
        String strA = EnumC7889eN.PUBLIC_API_CALL.a();
        Long lValueOf = Long.valueOf(jA);
        Bundle bundleA = C8103gN.a(new Pair(strA, lValueOf), new Pair(EnumC7889eN.DYNAMITE_ENTER.a(), lValueOf));
        C9356s60 c9356s60 = this.f65801a;
        c9356s60.h(y12);
        c9356s60.a(bundleA);
        c9356s60.c(i10);
        Context context = this.f65803c;
        C9570u60 c9570u60J = c9356s60.j();
        K80 k80B = J80.b(context, V80.f(c9570u60J), 8, y12);
        InterfaceC4123i0 interfaceC4123i0 = c9570u60J.f78748n;
        if (interfaceC4123i0 != null) {
            this.f65804d.d().b0(interfaceC4123i0);
        }
        FH fhO = this.f65802b.o();
        GB gb2 = new GB();
        gb2.f(this.f65803c);
        gb2.k(c9570u60J);
        fhO.i(gb2.l());
        XE xe2 = new XE();
        xe2.n(this.f65804d.d(), this.f65802b.d());
        fhO.n(xe2.q());
        fhO.c(this.f65804d.c());
        W80 w80E = null;
        fhO.d(new C8483jy(null));
        GH ghZzg = fhO.zzg();
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            w80E = ghZzg.e();
            w80E.i(8);
            w80E.b(y12.f19182p);
            w80E.f(y12.f19179m);
        }
        W80 w80 = w80E;
        this.f65802b.E().c(1);
        AbstractC9010ou abstractC9010ou = this.f65802b;
        Xj0 xj0B = U70.b();
        ScheduledExecutorService scheduledExecutorServiceE = abstractC9010ou.e();
        C8082gA c8082gAA = ghZzg.a();
        C7120Qz c7120Qz = new C7120Qz(xj0B, scheduledExecutorServiceE, c8082gAA.h(c8082gAA.i()));
        this.f65806f = c7120Qz;
        c7120Qz.e(new BX(this, interfaceC9608uX, w80, k80B, ghZzg));
        return true;
    }
}
