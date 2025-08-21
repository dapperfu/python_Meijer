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
    private static final Logger f83421b = Logger.getLogger(Ee.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final List f83422c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f83423d;

    /* renamed from: e, reason: collision with root package name */
    public static final Ee f83424e;

    /* renamed from: f, reason: collision with root package name */
    public static final Ee f83425f;

    /* renamed from: g, reason: collision with root package name */
    public static final Ee f83426g;

    /* renamed from: h, reason: collision with root package name */
    public static final Ee f83427h;

    /* renamed from: i, reason: collision with root package name */
    public static final Ee f83428i;

    /* renamed from: j, reason: collision with root package name */
    public static final Ee f83429j;

    /* renamed from: k, reason: collision with root package name */
    public static final Ee f83430k;

    /* renamed from: a, reason: collision with root package name */
    private final Ne f83431a;

    public Ee(Ne ne2) {
        this.f83431a = ne2;
    }

    static {
        if (X8.b()) {
            f83422c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f83423d = false;
        } else if (Xe.a()) {
            f83422c = b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f83423d = true;
        } else {
            f83422c = new ArrayList();
            f83423d = true;
        }
        f83424e = new Ee(new Ge());
        f83425f = new Ee(new Ke());
        f83426g = new Ee(new Me());
        f83427h = new Ee(new Le());
        f83428i = new Ee(new He());
        f83429j = new Ee(new Je());
        f83430k = new Ee(new Ie());
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f83421b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) throws GeneralSecurityException {
        Iterator it = f83422c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f83431a.a(str, (Provider) it.next());
            } catch (Exception e10) {
                if (exc == null) {
                    exc = e10;
                }
            }
        }
        if (f83423d) {
            return this.f83431a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
