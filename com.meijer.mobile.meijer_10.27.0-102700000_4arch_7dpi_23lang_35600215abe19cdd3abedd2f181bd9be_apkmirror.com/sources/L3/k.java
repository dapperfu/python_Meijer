package L3;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17856b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17857c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17858d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f17857c, kVar.f17857c) && Objects.equals(this.f17856b, kVar.f17856b) && Objects.equals(this.f17858d, kVar.f17858d)) {
                return true;
            }
        }
        return false;
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f17856b = str;
        this.f17857c = str2;
        this.f17858d = str3;
    }

    public int hashCode() {
        String str = this.f17856b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17857c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17858d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": domain=" + this.f17856b + ", description=" + this.f17857c;
    }
}
