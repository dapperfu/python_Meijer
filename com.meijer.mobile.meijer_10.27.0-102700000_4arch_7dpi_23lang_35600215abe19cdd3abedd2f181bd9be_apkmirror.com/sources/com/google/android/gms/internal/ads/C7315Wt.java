package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7315Wt extends C10184zt {
    public C7315Wt(InterfaceC9008ot interfaceC9008ot, C7392Zc c7392Zc, boolean z10, GS gs2) {
        super(interfaceC9008ot, c7392Zc, z10, new C7715cn(interfaceC9008ot, interfaceC9008ot.A(), new C7163Se(interfaceC9008ot.getContext())), null, gs2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse Y0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof InterfaceC9008ot)) {
            Qc.p.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) webView;
        InterfaceC6805Hp interfaceC6805Hp = this.f80539y;
        if (interfaceC6805Hp != null) {
            interfaceC6805Hp.a(str, map, 1);
        }
        C8870nd0.a();
        AbstractC9618ud0 abstractC9618ud0 = AbstractC9618ud0.f78887a;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.z0(str, map);
        }
        if (interfaceC9008ot.zzN() != null) {
            interfaceC9008ot.zzN().f();
        }
        if (interfaceC9008ot.c().i()) {
            str2 = (String) Mc.A.c().a(C8659lf.f76250a0);
        } else if (interfaceC9008ot.U()) {
            str2 = (String) Mc.A.c().a(C8659lf.f76236Z);
        } else {
            str2 = (String) Mc.A.c().a(C8659lf.f76222Y);
        }
        Lc.v.t();
        return Pc.D0.d0(interfaceC9008ot.getContext(), interfaceC9008ot.zzn().f29929a, str2);
    }
}
