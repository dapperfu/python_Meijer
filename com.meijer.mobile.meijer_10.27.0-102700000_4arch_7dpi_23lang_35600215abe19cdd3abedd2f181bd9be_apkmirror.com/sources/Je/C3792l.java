package Je;

import Je.C3796p;
import java.security.GeneralSecurityException;

/* renamed from: Je.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3792l extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final C3796p f14994a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f14995b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f14996c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f14997d;

    /* renamed from: Je.l$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C3796p f14998a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f14999b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f15000c;

        private b() {
            this.f14998a = null;
            this.f14999b = null;
            this.f15000c = null;
        }

        private We.a b() {
            if (this.f14998a.f() == C3796p.c.f15020d) {
                return com.google.crypto.tink.internal.x.f88234a;
            }
            if (this.f14998a.f() == C3796p.c.f15019c) {
                return com.google.crypto.tink.internal.x.a(this.f15000c.intValue());
            }
            if (this.f14998a.f() == C3796p.c.f15018b) {
                return com.google.crypto.tink.internal.x.b(this.f15000c.intValue());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f14998a.f());
        }

        public C3792l a() throws GeneralSecurityException {
            C3796p c3796p = this.f14998a;
            if (c3796p == null || this.f14999b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c3796p.d() != this.f14999b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f14998a.a() && this.f15000c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f14998a.a() && this.f15000c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C3792l(this.f14998a, this.f14999b, b(), this.f15000c);
        }

        public b c(Integer num) {
            this.f15000c = num;
            return this;
        }

        public b d(We.b bVar) {
            this.f14999b = bVar;
            return this;
        }

        public b e(C3796p c3796p) {
            this.f14998a = c3796p;
            return this;
        }
    }

    private C3792l(C3796p c3796p, We.b bVar, We.a aVar, Integer num) {
        this.f14994a = c3796p;
        this.f14995b = bVar;
        this.f14996c = aVar;
        this.f14997d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f14996c;
    }

    public Integer e() {
        return this.f14997d;
    }

    public We.b f() {
        return this.f14995b;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3796p a() {
        return this.f14994a;
    }
}
