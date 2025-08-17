package Je;

import Je.C3800u;
import java.security.GeneralSecurityException;

/* renamed from: Je.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3797q extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final C3800u f15027a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f15028b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f15029c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15030d;

    /* renamed from: Je.q$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C3800u f15031a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f15032b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f15033c;

        private b() {
            this.f15031a = null;
            this.f15032b = null;
            this.f15033c = null;
        }

        private We.a b() {
            if (this.f15031a.f() == C3800u.c.f15057d) {
                return com.google.crypto.tink.internal.x.f88234a;
            }
            if (this.f15031a.f() == C3800u.c.f15056c) {
                return com.google.crypto.tink.internal.x.a(this.f15033c.intValue());
            }
            if (this.f15031a.f() == C3800u.c.f15055b) {
                return com.google.crypto.tink.internal.x.b(this.f15033c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f15031a.f());
        }

        public C3797q a() throws GeneralSecurityException {
            C3800u c3800u = this.f15031a;
            if (c3800u == null || this.f15032b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c3800u.d() != this.f15032b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f15031a.a() && this.f15033c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f15031a.a() && this.f15033c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C3797q(this.f15031a, this.f15032b, b(), this.f15033c);
        }

        public b c(Integer num) {
            this.f15033c = num;
            return this;
        }

        public b d(We.b bVar) {
            this.f15032b = bVar;
            return this;
        }

        public b e(C3800u c3800u) {
            this.f15031a = c3800u;
            return this;
        }
    }

    private C3797q(C3800u c3800u, We.b bVar, We.a aVar, Integer num) {
        this.f15027a = c3800u;
        this.f15028b = bVar;
        this.f15029c = aVar;
        this.f15030d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f15029c;
    }

    public Integer e() {
        return this.f15030d;
    }

    public We.b f() {
        return this.f15028b;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3800u a() {
        return this.f15027a;
    }
}
