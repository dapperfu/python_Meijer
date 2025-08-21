package tc;

import java.util.Arrays;
import rc.C16883c;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C16883c f162470a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f162471b;

    public byte[] a() {
        return this.f162471b;
    }

    public C16883c b() {
        return this.f162470a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f162470a.equals(hVar.f162470a)) {
            return Arrays.equals(this.f162471b, hVar.f162471b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f162470a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f162471b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f162470a + ", bytes=[...]}";
    }

    public h(C16883c c16883c, byte[] bArr) {
        if (c16883c != null) {
            if (bArr != null) {
                this.f162470a = c16883c;
                this.f162471b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }
}
