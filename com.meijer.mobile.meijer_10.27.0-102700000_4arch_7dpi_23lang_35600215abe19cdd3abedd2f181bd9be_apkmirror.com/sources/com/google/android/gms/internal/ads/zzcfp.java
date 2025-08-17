package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class zzcfp extends FrameLayout implements InterfaceC9008ot {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9008ot f80642a;

    /* renamed from: b, reason: collision with root package name */
    private final C9859wr f80643b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f80644c;

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void k0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void p0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7835du
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final WebView zzG() {
        return (WebView) this.f80642a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void zzam() {
        setBackgroundColor(0);
        this.f80642a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final C9859wr zzo() {
        return this.f80643b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final Context A() {
        return this.f80642a.A();
    }

    @Override // Lc.n
    public final void A0() {
        this.f80642a.A0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void B0(int i10) {
        this.f80642a.B0(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final AbstractC9647us C(String str) {
        return this.f80642a.C(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void D(String str, AbstractC9647us abstractC9647us) {
        this.f80642a.D(str, abstractC9647us);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9827wb
    public final void D0(C9720vb c9720vb) {
        this.f80642a.D0(c9720vb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final C9998y60 E() {
        return this.f80642a.E();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void E0(InterfaceC8546kc interfaceC8546kc) {
        this.f80642a.E0(interfaceC8546kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean F() {
        return this.f80642a.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void G() {
        this.f80642a.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void G0() {
        this.f80642a.G0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void H() {
        this.f80642a.H();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void I() {
        this.f80642a.I();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void J(int i10) {
        this.f80643b.g(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void J0(String str, String str2, String str3) {
        this.f80642a.J0(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void K(int i10) {
        this.f80642a.K(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void K0(String str, String str2, int i10) {
        this.f80642a.K0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final void L(String str, Map map) {
        this.f80642a.L(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void L0(boolean z10) {
        this.f80642a.L0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean M() {
        return this.f80642a.M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void O(boolean z10) {
        this.f80642a.O(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void P0(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f80642a.P0(hVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void Q(boolean z10) {
        this.f80642a.Q(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void Q0(boolean z10) {
        this.f80642a.Q0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void R() {
        this.f80642a.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void S(Z50 z50, C7648c60 c7648c60) {
        this.f80642a.S(z50, c7648c60);
    }

    final /* synthetic */ void S0(boolean z10) {
        InterfaceC9008ot interfaceC9008ot = this.f80642a;
        HandlerC6857Jd0 handlerC6857Jd0 = Pc.D0.f25081l;
        Objects.requireNonNull(interfaceC9008ot);
        handlerC6857Jd0.post(new RunnableC6707Et(interfaceC9008ot));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void T(InterfaceC6862Jg interfaceC6862Jg) {
        this.f80642a.T(interfaceC6862Jg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean U() {
        return this.f80642a.U();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void W(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f80642a.W(hVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void X(String str, InterfaceC7069Pi interfaceC7069Pi) {
        this.f80642a.X(str, interfaceC7069Pi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void Y(boolean z10) {
        this.f80642a.Y(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void Z() {
        InterfaceC9008ot interfaceC9008ot = this.f80642a;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void a(String str, String str2) {
        this.f80642a.a("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final String b() {
        return this.f80642a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void b0(boolean z10) {
        this.f80642a.b0(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7516au
    public final C8368iu c() {
        return this.f80642a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean canGoBack() {
        return this.f80642a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final C7789dT d() {
        return this.f80642a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7940et
    public final Z50 e() {
        return this.f80642a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void e0(InterfaceC6930Lg interfaceC6930Lg) {
        this.f80642a.e0(interfaceC6930Lg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final WebViewClient f() {
        return this.f80642a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void f0(C7576bT c7576bT) {
        this.f80642a.f0(c7576bT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7623bu
    public final M9 g() {
        return this.f80642a.g();
    }

    @Override // Lc.n
    public final void g0() {
        this.f80642a.g0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void goBack() {
        this.f80642a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7148Rt
    public final C7648c60 h() {
        return this.f80642a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void h0(String str, InterfaceC7069Pi interfaceC7069Pi) {
        this.f80642a.h0(str, interfaceC7069Pi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean i0(boolean z10, int i10) {
        if (!this.f80644c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76195W0)).booleanValue()) {
            return false;
        }
        if (this.f80642a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f80642a.getParent()).removeView((View) this.f80642a);
        }
        this.f80642a.i0(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8136gk
    public final void j(String str, JSONObject jSONObject) {
        this.f80642a.j(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final InterfaceC8546kc k() {
        return this.f80642a.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final com.google.android.gms.ads.internal.overlay.h l() {
        return this.f80642a.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean l0() {
        return this.f80644c.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void loadData(String str, String str2, String str3) {
        this.f80642a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f80642a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void loadUrl(String str) {
        this.f80642a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final com.google.android.gms.ads.internal.overlay.h m() {
        return this.f80642a.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void m0(boolean z10) {
        this.f80642a.m0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final InterfaceC6930Lg n() {
        return this.f80642a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void n0(C8368iu c8368iu) {
        this.f80642a.n0(c8368iu);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void o() {
        this.f80643b.e();
        this.f80642a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void o0(String str, com.google.android.gms.common.util.o oVar) {
        this.f80642a.o0(str, oVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void onPause() {
        this.f80643b.f();
        this.f80642a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void onResume() {
        this.f80642a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void p(int i10) {
        this.f80642a.p(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void q(boolean z10, int i10, boolean z11) {
        this.f80642a.q(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void q0(boolean z10, long j10) {
        this.f80642a.q0(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void r(BinderC7114Qt binderC7114Qt) {
        this.f80642a.r(binderC7114Qt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void s0(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.f80642a.s0(z10, i10, str, z11, z12);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f80642a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f80642a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f80642a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f80642a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final C7576bT t() {
        return this.f80642a.t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void t0(C7789dT c7789dT) {
        this.f80642a.t0(c7789dT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final com.google.common.util.concurrent.q u() {
        return this.f80642a.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean u0() {
        return this.f80642a.u0();
    }

    @Override // Mc.InterfaceC4098a
    public final void v() {
        InterfaceC9008ot interfaceC9008ot = this.f80642a;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void v0(boolean z10) {
        this.f80642a.v0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void w() {
        C7789dT c7789dTD;
        C7576bT c7576bTT;
        TextView textView = new TextView(getContext());
        Lc.v.t();
        textView.setText(Pc.D0.e0());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && (c7576bTT = t()) != null) {
            c7576bTT.a(textView);
        } else if (((Boolean) Mc.A.c().a(C8659lf.f76311e5)).booleanValue() && (c7789dTD = d()) != null && c7789dTD.b()) {
            Lc.v.b().i(c7789dTD.a(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void w0(Context context) {
        this.f80642a.w0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final boolean x() {
        return this.f80642a.x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final List y() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f80642a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void y0(Oc.l lVar, boolean z10, boolean z11, String str) {
        this.f80642a.y0(lVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void z() {
        this.f80642a.z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7381Yt
    public final void z0(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f80642a.z0(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final InterfaceC8156gu zzN() {
        return ((zzcfw) this.f80642a).T0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void zza(String str) {
        ((zzcfw) this.f80642a).Y0(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final int zzf() {
        return this.f80642a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final int zzg() {
        return ((Boolean) Mc.A.c().a(C8659lf.f76198W3)).booleanValue() ? this.f80642a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final int zzh() {
        return ((Boolean) Mc.A.c().a(C8659lf.f76198W3)).booleanValue() ? this.f80642a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7282Vt, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final Activity zzi() {
        return this.f80642a.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final Lc.a zzj() {
        return this.f80642a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final C9942xf zzk() {
        return this.f80642a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final C10049yf zzm() {
        return this.f80642a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC7729cu, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final Qc.a zzn() {
        return this.f80642a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot, com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final BinderC7114Qt zzq() {
        return this.f80642a.zzq();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final String zzr() {
        return this.f80642a.zzr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final String zzs() {
        return this.f80642a.zzs();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8201hG
    public final void zzu() {
        InterfaceC9008ot interfaceC9008ot = this.f80642a;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    public final void zzw() {
        this.f80642a.zzw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzcfp(InterfaceC9008ot interfaceC9008ot) {
        super(interfaceC9008ot.getContext());
        this.f80644c = new AtomicBoolean();
        this.f80642a = interfaceC9008ot;
        this.f80643b = new C9859wr(interfaceC9008ot.A(), this, this);
        addView((View) interfaceC9008ot);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9417sk
    public final void R0(String str, JSONObject jSONObject) {
        ((zzcfw) this.f80642a).a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9008ot
    public final void destroy() {
        final C7576bT c7576bTT;
        final C7789dT c7789dTD = d();
        if (c7789dTD != null) {
            HandlerC6857Jd0 handlerC6857Jd0 = Pc.D0.f25081l;
            handlerC6857Jd0.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ft
                @Override // java.lang.Runnable
                public final void run() {
                    Lc.v.b().d(c7789dTD.a());
                }
            });
            InterfaceC9008ot interfaceC9008ot = this.f80642a;
            Objects.requireNonNull(interfaceC9008ot);
            handlerC6857Jd0.postDelayed(new RunnableC6707Et(interfaceC9008ot), ((Integer) Mc.A.c().a(C8659lf.f76297d5)).intValue());
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76325f5)).booleanValue() && (c7576bTT = t()) != null) {
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Gt
                @Override // java.lang.Runnable
                public final void run() {
                    c7576bTT.f(new C6809Ht(this.f67298a));
                }
            });
        } else {
            this.f80642a.destroy();
        }
    }
}
