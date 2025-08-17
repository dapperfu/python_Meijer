package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class Z40 implements InterfaceC9715vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f71983a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f71984b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC9010ou f71985c;

    /* renamed from: d, reason: collision with root package name */
    private final C7899eX f71986d;

    /* renamed from: e, reason: collision with root package name */
    private final B50 f71987e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6758Gf f71988f;

    /* renamed from: g, reason: collision with root package name */
    private final Z80 f71989g;

    /* renamed from: h, reason: collision with root package name */
    private final C9356s60 f71990h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q f71991i;

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean a(Mc.Y1 y12, String str, C9501tX c9501tX, InterfaceC9608uX interfaceC9608uX) throws JSONException {
        AbstractC8522kH abstractC8522kHZzf;
        W80 w80D;
        if (str == null) {
            Qc.p.d("Ad unit ID should not be null for interstitial ad.");
            this.f71984b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.T40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70289a.g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue() && y12.f19172f) {
            this.f71985c.s().p(true);
        }
        Mc.d2 d2Var = ((S40) c9501tX).f70030a;
        Bundle bundleA = C8103gN.a(new Pair(EnumC7889eN.PUBLIC_API_CALL.a(), Long.valueOf(y12.f19192z)), new Pair(EnumC7889eN.DYNAMITE_ENTER.a(), Long.valueOf(Lc.v.c().a())));
        C9356s60 c9356s60 = this.f71990h;
        c9356s60.P(str);
        c9356s60.O(d2Var);
        c9356s60.h(y12);
        c9356s60.a(bundleA);
        Context context = this.f71983a;
        C9570u60 c9570u60J = c9356s60.j();
        K80 k80B = J80.b(context, V80.f(c9570u60J), 4, y12);
        if (((Boolean) Mc.A.c().a(C8659lf.f76286c8)).booleanValue()) {
            InterfaceC8415jH interfaceC8415jHN = this.f71985c.n();
            GB gb2 = new GB();
            gb2.f(this.f71983a);
            gb2.k(c9570u60J);
            interfaceC8415jHN.k(gb2.l());
            XE xe2 = new XE();
            xe2.m(this.f71986d, this.f71984b);
            xe2.n(this.f71986d, this.f71984b);
            interfaceC8415jHN.o(xe2.q());
            interfaceC8415jHN.h(new C8645lW(this.f71988f));
            abstractC8522kHZzf = interfaceC8415jHN.zzh();
        } else {
            XE xe3 = new XE();
            B50 b50 = this.f71987e;
            if (b50 != null) {
                xe3.h(b50, this.f71984b);
                xe3.i(this.f71987e, this.f71984b);
                xe3.e(this.f71987e, this.f71984b);
            }
            InterfaceC8415jH interfaceC8415jHN2 = this.f71985c.n();
            GB gb3 = new GB();
            gb3.f(this.f71983a);
            gb3.k(c9570u60J);
            interfaceC8415jHN2.k(gb3.l());
            xe3.m(this.f71986d, this.f71984b);
            xe3.h(this.f71986d, this.f71984b);
            xe3.i(this.f71986d, this.f71984b);
            xe3.e(this.f71986d, this.f71984b);
            xe3.d(this.f71986d, this.f71984b);
            xe3.o(this.f71986d, this.f71984b);
            xe3.n(this.f71986d, this.f71984b);
            xe3.l(this.f71986d, this.f71984b);
            xe3.f(this.f71986d, this.f71984b);
            interfaceC8415jHN2.o(xe3.q());
            interfaceC8415jHN2.h(new C8645lW(this.f71988f));
            abstractC8522kHZzf = interfaceC8415jHN2.zzh();
        }
        AbstractC8522kH abstractC8522kH = abstractC8522kHZzf;
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            w80D = abstractC8522kH.d();
            w80D.i(4);
            w80D.b(y12.f19182p);
            w80D.f(y12.f19179m);
        } else {
            w80D = null;
        }
        W80 w80 = w80D;
        C8082gA c8082gAA = abstractC8522kH.a();
        com.google.common.util.concurrent.q qVarH = c8082gAA.h(c8082gAA.i());
        this.f71991i = qVarH;
        Mj0.r(qVarH, new Y40(this, interfaceC9608uX, w80, k80B, abstractC8522kH), this.f71984b);
        return true;
    }

    public final void h(InterfaceC6758Gf interfaceC6758Gf) {
        this.f71988f = interfaceC6758Gf;
    }

    final /* synthetic */ void g() {
        this.f71986d.g0(V60.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9715vX
    public final boolean zza() {
        com.google.common.util.concurrent.q qVar = this.f71991i;
        return (qVar == null || qVar.isDone()) ? false : true;
    }

    public Z40(Context context, Executor executor, AbstractC9010ou abstractC9010ou, C7899eX c7899eX, B50 b50, C9356s60 c9356s60) {
        this.f71983a = context;
        this.f71984b = executor;
        this.f71985c = abstractC9010ou;
        this.f71986d = c7899eX;
        this.f71990h = c9356s60;
        this.f71987e = b50;
        this.f71989g = abstractC9010ou.F();
    }
}
