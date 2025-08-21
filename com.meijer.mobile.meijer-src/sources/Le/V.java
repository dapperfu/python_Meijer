package Le;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class V extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final d f18240a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18241b;

    /* renamed from: c, reason: collision with root package name */
    private final c f18242c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4027c f18243d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private d f18244a;

        /* renamed from: b, reason: collision with root package name */
        private String f18245b;

        /* renamed from: c, reason: collision with root package name */
        private c f18246c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC4027c f18247d;

        private b() {
        }

        private static boolean b(c cVar, AbstractC4027c abstractC4027c) {
            if (cVar.equals(c.f18248b) && (abstractC4027c instanceof C4044u)) {
                return true;
            }
            if (cVar.equals(c.f18250d) && (abstractC4027c instanceof E)) {
                return true;
            }
            if (cVar.equals(c.f18249c) && (abstractC4027c instanceof u0)) {
                return true;
            }
            if (cVar.equals(c.f18251e) && (abstractC4027c instanceof C4035k)) {
                return true;
            }
            if (cVar.equals(c.f18252f) && (abstractC4027c instanceof C4040p)) {
                return true;
            }
            return cVar.equals(c.f18253g) && (abstractC4027c instanceof C4049z);
        }

        public V a() throws GeneralSecurityException {
            if (this.f18244a == null) {
                this.f18244a = d.f18256c;
            }
            if (this.f18245b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f18246c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            AbstractC4027c abstractC4027c = this.f18247d;
            if (abstractC4027c == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (abstractC4027c.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f18246c, this.f18247d)) {
                return new V(this.f18244a, this.f18245b, this.f18246c, this.f18247d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f18246c.toString() + " when new keys are picked according to " + this.f18247d + ".");
        }

        public b c(AbstractC4027c abstractC4027c) {
            this.f18247d = abstractC4027c;
            return this;
        }

        public b d(c cVar) {
            this.f18246c = cVar;
            return this;
        }

        public b e(String str) {
            this.f18245b = str;
            return this;
        }

        public b f(d dVar) {
            this.f18244a = dVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f18248b = new c("ASSUME_AES_GCM");

        /* renamed from: c, reason: collision with root package name */
        public static final c f18249c = new c("ASSUME_XCHACHA20POLY1305");

        /* renamed from: d, reason: collision with root package name */
        public static final c f18250d = new c("ASSUME_CHACHA20POLY1305");

        /* renamed from: e, reason: collision with root package name */
        public static final c f18251e = new c("ASSUME_AES_CTR_HMAC");

        /* renamed from: f, reason: collision with root package name */
        public static final c f18252f = new c("ASSUME_AES_EAX");

        /* renamed from: g, reason: collision with root package name */
        public static final c f18253g = new c("ASSUME_AES_GCM_SIV");

        /* renamed from: a, reason: collision with root package name */
        private final String f18254a;

        public String toString() {
            return this.f18254a;
        }

        private c(String str) {
            this.f18254a = str;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f18255b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f18256c = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18257a;

        public String toString() {
            return this.f18257a;
        }

        private d(String str) {
            this.f18257a = str;
        }
    }

    private V(d dVar, String str, c cVar, AbstractC4027c abstractC4027c) {
        this.f18240a = dVar;
        this.f18241b = str;
        this.f18242c = cVar;
        this.f18243d = abstractC4027c;
    }

    public static b b() {
        return new b();
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18240a != d.f18256c;
    }

    public AbstractC4027c c() {
        return this.f18243d;
    }

    public String d() {
        return this.f18241b;
    }

    public d e() {
        return this.f18240a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return v10.f18242c.equals(this.f18242c) && v10.f18243d.equals(this.f18243d) && v10.f18241b.equals(this.f18241b) && v10.f18240a.equals(this.f18240a);
    }

    public int hashCode() {
        return Objects.hash(V.class, this.f18241b, this.f18242c, this.f18243d, this.f18240a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f18241b + ", dekParsingStrategy: " + this.f18242c + ", dekParametersForNewKeys: " + this.f18243d + ", variant: " + this.f18240a + ")";
    }
}
