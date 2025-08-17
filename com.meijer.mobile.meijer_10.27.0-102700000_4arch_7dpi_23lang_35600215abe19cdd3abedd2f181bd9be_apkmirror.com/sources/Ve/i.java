package Ve;

import Ve.j;
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

/* loaded from: classes7.dex */
public final class i<T_WRAPPER extends j<JcePrimitiveT>, JcePrimitiveT> {

    /* renamed from: b, reason: collision with root package name */
    public static final i<j.a, Cipher> f37506b = new i<>(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i<j.e, Mac> f37507c = new i<>(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i<j.g, Signature> f37508d = new i<>(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i<j.f, MessageDigest> f37509e = new i<>(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i<j.b, KeyAgreement> f37510f = new i<>(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i<j.d, KeyPairGenerator> f37511g = new i<>(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i<j.c, KeyFactory> f37512h = new i<>(new j.c());

    /* renamed from: a, reason: collision with root package name */
    private final e<JcePrimitiveT> f37513a;

    private static class b<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f37514a;

        private b(j<JcePrimitiveT> jVar) {
            this.f37514a = jVar;
        }

        @Override // Ve.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f37514a.a(str, it.next());
                } catch (Exception e10) {
                    if (exc == null) {
                        exc = e10;
                    }
                }
            }
            return this.f37514a.a(str, null);
        }
    }

    private static class c<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f37515a;

        private c(j<JcePrimitiveT> jVar) {
            this.f37515a = jVar;
        }

        @Override // Ve.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            return this.f37515a.a(str, null);
        }
    }

    private static class d<JcePrimitiveT> implements e<JcePrimitiveT> {

        /* renamed from: a, reason: collision with root package name */
        private final j<JcePrimitiveT> f37516a;

        private d(j<JcePrimitiveT> jVar) {
            this.f37516a = jVar;
        }

        @Override // Ve.i.e
        public JcePrimitiveT a(String str) throws GeneralSecurityException {
            Iterator<Provider> it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f37516a.a(str, it.next());
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
        return this.f37513a.a(str);
    }

    public i(T_WRAPPER t_wrapper) {
        if (Ne.b.c()) {
            this.f37513a = new d(t_wrapper);
        } else if (q.a()) {
            this.f37513a = new b(t_wrapper);
        } else {
            this.f37513a = new c(t_wrapper);
        }
    }
}
