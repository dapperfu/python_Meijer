package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f18011b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f18012c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f18011b, mVar.f18011b) && Arrays.equals(this.f18012c, mVar.f18012c)) {
                return true;
            }
        }
        return false;
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f18011b = str;
        this.f18012c = bArr;
    }

    public int hashCode() {
        String str = this.f18011b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f18012c);
    }

    @Override // L3.i
    public String toString() {
        return this.f18001a + ": owner=" + this.f18011b;
    }
}
