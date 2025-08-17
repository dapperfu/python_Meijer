package Re;

import Re.n;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    private final n f32157a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f32158b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f32159c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f32160d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private n f32161a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f32162b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f32163c;

        private b() {
            this.f32161a = null;
            this.f32162b = null;
            this.f32163c = null;
        }

        private We.a b() {
            if (this.f32161a.g() == n.d.f32187e) {
                return com.google.crypto.tink.internal.x.f88234a;
            }
            if (this.f32161a.g() == n.d.f32186d || this.f32161a.g() == n.d.f32185c) {
                return com.google.crypto.tink.internal.x.a(this.f32163c.intValue());
            }
            if (this.f32161a.g() == n.d.f32184b) {
                return com.google.crypto.tink.internal.x.b(this.f32163c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f32161a.g());
        }

        public i a() throws GeneralSecurityException {
            n nVar = this.f32161a;
            if (nVar == null || this.f32162b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (nVar.e() != this.f32162b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f32161a.a() && this.f32163c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f32161a.a() && this.f32163c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f32161a, this.f32162b, b(), this.f32163c);
        }

        public b c(Integer num) {
            this.f32163c = num;
            return this;
        }

        public b d(We.b bVar) {
            this.f32162b = bVar;
            return this;
        }

        public b e(n nVar) {
            this.f32161a = nVar;
            return this;
        }
    }

    private i(n nVar, We.b bVar, We.a aVar, Integer num) {
        this.f32157a = nVar;
        this.f32158b = bVar;
        this.f32159c = aVar;
        this.f32160d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Re.p
    public We.a b() {
        return this.f32159c;
    }

    public Integer e() {
        return this.f32160d;
    }

    public We.b f() {
        return this.f32158b;
    }

    @Override // Re.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n a() {
        return this.f32157a;
    }
}
