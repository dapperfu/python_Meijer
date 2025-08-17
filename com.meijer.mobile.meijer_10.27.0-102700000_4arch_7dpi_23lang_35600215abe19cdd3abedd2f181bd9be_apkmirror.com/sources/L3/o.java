package L3;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17869b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17870c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f17854a.equals(oVar.f17854a) && Objects.equals(this.f17869b, oVar.f17869b) && Objects.equals(this.f17870c, oVar.f17870c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f17854a.hashCode()) * 31;
        String str = this.f17869b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17870c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": url=" + this.f17870c;
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f17869b = str2;
        this.f17870c = str3;
    }
}
