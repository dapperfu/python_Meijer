package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class TL {

    /* renamed from: a, reason: collision with root package name */
    private final XB f71204a;

    /* renamed from: b, reason: collision with root package name */
    private final C8112fG f71205b;

    /* renamed from: c, reason: collision with root package name */
    private final IC f71206c;

    /* renamed from: d, reason: collision with root package name */
    private final VC f71207d;

    /* renamed from: e, reason: collision with root package name */
    private final C8320hD f71208e;

    /* renamed from: f, reason: collision with root package name */
    private final BE f71209f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f71210g;

    /* renamed from: h, reason: collision with root package name */
    private final C7686bG f71211h;

    /* renamed from: i, reason: collision with root package name */
    private final C6870Fx f71212i;

    /* renamed from: j, reason: collision with root package name */
    private final Nc.b f71213j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC6930Hp f71214k;

    /* renamed from: l, reason: collision with root package name */
    private final M9 f71215l;

    /* renamed from: m, reason: collision with root package name */
    private final C9496sE f71216m;

    /* renamed from: n, reason: collision with root package name */
    private final C9835vS f71217n;

    /* renamed from: o, reason: collision with root package name */
    private final R90 f71218o;

    /* renamed from: p, reason: collision with root package name */
    private final C9937wN f71219p;

    /* renamed from: q, reason: collision with root package name */
    private final C8394hx f71220q;

    /* renamed from: r, reason: collision with root package name */
    private final ZL f71221r;

    public static final com.google.common.util.concurrent.q j(InterfaceC9133ot interfaceC9133ot, String str, String str2, final Bundle bundle) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77260m2)).booleanValue()) {
            bundle.putLong(EnumC8014eN.RENDERING_WEBVIEW_LOAD_HTML_START.a(), Nc.v.c().a());
        }
        final C7270Rq c7270Rq = new C7270Rq();
        interfaceC9133ot.zzN().P(new InterfaceC8067eu() { // from class: com.google.android.gms.internal.ads.KL
            @Override // com.google.android.gms.internal.ads.InterfaceC8067eu
            public final void a(boolean z10, int i10, String str3, String str4) {
                C7270Rq c7270Rq2 = c7270Rq;
                if (z10) {
                    if (((Boolean) Oc.A.c().a(C8784lf.f77260m2)).booleanValue()) {
                        bundle.putLong(EnumC8014eN.RENDERING_WEBVIEW_LOAD_HTML_END.a(), Nc.v.c().a());
                    }
                    c7270Rq2.b(null);
                    return;
                }
                c7270Rq2.c(new Exception("Ad Web View failed to load. Error code: " + i10 + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        interfaceC9133ot.I0(str, str2, null);
        return c7270Rq;
    }

    final /* synthetic */ void c() {
        this.f71204a.v();
    }

    final /* synthetic */ void d(String str, String str2) {
        this.f71209f.a(str, str2);
    }

    final /* synthetic */ void e() {
        this.f71206c.zzb();
    }

    final /* synthetic */ void f(View view) {
        this.f71213j.a();
    }

    final /* synthetic */ void g(InterfaceC9133ot interfaceC9133ot, InterfaceC9133ot interfaceC9133ot2, Map map) {
        this.f71212i.i(interfaceC9133ot);
    }

    final /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77016U9)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.f71221r.b(motionEvent);
        }
        this.f71213j.a();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void i(final InterfaceC9133ot interfaceC9133ot, boolean z10, C7296Si c7296Si, Bundle bundle) {
        G9 g9C;
        AbstractC7718bf abstractC7718bf = C8784lf.f77260m2;
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            bundle.putLong(EnumC8014eN.RENDERING_CONFIGURE_WEBVIEW_START.a(), Nc.v.c().a());
        }
        interfaceC9133ot.zzN().N0(new InterfaceC4376a() { // from class: com.google.android.gms.internal.ads.LL
            @Override // Oc.InterfaceC4376a
            public final void v() {
                this.f69188a.c();
            }
        }, this.f71207d, this.f71208e, new InterfaceC8257gi() { // from class: com.google.android.gms.internal.ads.ML
            @Override // com.google.android.gms.internal.ads.InterfaceC8257gi
            public final void a(String str, String str2) {
                this.f69469a.d(str, str2);
            }
        }, new Qc.d() { // from class: com.google.android.gms.internal.ads.NL
            @Override // Qc.d
            public final void zzg() {
                this.f69710a.e();
            }
        }, z10, c7296Si, this.f71213j, new SL(this), this.f71214k, this.f71217n, this.f71218o, this.f71219p, null, this.f71205b, null, null, null, this.f71220q);
        interfaceC9133ot.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.OL
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.f69906a.h(view, motionEvent);
                return false;
            }
        });
        interfaceC9133ot.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.PL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70152a.f(view);
            }
        });
        if (((Boolean) Oc.A.c().a(C8784lf.f76869K2)).booleanValue() && (g9C = this.f71215l.c()) != null) {
            g9C.a(interfaceC9133ot.zzF());
        }
        this.f71211h.G0(interfaceC9133ot, this.f71210g);
        this.f71211h.G0(new InterfaceC9952wb() { // from class: com.google.android.gms.internal.ads.QL
            @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
            public final void C0(C9845vb c9845vb) {
                InterfaceC8281gu interfaceC8281guZzN = interfaceC9133ot.zzN();
                Rect rect = c9845vb.f79924d;
                interfaceC8281guZzN.b0(rect.left, rect.top, false);
            }
        }, this.f71210g);
        this.f71211h.R0(interfaceC9133ot.zzF());
        interfaceC9133ot.h0("/trackActiveViewUnit", new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.RL
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                this.f70702a.g(interfaceC9133ot, (InterfaceC9133ot) obj, map);
            }
        });
        this.f71212i.p(interfaceC9133ot);
        if (((Boolean) Oc.A.c().a(abstractC7718bf)).booleanValue()) {
            bundle.putLong(EnumC8014eN.RENDERING_CONFIGURE_WEBVIEW_END.a(), Nc.v.c().a());
        }
    }

    public TL(XB xb2, IC ic2, VC vc2, C8320hD c8320hD, BE be2, Executor executor, C7686bG c7686bG, C6870Fx c6870Fx, Nc.b bVar, InterfaceC6930Hp interfaceC6930Hp, M9 m92, C9496sE c9496sE, C9835vS c9835vS, R90 r90, C9937wN c9937wN, C8112fG c8112fG, C8394hx c8394hx, ZL zl2) {
        this.f71204a = xb2;
        this.f71206c = ic2;
        this.f71207d = vc2;
        this.f71208e = c8320hD;
        this.f71209f = be2;
        this.f71210g = executor;
        this.f71211h = c7686bG;
        this.f71212i = c6870Fx;
        this.f71213j = bVar;
        this.f71214k = interfaceC6930Hp;
        this.f71215l = m92;
        this.f71216m = c9496sE;
        this.f71217n = c9835vS;
        this.f71218o = r90;
        this.f71219p = c9937wN;
        this.f71205b = c8112fG;
        this.f71220q = c8394hx;
        this.f71221r = zl2;
    }
}
