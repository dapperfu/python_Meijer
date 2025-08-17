package l8;

import android.webkit.CookieManager;
import g8.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import x8.f;

/* renamed from: l8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C15388c {

    /* renamed from: b, reason: collision with root package name */
    private static final String f148711b = x.f133195a + "CookieWriter";

    /* renamed from: a, reason: collision with root package name */
    private CookieManager f148712a;

    private void a(boolean z10) {
        if (z10) {
            try {
                CookieManager.setAcceptFileSchemeCookies(true);
            } catch (Exception e10) {
                if (x.f133196b) {
                    f.x(f148711b, "unable to access CookieManager", e10);
                    return;
                }
                return;
            }
        }
        if (!CookieManager.getInstance().acceptCookie()) {
            CookieManager.getInstance().setAcceptCookie(true);
        }
        this.f148712a = CookieManager.getInstance();
    }

    void b(Set<String> set, Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        for (String str : set) {
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next() + "=; Max-Age=-1");
            }
        }
        this.f148712a.flush();
        c(set, arrayList, false);
    }

    void c(Set<String> set, Collection<String> collection, boolean z10) {
        if (this.f148712a == null) {
            return;
        }
        if (x.f133196b) {
            String str = f148711b;
            f.u(str, "domains: " + set.toString());
            f.u(str, "cookies: " + collection.toString());
        }
        for (String str2 : set) {
            for (String str3 : collection) {
                CookieManager cookieManager = this.f148712a;
                if (z10) {
                    str3 = str3 + "; secure";
                }
                cookieManager.setCookie(str2, str3);
            }
        }
        this.f148712a.flush();
    }

    C15388c(boolean z10) {
        a(z10);
    }
}
