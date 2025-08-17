package qc;

import java.util.Arrays;
import qc.AbstractC16506q;

/* renamed from: qc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C16496g extends AbstractC16506q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f157082a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f157083b;

    /* renamed from: qc.g$b */
    static final class b extends AbstractC16506q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f157084a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f157085b;

        @Override // qc.AbstractC16506q.a
        public AbstractC16506q a() {
            return new C16496g(this.f157084a, this.f157085b);
        }

        @Override // qc.AbstractC16506q.a
        public AbstractC16506q.a b(byte[] bArr) {
            this.f157084a = bArr;
            return this;
        }

        @Override // qc.AbstractC16506q.a
        public AbstractC16506q.a c(byte[] bArr) {
            this.f157085b = bArr;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16506q) {
            AbstractC16506q abstractC16506q = (AbstractC16506q) obj;
            boolean z10 = abstractC16506q instanceof C16496g;
            if (Arrays.equals(this.f157082a, z10 ? ((C16496g) abstractC16506q).f157082a : abstractC16506q.b())) {
                if (Arrays.equals(this.f157083b, z10 ? ((C16496g) abstractC16506q).f157083b : abstractC16506q.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C16496g(byte[] bArr, byte[] bArr2) {
        this.f157082a = bArr;
        this.f157083b = bArr2;
    }

    @Override // qc.AbstractC16506q
    public byte[] b() {
        return this.f157082a;
    }

    @Override // qc.AbstractC16506q
    public byte[] c() {
        return this.f157083b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f157082a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f157083b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f157082a) + ", encryptedBlob=" + Arrays.toString(this.f157083b) + "}";
    }
}
