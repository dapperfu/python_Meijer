package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class TL {

    /* renamed from: a, reason: collision with root package name */
    private final XB f70364a;

    /* renamed from: b, reason: collision with root package name */
    private final C7987fG f70365b;

    /* renamed from: c, reason: collision with root package name */
    private final IC f70366c;

    /* renamed from: d, reason: collision with root package name */
    private final VC f70367d;

    /* renamed from: e, reason: collision with root package name */
    private final C8195hD f70368e;

    /* renamed from: f, reason: collision with root package name */
    private final BE f70369f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f70370g;

    /* renamed from: h, reason: collision with root package name */
    private final C7561bG f70371h;

    /* renamed from: i, reason: collision with root package name */
    private final C6745Fx f70372i;

    /* renamed from: j, reason: collision with root package name */
    private final Lc.b f70373j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6805Hp f70374k;

    /* renamed from: l, reason: collision with root package name */
    private final M9 f70375l;

    /* renamed from: m, reason: collision with root package name */
    private final C9371sE f70376m;

    /* renamed from: n, reason: collision with root package name */
    private final C9710vS f70377n;

    /* renamed from: o, reason: collision with root package name */
    private final R90 f70378o;

    /* renamed from: p, reason: collision with root package name */
    private final C9812wN f70379p;

    /* renamed from: q, reason: collision with root package name */
    private final C8269hx f70380q;

    /* renamed from: r, reason: collision with root package name */
    private final ZL f70381r;

    public static final com.google.common.util.concurrent.q j(InterfaceC9008ot interfaceC9008ot, String str, String str2, final Bundle bundle) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76420m2)).booleanValue()) {
            bundle.putLong(EnumC7889eN.RENDERING_WEBVIEW_LOAD_HTML_START.a(), Lc.v.c().a());
        }
        final C7145Rq c7145Rq = new C7145Rq();
        interfaceC9008ot.zzN().P(new InterfaceC7942eu() { // from class: com.google.android.gms.internal.ads.KL
            @Override // com.google.android.gms.internal.ads.InterfaceC7942eu
            public final void a(boolean z10, int i10, String str3, String str4) {
                C7145Rq c7145Rq2 = c7145Rq;
                if (z10) {
                    if (((Boolean) Mc.A.c().a(C8659lf.f76420m2)).booleanValue()) {
                        bundle.putLong(EnumC7889eN.RENDERING_WEBVIEW_LOAD_HTML_END.a(), Lc.v.c().a());
                    }
                    c7145Rq2.b(null);
                    return;
                }
                c7145Rq2.c(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC9008ot.J0(str, str2, null);
        return c7145Rq;
    }

    final /* synthetic */ void c() {
        this.f70364a.v();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f70369f.a(str, str2);
    }

    final /* synthetic */ void e() {
        this.f70366c.zzb();
    }

    final /* synthetic */ void f(View view) {
        this.f70373j.a();
    }

    final /* synthetic */ void g(InterfaceC9008ot interfaceC9008ot, InterfaceC9008ot interfaceC9008ot2, Map map) {
        this.f70372i.i(interfaceC9008ot);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76176U9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f70381r.b(motionEvent);
        }
        this.f70373j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void i(final InterfaceC9008ot interfaceC9008ot, boolean z10, C7171Si c7171Si, Bundle bundle) {
        G9 g9C;
        AbstractC7593bf abstractC7593bf = C8659lf.f76420m2;
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            bundle.putLong(EnumC7889eN.RENDERING_CONFIGURE_WEBVIEW_START.a(), Lc.v.c().a());
        }
        interfaceC9008ot.zzN().r0(new InterfaceC4098a() { // from class: com.google.android.gms.internal.ads.LL
            @Override // Mc.InterfaceC4098a
            public final void v() {
                this.f68348a.c();
            }
        }, this.f70367d, this.f70368e, new InterfaceC8132gi() { // from class: com.google.android.gms.internal.ads.ML
            @Override // com.google.android.gms.internal.ads.InterfaceC8132gi
            public final void a(String str, String str2) {
                this.f68629a.d(str, str2);
            }
        }, new Oc.d() { // from class: com.google.android.gms.internal.ads.NL
            @Override // Oc.d
            public final void zzg() {
                this.f68870a.e();
            }
        }, z10, c7171Si, this.f70373j, new SL(this), this.f70374k, this.f70377n, this.f70378o, this.f70379p, null, this.f70365b, null, null, null, this.f70380q);
        interfaceC9008ot.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.OL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f69066a.h(view, motionEvent);
                return false;
            }
        });
        interfaceC9008ot.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.PL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69312a.f(view);
            }
        });
        if (((Boolean) Mc.A.c().a(C8659lf.f76029K2)).booleanValue() && (g9C = this.f70375l.c()) != null) {
            g9C.a(interfaceC9008ot.zzF());
        }
        this.f70371h.H0(interfaceC9008ot, this.f70370g);
        this.f70371h.H0(new InterfaceC9827wb() { // from class: com.google.android.gms.internal.ads.QL
            @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
            public final void D0(C9720vb c9720vb) {
                InterfaceC8156gu interfaceC8156guZzN = interfaceC9008ot.zzN();
                Rect rect = c9720vb.f79084d;
                interfaceC8156guZzN.c0(rect.left, rect.top, false);
            }
        }, this.f70370g);
        this.f70371h.R0(interfaceC9008ot.zzF());
        interfaceC9008ot.h0("/trackActiveViewUnit", new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.RL
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                this.f69862a.g(interfaceC9008ot, (InterfaceC9008ot) obj, map);
            }
        });
        this.f70372i.p(interfaceC9008ot);
        if (((Boolean) Mc.A.c().a(abstractC7593bf)).booleanValue()) {
            bundle.putLong(EnumC7889eN.RENDERING_CONFIGURE_WEBVIEW_END.a(), Lc.v.c().a());
        }
    }

    public TL(XB xb2, IC ic2, VC vc2, C8195hD c8195hD, BE be2, Executor executor, C7561bG c7561bG, C6745Fx c6745Fx, Lc.b bVar, InterfaceC6805Hp interfaceC6805Hp, M9 m92, C9371sE c9371sE, C9710vS c9710vS, R90 r90, C9812wN c9812wN, C7987fG c7987fG, C8269hx c8269hx, ZL zl2) {
        this.f70364a = xb2;
        this.f70366c = ic2;
        this.f70367d = vc2;
        this.f70368e = c8195hD;
        this.f70369f = be2;
        this.f70370g = executor;
        this.f70371h = c7561bG;
        this.f70372i = c6745Fx;
        this.f70373j = bVar;
        this.f70374k = interfaceC6805Hp;
        this.f70375l = m92;
        this.f70376m = c9371sE;
        this.f70377n = c9710vS;
        this.f70378o = r90;
        this.f70379p = c9812wN;
        this.f70365b = c7987fG;
        this.f70380q = c8269hx;
        this.f70381r = zl2;
    }
}
