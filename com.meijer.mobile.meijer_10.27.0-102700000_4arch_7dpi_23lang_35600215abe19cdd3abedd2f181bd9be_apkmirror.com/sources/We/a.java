package We;

import Ve.k;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f38646a;

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i10 + i11 > bArr.length) {
            i11 = bArr.length - i10;
        }
        return new a(bArr, i10, i11);
    }

    public int c() {
        return this.f38646a.length;
    }

    public byte[] d() {
        byte[] bArr = this.f38646a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f38646a, this.f38646a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f38646a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f38646a) + ")";
    }

    private a(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f38646a = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }
}
