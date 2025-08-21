package Te;

import Te.n;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    private final n f36157a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f36158b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f36159c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f36160d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private n f36161a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f36162b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f36163c;

        private b() {
            this.f36161a = null;
            this.f36162b = null;
            this.f36163c = null;
        }

        private Ye.a b() {
            if (this.f36161a.g() == n.d.f36187e) {
                return com.google.crypto.tink.internal.x.f89074a;
            }
            if (this.f36161a.g() == n.d.f36186d || this.f36161a.g() == n.d.f36185c) {
                return com.google.crypto.tink.internal.x.a(this.f36163c.intValue());
            }
            if (this.f36161a.g() == n.d.f36184b) {
                return com.google.crypto.tink.internal.x.b(this.f36163c.intValue());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f36161a.g());
        }

        public i a() throws GeneralSecurityException {
            n nVar = this.f36161a;
            if (nVar == null || this.f36162b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (nVar.e() != this.f36162b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f36161a.a() && this.f36163c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f36161a.a() && this.f36163c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f36161a, this.f36162b, b(), this.f36163c);
        }

        public b c(Integer num) {
            this.f36163c = num;
            return this;
        }

        public b d(Ye.b bVar) {
            this.f36162b = bVar;
            return this;
        }

        public b e(n nVar) {
            this.f36161a = nVar;
            return this;
        }
    }

    private i(n nVar, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f36157a = nVar;
        this.f36158b = bVar;
        this.f36159c = aVar;
        this.f36160d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Te.p
    public Ye.a b() {
        return this.f36159c;
    }

    public Integer e() {
        return this.f36160d;
    }

    public Ye.b f() {
        return this.f36158b;
    }

    @Override // Te.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n a() {
        return this.f36157a;
    }
}
