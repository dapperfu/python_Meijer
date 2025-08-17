package rf;

import java.util.Arrays;
import rf.AbstractC16777F;

/* renamed from: rf.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16785g extends AbstractC16777F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f158418a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f158419b;

    /* renamed from: rf.g$b */
    static final class b extends AbstractC16777F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f158420a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f158421b;

        @Override // rf.AbstractC16777F.d.b.a
        public AbstractC16777F.d.b a() {
            byte[] bArr;
            String str = this.f158420a;
            if (str != null && (bArr = this.f158421b) != null) {
                return new C16785g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f158420a == null) {
                sb2.append(" filename");
            }
            if (this.f158421b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // rf.AbstractC16777F.d.b.a
        public AbstractC16777F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f158421b = bArr;
            return this;
        }

        @Override // rf.AbstractC16777F.d.b.a
        public AbstractC16777F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f158420a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16777F.d.b) {
            AbstractC16777F.d.b bVar = (AbstractC16777F.d.b) obj;
            if (this.f158418a.equals(bVar.c())) {
                if (Arrays.equals(this.f158419b, bVar instanceof C16785g ? ((C16785g) bVar).f158419b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16785g(String str, byte[] bArr) {
        this.f158418a = str;
        this.f158419b = bArr;
    }

    @Override // rf.AbstractC16777F.d.b
    public byte[] b() {
        return this.f158419b;
    }

    @Override // rf.AbstractC16777F.d.b
    public String c() {
        return this.f158418a;
    }

    public int hashCode() {
        return ((this.f158418a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f158419b);
    }

    public String toString() {
        return "File{filename=" + this.f158418a + ", contents=" + Arrays.toString(this.f158419b) + "}";
    }
}
