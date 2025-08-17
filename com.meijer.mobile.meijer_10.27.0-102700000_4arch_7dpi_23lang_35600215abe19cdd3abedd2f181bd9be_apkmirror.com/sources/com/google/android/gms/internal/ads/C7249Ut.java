package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.Ut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7249Ut {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7282Vt f70706a;

    /* renamed from: b, reason: collision with root package name */
    private final C7216Tt f70707b;

    public C7249Ut(InterfaceC7282Vt interfaceC7282Vt, C7216Tt c7216Tt) {
        this.f70707b = c7216Tt;
        this.f70706a = interfaceC7282Vt;
    }

    @JavascriptInterface
    public String getViewSignals() {
        M9 m9G = ((InterfaceC7623bu) this.f70706a).g();
        if (m9G == null) {
            Pc.p0.k("Signal utils is empty, ignoring.");
            return "";
        }
        G9 g9C = m9G.c();
        if (g9C == null) {
            Pc.p0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f70706a.getContext() == null) {
            Pc.p0.k("Context is null, ignoring.");
            return "";
        }
        InterfaceC7282Vt interfaceC7282Vt = this.f70706a;
        return g9C.zzh(interfaceC7282Vt.getContext(), ((InterfaceC7835du) interfaceC7282Vt).zzF(), this.f70706a.zzi());
    }

    final /* synthetic */ void a(String str) {
        Uri uri = Uri.parse(str);
        C10184zt c10184ztT0 = ((zzcfw) this.f70707b.f70467a).T0();
        if (c10184ztT0 == null) {
            Qc.p.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            c10184ztT0.O0(uri);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            Pc.p0.k("Click string is empty, not proceeding.");
            return "";
        }
        M9 m9G = ((InterfaceC7623bu) this.f70706a).g();
        if (m9G == null) {
            Pc.p0.k("Signal utils is empty, ignoring.");
            return "";
        }
        G9 g9C = m9G.c();
        if (g9C == null) {
            Pc.p0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f70706a.getContext() == null) {
            Pc.p0.k("Context is null, ignoring.");
            return "";
        }
        InterfaceC7282Vt interfaceC7282Vt = this.f70706a;
        return g9C.zze(interfaceC7282Vt.getContext(), str, ((InterfaceC7835du) interfaceC7282Vt).zzF(), this.f70706a.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            Qc.p.g("URL is empty, ignoring message");
        } else {
            Pc.D0.f25081l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.St
                @Override // java.lang.Runnable
                public final void run() {
                    this.f70174a.a(str);
                }
            });
        }
    }
}
