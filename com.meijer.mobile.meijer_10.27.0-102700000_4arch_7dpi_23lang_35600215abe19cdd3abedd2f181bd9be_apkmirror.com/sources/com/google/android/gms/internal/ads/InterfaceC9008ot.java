package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
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
public interface InterfaceC9008ot extends InterfaceC4098a, InterfaceC8201hG, InterfaceC7940et, InterfaceC8136gk, InterfaceC7148Rt, InterfaceC7282Vt, InterfaceC9417sk, InterfaceC9827wb, InterfaceC7381Yt, Lc.n, InterfaceC7623bu, InterfaceC7729cu, InterfaceC6807Hr, InterfaceC7835du {
    Context A();

    void B0(int i10);

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    void D(String str, AbstractC9647us abstractC9647us);

    C9998y60 E();

    void E0(InterfaceC8546kc interfaceC8546kc);

    boolean F();

    void G();

    void H();

    void I();

    void J0(String str, String str2, String str3);

    void K(int i10);

    void L0(boolean z10);

    boolean M();

    void O(boolean z10);

    void P0(com.google.android.gms.ads.internal.overlay.h hVar);

    void Q(boolean z10);

    void Q0(boolean z10);

    void R();

    void S(Z50 z50, C7648c60 c7648c60);

    void T(InterfaceC6862Jg interfaceC6862Jg);

    boolean U();

    void W(com.google.android.gms.ads.internal.overlay.h hVar);

    void X(String str, InterfaceC7069Pi interfaceC7069Pi);

    void Y(boolean z10);

    String b();

    @Override // com.google.android.gms.internal.ads.InterfaceC7516au
    C8368iu c();

    boolean canGoBack();

    C7789dT d();

    void destroy();

    @Override // com.google.android.gms.internal.ads.InterfaceC7940et
    Z50 e();

    void e0(InterfaceC6930Lg interfaceC6930Lg);

    WebViewClient f();

    void f0(C7576bT c7576bT);

    @Override // com.google.android.gms.internal.ads.InterfaceC7623bu
    M9 g();

    @Override // com.google.android.gms.internal.ads.InterfaceC7282Vt, com.google.android.gms.internal.ads.InterfaceC6807Hr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    @Override // com.google.android.gms.internal.ads.InterfaceC7148Rt
    C7648c60 h();

    void h0(String str, InterfaceC7069Pi interfaceC7069Pi);

    boolean i0(boolean z10, int i10);

    boolean isAttachedToWindow();

    InterfaceC8546kc k();

    com.google.android.gms.ads.internal.overlay.h l();

    boolean l0();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    com.google.android.gms.ads.internal.overlay.h m();

    void m0(boolean z10);

    void measure(int i10, int i11);

    InterfaceC6930Lg n();

    void n0(C8368iu c8368iu);

    void o();

    void o0(String str, com.google.android.gms.common.util.o oVar);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    void r(BinderC7114Qt binderC7114Qt);

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    C7576bT t();

    void t0(C7789dT c7789dT);

    com.google.common.util.concurrent.q u();

    boolean u0();

    void v0(boolean z10);

    void w();

    void w0(Context context);

    boolean x();

    List y();

    void z();

    @Override // com.google.android.gms.internal.ads.InterfaceC7835du
    View zzF();

    WebView zzG();

    InterfaceC8156gu zzN();

    void zzam();

    @Override // com.google.android.gms.internal.ads.InterfaceC7282Vt, com.google.android.gms.internal.ads.InterfaceC6807Hr
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    Lc.a zzj();

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    C10049yf zzm();

    @Override // com.google.android.gms.internal.ads.InterfaceC7729cu, com.google.android.gms.internal.ads.InterfaceC6807Hr
    Qc.a zzn();

    @Override // com.google.android.gms.internal.ads.InterfaceC6807Hr
    BinderC7114Qt zzq();
}
