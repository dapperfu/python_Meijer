package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Wt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7440Wt extends C10309zt {
    public C7440Wt(InterfaceC9133ot interfaceC9133ot, C7517Zc c7517Zc, boolean z10, GS gs2) {
        super(interfaceC9133ot, c7517Zc, z10, new C7840cn(interfaceC9133ot, interfaceC9133ot.A(), new C7288Se(interfaceC9133ot.getContext())), null, gs2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse Y0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof InterfaceC9133ot)) {
            Sc.p.g("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) webView;
        InterfaceC6930Hp interfaceC6930Hp = this.f81379y;
        if (interfaceC6930Hp != null) {
            interfaceC6930Hp.a(str, map, 1);
        }
        C8995nd0.a();
        AbstractC9743ud0 abstractC9743ud0 = AbstractC9743ud0.f79727a;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.y0(str, map);
        }
        if (interfaceC9133ot.zzN() != null) {
            interfaceC9133ot.zzN().g();
        }
        if (interfaceC9133ot.c().i()) {
            str2 = (String) Oc.A.c().a(C8784lf.f77090a0);
        } else if (interfaceC9133ot.U()) {
            str2 = (String) Oc.A.c().a(C8784lf.f77076Z);
        } else {
            str2 = (String) Oc.A.c().a(C8784lf.f77062Y);
        }
        Nc.v.t();
        return Rc.D0.d0(interfaceC9133ot.getContext(), interfaceC9133ot.zzn().f34479a, str2);
    }
}
