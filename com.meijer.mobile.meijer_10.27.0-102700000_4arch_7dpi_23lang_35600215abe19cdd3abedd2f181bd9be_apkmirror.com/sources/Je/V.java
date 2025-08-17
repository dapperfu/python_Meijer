package Je;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class V extends AbstractC3783c {

    /* renamed from: a, reason: collision with root package name */
    private final d f14903a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14904b;

    /* renamed from: c, reason: collision with root package name */
    private final c f14905c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3783c f14906d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private d f14907a;

        /* renamed from: b, reason: collision with root package name */
        private String f14908b;

        /* renamed from: c, reason: collision with root package name */
        private c f14909c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC3783c f14910d;

        private b() {
        }

        private static boolean b(c cVar, AbstractC3783c abstractC3783c) {
            if (cVar.equals(c.f14911b) && (abstractC3783c instanceof C3800u)) {
                return true;
            }
            if (cVar.equals(c.f14913d) && (abstractC3783c instanceof E)) {
                return true;
            }
            if (cVar.equals(c.f14912c) && (abstractC3783c instanceof u0)) {
                return true;
            }
            if (cVar.equals(c.f14914e) && (abstractC3783c instanceof C3791k)) {
                return true;
            }
            if (cVar.equals(c.f14915f) && (abstractC3783c instanceof C3796p)) {
                return true;
            }
            return cVar.equals(c.f14916g) && (abstractC3783c instanceof C3805z);
        }

        public V a() throws GeneralSecurityException {
            if (this.f14907a == null) {
                this.f14907a = d.f14919c;
            }
            if (this.f14908b == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.f14909c == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            AbstractC3783c abstractC3783c = this.f14910d;
            if (abstractC3783c == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (abstractC3783c.a()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (b(this.f14909c, this.f14910d)) {
                return new V(this.f14907a, this.f14908b, this.f14909c, this.f14910d);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.f14909c.toString() + " when new keys are picked according to " + this.f14910d + ".");
        }

        public b c(AbstractC3783c abstractC3783c) {
            this.f14910d = abstractC3783c;
            return this;
        }

        public b d(c cVar) {
            this.f14909c = cVar;
            return this;
        }

        public b e(String str) {
            this.f14908b = str;
            return this;
        }

        public b f(d dVar) {
            this.f14907a = dVar;
            return this;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f14911b = new c("ASSUME_AES_GCM");

        /* renamed from: c, reason: collision with root package name */
        public static final c f14912c = new c("ASSUME_XCHACHA20POLY1305");

        /* renamed from: d, reason: collision with root package name */
        public static final c f14913d = new c("ASSUME_CHACHA20POLY1305");

        /* renamed from: e, reason: collision with root package name */
        public static final c f14914e = new c("ASSUME_AES_CTR_HMAC");

        /* renamed from: f, reason: collision with root package name */
        public static final c f14915f = new c("ASSUME_AES_EAX");

        /* renamed from: g, reason: collision with root package name */
        public static final c f14916g = new c("ASSUME_AES_GCM_SIV");

        /* renamed from: a, reason: collision with root package name */
        private final String f14917a;

        public String toString() {
            return this.f14917a;
        }

        private c(String str) {
            this.f14917a = str;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f14918b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f14919c = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f14920a;

        public String toString() {
            return this.f14920a;
        }

        private d(String str) {
            this.f14920a = str;
        }
    }

    private V(d dVar, String str, c cVar, AbstractC3783c abstractC3783c) {
        this.f14903a = dVar;
        this.f14904b = str;
        this.f14905c = cVar;
        this.f14906d = abstractC3783c;
    }

    public static b b() {
        return new b();
    }

    @Override // Ie.x
    public boolean a() {
        return this.f14903a != d.f14919c;
    }

    public AbstractC3783c c() {
        return this.f14906d;
    }

    public String d() {
        return this.f14904b;
    }

    public d e() {
        return this.f14903a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return v10.f14905c.equals(this.f14905c) && v10.f14906d.equals(this.f14906d) && v10.f14904b.equals(this.f14904b) && v10.f14903a.equals(this.f14903a);
    }

    public int hashCode() {
        return Objects.hash(V.class, this.f14904b, this.f14905c, this.f14906d, this.f14903a);
    }

    public String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f14904b + ", dekParsingStrategy: " + this.f14905c + ", dekParametersForNewKeys: " + this.f14906d + ", variant: " + this.f14903a + ")";
    }
}
