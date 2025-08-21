package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ot, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC9133ot extends InterfaceC4376a, InterfaceC8326hG, InterfaceC8065et, InterfaceC8261gk, InterfaceC7273Rt, InterfaceC7407Vt, InterfaceC9542sk, InterfaceC9952wb, InterfaceC7506Yt, Nc.n, InterfaceC7748bu, InterfaceC7854cu, InterfaceC6932Hr, InterfaceC7960du {
    Context A();

    void A0(int i10);

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    void D(String str, AbstractC9772us abstractC9772us);

    void D0(InterfaceC8671kc interfaceC8671kc);

    C10123y60 E();

    boolean F();

    void G();

    void H();

    void I();

    void I0(String str, String str2, String str3);

    void K(int i10);

    void K0(boolean z10);

    boolean M();

    void O(boolean z10);

    void P0(com.google.android.gms.ads.internal.overlay.h hVar);

    void Q(boolean z10);

    void Q0(boolean z10);

    void R();

    void S(Z50 z50, C7773c60 c7773c60);

    void T(InterfaceC6987Jg interfaceC6987Jg);

    boolean U();

    void W(com.google.android.gms.ads.internal.overlay.h hVar);

    void X(String str, InterfaceC7194Pi interfaceC7194Pi);

    void Y(boolean z10);

    String b();

    @Override // com.google.android.gms.internal.ads.InterfaceC7641au
    C8493iu c();

    void c0(InterfaceC7055Lg interfaceC7055Lg);

    boolean canGoBack();

    C7914dT d();

    void destroy();

    @Override // com.google.android.gms.internal.ads.InterfaceC8065et
    Z50 e();

    void e0(C7701bT c7701bT);

    @Override // com.google.android.gms.internal.ads.InterfaceC7273Rt
    C7773c60 f();

    WebViewClient g();

    @Override // com.google.android.gms.internal.ads.InterfaceC7407Vt, com.google.android.gms.internal.ads.InterfaceC6932Hr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    @Override // com.google.android.gms.internal.ads.InterfaceC7748bu
    M9 h();

    void h0(String str, InterfaceC7194Pi interfaceC7194Pi);

    boolean i0(boolean z10, int i10);

    boolean isAttachedToWindow();

    InterfaceC8671kc k();

    com.google.android.gms.ads.internal.overlay.h l();

    boolean l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    com.google.android.gms.ads.internal.overlay.h m();

    void m0(boolean z10);

    void measure(int i10, int i11);

    InterfaceC7055Lg n();

    void n0(C8493iu c8493iu);

    void o();

    void o0(String str, com.google.android.gms.common.util.o oVar);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    void r(BinderC7239Qt binderC7239Qt);

    void r0(C7914dT c7914dT);

    boolean s0();

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    C7701bT t();

    com.google.common.util.concurrent.q u();

    void u0(boolean z10);

    void v0(Context context);

    void w();

    boolean x();

    List y();

    void z();

    @Override // com.google.android.gms.internal.ads.InterfaceC7960du
    View zzF();

    WebView zzG();

    InterfaceC8281gu zzN();

    void zzam();

    @Override // com.google.android.gms.internal.ads.InterfaceC7407Vt, com.google.android.gms.internal.ads.InterfaceC6932Hr
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    Nc.a zzj();

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    C10174yf zzm();

    @Override // com.google.android.gms.internal.ads.InterfaceC7854cu, com.google.android.gms.internal.ads.InterfaceC6932Hr
    Sc.a zzn();

    @Override // com.google.android.gms.internal.ads.InterfaceC6932Hr
    BinderC7239Qt zzq();
}
