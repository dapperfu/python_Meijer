package Qe;

import Qe.e;
import com.google.crypto.tink.internal.x;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private final e f28084a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f28085b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f28086c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f28087d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private e f28088a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f28089b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f28090c;

        private b() {
            this.f28088a = null;
            this.f28089b = null;
            this.f28090c = null;
        }

        private Ye.a b() {
            if (this.f28088a.d() == e.c.f28101d) {
                return x.f89074a;
            }
            if (this.f28088a.d() == e.c.f28100c) {
                return x.a(this.f28090c.intValue());
            }
            if (this.f28088a.d() == e.c.f28099b) {
                return x.b(this.f28090c.intValue());
            }
            throw new IllegalStateException("Unknown AesSivParameters.Variant: " + this.f28088a.d());
        }

        public a a() throws GeneralSecurityException {
            e eVar = this.f28088a;
            if (eVar == null || this.f28089b == null) {
                throw new IllegalArgumentException("Cannot build without parameters and/or key material");
            }
            if (eVar.c() != this.f28089b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f28088a.a() && this.f28090c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f28088a.a() && this.f28090c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f28088a, this.f28089b, b(), this.f28090c);
        }

        public b c(Integer num) {
            this.f28090c = num;
            return this;
        }

        public b d(Ye.b bVar) {
            this.f28089b = bVar;
            return this;
        }

        public b e(e eVar) {
            this.f28088a = eVar;
            return this;
        }
    }

    private a(e eVar, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f28084a = eVar;
        this.f28085b = bVar;
        this.f28086c = aVar;
        this.f28087d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Qe.g
    public Ye.a b() {
        return this.f28086c;
    }

    public Integer e() {
        return this.f28087d;
    }

    public Ye.b f() {
        return this.f28085b;
    }

    @Override // Qe.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public e a() {
        return this.f28084a;
    }
}
