package L3;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17977b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f18001a.equals(bVar.f18001a) && Arrays.equals(this.f17977b, bVar.f17977b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f18001a.hashCode()) * 31) + Arrays.hashCode(this.f17977b);
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f17977b = bArr;
    }
}
