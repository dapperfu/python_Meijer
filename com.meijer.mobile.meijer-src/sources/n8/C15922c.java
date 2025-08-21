package n8;

import android.webkit.CookieManager;
import i8.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import z8.f;

/* renamed from: n8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C15922c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f152108b = x.f137411a + "CookieWriter";

    /* renamed from: a, reason: collision with root package name */
    private CookieManager f152109a;

    private void a(boolean z10) {
        if (z10) {
            try {
                CookieManager.setAcceptFileSchemeCookies(true);
            } catch (Exception e10) {
                if (x.f137412b) {
                    f.x(f152108b, "unable to access CookieManager", e10);
                    return;
                }
                return;
            }
        }
        if (!CookieManager.getInstance().acceptCookie()) {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.f152109a = CookieManager.getInstance();
    }

    void b(Set<String> set, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next() + "=; Max-Age=-1");
            }
        }
        this.f152109a.flush();
        c(set, arrayList, false);
    }

    void c(Set<String> set, Collection<String> collection, boolean z10) {
        if (this.f152109a == null) {
            return;
        }
        if (x.f137412b) {
            String str = f152108b;
            f.u(str, "domains: " + set.toString());
            f.u(str, "cookies: " + collection.toString());
        }
        for (String str2 : set) {
            for (String str3 : collection) {
                CookieManager cookieManager = this.f152109a;
                if (z10) {
                    str3 = str3 + "; secure";
                }
                cookieManager.setCookie(str2, str3);
            }
        }
        this.f152109a.flush();
    }

    C15922c(boolean z10) {
        a(z10);
    }
}
