package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.gms.internal.ads.Ut, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7374Ut {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7407Vt f71546a;

    /* renamed from: b, reason: collision with root package name */
    private final C7341Tt f71547b;

    public C7374Ut(InterfaceC7407Vt interfaceC7407Vt, C7341Tt c7341Tt) {
        this.f71547b = c7341Tt;
        this.f71546a = interfaceC7407Vt;
    }

    @JavascriptInterface
    public String getViewSignals() {
        M9 m9H = ((InterfaceC7748bu) this.f71546a).h();
        if (m9H == null) {
            Rc.p0.k("Signal utils is empty, ignoring.");
            return "";
        }
        G9 g9C = m9H.c();
        if (g9C == null) {
            Rc.p0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f71546a.getContext() == null) {
            Rc.p0.k("Context is null, ignoring.");
            return "";
        }
        InterfaceC7407Vt interfaceC7407Vt = this.f71546a;
        return g9C.zzh(interfaceC7407Vt.getContext(), ((InterfaceC7960du) interfaceC7407Vt).zzF(), this.f71546a.zzi());
    }

    final /* synthetic */ void a(String str) {
        Uri uri = Uri.parse(str);
        C10309zt c10309ztT0 = ((zzcfw) this.f71547b.f71307a).T0();
        if (c10309ztT0 == null) {
            Sc.p.d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            c10309ztT0.O0(uri);
        }
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            Rc.p0.k("Click string is empty, not proceeding.");
            return "";
        }
        M9 m9H = ((InterfaceC7748bu) this.f71546a).h();
        if (m9H == null) {
            Rc.p0.k("Signal utils is empty, ignoring.");
            return "";
        }
        G9 g9C = m9H.c();
        if (g9C == null) {
            Rc.p0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (this.f71546a.getContext() == null) {
            Rc.p0.k("Context is null, ignoring.");
            return "";
        }
        InterfaceC7407Vt interfaceC7407Vt = this.f71546a;
        return g9C.zze(interfaceC7407Vt.getContext(), str, ((InterfaceC7960du) interfaceC7407Vt).zzF(), this.f71546a.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            Sc.p.g("URL is empty, ignoring message");
        } else {
            Rc.D0.f32295l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.St
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71014a.a(str);
                }
            });
        }
    }
}
