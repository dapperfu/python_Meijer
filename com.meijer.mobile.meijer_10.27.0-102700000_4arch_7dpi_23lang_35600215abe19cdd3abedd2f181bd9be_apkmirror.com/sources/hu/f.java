package hu;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    private static final d[] f136348e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f136349f;

    /* renamed from: g, reason: collision with root package name */
    public static final f f136350g;

    /* renamed from: h, reason: collision with root package name */
    public static final f f136351h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f136352a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f136353b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f136354c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f136355d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f136356a;

        /* renamed from: b, reason: collision with root package name */
        private String[] f136357b;

        /* renamed from: c, reason: collision with root package name */
        private String[] f136358c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f136359d;

        b(boolean z10) {
            this.f136356a = z10;
        }

        public f e() {
            return new f(this);
        }

        public b f(d... dVarArr) {
            if (!this.f136356a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[dVarArr.length];
            for (int i10 = 0; i10 < dVarArr.length; i10++) {
                strArr[i10] = dVarArr[i10].f136347a;
            }
            return g(strArr);
        }

        public b g(String... strArr) {
            if (!this.f136356a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f136357b = (String[]) strArr.clone();
            return this;
        }

        public b h(boolean z10) {
            if (!this.f136356a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f136359d = z10;
            return this;
        }

        public b i(k... kVarArr) {
            if (!this.f136356a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[kVarArr.length];
            for (int i10 = 0; i10 < kVarArr.length; i10++) {
                strArr[i10] = kVarArr[i10].f136403a;
            }
            return j(strArr);
        }

        public b j(String... strArr) {
            if (!this.f136356a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f136358c = (String[]) strArr.clone();
            return this;
        }

        public b(f fVar) {
            this.f136356a = fVar.f136352a;
            this.f136357b = fVar.f136354c;
            this.f136358c = fVar.f136355d;
            this.f136359d = fVar.f136353b;
        }
    }

    static {
        d[] dVarArr = {d.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, d.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, d.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, d.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, d.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, d.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, d.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, d.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, d.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, d.TLS_RSA_WITH_AES_128_GCM_SHA256, d.TLS_RSA_WITH_AES_128_CBC_SHA, d.TLS_RSA_WITH_AES_256_CBC_SHA, d.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f136348e = dVarArr;
        b bVarF = new b(true).f(dVarArr);
        k kVar = k.TLS_1_2;
        k kVar2 = k.TLS_1_1;
        k kVar3 = k.TLS_1_0;
        f fVarE = bVarF.i(kVar, kVar2, kVar3).h(true).e();
        f136349f = fVarE;
        f136350g = new b(fVarE).i(kVar3).h(true).e();
        f136351h = new b(false).e();
    }

    private f(b bVar) {
        this.f136352a = bVar.f136356a;
        this.f136354c = bVar.f136357b;
        this.f136355d = bVar.f136358c;
        this.f136353b = bVar.f136359d;
    }

    public List<d> e() {
        String[] strArr = this.f136354c;
        if (strArr == null) {
            return null;
        }
        d[] dVarArr = new d[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f136354c;
            if (i10 >= strArr2.length) {
                return iu.f.a(dVarArr);
            }
            dVarArr[i10] = d.a(strArr2[i10]);
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        f fVar = (f) obj;
        boolean z10 = this.f136352a;
        if (z10 != fVar.f136352a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f136354c, fVar.f136354c) && Arrays.equals(this.f136355d, fVar.f136355d) && this.f136353b == fVar.f136353b);
    }

    public List<k> f() {
        String[] strArr = this.f136355d;
        if (strArr == null) {
            return null;
        }
        k[] kVarArr = new k[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f136355d;
            if (i10 >= strArr2.length) {
                return iu.f.a(kVarArr);
            }
            kVarArr[i10] = k.a(strArr2[i10]);
            i10++;
        }
    }

    public int hashCode() {
        if (this.f136352a) {
            return ((((527 + Arrays.hashCode(this.f136354c)) * 31) + Arrays.hashCode(this.f136355d)) * 31) + (!this.f136353b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f136352a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f136354c != null ? e().toString() : "[all enabled]") + ", tlsVersions=" + (this.f136355d != null ? f().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f136353b + ")";
    }
}
