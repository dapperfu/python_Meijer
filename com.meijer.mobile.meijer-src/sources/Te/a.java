package Te;

import Te.f;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    private final f f36132a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f36133b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f36134c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f36135d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private f f36136a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f36137b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f36138c;

        private b() {
            this.f36136a = null;
            this.f36137b = null;
            this.f36138c = null;
        }

        private Ye.a b() {
            if (this.f36136a.f() == f.c.f36152e) {
                return com.google.crypto.tink.internal.x.f89074a;
            }
            if (this.f36136a.f() == f.c.f36151d || this.f36136a.f() == f.c.f36150c) {
                return com.google.crypto.tink.internal.x.a(this.f36138c.intValue());
            }
            if (this.f36136a.f() == f.c.f36149b) {
                return com.google.crypto.tink.internal.x.b(this.f36138c.intValue());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f36136a.f());
        }

        public a a() throws GeneralSecurityException {
            f fVar = this.f36136a;
            if (fVar == null || this.f36137b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (fVar.d() != this.f36137b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f36136a.a() && this.f36138c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f36136a.a() && this.f36138c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f36136a, this.f36137b, b(), this.f36138c);
        }

        public b c(Ye.b bVar) throws GeneralSecurityException {
            this.f36137b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f36138c = num;
            return this;
        }

        public b e(f fVar) {
            this.f36136a = fVar;
            return this;
        }
    }

    private a(f fVar, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f36132a = fVar;
        this.f36133b = bVar;
        this.f36134c = aVar;
        this.f36135d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Te.p
    public Ye.a b() {
        return this.f36134c;
    }

    public Ye.b e() {
        return this.f36133b;
    }

    public Integer f() {
        return this.f36135d;
    }

    @Override // Te.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f a() {
        return this.f36132a;
    }
}
