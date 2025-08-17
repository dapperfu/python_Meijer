package Oe;

import Oe.e;
import com.google.crypto.tink.internal.x;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final e f23596a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f23597b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f23598c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f23599d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private e f23600a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f23601b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f23602c;

        private b() {
            this.f23600a = null;
            this.f23601b = null;
            this.f23602c = null;
        }

        private We.a b() {
            if (this.f23600a.d() == e.c.f23613d) {
                return x.f88234a;
            }
            if (this.f23600a.d() == e.c.f23612c) {
                return x.a(this.f23602c.intValue());
            }
            if (this.f23600a.d() == e.c.f23611b) {
                return x.b(this.f23602c.intValue());
            }
            throw new IllegalStateException("Unknown AesSivParameters.Variant: " + this.f23600a.d());
        }

        public a a() throws GeneralSecurityException {
            e eVar = this.f23600a;
            if (eVar == null || this.f23601b == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (eVar.c() != this.f23601b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f23600a.a() && this.f23602c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f23600a.a() && this.f23602c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f23600a, this.f23601b, b(), this.f23602c);
        }

        public b c(Integer num) {
            this.f23602c = num;
            return this;
        }

        public b d(We.b bVar) {
            this.f23601b = bVar;
            return this;
        }

        public b e(e eVar) {
            this.f23600a = eVar;
            return this;
        }
    }

    private a(e eVar, We.b bVar, We.a aVar, Integer num) {
        this.f23596a = eVar;
        this.f23597b = bVar;
        this.f23598c = aVar;
        this.f23599d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Oe.g
    public We.a b() {
        return this.f23598c;
    }

    public Integer e() {
        return this.f23599d;
    }

    public We.b f() {
        return this.f23597b;
    }

    @Override // Oe.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e a() {
        return this.f23596a;
    }
}
