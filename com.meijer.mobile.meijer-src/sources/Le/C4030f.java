package Le;

import Le.C4035k;
import java.security.GeneralSecurityException;

/* renamed from: Le.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4030f extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final C4035k f18283a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18284b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.b f18285c;

    /* renamed from: d, reason: collision with root package name */
    private final Ye.a f18286d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f18287e;

    /* renamed from: Le.f$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C4035k f18288a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f18289b;

        /* renamed from: c, reason: collision with root package name */
        private Ye.b f18290c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f18291d;

        private b() {
            this.f18288a = null;
            this.f18289b = null;
            this.f18290c = null;
            this.f18291d = null;
        }

        private Ye.a b() {
            if (this.f18288a.h() == C4035k.d.f18317d) {
                return com.google.crypto.tink.internal.x.f89074a;
            }
            if (this.f18288a.h() == C4035k.d.f18316c) {
                return com.google.crypto.tink.internal.x.a(this.f18291d.intValue());
            }
            if (this.f18288a.h() == C4035k.d.f18315b) {
                return com.google.crypto.tink.internal.x.b(this.f18291d.intValue());
            }
            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + this.f18288a.h());
        }

        public C4030f a() throws GeneralSecurityException {
            C4035k c4035k = this.f18288a;
            if (c4035k == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.f18289b == null || this.f18290c == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (c4035k.c() != this.f18289b.c()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.f18288a.e() != this.f18290c.c()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.f18288a.a() && this.f18291d == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f18288a.a() && this.f18291d != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C4030f(this.f18288a, this.f18289b, this.f18290c, b(), this.f18291d);
        }

        public b c(Ye.b bVar) {
            this.f18289b = bVar;
            return this;
        }

        public b d(Ye.b bVar) {
            this.f18290c = bVar;
            return this;
        }

        public b e(Integer num) {
            this.f18291d = num;
            return this;
        }

        public b f(C4035k c4035k) {
            this.f18288a = c4035k;
            return this;
        }
    }

    private C4030f(C4035k c4035k, Ye.b bVar, Ye.b bVar2, Ye.a aVar, Integer num) {
        this.f18283a = c4035k;
        this.f18284b = bVar;
        this.f18285c = bVar2;
        this.f18286d = aVar;
        this.f18287e = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18286d;
    }

    public Ye.b e() {
        return this.f18284b;
    }

    public Ye.b f() {
        return this.f18285c;
    }

    public Integer g() {
        return this.f18287e;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C4035k a() {
        return this.f18283a;
    }
}
