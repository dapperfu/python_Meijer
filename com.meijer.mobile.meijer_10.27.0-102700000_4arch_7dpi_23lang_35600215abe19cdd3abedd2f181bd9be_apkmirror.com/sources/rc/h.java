package rc;

import java.util.Arrays;
import pc.C16279c;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C16279c f157980a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f157981b;

    public byte[] a() {
        return this.f157981b;
    }

    public C16279c b() {
        return this.f157980a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f157980a.equals(hVar.f157980a)) {
            return Arrays.equals(this.f157981b, hVar.f157981b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f157980a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f157981b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f157980a + ", bytes=[...]}";
    }

    public h(C16279c c16279c, byte[] bArr) {
        if (c16279c != null) {
            if (bArr != null) {
                this.f157980a = c16279c;
                this.f157981b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }
}
