package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class DK {

    /* renamed from: a, reason: collision with root package name */
    private final C9695u60 f67065a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f67066b;

    /* renamed from: c, reason: collision with root package name */
    private final UL f67067c;

    /* renamed from: d, reason: collision with root package name */
    private final C9080oL f67068d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f67069e;

    /* renamed from: f, reason: collision with root package name */
    private final C9937wN f67070f;

    /* renamed from: g, reason: collision with root package name */
    private final R90 f67071g;

    /* renamed from: h, reason: collision with root package name */
    private final C9835vS f67072h;

    public DK(C9695u60 c9695u60, Executor executor, UL ul2, Context context, C9937wN c9937wN, R90 r90, C9835vS c9835vS, C9080oL c9080oL) {
        this.f67065a = c9695u60;
        this.f67066b = executor;
        this.f67067c = ul2;
        this.f67069e = context;
        this.f67070f = c9937wN;
        this.f67071g = r90;
        this.f67072h = c9835vS;
        this.f67068d = c9080oL;
    }

    public final com.google.common.util.concurrent.q a(final JSONObject jSONObject) {
        return Mj0.n(Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.tK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f79396a.e(obj);
            }
        }, this.f67066b), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.sK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f79061a.c(jSONObject, (InterfaceC9133ot) obj);
            }
        }, this.f67066b);
    }

    public final com.google.common.util.concurrent.q b(final String str, final String str2, final Z50 z50, final C7773c60 c7773c60, final Oc.d2 d2Var) {
        return Mj0.n(Mj0.h(null), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.rK
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f78834a.d(d2Var, z50, c7773c60, str, str2, obj);
            }
        }, this.f67066b);
    }

    private final void i(InterfaceC9133ot interfaceC9133ot, C7236Qq c7236Qq) {
        if (this.f67065a.f79575a != null && interfaceC9133ot.zzq() != null) {
            interfaceC9133ot.zzq().F9(this.f67065a.f79575a);
        }
        c7236Qq.e();
    }

    private static final void j(InterfaceC9133ot interfaceC9133ot) {
        interfaceC9133ot.h0("/videoClicked", C7160Oi.f69979h);
        interfaceC9133ot.zzN().E0(true);
        interfaceC9133ot.h0("/getNativeAdViewSignals", C7160Oi.f69990s);
        interfaceC9133ot.h0("/getNativeClickMeta", C7160Oi.f69991t);
    }

    final /* synthetic */ com.google.common.util.concurrent.q c(JSONObject jSONObject, final InterfaceC9133ot interfaceC9133ot) throws Exception {
        C7364Uj c7364Uj = this.f67065a.f79576b;
        final C7236Qq c7236QqD = C7236Qq.d(interfaceC9133ot);
        if (c7364Uj != null) {
            interfaceC9133ot.n0(C8493iu.d());
        } else {
            interfaceC9133ot.n0(C8493iu.e());
        }
        interfaceC9133ot.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.wK
            @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
            public final void a(boolean z10, int i10, String str, String str2) {
                this.f80311a.f(interfaceC9133ot, c7236QqD, z10, i10, str, str2);
            }
        });
        interfaceC9133ot.R0("google.afma.nativeAds.renderVideo", jSONObject);
        return c7236QqD;
    }

    final /* synthetic */ com.google.common.util.concurrent.q d(Oc.d2 d2Var, Z50 z50, C7773c60 c7773c60, String str, String str2, Object obj) throws Exception {
        final InterfaceC9133ot interfaceC9133otA = this.f67067c.a(d2Var, z50, c7773c60);
        final C7236Qq c7236QqD = C7236Qq.d(interfaceC9133otA);
        if (this.f67065a.f79576b != null) {
            h(interfaceC9133otA);
            interfaceC9133otA.n0(C8493iu.d());
        } else {
            C8759lL c8759lLB = this.f67068d.b();
            interfaceC9133otA.zzN().N0(c8759lLB, c8759lLB, c8759lLB, c8759lLB, c8759lLB, false, null, new Nc.b(this.f67069e, null, null), null, null, this.f67072h, this.f67071g, this.f67070f, null, c8759lLB, null, null, null, null);
            j(interfaceC9133otA);
        }
        interfaceC9133otA.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.xK
            @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
            public final void a(boolean z10, int i10, String str3, String str4) {
                this.f80608a.g(interfaceC9133otA, c7236QqD, z10, i10, str3, str4);
            }
        });
        interfaceC9133otA.I0(str, str2, null);
        return c7236QqD;
    }

    final /* synthetic */ com.google.common.util.concurrent.q e(Object obj) throws Exception {
        InterfaceC9133ot interfaceC9133otA = this.f67067c.a(Oc.d2.b0(), null, null);
        final C7236Qq c7236QqD = C7236Qq.d(interfaceC9133otA);
        h(interfaceC9133otA);
        interfaceC9133otA.zzN().B0(new InterfaceC8174fu() { // from class: com.google.android.gms.internal.ads.uK
            @Override // com.google.android.gms.internal.ads.InterfaceC8174fu
            public final void zza() {
                c7236QqD.e();
            }
        });
        interfaceC9133otA.loadUrl((String) Oc.A.c().a(C8784lf.f76968R3));
        return c7236QqD;
    }

    final /* synthetic */ void f(InterfaceC9133ot interfaceC9133ot, C7236Qq c7236Qq, boolean z10, int i10, String str, String str2) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f77080Z3)).booleanValue()) {
            i(interfaceC9133ot, c7236Qq);
            return;
        }
        if (z10) {
            i(interfaceC9133ot, c7236Qq);
            return;
        }
        c7236Qq.c(new zzegu(1, "Native Video WebView failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    final /* synthetic */ void g(InterfaceC9133ot interfaceC9133ot, C7236Qq c7236Qq, boolean z10, int i10, String str, String str2) {
        if (z10) {
            if (this.f67065a.f79575a != null && interfaceC9133ot.zzq() != null) {
                interfaceC9133ot.zzq().F9(this.f67065a.f79575a);
            }
            c7236Qq.e();
            return;
        }
        c7236Qq.c(new zzegu(1, "Html video Web View failed to load. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(InterfaceC9133ot interfaceC9133ot) {
        j(interfaceC9133ot);
        interfaceC9133ot.h0("/video", C7160Oi.f69983l);
        interfaceC9133ot.h0("/videoMeta", C7160Oi.f69984m);
        interfaceC9133ot.h0("/precache", new C9879vs());
        interfaceC9133ot.h0("/delayPageLoaded", C7160Oi.f69987p);
        interfaceC9133ot.h0("/instrument", C7160Oi.f69985n);
        interfaceC9133ot.h0("/log", C7160Oi.f69978g);
        interfaceC9133ot.h0("/click", new C8897mi(null, 0 == true ? 1 : 0));
        if (this.f67065a.f79576b != null) {
            interfaceC9133ot.zzN().f0(true);
            interfaceC9133ot.h0("/open", new C7832cj(null, null, null, null, null));
        } else {
            interfaceC9133ot.zzN().f0(false);
        }
        if (Nc.v.r().p(interfaceC9133ot.getContext())) {
            Map map = new HashMap();
            if (interfaceC9133ot.e() != null) {
                map = interfaceC9133ot.e().f72906w0;
            }
            interfaceC9133ot.h0("/logScionEvent", new C7396Vi(interfaceC9133ot.getContext(), map));
        }
    }
}
