package tc;

import java.util.Arrays;
import rc.EnumC16886f;
import tc.p;

/* loaded from: classes4.dex */
final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f162449a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f162450b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC16886f f162451c;

    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f162452a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f162453b;

        /* renamed from: c, reason: collision with root package name */
        private EnumC16886f f162454c;

        @Override // tc.p.a
        public p a() {
            String str = "";
            if (this.f162452a == null) {
                str = " backendName";
            }
            if (this.f162454c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f162452a, this.f162453b, this.f162454c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // tc.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f162452a = str;
            return this;
        }

        @Override // tc.p.a
        public p.a c(byte[] bArr) {
            this.f162453b = bArr;
            return this;
        }

        @Override // tc.p.a
        public p.a d(EnumC16886f enumC16886f) {
            if (enumC16886f == null) {
                throw new NullPointerException("Null priority");
            }
            this.f162454c = enumC16886f;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f162449a.equals(pVar.b())) {
                if (Arrays.equals(this.f162450b, pVar instanceof d ? ((d) pVar).f162450b : pVar.c()) && this.f162451c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    private d(String str, byte[] bArr, EnumC16886f enumC16886f) {
        this.f162449a = str;
        this.f162450b = bArr;
        this.f162451c = enumC16886f;
    }

    @Override // tc.p
    public String b() {
        return this.f162449a;
    }

    @Override // tc.p
    public byte[] c() {
        return this.f162450b;
    }

    @Override // tc.p
    public EnumC16886f d() {
        return this.f162451c;
    }

    public int hashCode() {
        return ((((this.f162449a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f162450b)) * 1000003) ^ this.f162451c.hashCode();
    }
}
