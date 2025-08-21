package tf;

import java.util.Arrays;
import tf.AbstractC17251F;

/* renamed from: tf.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17259g extends AbstractC17251F.d.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f162864a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f162865b;

    /* renamed from: tf.g$b */
    static final class b extends AbstractC17251F.d.b.a {

        /* renamed from: a, reason: collision with root package name */
        private String f162866a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f162867b;

        @Override // tf.AbstractC17251F.d.b.a
        public AbstractC17251F.d.b a() {
            byte[] bArr;
            String str = this.f162866a;
            if (str != null && (bArr = this.f162867b) != null) {
                return new C17259g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f162866a == null) {
                sb2.append(" filename");
            }
            if (this.f162867b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // tf.AbstractC17251F.d.b.a
        public AbstractC17251F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f162867b = bArr;
            return this;
        }

        @Override // tf.AbstractC17251F.d.b.a
        public AbstractC17251F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f162866a = str;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17251F.d.b) {
            AbstractC17251F.d.b bVar = (AbstractC17251F.d.b) obj;
            if (this.f162864a.equals(bVar.c())) {
                if (Arrays.equals(this.f162865b, bVar instanceof C17259g ? ((C17259g) bVar).f162865b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17259g(String str, byte[] bArr) {
        this.f162864a = str;
        this.f162865b = bArr;
    }

    @Override // tf.AbstractC17251F.d.b
    public byte[] b() {
        return this.f162865b;
    }

    @Override // tf.AbstractC17251F.d.b
    public String c() {
        return this.f162864a;
    }

    public int hashCode() {
        return ((this.f162864a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f162865b);
    }

    public String toString() {
        return "File{filename=" + this.f162864a + ", contents=" + Arrays.toString(this.f162865b) + "}";
    }
}
