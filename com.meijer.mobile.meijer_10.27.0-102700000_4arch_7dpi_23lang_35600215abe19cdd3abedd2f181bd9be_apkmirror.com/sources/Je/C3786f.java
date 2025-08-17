package Je;

import Je.C3791k;
import java.security.GeneralSecurityException;

/* renamed from: Je.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3786f extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final C3791k f14946a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f14947b;

    /* renamed from: c, reason: collision with root package name */
    private final We.b f14948c;

    /* renamed from: d, reason: collision with root package name */
    private final We.a f14949d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f14950e;

    /* renamed from: Je.f$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C3791k f14951a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f14952b;

        /* renamed from: c, reason: collision with root package name */
        private We.b f14953c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f14954d;

        private b() {
            this.f14951a = null;
            this.f14952b = null;
            this.f14953c = null;
            this.f14954d = null;
        }

        private We.a b() {
            if (this.f14951a.h() == C3791k.d.f14980d) {
                return com.google.crypto.tink.internal.x.f88234a;
            }
            if (this.f14951a.h() == C3791k.d.f14979c) {
                return com.google.crypto.tink.internal.x.a(this.f14954d.intValue());
            }
            if (this.f14951a.h() == C3791k.d.f14978b) {
                return com.google.crypto.tink.internal.x.b(this.f14954d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f14951a.h());
        }

        public C3786f a() throws GeneralSecurityException {
            C3791k c3791k = this.f14951a;
            if (c3791k == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.f14952b == null || this.f14953c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (c3791k.c() != this.f14952b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f14951a.e() != this.f14953c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f14951a.a() && this.f14954d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14951a.a() && this.f14954d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C3786f(this.f14951a, this.f14952b, this.f14953c, b(), this.f14954d);
        }

        public b c(We.b bVar) {
            this.f14952b = bVar;
            return this;
        }

        public b d(We.b bVar) {
            this.f14953c = bVar;
            return this;
        }

        public b e(Integer num) {
            this.f14954d = num;
            return this;
        }

        public b f(C3791k c3791k) {
            this.f14951a = c3791k;
            return this;
        }
    }

    private C3786f(C3791k c3791k, We.b bVar, We.b bVar2, We.a aVar, Integer num) {
        this.f14946a = c3791k;
        this.f14947b = bVar;
        this.f14948c = bVar2;
        this.f14949d = aVar;
        this.f14950e = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f14949d;
    }

    public We.b e() {
        return this.f14947b;
    }

    public We.b f() {
        return this.f14948c;
    }

    public Integer g() {
        return this.f14950e;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C3791k a() {
        return this.f14946a;
    }
}
