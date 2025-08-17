package rc;

import java.util.Arrays;
import pc.EnumC16282f;
import rc.p;

/* loaded from: classes4.dex */
final class d extends p {

    /* renamed from: a, reason: collision with root package name */
    private final String f157959a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f157960b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC16282f f157961c;

    static final class b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        private String f157962a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f157963b;

        /* renamed from: c, reason: collision with root package name */
        private EnumC16282f f157964c;

        @Override // rc.p.a
        public p a() {
            String str = "";
            if (this.f157962a == null) {
                str = " backendName";
            }
            if (this.f157964c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f157962a, this.f157963b, this.f157964c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // rc.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f157962a = str;
            return this;
        }

        @Override // rc.p.a
        public p.a c(byte[] bArr) {
            this.f157963b = bArr;
            return this;
        }

        @Override // rc.p.a
        public p.a d(EnumC16282f enumC16282f) {
            if (enumC16282f == null) {
                throw new NullPointerException("Null priority");
            }
            this.f157964c = enumC16282f;
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
            if (this.f157959a.equals(pVar.b())) {
                if (Arrays.equals(this.f157960b, pVar instanceof d ? ((d) pVar).f157960b : pVar.c()) && this.f157961c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    private d(String str, byte[] bArr, EnumC16282f enumC16282f) {
        this.f157959a = str;
        this.f157960b = bArr;
        this.f157961c = enumC16282f;
    }

    @Override // rc.p
    public String b() {
        return this.f157959a;
    }

    @Override // rc.p
    public byte[] c() {
        return this.f157960b;
    }

    @Override // rc.p
    public EnumC16282f d() {
        return this.f157961c;
    }

    public int hashCode() {
        return ((((this.f157959a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f157960b)) * 1000003) ^ this.f157961c.hashCode();
    }
}
