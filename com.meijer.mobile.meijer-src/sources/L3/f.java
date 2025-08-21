package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17992b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17993c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17994d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17995e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f17992b, fVar.f17992b) && Objects.equals(this.f17993c, fVar.f17993c) && Objects.equals(this.f17994d, fVar.f17994d) && Arrays.equals(this.f17995e, fVar.f17995e)) {
                return true;
            }
        }
        return false;
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f17992b = str;
        this.f17993c = str2;
        this.f17994d = str3;
        this.f17995e = bArr;
    }

    public int hashCode() {
        String str = this.f17992b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17993c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17994d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17995e);
    }

    @Override // L3.i
    public String toString() {
        return this.f18001a + ": mimeType=" + this.f17992b + ", filename=" + this.f17993c + ", description=" + this.f17994d;
    }
}
