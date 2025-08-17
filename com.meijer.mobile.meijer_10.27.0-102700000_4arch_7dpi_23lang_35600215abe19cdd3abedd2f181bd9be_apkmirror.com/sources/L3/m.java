package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17864b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f17865c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f17864b, mVar.f17864b) && Arrays.equals(this.f17865c, mVar.f17865c)) {
                return true;
            }
        }
        return false;
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f17864b = str;
        this.f17865c = bArr;
    }

    public int hashCode() {
        String str = this.f17864b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17865c);
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": owner=" + this.f17864b;
    }
}
