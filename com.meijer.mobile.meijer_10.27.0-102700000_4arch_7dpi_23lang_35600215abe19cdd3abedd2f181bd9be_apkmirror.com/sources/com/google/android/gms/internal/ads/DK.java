package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class DK {

    /* renamed from: a, reason: collision with root package name */
    private final C9570u60 f66225a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f66226b;

    /* renamed from: c, reason: collision with root package name */
    private final UL f66227c;

    /* renamed from: d, reason: collision with root package name */
    private final C8955oL f66228d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f66229e;

    /* renamed from: f, reason: collision with root package name */
    private final C9812wN f66230f;

    /* renamed from: g, reason: collision with root package name */
    private final R90 f66231g;

    /* renamed from: h, reason: collision with root package name */
    private final C9710vS f66232h;

    public DK(C9570u60 c9570u60, Executor executor, UL ul2, Context context, C9812wN c9812wN, R90 r90, C9710vS c9710vS, C8955oL c8955oL) {
        this.f66225a = c9570u60;
        this.f66226b = executor;
        this.f66227c = ul2;
        this.f66229e = context;
        this.f66230f = c9812wN;
        this.f66231g = r90;
        this.f66232h = c9710vS;
        this.f66228d = c8955oL;
    }

    public final com.google.common.util.concurrent.q a(final JSONObject jSONObject) {
        return Mj0.n(Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.tK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78556a.e(obj);
            }
        }, this.f66226b), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.sK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78221a.c(jSONObject, (InterfaceC9008ot) obj);
            }
        }, this.f66226b);
    }

    public final com.google.common.util.concurrent.q b(final String str, final String str2, final Z50 z50, final C7648c60 c7648c60, final Mc.d2 d2Var) {
        return Mj0.n(Mj0.h(null), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.rK
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f77994a.d(d2Var, z50, c7648c60, str, str2, obj);
            }
        }, this.f66226b);
    }

    private final void i(InterfaceC9008ot interfaceC9008ot, C7111Qq c7111Qq) {
        if (this.f66225a.f78735a != null && interfaceC9008ot.zzq() != null) {
            interfaceC9008ot.zzq().F9(this.f66225a.f78735a);
        }
        c7111Qq.e();
    }

    private static final void j(InterfaceC9008ot interfaceC9008ot) {
        interfaceC9008ot.h0("/videoClicked", C7035Oi.f69139h);
        interfaceC9008ot.zzN().F0(true);
        interfaceC9008ot.h0("/getNativeAdViewSignals", C7035Oi.f69150s);
        interfaceC9008ot.h0("/getNativeClickMeta", C7035Oi.f69151t);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(JSONObject jSONObject, final InterfaceC9008ot interfaceC9008ot) throws Exception {
        C7239Uj c7239Uj = this.f66225a.f78736b;
        final C7111Qq c7111QqD = C7111Qq.d(interfaceC9008ot);
        if (c7239Uj != null) {
            interfaceC9008ot.n0(C8368iu.d());
        } else {
            interfaceC9008ot.n0(C8368iu.e());
        }
        interfaceC9008ot.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.wK
            @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
            public final void a(boolean z10, int i10, String str, String str2) {
                this.f79471a.f(interfaceC9008ot, c7111QqD, z10, i10, str, str2);
            }
        });
        interfaceC9008ot.R0("google.afma.nativeAds.renderVideo", jSONObject);
        return c7111QqD;
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(Mc.d2 d2Var, Z50 z50, C7648c60 c7648c60, String str, String str2, Object obj) throws Exception {
        final InterfaceC9008ot interfaceC9008otA = this.f66227c.a(d2Var, z50, c7648c60);
        final C7111Qq c7111QqD = C7111Qq.d(interfaceC9008otA);
        if (this.f66225a.f78736b != null) {
            h(interfaceC9008otA);
            interfaceC9008otA.n0(C8368iu.d());
        } else {
            C8634lL c8634lLB = this.f66228d.b();
            interfaceC9008otA.zzN().r0(c8634lLB, c8634lLB, c8634lLB, c8634lLB, c8634lLB, false, null, new Lc.b(this.f66229e, null, null), null, null, this.f66232h, this.f66231g, this.f66230f, null, c8634lLB, null, null, null, null);
            j(interfaceC9008otA);
        }
        interfaceC9008otA.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.xK
            @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
            public final void a(boolean z10, int i10, String str3, String str4) {
                this.f79768a.g(interfaceC9008otA, c7111QqD, z10, i10, str3, str4);
            }
        });
        interfaceC9008otA.J0(str, str2, null);
        return c7111QqD;
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(Object obj) throws Exception {
        InterfaceC9008ot interfaceC9008otA = this.f66227c.a(Mc.d2.c0(), null, null);
        final C7111Qq c7111QqD = C7111Qq.d(interfaceC9008otA);
        h(interfaceC9008otA);
        interfaceC9008otA.zzN().C0(new InterfaceC8049fu() { // from class: com.google.android.gms.internal.ads.uK
            @Override // com.google.android.gms.internal.ads.InterfaceC8049fu
            public final void zza() {
                c7111QqD.e();
            }
        });
        interfaceC9008otA.loadUrl((String) Mc.A.c().a(C8659lf.f76128R3));
        return c7111QqD;
    }

    final /* synthetic */ void f(InterfaceC9008ot interfaceC9008ot, C7111Qq c7111Qq, boolean z10, int i10, String str, String str2) {
        if (!((Boolean) Mc.A.c().a(C8659lf.f76240Z3)).booleanValue()) {
            i(interfaceC9008ot, c7111Qq);
            return;
        }
        if (z10) {
            i(interfaceC9008ot, c7111Qq);
            return;
        }
        c7111Qq.c(new zzegu(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void g(InterfaceC9008ot interfaceC9008ot, C7111Qq c7111Qq, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (this.f66225a.f78735a != null && interfaceC9008ot.zzq() != null) {
                interfaceC9008ot.zzq().F9(this.f66225a.f78735a);
            }
            c7111Qq.e();
            return;
        }
        c7111Qq.c(new zzegu(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(InterfaceC9008ot interfaceC9008ot) {
        j(interfaceC9008ot);
        interfaceC9008ot.h0("/video", C7035Oi.f69143l);
        interfaceC9008ot.h0("/videoMeta", C7035Oi.f69144m);
        interfaceC9008ot.h0("/precache", new C9754vs());
        interfaceC9008ot.h0("/delayPageLoaded", C7035Oi.f69147p);
        interfaceC9008ot.h0("/instrument", C7035Oi.f69145n);
        interfaceC9008ot.h0("/log", C7035Oi.f69138g);
        interfaceC9008ot.h0("/click", new C8772mi(null, 0 == true ? 1 : 0));
        if (this.f66225a.f78736b != null) {
            interfaceC9008ot.zzN().d0(true);
            interfaceC9008ot.h0("/open", new C7707cj(null, null, null, null, null));
        } else {
            interfaceC9008ot.zzN().d0(false);
        }
        if (Lc.v.r().p(interfaceC9008ot.getContext())) {
            Map map = new HashMap();
            if (interfaceC9008ot.e() != null) {
                map = interfaceC9008ot.e().f72066w0;
            }
            interfaceC9008ot.h0("/logScionEvent", new C7271Vi(interfaceC9008ot.getContext(), map));
        }
    }
}
