package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class Ee {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f82581b = Logger.getLogger(Ee.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final List f82582c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f82583d;

    /* renamed from: e, reason: collision with root package name */
    public static final Ee f82584e;

    /* renamed from: f, reason: collision with root package name */
    public static final Ee f82585f;

    /* renamed from: g, reason: collision with root package name */
    public static final Ee f82586g;

    /* renamed from: h, reason: collision with root package name */
    public static final Ee f82587h;

    /* renamed from: i, reason: collision with root package name */
    public static final Ee f82588i;

    /* renamed from: j, reason: collision with root package name */
    public static final Ee f82589j;

    /* renamed from: k, reason: collision with root package name */
    public static final Ee f82590k;

    /* renamed from: a, reason: collision with root package name */
    private final Ne f82591a;

    public Ee(Ne ne2) {
        this.f82591a = ne2;
    }

    static {
        if (X8.b()) {
            f82582c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f82583d = false;
        } else if (Xe.a()) {
            f82582c = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f82583d = true;
        } else {
            f82582c = new ArrayList();
            f82583d = true;
        }
        f82584e = new Ee(new Ge());
        f82585f = new Ee(new Ke());
        f82586g = new Ee(new Me());
        f82587h = new Ee(new Le());
        f82588i = new Ee(new He());
        f82589j = new Ee(new Je());
        f82590k = new Ee(new Ie());
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f82581b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = f82582c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f82591a.a(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (f82583d) {
            return this.f82591a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
