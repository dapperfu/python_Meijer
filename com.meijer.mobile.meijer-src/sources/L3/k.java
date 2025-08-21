package L3;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f18003b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18004c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18005d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f18004c, kVar.f18004c) && Objects.equals(this.f18003b, kVar.f18003b) && Objects.equals(this.f18005d, kVar.f18005d)) {
                return true;
            }
        }
        return false;
    }

    public k(String str, String str2, String str3) {
        super("----");
        this.f18003b = str;
        this.f18004c = str2;
        this.f18005d = str3;
    }

    public int hashCode() {
        String str = this.f18003b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f18004c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f18005d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // L3.i
    public String toString() {
        return this.f18001a + ": domain=" + this.f18003b + ", description=" + this.f18004c;
    }
}
