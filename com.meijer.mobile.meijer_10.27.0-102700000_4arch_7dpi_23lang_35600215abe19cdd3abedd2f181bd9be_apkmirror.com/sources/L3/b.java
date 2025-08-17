package L3;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f17830b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f17854a.equals(bVar.f17854a) && Arrays.equals(this.f17830b, bVar.f17830b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f17854a.hashCode()) * 31) + Arrays.hashCode(this.f17830b);
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f17830b = bArr;
    }
}
