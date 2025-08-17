package Je;

import Je.C3805z;
import java.security.GeneralSecurityException;

/* renamed from: Je.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3801v extends AbstractC3782b {

    /* renamed from: a, reason: collision with root package name */
    private final C3805z f15064a;

    /* renamed from: b, reason: collision with root package name */
    private final We.b f15065b;

    /* renamed from: c, reason: collision with root package name */
    private final We.a f15066c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15067d;

    /* renamed from: Je.v$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private C3805z f15068a;

        /* renamed from: b, reason: collision with root package name */
        private We.b f15069b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f15070c;

        private b() {
            this.f15068a = null;
            this.f15069b = null;
            this.f15070c = null;
        }

        private We.a b() {
            if (this.f15068a.d() == C3805z.c.f15081d) {
                return com.google.crypto.tink.internal.x.f88234a;
            }
            if (this.f15068a.d() == C3805z.c.f15080c) {
                return com.google.crypto.tink.internal.x.a(this.f15070c.intValue());
            }
            if (this.f15068a.d() == C3805z.c.f15079b) {
                return com.google.crypto.tink.internal.x.b(this.f15070c.intValue());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f15068a.d());
        }

        public C3801v a() throws GeneralSecurityException {
            C3805z c3805z = this.f15068a;
            if (c3805z == null || this.f15069b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c3805z.c() != this.f15069b.c()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f15068a.a() && this.f15070c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f15068a.a() && this.f15070c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C3801v(this.f15068a, this.f15069b, b(), this.f15070c);
        }

        public b c(Integer num) {
            this.f15070c = num;
            return this;
        }

        public b d(We.b bVar) {
            this.f15069b = bVar;
            return this;
        }

        public b e(C3805z c3805z) {
            this.f15068a = c3805z;
            return this;
        }
    }

    private C3801v(C3805z c3805z, We.b bVar, We.a aVar, Integer num) {
        this.f15064a = c3805z;
        this.f15065b = bVar;
        this.f15066c = aVar;
        this.f15067d = num;
    }

    public static b d() {
        return new b();
    }

    @Override // Je.AbstractC3782b
    public We.a b() {
        return this.f15066c;
    }

    public Integer e() {
        return this.f15067d;
    }

    public We.b f() {
        return this.f15065b;
    }

    @Override // Je.AbstractC3782b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public C3805z a() {
        return this.f15064a;
    }
}
