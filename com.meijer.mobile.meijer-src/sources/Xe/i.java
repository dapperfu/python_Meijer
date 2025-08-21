package Xe;

import Xe.j;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* loaded from: classes8.dex */
public final class i<T_WRAPPER extends j<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b, reason: collision with root package name */
    public static final i<j.a, Cipher> f42218b = new i<>(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i<j.e, Mac> f42219c = new i<>(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i<j.g, Signature> f42220d = new i<>(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i<j.f, MessageDigest> f42221e = new i<>(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f42222f = new i<>(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f42223g = new i<>(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i<j.c, KeyFactory> f42224h = new i<>(new j.c());

    /* renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f42225a;

    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f42226a;

        private b(j<JcePrimitiveT> jVar) {
            this.f42226a = jVar;
        }

        @Override // Xe.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f42226a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f42226a.a(str, null);
        }
    }

    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f42227a;

        private c(j<JcePrimitiveT> jVar) {
            this.f42227a = jVar;
        }

        @Override // Xe.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            return this.f42227a.a(str, null);
        }
    }

    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f42228a;

        private d(j<JcePrimitiveT> jVar) {
            this.f42228a = jVar;
        }

        @Override // Xe.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f42228a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    private interface e<JcePrimitiveT> {
        JcePrimitiveT a(String str) throws GeneralSecurityException;
    }

    public static List<Provider> b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT a(String str) throws GeneralSecurityException {
        return this.f42225a.a(str);
    }

    public i(T_WRAPPER t_wrapper) {
        if (Pe.b.c()) {
            this.f42225a = new d(t_wrapper);
        } else if (q.a()) {
            this.f42225a = new b(t_wrapper);
        } else {
            this.f42225a = new c(t_wrapper);
        }
    }
}
