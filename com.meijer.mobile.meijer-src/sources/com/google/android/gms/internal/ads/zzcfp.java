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
public final class zzcfp extends FrameLayout implements InterfaceC9133ot {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9133ot f81482a;

    /* renamed from: b, reason: collision with root package name */
    private final C9984wr f81483b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f81484c;

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void k0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void p0(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7960du
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final WebView zzG() {
        return (WebView) this.f81482a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void zzam() {
        setBackgroundColor(0);
        this.f81482a.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final C9984wr zzo() {
        return this.f81483b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final Context A() {
        return this.f81482a.A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void A0(int i10) {
        this.f81482a.A0(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final AbstractC9772us C(String str) {
        return this.f81482a.C(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        this.f81482a.C0(c9845vb);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void D(String str, AbstractC9772us abstractC9772us) {
        this.f81482a.D(str, abstractC9772us);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void D0(InterfaceC8671kc interfaceC8671kc) {
        this.f81482a.D0(interfaceC8671kc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final C10123y60 E() {
        return this.f81482a.E();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean F() {
        return this.f81482a.F();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void F0() {
        this.f81482a.F0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void G() {
        this.f81482a.G();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void H() {
        this.f81482a.H();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void I() {
        this.f81482a.I();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void I0(String str, String str2, String str3) {
        this.f81482a.I0(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void J(int i10) {
        this.f81483b.g(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void J0(String str, String str2, int i10) {
        this.f81482a.J0(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void K(int i10) {
        this.f81482a.K(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void K0(boolean z10) {
        this.f81482a.K0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
    public final void L(String str, Map map) {
        this.f81482a.L(str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean M() {
        return this.f81482a.M();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void O(boolean z10) {
        this.f81482a.O(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void P0(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f81482a.P0(hVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void Q(boolean z10) {
        this.f81482a.Q(true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void Q0(boolean z10) {
        this.f81482a.Q0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void R() {
        this.f81482a.R();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void S(Z50 z50, C7773c60 c7773c60) {
        this.f81482a.S(z50, c7773c60);
    }

    final /* synthetic */ void S0(boolean z10) {
        InterfaceC9133ot interfaceC9133ot = this.f81482a;
        HandlerC6982Jd0 handlerC6982Jd0 = Rc.D0.f32295l;
        Objects.requireNonNull(interfaceC9133ot);
        handlerC6982Jd0.post(new RunnableC6832Et(interfaceC9133ot));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void T(InterfaceC6987Jg interfaceC6987Jg) {
        this.f81482a.T(interfaceC6987Jg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean U() {
        return this.f81482a.U();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void W(com.google.android.gms.ads.internal.overlay.h hVar) {
        this.f81482a.W(hVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void X(String str, InterfaceC7194Pi interfaceC7194Pi) {
        this.f81482a.X(str, interfaceC7194Pi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void Y(boolean z10) {
        this.f81482a.Y(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void Z() {
        InterfaceC9133ot interfaceC9133ot = this.f81482a;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.Z();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void a(String str, String str2) {
        this.f81482a.a("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final String b() {
        return this.f81482a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7641au
    public final C8493iu c() {
        return this.f81482a.c();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void c0(InterfaceC7055Lg interfaceC7055Lg) {
        this.f81482a.c0(interfaceC7055Lg);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean canGoBack() {
        return this.f81482a.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final C7914dT d() {
        return this.f81482a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void d0(boolean z10) {
        this.f81482a.d0(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC8065et
    public final Z50 e() {
        return this.f81482a.e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void e0(C7701bT c7701bT) {
        this.f81482a.e0(c7701bT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7273Rt
    public final C7773c60 f() {
        return this.f81482a.f();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final WebViewClient g() {
        return this.f81482a.g();
    }

    @Override // Nc.n
    public final void g0() {
        this.f81482a.g0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void goBack() {
        this.f81482a.goBack();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7748bu
    public final M9 h() {
        return this.f81482a.h();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void h0(String str, InterfaceC7194Pi interfaceC7194Pi) {
        this.f81482a.h0(str, interfaceC7194Pi);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean i0(boolean z10, int i10) {
        if (!this.f81484c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77035W0)).booleanValue()) {
            return false;
        }
        if (this.f81482a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f81482a.getParent()).removeView((View) this.f81482a);
        }
        this.f81482a.i0(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8261gk
    public final void j(String str, JSONObject jSONObject) {
        this.f81482a.j(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final InterfaceC8671kc k() {
        return this.f81482a.k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final com.google.android.gms.ads.internal.overlay.h l() {
        return this.f81482a.l();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean l0() {
        return this.f81484c.get();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void loadData(String str, String str2, String str3) {
        this.f81482a.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f81482a.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void loadUrl(String str) {
        this.f81482a.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final com.google.android.gms.ads.internal.overlay.h m() {
        return this.f81482a.m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void m0(boolean z10) {
        this.f81482a.m0(z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final InterfaceC7055Lg n() {
        return this.f81482a.n();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void n0(C8493iu c8493iu) {
        this.f81482a.n0(c8493iu);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void o() {
        this.f81483b.e();
        this.f81482a.o();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void o0(String str, com.google.android.gms.common.util.o oVar) {
        this.f81482a.o0(str, oVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void onPause() {
        this.f81483b.f();
        this.f81482a.onPause();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void onResume() {
        this.f81482a.onResume();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void p(int i10) {
        this.f81482a.p(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void q(boolean z10, int i10, boolean z11) {
        this.f81482a.q(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void q0(boolean z10, long j10) {
        this.f81482a.q0(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void r(BinderC7239Qt binderC7239Qt) {
        this.f81482a.r(binderC7239Qt);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void r0(C7914dT c7914dT) {
        this.f81482a.r0(c7914dT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean s0() {
        return this.f81482a.s0();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f81482a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f81482a.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f81482a.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f81482a.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final C7701bT t() {
        return this.f81482a.t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void t0(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.f81482a.t0(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final com.google.common.util.concurrent.q u() {
        return this.f81482a.u();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void u0(boolean z10) {
        this.f81482a.u0(z10);
    }

    @Override // Oc.InterfaceC4376a
    public final void v() {
        InterfaceC9133ot interfaceC9133ot = this.f81482a;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.v();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void v0(Context context) {
        this.f81482a.v0(context);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void w() {
        C7914dT c7914dTD;
        C7701bT c7701bTT;
        TextView textView = new TextView(getContext());
        Nc.v.t();
        textView.setText(Rc.D0.e0());
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
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && (c7701bTT = t()) != null) {
            c7701bTT.a(textView);
        } else if (((Boolean) Oc.A.c().a(C8784lf.f77151e5)).booleanValue() && (c7914dTD = d()) != null && c7914dTD.b()) {
            Nc.v.b().i(c7914dTD.a(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void w0(Qc.l lVar, boolean z10, boolean z11, String str) {
        this.f81482a.w0(lVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final boolean x() {
        return this.f81482a.x();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final List y() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f81482a) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7506Yt
    public final void y0(boolean z10, int i10, String str, String str2, boolean z11) {
        this.f81482a.y0(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void z() {
        this.f81482a.z();
    }

    @Override // Nc.n
    public final void z0() {
        this.f81482a.z0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final InterfaceC8281gu zzN() {
        return ((zzcfw) this.f81482a).T0();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void zza(String str) {
        ((zzcfw) this.f81482a).Y0(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final int zzf() {
        return this.f81482a.zzf();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final int zzg() {
        return ((Boolean) Oc.A.c().a(C8784lf.f77038W3)).booleanValue() ? this.f81482a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final int zzh() {
        return ((Boolean) Oc.A.c().a(C8784lf.f77038W3)).booleanValue() ? this.f81482a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7407Vt, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final Activity zzi() {
        return this.f81482a.zzi();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final Nc.a zzj() {
        return this.f81482a.zzj();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final C10067xf zzk() {
        return this.f81482a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final C10174yf zzm() {
        return this.f81482a.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC7854cu, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final Sc.a zzn() {
        return this.f81482a.zzn();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot, com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final BinderC7239Qt zzq() {
        return this.f81482a.zzq();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final String zzr() {
        return this.f81482a.zzr();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final String zzs() {
        return this.f81482a.zzs();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8326hG
    public final void zzu() {
        InterfaceC9133ot interfaceC9133ot = this.f81482a;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    public final void zzw() {
        this.f81482a.zzw();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zzcfp(InterfaceC9133ot interfaceC9133ot) {
        super(interfaceC9133ot.getContext());
        this.f81484c = new AtomicBoolean();
        this.f81482a = interfaceC9133ot;
        this.f81483b = new C9984wr(interfaceC9133ot.A(), this, this);
        addView((View) interfaceC9133ot);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9542sk
    public final void R0(String str, JSONObject jSONObject) {
        ((zzcfw) this.f81482a).a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9133ot
    public final void destroy() {
        final C7701bT c7701bTT;
        final C7914dT c7914dTD = d();
        if (c7914dTD != null) {
            HandlerC6982Jd0 handlerC6982Jd0 = Rc.D0.f32295l;
            handlerC6982Jd0.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Ft
                @Override // java.lang.Runnable
                public final void run() {
                    Nc.v.b().e(c7914dTD.a());
                }
            });
            InterfaceC9133ot interfaceC9133ot = this.f81482a;
            Objects.requireNonNull(interfaceC9133ot);
            handlerC6982Jd0.postDelayed(new RunnableC6832Et(interfaceC9133ot), ((Integer) Oc.A.c().a(C8784lf.f77137d5)).intValue());
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && (c7701bTT = t()) != null) {
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Gt
                @Override // java.lang.Runnable
                public final void run() {
                    c7701bTT.f(new C6934Ht(this.f68138a));
                }
            });
        } else {
            this.f81482a.destroy();
        }
    }
}
