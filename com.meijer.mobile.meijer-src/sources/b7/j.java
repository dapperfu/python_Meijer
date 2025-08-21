package b7;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import r7.k;
import r7.l;
import s7.C17028a;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final r7.h<X6.e, String> f60094a = new r7.h<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final o2.f<b> f60095b = C17028a.d(10, new a());

    class a implements C17028a.d<b> {
        a() {
        }

        @Override // s7.C17028a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements C17028a.f {

        /* renamed from: a, reason: collision with root package name */
        final MessageDigest f60097a;

        /* renamed from: b, reason: collision with root package name */
        private final s7.c f60098b = s7.c.a();

        @Override // s7.C17028a.f
        public s7.c e() {
            return this.f60098b;
        }

        b(MessageDigest messageDigest) {
            this.f60097a = messageDigest;
        }
    }

    private String a(X6.e eVar) {
        b bVar = (b) k.d(this.f60095b.b());
        try {
            eVar.updateDiskCacheKey(bVar.f60097a);
            return l.w(bVar.f60097a.digest());
        } finally {
            this.f60095b.a(bVar);
        }
    }

    public String b(X6.e eVar) {
        String strG;
        synchronized (this.f60094a) {
            strG = this.f60094a.g(eVar);
        }
        if (strG == null) {
            strG = a(eVar);
        }
        synchronized (this.f60094a) {
            this.f60094a.k(eVar, strG);
        }
        return strG;
    }
}
