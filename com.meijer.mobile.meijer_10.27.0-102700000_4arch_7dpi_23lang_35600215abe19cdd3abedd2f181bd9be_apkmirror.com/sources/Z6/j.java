package Z6;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p7.k;
import p7.l;
import q7.C16480a;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final p7.h<V6.e, String> f42427a = new p7.h<>(1000);

    /* renamed from: b, reason: collision with root package name */
    private final o2.f<b> f42428b = C16480a.d(10, new a());

    class a implements C16480a.d<b> {
        a() {
        }

        @Override // q7.C16480a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private static final class b implements C16480a.f {

        /* renamed from: a, reason: collision with root package name */
        final MessageDigest f42430a;

        /* renamed from: b, reason: collision with root package name */
        private final q7.c f42431b = q7.c.a();

        @Override // q7.C16480a.f
        public q7.c e() {
            return this.f42431b;
        }

        b(MessageDigest messageDigest) {
            this.f42430a = messageDigest;
        }
    }

    private String a(V6.e eVar) {
        b bVar = (b) k.d(this.f42428b.b());
        try {
            eVar.updateDiskCacheKey(bVar.f42430a);
            return l.w(bVar.f42430a.digest());
        } finally {
            this.f42428b.a(bVar);
        }
    }

    public String b(V6.e eVar) {
        String strG;
        synchronized (this.f42427a) {
            strG = this.f42427a.g(eVar);
        }
        if (strG == null) {
            strG = a(eVar);
        }
        synchronized (this.f42427a) {
            this.f42427a.k(eVar, strG);
        }
        return strG;
    }
}
