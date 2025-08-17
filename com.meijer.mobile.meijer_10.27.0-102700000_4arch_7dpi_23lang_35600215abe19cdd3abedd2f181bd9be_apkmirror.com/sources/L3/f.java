package L3;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17845b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17846c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17847d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f17848e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f17845b, fVar.f17845b) && Objects.equals(this.f17846c, fVar.f17846c) && Objects.equals(this.f17847d, fVar.f17847d) && Arrays.equals(this.f17848e, fVar.f17848e)) {
                return true;
            }
        }
        return false;
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f17845b = str;
        this.f17846c = str2;
        this.f17847d = str3;
        this.f17848e = bArr;
    }

    public int hashCode() {
        String str = this.f17845b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17846c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17847d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f17848e);
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": mimeType=" + this.f17845b + ", filename=" + this.f17846c + ", description=" + this.f17847d;
    }
}
