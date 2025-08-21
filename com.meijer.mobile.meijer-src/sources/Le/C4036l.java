package Le;

import Le.C4040p;
import java.security.GeneralSecurityException;

/* renamed from: Le.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4036l extends AbstractC4026b {

    /* renamed from: a, reason: collision with root package name */
    private final C4040p f18331a;

    /* renamed from: b, reason: collision with root package name */
    private final Ye.b f18332b;

    /* renamed from: c, reason: collision with root package name */
    private final Ye.a f18333c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f18334d;

    /* renamed from: Le.l$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C4040p f18335a;

        /* renamed from: b, reason: collision with root package name */
        private Ye.b f18336b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f18337c;

        private b() {
            this.f18335a = null;
            this.f18336b = null;
            this.f18337c = null;
        }

        private Ye.a b() {
            if (this.f18335a.f() == C4040p.c.f18357d) {
                return com.google.crypto.tink.internal.x.f89074a;
            }
            if (this.f18335a.f() == C4040p.c.f18356c) {
                return com.google.crypto.tink.internal.x.a(this.f18337c.intValue());
            }
            if (this.f18335a.f() == C4040p.c.f18355b) {
                return com.google.crypto.tink.internal.x.b(this.f18337c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f18335a.f());
        }

        public C4036l a() throws GeneralSecurityException {
            C4040p c4040p = this.f18335a;
            if (c4040p == null || this.f18336b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c4040p.d() != this.f18336b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f18335a.a() && this.f18337c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f18335a.a() && this.f18337c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C4036l(this.f18335a, this.f18336b, b(), this.f18337c);
        }

        public b c(Integer num) {
            this.f18337c = num;
            return this;
        }

        public b d(Ye.b bVar) {
            this.f18336b = bVar;
            return this;
        }

        public b e(C4040p c4040p) {
            this.f18335a = c4040p;
            return this;
        }
    }

    private C4036l(C4040p c4040p, Ye.b bVar, Ye.a aVar, Integer num) {
        this.f18331a = c4040p;
        this.f18332b = bVar;
        this.f18333c = aVar;
        this.f18334d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Le.AbstractC4026b
    public Ye.a b() {
        return this.f18333c;
    }

    public Integer e() {
        return this.f18334d;
    }

    public Ye.b f() {
        return this.f18332b;
    }

    @Override // Le.AbstractC4026b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C4040p a() {
        return this.f18331a;
    }
}
