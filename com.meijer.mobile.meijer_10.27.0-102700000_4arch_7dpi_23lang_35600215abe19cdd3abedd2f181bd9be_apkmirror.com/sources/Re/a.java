package Re;

import Re.f;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final f f32132a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f32133b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f32134c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f32135d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private f f32136a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f32137b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f32138c;

        private b() {
            this.f32136a = null;
            this.f32137b = null;
            this.f32138c = null;
        }

        private We.a b() {
            if (this.f32136a.f() == f.c.f32152e) {
                return com.google.crypto.tink.internal.x.f88234a;
            }
            if (this.f32136a.f() == f.c.f32151d || this.f32136a.f() == f.c.f32150c) {
                return com.google.crypto.tink.internal.x.a(this.f32138c.intValue());
            }
            if (this.f32136a.f() == f.c.f32149b) {
                return com.google.crypto.tink.internal.x.b(this.f32138c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f32136a.f());
        }

        public a a() throws GeneralSecurityException {
            f fVar = this.f32136a;
            if (fVar == null || this.f32137b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fVar.d() != this.f32137b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f32136a.a() && this.f32138c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f32136a.a() && this.f32138c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f32136a, this.f32137b, b(), this.f32138c);
        }

        public b c(We.b bVar) throws GeneralSecurityException {
            this.f32137b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f32138c = num;
            return this;
        }

        public b e(f fVar) {
            this.f32136a = fVar;
            return this;
        }
    }

    private a(f fVar, We.b bVar, We.a aVar, Integer num) {
        this.f32132a = fVar;
        this.f32133b = bVar;
        this.f32134c = aVar;
        this.f32135d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Re.p
    public We.a b() {
        return this.f32134c;
    }

    public We.b e() {
        return this.f32133b;
    }

    public Integer f() {
        return this.f32135d;
    }

    @Override // Re.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f a() {
        return this.f32132a;
    }
}
