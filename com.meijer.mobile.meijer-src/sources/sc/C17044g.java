package sc;

import java.util.Arrays;
import sc.AbstractC17054q;

/* renamed from: sc.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C17044g extends AbstractC17054q {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f160197a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f160198b;

    /* renamed from: sc.g$b */
    static final class b extends AbstractC17054q.a {

        /* renamed from: a, reason: collision with root package name */
        private byte[] f160199a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f160200b;

        @Override // sc.AbstractC17054q.a
        public AbstractC17054q a() {
            return new C17044g(this.f160199a, this.f160200b);
        }

        @Override // sc.AbstractC17054q.a
        public AbstractC17054q.a b(byte[] bArr) {
            this.f160199a = bArr;
            return this;
        }

        @Override // sc.AbstractC17054q.a
        public AbstractC17054q.a c(byte[] bArr) {
            this.f160200b = bArr;
            return this;
        }

        b() {
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17054q) {
            AbstractC17054q abstractC17054q = (AbstractC17054q) obj;
            boolean z10 = abstractC17054q instanceof C17044g;
            if (Arrays.equals(this.f160197a, z10 ? ((C17044g) abstractC17054q).f160197a : abstractC17054q.b())) {
                if (Arrays.equals(this.f160198b, z10 ? ((C17044g) abstractC17054q).f160198b : abstractC17054q.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    private C17044g(byte[] bArr, byte[] bArr2) {
        this.f160197a = bArr;
        this.f160198b = bArr2;
    }

    @Override // sc.AbstractC17054q
    public byte[] b() {
        return this.f160197a;
    }

    @Override // sc.AbstractC17054q
    public byte[] c() {
        return this.f160198b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f160197a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f160198b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f160197a) + ", encryptedBlob=" + Arrays.toString(this.f160198b) + "}";
    }
}
