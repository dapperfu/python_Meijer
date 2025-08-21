package Le;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class p0 extends AbstractC4027c {

    /* renamed from: a, reason: collision with root package name */
    private final a f18359a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18360b;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18361b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f18362c = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        private final String f18363a;

        public String toString() {
            return this.f18363a;
        }

        private a(String str) {
            this.f18363a = str;
        }
    }

    public static p0 b(a aVar, int i10) throws GeneralSecurityException {
        if (i10 < 8 || i10 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new p0(aVar, i10);
    }

    @Override // Ke.x
    public boolean a() {
        return this.f18359a != a.f18362c;
    }

    public int c() {
        return this.f18360b;
    }

    public a d() {
        return this.f18359a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p0Var.d() == d() && p0Var.c() == c();
    }

    public int hashCode() {
        return Objects.hash(p0.class, this.f18359a, Integer.valueOf(this.f18360b));
    }

    public String toString() {
        return "X-AES-GCM Parameters (variant: " + this.f18359a + "salt_size_bytes: " + this.f18360b + ")";
    }

    private p0(a aVar, int i10) {
        this.f18359a = aVar;
        this.f18360b = i10;
    }
}
