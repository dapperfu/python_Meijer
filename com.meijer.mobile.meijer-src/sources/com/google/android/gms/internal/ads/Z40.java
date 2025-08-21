package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class Z40 implements InterfaceC9840vX {

    /* renamed from: a, reason: collision with root package name */
    private final Context f72823a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f72824b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC9135ou f72825c;

    /* renamed from: d, reason: collision with root package name */
    private final C8024eX f72826d;

    /* renamed from: e, reason: collision with root package name */
    private final B50 f72827e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6883Gf f72828f;

    /* renamed from: g, reason: collision with root package name */
    private final Z80 f72829g;

    /* renamed from: h, reason: collision with root package name */
    private final C9481s60 f72830h;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q f72831i;

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean a(Oc.Y1 y12, String str, C9626tX c9626tX, InterfaceC9733uX interfaceC9733uX) throws JSONException {
        AbstractC8647kH abstractC8647kHZzf;
        W80 w80D;
        if (str == null) {
            Sc.p.d("Ad unit ID should not be null for interstitial ad.");
            this.f72824b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.T40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71129a.g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue() && y12.f23359f) {
            this.f72825c.s().p(true);
        }
        Oc.d2 d2Var = ((S40) c9626tX).f70870a;
        Bundle bundleA = C8228gN.a(new Pair(EnumC8014eN.PUBLIC_API_CALL.a(), Long.valueOf(y12.f23379z)), new Pair(EnumC8014eN.DYNAMITE_ENTER.a(), Long.valueOf(Nc.v.c().a())));
        C9481s60 c9481s60 = this.f72830h;
        c9481s60.P(str);
        c9481s60.O(d2Var);
        c9481s60.h(y12);
        c9481s60.a(bundleA);
        Context context = this.f72823a;
        C9695u60 c9695u60J = c9481s60.j();
        K80 k80B = J80.b(context, V80.f(c9695u60J), 4, y12);
        if (((Boolean) Oc.A.c().a(C8784lf.f77126c8)).booleanValue()) {
            InterfaceC8540jH interfaceC8540jHN = this.f72825c.n();
            GB gb2 = new GB();
            gb2.f(this.f72823a);
            gb2.k(c9695u60J);
            interfaceC8540jHN.k(gb2.l());
            XE xe2 = new XE();
            xe2.m(this.f72826d, this.f72824b);
            xe2.n(this.f72826d, this.f72824b);
            interfaceC8540jHN.o(xe2.q());
            interfaceC8540jHN.h(new C8770lW(this.f72828f));
            abstractC8647kHZzf = interfaceC8540jHN.zzh();
        } else {
            XE xe3 = new XE();
            B50 b50 = this.f72827e;
            if (b50 != null) {
                xe3.h(b50, this.f72824b);
                xe3.i(this.f72827e, this.f72824b);
                xe3.e(this.f72827e, this.f72824b);
            }
            InterfaceC8540jH interfaceC8540jHN2 = this.f72825c.n();
            GB gb3 = new GB();
            gb3.f(this.f72823a);
            gb3.k(c9695u60J);
            interfaceC8540jHN2.k(gb3.l());
            xe3.m(this.f72826d, this.f72824b);
            xe3.h(this.f72826d, this.f72824b);
            xe3.i(this.f72826d, this.f72824b);
            xe3.e(this.f72826d, this.f72824b);
            xe3.d(this.f72826d, this.f72824b);
            xe3.o(this.f72826d, this.f72824b);
            xe3.n(this.f72826d, this.f72824b);
            xe3.l(this.f72826d, this.f72824b);
            xe3.f(this.f72826d, this.f72824b);
            interfaceC8540jHN2.o(xe3.q());
            interfaceC8540jHN2.h(new C8770lW(this.f72828f));
            abstractC8647kHZzf = interfaceC8540jHN2.zzh();
        }
        AbstractC8647kH abstractC8647kH = abstractC8647kHZzf;
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            w80D = abstractC8647kH.d();
            w80D.i(4);
            w80D.b(y12.f23369p);
            w80D.f(y12.f23366m);
        } else {
            w80D = null;
        }
        W80 w80 = w80D;
        C8207gA c8207gAA = abstractC8647kH.a();
        com.google.common.util.concurrent.q qVarH = c8207gAA.h(c8207gAA.i());
        this.f72831i = qVarH;
        Mj0.r(qVarH, new Y40(this, interfaceC9733uX, w80, k80B, abstractC8647kH), this.f72824b);
        return true;
    }

    public final void h(InterfaceC6883Gf interfaceC6883Gf) {
        this.f72828f = interfaceC6883Gf;
    }

    final /* synthetic */ void g() {
        this.f72826d.C(V60.d(6, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9840vX
    public final boolean zza() {
        com.google.common.util.concurrent.q qVar = this.f72831i;
        return (qVar == null || qVar.isDone()) ? false : true;
    }

    public Z40(Context context, Executor executor, AbstractC9135ou abstractC9135ou, C8024eX c8024eX, B50 b50, C9481s60 c9481s60) {
        this.f72823a = context;
        this.f72824b = executor;
        this.f72825c = abstractC9135ou;
        this.f72826d = c8024eX;
        this.f72830h = c9481s60;
        this.f72827e = b50;
        this.f72829g = abstractC9135ou.F();
    }
}
