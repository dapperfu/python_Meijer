package Le;

import Le.C4049z;
import java.security.GeneralSecurityException;

/* renamed from: Le.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4045v extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final C4049z f18401a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18402b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f18403c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18404d;

    /* renamed from: Le.v$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C4049z f18405a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f18406b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f18407c;

        private b() {
            this.f18405a = null;
            this.f18406b = null;
            this.f18407c = null;
        }

        private Ye.a b() {
            if (this.f18405a.d() == C4049z.c.f18418d) {
                return com.google.crypto.tink.internal.x.f89074a;
            }
            if (this.f18405a.d() == C4049z.c.f18417c) {
                return com.google.crypto.tink.internal.x.a(this.f18407c.intValue());
            }
            if (this.f18405a.d() == C4049z.c.f18416b) {
                return com.google.crypto.tink.internal.x.b(this.f18407c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f18405a.d());
        }

        public C4045v a() throws GeneralSecurityException {
            C4049z c4049z = this.f18405a;
            if (c4049z == null || this.f18406b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c4049z.c() != this.f18406b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f18405a.a() && this.f18407c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f18405a.a() && this.f18407c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C4045v(this.f18405a, this.f18406b, b(), this.f18407c);
        }

        public b c(Integer num) {
            this.f18407c = num;
            return this;
        }

        public b d(Ye.b bVar) {
            this.f18406b = bVar;
            return this;
        }

        public b e(C4049z c4049z) {
            this.f18405a = c4049z;
            return this;
        }
    }

    private C4045v(C4049z c4049z, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f18401a = c4049z;
        this.f18402b = bVar;
        this.f18403c = aVar;
        this.f18404d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18403c;
    }

    public Integer e() {
        return this.f18404d;
    }

    public Ye.b f() {
        return this.f18402b;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4049z a() {
        return this.f18401a;
    }
}
