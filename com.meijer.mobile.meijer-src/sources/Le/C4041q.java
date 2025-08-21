package Le;

import Le.C4044u;
import java.security.GeneralSecurityException;

/* renamed from: Le.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4041q extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final C4044u f18364a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18365b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f18366c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18367d;

    /* renamed from: Le.q$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C4044u f18368a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f18369b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f18370c;

        private b() {
            this.f18368a = null;
            this.f18369b = null;
            this.f18370c = null;
        }

        private Ye.a b() {
            if (this.f18368a.f() == C4044u.c.f18394d) {
                return com.google.crypto.tink.internal.x.f89074a;
            }
            if (this.f18368a.f() == C4044u.c.f18393c) {
                return com.google.crypto.tink.internal.x.a(this.f18370c.intValue());
            }
            if (this.f18368a.f() == C4044u.c.f18392b) {
                return com.google.crypto.tink.internal.x.b(this.f18370c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f18368a.f());
        }

        public C4041q a() throws GeneralSecurityException {
            C4044u c4044u = this.f18368a;
            if (c4044u == null || this.f18369b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c4044u.d() != this.f18369b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f18368a.a() && this.f18370c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f18368a.a() && this.f18370c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C4041q(this.f18368a, this.f18369b, b(), this.f18370c);
        }

        public b c(Integer num) {
            this.f18370c = num;
            return this;
        }

        public b d(Ye.b bVar) {
            this.f18369b = bVar;
            return this;
        }

        public b e(C4044u c4044u) {
            this.f18368a = c4044u;
            return this;
        }
    }

    private C4041q(C4044u c4044u, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f18364a = c4044u;
        this.f18365b = bVar;
        this.f18366c = aVar;
        this.f18367d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18366c;
    }

    public Integer e() {
        return this.f18367d;
    }

    public Ye.b f() {
        return this.f18365b;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4044u a() {
        return this.f18364a;
    }
}
