package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Sw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7185Sw implements InterfaceC9869ww {

    /* renamed from: a, reason: collision with root package name */
    private final CookieManager f70199a;

    @Override // com.google.android.gms.internal.ads.InterfaceC9869ww
    public final void a(Map map) {
        String cookie;
        if (this.f70199a == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f70199a.setCookie((String) Mc.A.c().a(C8659lf.f76223Y0), str);
            return;
        }
        String str2 = (String) Mc.A.c().a(C8659lf.f76223Y0);
        CookieManager cookieManager = this.f70199a;
        if (cookieManager == null || (cookie = cookieManager.getCookie(str2)) == null) {
            return;
        }
        List listF = C7200Tf0.b(AbstractC8981of0.b(';')).f(cookie);
        for (int i10 = 0; i10 < listF.size(); i10++) {
            CookieManager cookieManager2 = this.f70199a;
            Iterator it = C7200Tf0.b(AbstractC8981of0.b('=')).d((String) listF.get(i10)).iterator();
            it.getClass();
            if (!it.hasNext()) {
                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
            }
            cookieManager2.setCookie(str2, String.valueOf((String) it.next()).concat(String.valueOf((String) Mc.A.c().a(C8659lf.f76027K0))));
        }
    }

    public C7185Sw(Context context) {
        this.f70199a = Lc.v.u().a(context);
    }
}
