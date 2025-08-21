package L3;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class o extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f18016b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18017c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f18001a.equals(oVar.f18001a) && Objects.equals(this.f18016b, oVar.f18016b) && Objects.equals(this.f18017c, oVar.f18017c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f18001a.hashCode()) * 31;
        String str = this.f18016b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18017c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // L3.i
    public String toString() {
        return this.f18001a + ": url=" + this.f18017c;
    }

    public o(String str, String str2, String str3) {
        super(str);
        this.f18016b = str2;
        this.f18017c = str3;
    }
}
